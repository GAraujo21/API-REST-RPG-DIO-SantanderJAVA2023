package me.finalprojectsantanderjava2023.DTO.MovimentDTO;

import lombok.AllArgsConstructor;
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
//@AllArgsConstructor // com o uso dessa anotação, não é possível buildar o projeto, dizendo que o construtor já está defenido
public class MovimentDefensivoDTO extends MovimentDTO{
    @Override
    public MovimentDefensivo toEntity(Person person) {
        return MovimentDefensivo.builder()
                .person(person)
                .build();
    }
}
