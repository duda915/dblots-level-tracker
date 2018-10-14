package com.mdud.dblotsleveltracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class DblotsLevelTrackerApplication

fun main(args: Array<String>) {
    runApplication<DblotsLevelTrackerApplication>(*args)
}
