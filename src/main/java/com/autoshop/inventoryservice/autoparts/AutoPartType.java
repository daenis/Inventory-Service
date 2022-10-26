package com.autoshop.inventoryservice.autoparts;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "auto_part_types")
@Getter
@Setter
public class AutoPartType {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "autoPartType", cascade = CascadeType.ALL)
    private List<AutoPart> autoParts;
}
