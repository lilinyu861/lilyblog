package com.lily.myblog.web;

import com.lily.myblog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        String blog = null;
        if (blog == null){
            throw new NotFoundException("博客不存在");
        }
        return "index";
    }
}
