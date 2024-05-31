package me.finalprojectsantanderjava2023.Repository;

import me.finalprojectsantanderjava2023.Entities.Person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
