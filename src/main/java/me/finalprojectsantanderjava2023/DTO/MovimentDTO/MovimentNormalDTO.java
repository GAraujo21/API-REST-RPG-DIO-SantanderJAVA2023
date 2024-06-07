package me.finalprojectsantanderjava2023.DTO.MovimentDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.Moviment.MovimentNormal;
import me.finalprojectsantanderjava2023.Entities.Person.Person;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class MovimentNormalDTO extends MovimentDTO{
    @Override
    public MovimentNormal toEntity(Person person) {
        return MovimentNormal.builder()
                .person(person)
                .build();
    }
}
