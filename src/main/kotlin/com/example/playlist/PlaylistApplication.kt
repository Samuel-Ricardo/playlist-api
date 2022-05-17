package com.example.playlist

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ComponentScans
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScans
@SpringBootApplication
class PlaylistApplication

fun main(args: Array<String>) {
    runApplication<PlaylistApplication>(*args)
    println("Helo Wolrd")
}
