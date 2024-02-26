package com.julio.luis.banpopular.proxies;

import com.julio.luis.banpopular.model.ConversionResponse;
import com.julio.luis.banpopular.model.Transaction;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Conversion", url = "http://localhost:8989/reservas")
public interface ConversionProxy {

    @PostMapping("/convert")
    @Headers(value = "Content-Type: application/json")
    ConversionResponse convertDollarToPesos(@RequestBody Transaction request);
}
