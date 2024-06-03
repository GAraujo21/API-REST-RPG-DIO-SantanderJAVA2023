package me.finalprojectsantanderjava2023.DTO.PersonDTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import me.finalprojectsantanderjava2023.Entities.GameUser;
import me.finalprojectsantanderjava2023.Entities.Item;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.Person.Person;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PersonUpdateDTO {
//    @NotBlank
//    private GameUser usuario;
//
//    @NotNull
//    private int life;
//
//    private int strength;
//
//    private int magic;
//
//    private int charisma;

    @NotBlank
    @Min(1)
    private int level;

    @NotBlank
    @Size(min = 20, max = 100)
    private String status;

    private Moviment moviment;

    private Item item;

    public Person toEntityUpdate (Person person){
        return Person.builder()
                .id(person.getId())
                //.usuario(person.getUsuario())
                //.life(this.life)
                //.strength(this.strength)
                //.magic(this.magic)
                //.charisma(this.charisma)
                .level(this.level)
                .status(this.status)
                .moviment(this.moviment)
                .item(this.item)
                .build();
    }
}
