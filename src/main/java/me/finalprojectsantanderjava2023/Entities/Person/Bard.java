package me.finalprojectsantanderjava2023.Entities.Person;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.*;
import me.finalprojectsantanderjava2023.Entities.Item;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.GameUser;

@EqualsAndHashCode(callSuper = true) // necessario trazê-lo por ser uma subclasse.
@Data
@AllArgsConstructor
//@NoArgsConstructor
@Entity
@DiscriminatorValue("Bardo")
//@Table(name = "bard")
public class Bard extends Person {
    //@Builder
    public Bard(Long id, GameUser user, @Min(1) int level, String status, Moviment movement, Item item) {
        super(id, user, 30, 5, 2, 30, level, status, movement, item);
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
