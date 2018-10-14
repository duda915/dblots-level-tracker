package com.mdud.dblotsleveltracker.restcontroller


import com.mdud.dblotsleveltracker.model.Character
import com.mdud.dblotsleveltracker.repository.CharacterRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.Date

@CrossOrigin
@RestController
@RequestMapping("/api/characters")
class CharacterRestController(@Autowired val characterRepository: CharacterRepository) {


    @GetMapping()
    fun getTodayData() : List<Character> {
        return characterRepository.findByAdvancesListDay(
                Date(java.util.Date().time)).toList()
    }
}