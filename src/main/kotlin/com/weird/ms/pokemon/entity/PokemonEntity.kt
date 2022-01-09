package com.weird.ms.pokemon.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "pokemon")
data class PokemonEntity(

    @Id
    @Column(name = "id")
    val id: Long,

    @Column(name = "name")
    val name: String,

    @Column(name = "type1")
    val type1: String,

    @Column(name = "type2")
    val type2: String?,

    @Column(name = "hp")
    val hp: Int,

    @Column(name = "attack")
    val attack: Int,

    @Column(name = "defense")
    val defense: Int,

    @Column(name = "sp_attack")
    val spAttack: Int,

    @Column(name = "sp_defense")
    val spDefense: Int,

    @Column(name = "speed")
    val speed: Int,

    @Column(name = "generation")
    val generation: Int,

    @Column(name = "total")
    val total: Int,

    @Column(name = "legendary")
    val legendary: Boolean
)
