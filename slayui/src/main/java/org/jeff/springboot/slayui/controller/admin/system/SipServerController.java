package org.jeff.springboot.slayui.controller.admin.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jeff
 * <p>Date 2018/6/7 16:30</p>
 */
@Controller
@RequestMapping("/sys/sip")
public class SipServerController {

    /**
     * 列表页面
     * @return {@code /admin/sys/sip/list}
     */
    @GetMapping("/sip/list.html")
    public String sipList(){
        return "/admin/sys/sip/list";
    }



}
