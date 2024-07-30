package com.cy.component;

import com.cy.dto.TestDTO;
import com.yomahub.liteflow.context.ContextBean;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Haechi
 * @date 2024/7/10
 */
@AllArgsConstructor
@NoArgsConstructor
@Component("myContext")
public class MyContext {
    private Integer number = 0;

    private TestDTO testDTO;
    public void setNumber( Integer number ) {
        this.number = number;
    }

    public Integer getNumber() {
        return this.number;
    }


    public TestDTO getTestDTO() {
        return testDTO;
    }


    public void setTestDTO( TestDTO testDTO ) {
        this.testDTO = testDTO;
    }

}
