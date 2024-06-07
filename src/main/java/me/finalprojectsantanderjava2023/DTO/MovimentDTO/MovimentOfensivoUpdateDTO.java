package me.finalprojectsantanderjava2023.DTO.MovimentDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.Moviment.MovimentOfensivo;
import me.finalprojectsantanderjava2023.Entities.Person.Person;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class MovimentOfensivoUpdateDTO extends MovimentUpdateDTO{
    @Override
    public MovimentOfensivo toEntity(Moviment moviment, Person person) {
        return MovimentOfensivo.builder()
                .id(moviment.getId())
                .person(person)
                .build();
    }
}
