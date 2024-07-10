package com.cy.component;

import com.yomahub.liteflow.context.ContextBean;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Haechi
 * @date 2024/7/10
 */
@ContextBean("myContext")
@AllArgsConstructor
@NoArgsConstructor
@Component("myContext")
public class MyContext {
    Integer number = 0;


    public void setNumber( Integer number ) {
        this.number = number;
    }

    public Integer getNumber() {
        return this.number;
    }

}
