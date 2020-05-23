package com.jt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: jta
 * @BelongsPackage: com.jt.config
 * @CreateTime: 2020-04-16 18:25
 * @Description:
 */
@Controller
public class IndexController{
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
