/**
 *
 */
package com.centurylink.pctl.mod.core.camel.transformers;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author s-arunkumar
 */
public class CDataTransformer {
    public String transform(NodeList list) {
        Node node = list.item(0);
        if (node != null) {
            return node.getNodeValue();
        }
        return null;
    }
}
