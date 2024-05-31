package me.finalprojectsantanderjava2023.Repository;

import me.finalprojectsantanderjava2023.Entities.Moviment.Moviment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentRepository extends JpaRepository<Moviment, Long> {
}
