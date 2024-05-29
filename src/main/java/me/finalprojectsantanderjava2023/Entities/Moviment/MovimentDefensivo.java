package me.finalprojectsantanderjava2023.Entities.Moviment;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true) // O @Data cria os contrutores, mas sem chamar o super();
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Defensivo")
public class MovimentDefensivo extends Moviment{
    @Override
    public void moviment() {
        System.out.println("O personagem está se movimetando defensivamente!");
    }
}
