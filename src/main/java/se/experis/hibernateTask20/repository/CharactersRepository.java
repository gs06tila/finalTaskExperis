package se.experis.hibernateTask20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.experis.hibernateTask20.model.Characters;

public interface CharactersRepository extends JpaRepository<Characters, Integer> {

    Character findCharacterById(int id);
}
