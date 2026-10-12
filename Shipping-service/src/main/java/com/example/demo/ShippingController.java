
package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @GetMapping
    public Map<String, Object> getShipping() {
        return Map.of(
            "service", "Shipping Service",
            "status", "success",
            "message", "Shipping details retrieved successfully",
            "orderId", "ORD101",
            "deliveryStatus", "In Transit"
        );
    }
}
