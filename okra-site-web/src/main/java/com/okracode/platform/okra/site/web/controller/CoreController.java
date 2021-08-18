package com.okracode.platform.okra.site.web.controller;

import com.okracode.platform.okra.site.web.entity.MenuItem;
import com.okracode.platform.okra.site.web.param.GetMenuReq;
import com.okracode.platform.okra.site.web.vo.ResultVO;
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

    @PostMapping("/getMenu")
    public MenuItem getMenu(@RequestBody GetMenuReq req) {
        System.out.println(111);
        MenuItem menuItem = new MenuItem();
        menuItem.setName("主页");
        menuItem.setOrderIndex(1);
        menuItem.setUrl("/");
        return menuItem;
    }
}
