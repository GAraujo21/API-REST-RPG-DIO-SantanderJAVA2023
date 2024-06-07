package me.finalprojectsantanderjava2023.DTO.MovimentDTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.Person.Person;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class MovimentUpdateDTO {

    @NotNull(message = "Person não pode ser nulo!")
    private Person person;

    public abstract Moviment toEntity(Moviment moviment,Person person);
}
