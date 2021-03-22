/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.mySpringbootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyMvcController {
    
    @RequestMapping("/")
    public String start() {
        return "index1";
    }
    
    @RequestMapping("/test1")
    public String test1() {
        return "test1";
    }

}
