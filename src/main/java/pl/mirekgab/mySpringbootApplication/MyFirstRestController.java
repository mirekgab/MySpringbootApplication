/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.mySpringbootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mirek
 */
@RestController
public class MyFirstRestController {
    
    @RequestMapping("/hello")
    public String start(@RequestParam(name="myName", defaultValue = "") String name) {
        return new String("hello "+name).trim();
    }
}
