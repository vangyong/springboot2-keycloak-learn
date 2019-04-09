 package cn.segema.test.keycloak.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiController {
    @RequestMapping(path = "/api/modules")
     public String getModules(Model model){
         model.addAttribute("modules", Arrays.asList("iPad","iPhone","iPod"));
         return "modules";
     }
}
