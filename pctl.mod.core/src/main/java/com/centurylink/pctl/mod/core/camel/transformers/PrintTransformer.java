/**
 *
 */
package com.centurylink.pctl.mod.core.camel.transformers;

/**
 * @author s-arunkumar
 *         sss
 */
public class PrintTransformer {
    public String transform(String list) {
        System.out.print(list);
        return list;
    }
}
