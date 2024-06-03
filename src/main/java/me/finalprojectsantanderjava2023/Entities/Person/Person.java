package me.finalprojectsantanderjava2023.Entities.Person;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import me.finalprojectsantanderjava2023.Entities.Item;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.GameUser;

@Data
@SuperBuilder // por ter herança, o superbuilder auxilia nos contrutores das classes filhas
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Como tem herança, essa anotação indica que no banco, só havera UMA tabela com as classes pai e filhas
@DiscriminatorColumn(name = "person_type")
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "game_user_id", nullable = false)
    private GameUser usuario;

    @Column(name = "person_life")
    private int life;

    @Column(name = "person_strength")
    private int strength;

    @Column(name = "person_magic")
    private int magic;

    @Column(name = "person_charisma")
    private int charisma;

    @Column(name = "person_level")
    @Min(1)
    @Builder.Default
    private int level = 1;

    @Column(name = "person_status")
    private String status; //n me recordo o que queria aqui;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true) // nullable é true por default e pq o personagem pode não ter movimentos(parado).
    private Moviment moviment;

    @ManyToOne
    @JoinColumn(name = "person_item") // nullable é true por default e pq o personagem pode não ter item(null).
    private Item item; // pode ser um enum, já que por enquanto só terei 3 itens fixos.

    public Person(int id, int life, int strength, int magic, int charisma, int level, String status, Moviment movement, Item item) {
    }

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
