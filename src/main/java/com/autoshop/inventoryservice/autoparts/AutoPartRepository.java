package com.autoshop.inventoryservice.autoparts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AutoPartRepository extends JpaRepository<AutoPart, Long> {}
