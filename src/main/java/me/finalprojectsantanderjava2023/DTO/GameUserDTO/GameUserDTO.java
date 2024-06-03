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
public class GameUserDTO { // a ideia de DTO é ter um intermediario entre o repositorio e o service, fazer com que não se mecha no repositorio antes de ter a certeza das validações.

    @NotBlank(message = "O nome não pode ser vazio ou nulo!") // a ideia de notblank ao inves de notnull, é não permitir espaços vazios!
    @Size(min = 3, max = 20)
    private String name;

    private Person person;

    public GameUser toEntity(){
        return GameUser.builder()
                .name(this.name)
                .person(this.person)
                .build();
    }
}
