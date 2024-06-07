package me.finalprojectsantanderjava2023.DTO.MovimentDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.Moviment.MovimentDefensivo;
import me.finalprojectsantanderjava2023.Entities.Person.Person;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class MovimentDefensivoUpdateDTO extends MovimentUpdateDTO{

    @Override
    public MovimentDefensivo toEntity(Moviment moviment, Person person) {
        return MovimentDefensivo.builder()
                .id(moviment.getId())
                .person(person)
                .build();
    }
}
