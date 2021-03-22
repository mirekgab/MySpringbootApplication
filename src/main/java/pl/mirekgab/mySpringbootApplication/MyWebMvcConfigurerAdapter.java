/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.mySpringbootApplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {

    //add view in configuration class
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/test2").setViewName("test2");
    }

}
