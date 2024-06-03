package me.finalprojectsantanderjava2023.DTO.PersonDTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;
import me.finalprojectsantanderjava2023.Entities.Item;
import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import me.finalprojectsantanderjava2023.Entities.Person.Mage;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MageUpdateDTO extends PersonUpdateDTO{
    @NotBlank
    @Min(1)
    private int level;

    @NotBlank
    @Size(min = 20, max = 100)
    private String status;

    private Moviment moviment;

    private Item item;

    public Mage toEntityUpdate(Mage mage, Moviment moviment, Item item){
        return Mage.builder()
                .id(mage.getId())
                .level(this.level)
                .status(this.status)
                .moviment(moviment)
                .item(item)
                .build();
    }
}
