/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.mySpringbootApplication;

import java.net.URI;
import java.net.URL;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyFirstRestControllerTest1 {
    
    @LocalServerPort
    private int port;
    
    private URL base;
    
    @Autowired
    private TestRestTemplate template;
    
    @BeforeEach 
    public void setUP() throws Exception {
        this.base = new URL("http://localhost:"+port+"/hello");
    }
    
    @Test
    public void getHelloWithoutParameter() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
        assertThat(response.getBody()).isEqualTo("hello");
    }
    
    @Test
    public void getHelloWithEmptyMyName() throws Exception {
        URI uri = UriComponentsBuilder.fromHttpUrl(base.toString()).queryParam("myName", "").build().toUri();
        ResponseEntity<String> response = template.getForEntity(uri, String.class);
        assertThat(response.getBody()).isEqualTo("hello");
    }
    
    @Test
    public void getHelloNonEmptyMyName() throws Exception {
        URI uri = UriComponentsBuilder.fromHttpUrl(base.toString()).queryParam("myName", "mirek").build().toUri();
        ResponseEntity<String> response = template.getForEntity(uri, String.class);
        assertThat(response.getBody()).isEqualTo("hello mirek");
    }
}
