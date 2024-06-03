package me.finalprojectsantanderjava2023.DTO.GameUserDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.finalprojectsantanderjava2023.Entities.GameUser;
import me.finalprojectsantanderjava2023.Entities.Person.Person;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameUserUpdateDTO {

    @NotBlank(message = "O nome não pode ser vazio ou nulo!")
    @Size(min = 3, max = 20)
    private String name;

    private Person person;

    public GameUser toEntityUpdate(GameUser gameUser){
        return GameUser.builder()
                .id(gameUser.getId())
                .name(this.name)
                .person(this.person)
                .build();
    }
}
