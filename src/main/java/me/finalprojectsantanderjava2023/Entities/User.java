package me.finalprojectsantanderjava2023.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.finalprojectsantanderjava2023.Entities.Character.Character;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_id", nullable = false)
    private int id;

    @Column(name = "user_name", nullable = false)
    private String name;

    @OneToOne(mappedBy = "user_character", cascade = CascadeType.ALL)
    private Character character;
}
