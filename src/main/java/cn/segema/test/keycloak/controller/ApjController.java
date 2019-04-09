 package cn.segema.test.keycloak.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
 public class ApjController {
    @RequestMapping(path = "/apj/channels")
    public String getChannels(Model model){
        model.addAttribute("channels", Arrays.asList("channel1","channel2","channel3"));
        return "channels";
    }
}
