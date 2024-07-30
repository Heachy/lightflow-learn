package com.cy.controller;

import com.cy.component.MyContext;
import com.cy.dto.TestDTO;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Haechi
 * @date 2024/7/9
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private FlowExecutor flowExecutor;

    @Resource
    private MyContext myContext;

    @GetMapping("/hello")
    public String hello() {

        LiteflowResponse response = flowExecutor.execute2Resp( "chain1", "arg" );

        response.getMessage();


        return "he456llo";

    }


    @GetMapping("/check")
    public String hello2() {

        LiteflowResponse response = flowExecutor.execute2Resp( "parityCheck", new TestDTO("parityCheck",4), myContext);
        return "hap123py";
    }

    @GetMapping("/for")
    public String forHello() {

        List<TestDTO> list = new ArrayList<>();

        list.add( new TestDTO("hahaha",6) );
        list.add( new TestDTO("yayaya",7) );
        list.add( new TestDTO("zazaza",8) );

        myContext.setTestDTO( new TestDTO("aaaaaa",89) );



        LiteflowResponse response = flowExecutor.execute2Resp( "forTest", list, myContext);
        return "hap123py";
    }
}
