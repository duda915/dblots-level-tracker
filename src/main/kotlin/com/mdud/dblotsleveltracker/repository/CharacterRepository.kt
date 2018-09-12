package com.mdud.dblotsleveltracker.repository

import com.mdud.dblotsleveltracker.model.Character
import org.springframework.data.repository.CrudRepository

interface CharacterRepository : CrudRepository<Character, Long> {

}