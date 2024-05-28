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
@Table(name = "warrior")
public class Warrior extends Character{

    @Builder
    public Warrior(@Min(1) int level, String status, String movement, String item) {
        super(70, 25, 0, 1, level, status, movement, item);
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
