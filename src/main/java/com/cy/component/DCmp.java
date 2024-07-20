package com.cy.component;

import com.cy.dto.TestDTO;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;

/**
 * @author Haechi
 * @date 2024/7/10
 */
@LiteflowComponent("d")
public class DCmp extends NodeSwitchComponent {

    @Override
    public String processSwitch() throws Exception {

        TestDTO testDTO = this.getRequestData();

        MyContext myContext = this.getContextBean( "myContext" );

        if (testDTO.getCount() % 2 != 0) {

            myContext.setNumber( 1021 );

            return "e";
        } else {
            myContext.setNumber( 100 );

            return "f";
        }

    }

}
