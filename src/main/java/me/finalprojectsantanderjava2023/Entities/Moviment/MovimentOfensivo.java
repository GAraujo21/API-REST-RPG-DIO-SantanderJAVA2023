package me.finalprojectsantanderjava2023.Entities.Moviment;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true) // O @Data cria os contrutores, mas sem chamar o super();
@Data
@SuperBuilder
//@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Ofensivo")
public class MovimentOfensivo extends Moviment{
    @Override
    public void moviment() {
        System.out.println("O personagem está se movimento ofensivamente!");
    }
}
