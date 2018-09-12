package com.mdud.dblotsleveltracker.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "dbladvance")
data class Advance(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id:Long?,

        @Column(name = "character_id", insertable = false, updatable = false)
        val character: Long?,

        @Column(name = "day")
        val day: Date?,

        @Column(name = "level_start")
        val startLevel:Int,

        @Column(name = "level_increment")
        var levelAdvances:Int
) {
}