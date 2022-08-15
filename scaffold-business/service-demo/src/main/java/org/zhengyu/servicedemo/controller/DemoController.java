package org.zhengyu.servicedemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhengyu.common.result.Result;

@RestController
@RequestMapping("/buiness/demo")
@Api(tags = "Demo模块")
public class DemoController {

    @GetMapping("/test")
    @ApiOperation(value = "测试")
    public Result<String> test() {
        return Result.success("ok");
    }
}
