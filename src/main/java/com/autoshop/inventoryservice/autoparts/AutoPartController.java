package com.autoshop.inventoryservice.autoparts;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AutoPartController {

    private final AutoPartService autoPartService;

    @GetMapping("/inventory-service/v1/auto-parts")
    public ResponseEntity<?> findAutoParts() {
        System.out.println("Received part request");
        return ResponseEntity.ok(autoPartService.findAutoParts());
    }
}
