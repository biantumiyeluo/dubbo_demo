package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @PackageName: com.itheima.controller
 * @ClassName: HelloController
 * @Author: renpengzhi
 * @Date: 2019/11/25 0025 下午 7:21
 * @Description: //TODO
 */

@Controller
@RequestMapping("/demo")
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String getName(String name) {
        String sayHello = helloService.sayHello(name);

        System.out.println(sayHello);

        return sayHello;
    }
}
