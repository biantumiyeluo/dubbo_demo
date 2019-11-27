package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.HelloService;

/**
 * @PackageName: com.itheima.service.impl
 * @ClassName: HelloServiceImpl
 * @Author: renpengzhi
 * @Date: 2019/11/25 0025 下午 7:11
 * @Description: //TODO
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
