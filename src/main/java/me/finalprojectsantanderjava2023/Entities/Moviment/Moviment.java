package me.finalprojectsantanderjava2023.Entities.Moviment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.finalprojectsantanderjava2023.Entities.Person.Person;

@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Como tem herança, essa anotação indica que no banco, só havera UMA tabela com as classes pai e filhas
@DiscriminatorColumn(name = "moviment_tipe") // por haver somente uma tabela, essa anotação cria uma coluna extra na tabela para identificar qual é o tipo de movimento, ou seja, qual classe, se a pai ou uma das filhas
@Entity
@Table(name = "moviment")
public abstract class Moviment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "moviment_id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    // a responsabilidade vai para a classe filha, e para o DiscriminatorValue
//    @Column(name = "moviment_tipo", nullable = false)
//    private String tipo;

    public abstract void moviment();

}
