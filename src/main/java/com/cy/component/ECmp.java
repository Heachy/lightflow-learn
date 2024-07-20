package com.cy.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @author Haechi
 * @date 2024/7/10
 */
@LiteflowComponent("e")
public class ECmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("ECmp 666 executed!");

        MyContext myContext = this.getContextBean( "myContext" );

        System.out.println("The odd number is: "+myContext.getNumber());
    }

}
