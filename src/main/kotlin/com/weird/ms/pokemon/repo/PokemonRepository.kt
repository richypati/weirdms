package com.weird.ms.pokemon.repo

import com.weird.ms.pokemon.entity.PokemonEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonRepository : JpaRepository<PokemonEntity, Long>