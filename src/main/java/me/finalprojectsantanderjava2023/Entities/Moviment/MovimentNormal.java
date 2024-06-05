package me.finalprojectsantanderjava2023.Entities.Moviment;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true) // O @Data cria os contrutores, mas sem chamar o super();
@Data
@SuperBuilder
//@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Normal")
//@Table(name = ) ñ quero uma tabela com os tipos específicos de movimento! Quero uma só com todos os movimentos.
public class MovimentNormal extends Moviment{
    @Override
    public void moviment(){
        System.out.println("O personagem está se movimentando...");
    }
}
