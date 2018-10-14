package com.mdud.dblotsleveltracker.runner

import com.mdud.dblotsleveltracker.model.Advance
import com.mdud.dblotsleveltracker.model.Character
import com.mdud.dblotsleveltracker.model.CharacterDTO
import com.mdud.dblotsleveltracker.model.Race
import com.mdud.dblotsleveltracker.repository.CharacterRepository
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.sql.Date
import java.util.*

@Component
class InitData (@Autowired val characterRepository: CharacterRepository) : CommandLineRunner{

    override fun run(vararg args: String?) {
        println("Empty runner invoked")
//        characterRepository.deleteAll()
//        Arrays.asList(1, 2, 3, 4, 5).forEach {
//            val advance = Advance(null, null,
//                    Date(java.util.Date().time), 1, it)
//            val advanceList = mutableListOf<Advance>(advance)
//            val character = Character(null, "Test", Race.Brolly, advanceList)
//            characterRepository.save(character)
//        }
//
//        val advanceList = mutableListOf<Advance>()
//        Arrays.asList(1,2,3).forEach {
//            advanceList.add(Advance(null, null,
//                    Date(java.util.Date().time), it, it))
//        }
//
//        characterRepository.save(Character(null, "Test Multiple", Race.GokuBlack, advanceList))

        // parse who is online
//        val doc : Document = Jsoup.connect("http://dblots.org.pl/whoisonline.php?lang=en&s=classic").get()
//        val elements : Elements = doc.select(".mid table tr")
//        val onlineCharacterList = mutableListOf<CharacterDTO>()
//        for(row in elements) {
//            val cells = row.select("td")
//            val id = cells.getOrNull(0)?.html()
//            val raceImageUrl = cells.getOrNull(1)?.select("img")?.attr("src")
//            val name = cells.getOrNull(2)?.select("a")?.html() ?: continue
//            val level = cells.getOrNull(3)?.html()
//            val raceString = raceImageUrl?.substringBeforeLast(".png")
//                    ?.substringAfterLast("/")?.replace(" ", "") ?: continue
//            val race = Race.valueOf(raceString)
//
//            val onlineCharacterDTO = CharacterDTO(name, race, Integer.valueOf(level))
//            onlineCharacterList.add(onlineCharacterDTO)
//        }
//
//        val todayData = characterRepository.findByAdvancesListDay(
//                Date(java.util.Date().time)).toList()
//
//        //update db data
//        onlineCharacterList.forEach {
//            var index:Int? = null
//            if(todayData.isNotEmpty()) {
//                for(i in 0 until todayData.size) {
//                    if(todayData[i].name == it.nick && todayData[i].race == it.race) {
//                        index = i
//                        break
//                    }
//                }
//            }
//
//            val defaultAdvanceList = mutableListOf<Advance>(Advance(null, null, Date(java.util.Date().time), it.level, 0))
//            val character = todayData.getOrNull(index ?: -1) ?: Character(null, it.nick, it.race, defaultAdvanceList)
//            val advanceList = character.advancesList
//            advanceList[advanceList.lastIndex].levelAdvances = it.level - advanceList[advanceList.lastIndex].startLevel
//            characterRepository.save(character)
//
////            val advance = Advance(null, null, Date(java.util.Date().time),it.level,0)
////            val advanceList = mutableListOf<Advance>(advance)
////            val character = Character(null, it.nick, it.race, advanceList)
////            characterRepository.save(character)
////            println("${it.nick} | ${it.race} | ${it.level}")

    }

}