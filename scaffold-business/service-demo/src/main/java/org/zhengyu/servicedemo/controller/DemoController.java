package org.zhengyu.servicedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhengyu.common.result.Result;

@RestController
@RequestMapping("/buiness/demo")
public class DemoController {

    @GetMapping("/test")
    public Result<String> test() {
        return Result.success("ok");
    }
}
