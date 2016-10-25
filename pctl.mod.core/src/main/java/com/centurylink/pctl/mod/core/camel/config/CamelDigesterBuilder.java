package com.centurylink.pctl.mod.core.camel.config;

import com.centurylink.pctl.mod.core.camel.CamelException;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.annotations.FromAnnotationsRuleModule;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CamelDigesterBuilder {

    private static final Logger logger = Logger.getLogger(CamelDigesterBuilder.class);

    private String configPath;

    public CamelDigesterBuilder(String configPath) {
        this.configPath = configPath;
    }

    public CamelConfig build() throws CamelException {
        logger.info("Building CamelConfig...." + configPath);
        DigesterLoader loader = DigesterLoader.newLoader(new FromAnnotationsRuleModule() {

            @Override
            protected void configureRules() {
                bindRulesFrom(CamelConfig.class);
            }

        });
        Digester digester = loader.newDigester();
        try {
            CamelConfig config = digester.parse(this.getClass().getClassLoader().getResourceAsStream(configPath));
            logger.info("producers: " + config.getSoapEndPoints());
            return config;
        } catch (FileNotFoundException e) {
            throw new CamelException("Config file 'camel-binding-config.xml' not found", e);
        } catch (IOException e) {
            throw new CamelException("Error reading file 'camel-binding-config.xml' not found", e);
        } catch (SAXException e) {
            throw new CamelException("Error parsing file 'camel-binding-config.xml' not found", e);
        } finally {
            digester.clear();
            digester = null;
        }
    }

/*	public static void main(String[] args) throws CamelException {
    System.out.println(	new  CamelDigesterBuilder("dev/camel-binding-config.xml").build());
	}*/
}
