
package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping
    public Map<String, Object> getInventory() {
        return Map.of(
            "service", "Inventory Service",
            "status", "success",
            "message", "Inventory details retrieved successfully",
            "product", "Laptop",
            "quantity", 50
        );
    }
}
