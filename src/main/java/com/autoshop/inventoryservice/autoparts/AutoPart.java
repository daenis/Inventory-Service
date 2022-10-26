package com.autoshop.inventoryservice.autoparts;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "auto_parts")
@Getter
@Setter
public class AutoPart {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private AutoPartType autoPartType;
}
