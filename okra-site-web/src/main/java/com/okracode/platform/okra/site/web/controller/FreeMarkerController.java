package com.okracode.platform.okra.site.web.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FreeMarker模板控制器
 *
 * @author Eric Ren
 * @version 1.0.0
 * @date 2021/8/18
 */
@Controller
public class FreeMarkerController {

    @RequestMapping(value = "/{name}")
    public String commonController(@PathVariable String name) {
        return name;
    }

    @RequestMapping({"/", "/index"})
    public String index(Model model) {
        Map map = new LinkedHashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put("key" + i, "value" + i);
        }
        model.addAttribute("list", Arrays.asList("string1", "string2", "string3", "string4", "string5", "string6"));
        model.addAttribute("map", map);
        model.addAttribute("name", "   htTps://wWw.zHyD.mE   ");
        model.addAttribute("htmlText", "<span style=\"color: red;font-size: 16px;\">html内容</span>");
        model.addAttribute("num", 123.012);
        model.addAttribute("null", null);
        model.addAttribute("dateObj", new Date());
        model.addAttribute("bol", true);
        model.addAttribute("visitSum", Math.abs(ThreadLocalRandom.current().nextInt()));
        return "index";
    }
}
