package com.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: jta
 * @BelongsPackage: com.jt.controller
 * @CreateTime: 2020-04-18 20:41
 * @Description: 页面跳转
 */
@Controller //跳转页面
@RequestMapping("/items")
public class ItemController {
    @RequestMapping("/{itemId}")
    public String toItems(@PathVariable Long itemId){
        //根据商品ID查询后台商品数据
        System.out.println("当前商品ID值"+itemId);
        return "item";
    }

}
