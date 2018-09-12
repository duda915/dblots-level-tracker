package com.mdud.dblotsleveltracker.model

import javax.persistence.*

@Entity
@Table(name = "dblcharacter")
data class Character (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,

        @Column(name = "name")
        var name:String,

        @Enumerated(EnumType.STRING)
        @Column(name = "race")
        var race:Race
){
}