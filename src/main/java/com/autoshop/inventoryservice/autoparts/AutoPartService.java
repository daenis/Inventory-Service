package com.autoshop.inventoryservice.autoparts;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AutoPartService {

    private final AutoPartRepository autoPartRepository;

    public List<AutoPart> findAutoParts() {
        return autoPartRepository.findAll();
    }
}
