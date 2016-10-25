package com.centurylink.pctl.mod.core.camel;


import com.centurylink.pctl.mod.core.camel.factory.CamelServiceFactory;
import com.centurylink.pctl.mod.core.camel.service.ICamelService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {

//    @Autowired
//    CamelServiceFactory factory;

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        CamelServiceFactory factory = ctx.getBean(CamelServiceFactory.class);
        System.out.print("Mainnnn");
        ICamelService service = CamelServiceFactory.getService("SOAP");
        System.out.println(service.process("getAirportDetails", "MAA"));
    }

}

