package org.jeff.springboot.slayui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jeff
 * <p>Date 2018/5/31 11:06</p>
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("index.html")
    public String index(Model model){
        model.addAttribute("account","admin");
        return "/admin/index";
    }

    @GetMapping("list.html")
    public String list(){
        return "/list";
    }

    @GetMapping("form.html")
    public String form(){
        return "/form";
    }
}
