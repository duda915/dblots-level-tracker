package com.mdud.dblotsleveltracker.runner

import com.mdud.dblotsleveltracker.model.Advance
import com.mdud.dblotsleveltracker.model.Character
import com.mdud.dblotsleveltracker.model.Race
import com.mdud.dblotsleveltracker.repository.CharacterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.util.*

@Component
class InitData (@Autowired val characterRepository: CharacterRepository) : CommandLineRunner{

    override fun run(vararg args: String?) {
        characterRepository.deleteAll()
        Arrays.asList(1, 2, 3, 4, 5).forEach {
            val advance = Advance(null, null, Date(), 1, it)
            val advanceList = mutableListOf<Advance>(advance)
            val character = Character(null, "Test", advanceList, Race.Brolly)
            characterRepository.save(character)
        }
    }

}