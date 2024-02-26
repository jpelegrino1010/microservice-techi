package com.julioluis.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

    @GetMapping("/reservasFallBack")
    public Mono<String> banreservasServiceCallBack() {
        return Mono.just("Your request is taking to long to respond or is down. Please try again later.");
    }

    @GetMapping("/popularFallBack")
    public Mono<String> popularServiceCallBack() {
        return Mono.just("Your request is taking to long to respond or is down. Please try again later.");
    }
}
