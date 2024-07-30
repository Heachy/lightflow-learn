package com.cy.component;

import com.cy.dto.TestDTO;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @author Haechi
 * @date 2024/7/10
 */
@LiteflowComponent("f")
public class FCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("FCmp executed!");

        MyContext myContext = this.getContextBean( "myContext" );

        System.out.println("The even number is: "+myContext.getNumber());

        TestDTO testDTO =this.getCurrLoopObj();

        if(testDTO==null){
            testDTO =myContext.getTestDTO();
        }

        System.out.println("F:"+testDTO);
    }

}
