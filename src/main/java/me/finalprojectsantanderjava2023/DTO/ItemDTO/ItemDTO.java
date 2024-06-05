package me.finalprojectsantanderjava2023.DTO.ItemDTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.finalprojectsantanderjava2023.Entities.Item;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {

    @NotBlank(message = "O nome não pode ser vazio ou nulo!")
    private String name;

    @NotNull(message = "A força não pode ser nula")
    @Min(value = 1, message = "O valor mínimo é 1")
    private int strength;

    @NotNull(message = "A magia não pode ser nula")
    @Min(value = 1, message = "O valor mínimo é 1")
    private int magic;

    @NotNull(message = "O carisma não pode ser nulo")
    @Min(value = 1, message = "O valor mínimo é 1")
    private int charisma;

    @NotBlank(message = "A descrição não pode ser nula ou vazia!")
    private String description;

    public Item toEntity(){
        return Item.builder()
                .name(this.name)
                .strength(this.strength)
                .magic(this.magic)
                .charisma(this.charisma)
                .description(this.description)
                .build();
    }
}
