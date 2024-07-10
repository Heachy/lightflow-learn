package com.cy.component;

import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.slot.DefaultContext;
import org.springframework.stereotype.Component;

/**
 * @author Haechi
 * @date 2024/7/9
 */
@Component("a")
public class ACmp extends NodeComponent {

    @Override
    public void process() {
        System.out.println("ACmp executed!");
    }
}

