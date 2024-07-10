package com.cy.controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
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

    @GetMapping("/hello")
    public String hello() {

        LiteflowResponse response = flowExecutor.execute2Resp( "chain1", "arg" );

        response.getMessage();

        return "hello";
    }


    @GetMapping("/xxx")
    public String hello2() {

        return "hello2";
    }
}
