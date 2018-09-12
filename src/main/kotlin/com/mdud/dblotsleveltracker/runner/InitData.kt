package com.mdud.dblotsleveltracker.runner

import com.mdud.dblotsleveltracker.model.Advance
import com.mdud.dblotsleveltracker.model.Character
import com.mdud.dblotsleveltracker.model.Race
import com.mdud.dblotsleveltracker.repository.CharacterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.sql.Date
import java.time.ZoneId
import java.util.*

@Component
class InitData (@Autowired val characterRepository: CharacterRepository) : CommandLineRunner{

    override fun run(vararg args: String?) {
        characterRepository.deleteAll()
        Arrays.asList(1, 2, 3, 4, 5).forEach {
            val advance = Advance(null, null,
                    Date(java.util.Date().time), 1, it)
            val advanceList = mutableListOf<Advance>(advance)
            val character = Character(null, "Test", Race.Brolly, advanceList)
            characterRepository.save(character)
        }

        val advanceList = mutableListOf<Advance>()
        Arrays.asList(1,2,3).forEach {
            advanceList.add(Advance(null, null,
                    Date(java.util.Date().time), it, it))
        }

        characterRepository.save(Character(null, "Test Multiple", Race.GokuBlack, advanceList))
    }

}