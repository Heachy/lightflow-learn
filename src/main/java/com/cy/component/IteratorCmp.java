package com.cy.component;

import com.cy.dto.TestDTO;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeIteratorComponent;
import java.util.Iterator;
import java.util.List;

/**
 * @author Haechi
 * @date 2024/7/23
 */

@LiteflowComponent("IteratorTest")
public class IteratorCmp extends NodeIteratorComponent {


    @Override
    public Iterator<?> processIterator() throws Exception {
        List<TestDTO> list = this.getRequestData();
        return list.iterator();
    }

}
