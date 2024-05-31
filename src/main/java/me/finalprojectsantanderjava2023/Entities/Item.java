package me.finalprojectsantanderjava2023.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id", nullable = false)
    private Long id;

    @Column(name = "item_name", nullable = false)
    private String name;

    @Column(name = "item_strength", nullable = false)
    @Min(1)
    private int strength;

    @Column(name = "item_magic", nullable = false)
    @Min(1)
    private int magic;

    @Column(name = "item_charisma", nullable = false)
    @Min(1)
    private int charisma;

    @Column(name = "item_description", nullable = false)
    private String description;
}
