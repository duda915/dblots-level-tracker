package com.mdud.dblotsleveltracker.repository;

import com.mdud.dblotsleveltracker.model.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long> {
    Iterable<Character> findByAdvancesListDay(Date date);
}
