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
public class MovimentOfensivoDTO extends MovimentDTO{
    @Override
    public MovimentOfensivo toEntity(Person person) {
        return MovimentOfensivo.builder()
                .person(person)
                .build();
    }
}
