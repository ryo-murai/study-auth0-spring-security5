package com.example.studyoidc.home;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "OK";
    }

    @GetMapping("/public")
    @ResponseBody
    public String publicEndpoint() {
        return "ok";
    }

    @GetMapping("/private")
    @ResponseBody
    public String privateEndpoint() {
        return "ok";
    }

    @GetMapping("/private-scoped")
    @ResponseBody
    public String privateScopedEndpoint() {
        return "ok";
    }
}
