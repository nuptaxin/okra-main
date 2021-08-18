package com.okracode.platform.okra.site.web.controller;

import com.okracode.platform.okra.site.web.param.GetMenuReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入口核心控制器
 *
 * @author Eric Ren
 * @version 1.0.0
 * @date 2021/8/18
 */
@RestController
@RequestMapping("/core")
public class CoreController {

    @PostMapping
    public void getMenu(@RequestBody GetMenuReq req) {

    }
}
