package com.jt.controller.web;

import com.jt.pojo.Item;
import com.jt.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: jta
 * @BelongsPackage: com.jt.controller.web
 * @CreateTime: 2020-04-20 18:38
 * @Description: 前台
 */
@RestController //返回数据都是JSON
@RequestMapping("/web/item")
public class WebItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("findItemById")
    public Item findItemById(Long itemId){
        return itemService.findItemById(itemId);
    }
}
