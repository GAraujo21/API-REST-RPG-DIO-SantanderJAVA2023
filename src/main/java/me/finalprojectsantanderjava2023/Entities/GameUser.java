package me.finalprojectsantanderjava2023.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.finalprojectsantanderjava2023.Entities.Person.Person;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "game_user")
public class GameUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "game_user_id", nullable = false)
    private Long id;

    @Column(name = "game_user_name", nullable = false)
    private String name;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true) // orphanRemoval garante que, caso a vinculação de usuario e character seja removida (null) o character será removido do banco de dados
    private Person person;
}
