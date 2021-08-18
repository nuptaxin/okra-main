package com.okracode.platform.okra.site.web.entity;

import lombok.Data;

/**
 * 菜单项
 *
 * @author Eric Ren
 * @version 1.0.0
 * @date 2021/8/18
 */
@Data
public class MenuItem {

    private String name;
    private Integer orderIndex;
    private String url;
}
