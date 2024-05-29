package me.finalprojectsantanderjava2023.Entities.Character;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.finalprojectsantanderjava2023.Entities.Item;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.User;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "character")
public class Character {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User usuario;

    @Column(name = "character_life")
    private int life;

    @Column(name = "character_strength")
    private int strength;

    @Column(name = "character_magic")
    private int magic;

    @Column(name = "character_charisma")
    private int charisma;

    @Column(name = "character_level")
    @Min(1)
    private int level = 1;

    @Column(name = "character_status")
    private String status; //n me recordo o que queria aqui;

    @Column(name = "character_movement")
    private Moviment movement;

    @Column(name = "character_item")
    private Item item; // pode ser um enum, já que por enquanto só terei 3 itens fixos.

    public void atacar(){
        System.out.println("O personagem atacou e causou " + (strength+magic) + " de dano");
    }

    public void defender(){
        System.out.println("O personagem se defendeu e recusou " + (strength+charisma) + " de dano");
    }

    public void moviment(){
        System.out.println("O personagem está se movimentando");
    }
}