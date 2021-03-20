/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.MySpringbootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mirek
 */
@RestController
public class MyFirstRestController {
    
    @RequestMapping("/hello")
    public String start() {
        return "hello, my first rest controller";
    }
}
