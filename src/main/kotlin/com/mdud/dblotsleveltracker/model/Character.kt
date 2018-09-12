package com.mdud.dblotsleveltracker.model

import javax.persistence.*

@Entity
@Table(name = "dblcharacter")
data class Character (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long?,

        @Column(name = "name")
        var name:String,

        @OneToMany(cascade = [CascadeType.ALL])
        @JoinColumn(name = "character_id", referencedColumnName = "id", nullable = false)
        var advancesList:MutableList<Advance>,

        @Enumerated(EnumType.STRING)
        @Column(name = "race")
        var race:Race
){
}