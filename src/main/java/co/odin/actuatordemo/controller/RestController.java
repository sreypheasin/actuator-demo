package co.odin.actuatordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/demo")
public class RestController {

    @GetMapping
    public Map<String, String> getData(){

        return Map.of("Hello", "Senpai");
    }
}
