package org.jeff.springboot.slayui.controller.admin.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jeff
 * <p>Date 2018/6/5 11:32</p>
 */
@Controller
@RequestMapping("/sys/config")
public class SystemConfigController {

    @GetMapping("/config.html")
    public String config(){
        return "/admin/sys/config/config";
    }
}
