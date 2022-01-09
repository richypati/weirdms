package com.weird.ms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan("com.weird.ms")
@EntityScan("com.weird.ms.pokemon.entity")
@EnableJpaRepositories("com.weird.ms.pokemon.repo")
class MsApplication

fun main(args: Array<String>) {
	runApplication<MsApplication>(*args)
}
