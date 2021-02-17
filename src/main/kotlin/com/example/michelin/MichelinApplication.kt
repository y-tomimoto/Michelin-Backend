package com.example.michelin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MichelinApplication

fun main(args: Array<String>) {
	runApplication<MichelinApplication>(*args)
}
