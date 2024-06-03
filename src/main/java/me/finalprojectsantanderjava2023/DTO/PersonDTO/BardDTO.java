package me.finalprojectsantanderjava2023.DTO.PersonDTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;
import me.finalprojectsantanderjava2023.Entities.GameUser;
import me.finalprojectsantanderjava2023.Entities.Item;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.Person.Bard;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BardDTO extends PersonDTO{

    @NotBlank(message = "Usuário não pode ser nulo ou vazio!")
    private GameUser usuario;

    @NotNull(message = "A vida não pode ser vazia!")
    private int life;

    private int strength;

    private int magic;

    private int charisma;

    @Min(1)
    private int level;

    @NotBlank
    @Size(min = 20, max = 100)
    private String status;

    private Moviment moviment;

    private Item item;

    public Bard toEntity(GameUser usuario, Moviment moviment, Item item){
        return Bard.builder()
                .usuario(usuario)
                .life(30)
                .strength(5)
                .magic(2)
                .charisma(30)
                .level(1)
                .status(this.status)
                .moviment(moviment)
                .item(item)
                .build();
    }
}
