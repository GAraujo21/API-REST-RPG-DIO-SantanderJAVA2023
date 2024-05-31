package me.finalprojectsantanderjava2023.Repository;

import me.finalprojectsantanderjava2023.Entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
