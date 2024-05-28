package me.finalprojectsantanderjava2023.Entities.Character;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.*;

@EqualsAndHashCode(callSuper = true) // necessario trazê-lo por ser uma subclasse.
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mage")
public class Mage extends Character {

    @Builder
    public Mage(@Min(1) int level, String status, String movement, String item) {
        super(50, 5, 20, 5, level, status, movement, item);
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void defender() {
        super.defender();
    }

    @Override
    public void moviment() {
        super.moviment();
    }
}
