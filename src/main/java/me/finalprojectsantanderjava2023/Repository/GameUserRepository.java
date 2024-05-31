package me.finalprojectsantanderjava2023.Repository;

import me.finalprojectsantanderjava2023.Entities.GameUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameUserRepository extends JpaRepository<GameUser, Long> { // entre Integer e Long. Long pode receber números maiores
}
