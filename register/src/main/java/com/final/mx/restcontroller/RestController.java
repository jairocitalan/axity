package com.javeros.mx.restcontroller;

import com.javeros.mx.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by droblero on 28/01/18.
 */
@org.springframework.web.bind.annotation.RestController//punto de accesso de servico de un web
@RequestMapping("/api/v1")//url base 
public class RestController {


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(1,
                "Rond");
    }
}
