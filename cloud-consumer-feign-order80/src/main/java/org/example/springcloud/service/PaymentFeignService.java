package org.example.springcloud.service;

import org.example.springcloud.entities.CommonResult;
import org.example.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@Component
@FeignClient("cloud-payment-service")
public interface PaymentFeignService {

    @GetMapping("payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);


    @GetMapping("payment/feign/timeout")
    public String paymentFeignTimeout() throws InterruptedException ;
}