package com.example.playlist.functional_rest

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RequestPredicates.*
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration
class PlaylistRouter {
    @Bean
    fun route(handler: PlaylistHandler): RouterFunction<ServerResponse>{
        return RouterFunctions
            .route(GET("/playlist").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
            .andRoute(GET("/playlist/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findByID)
            .andRoute(POST("/playlist").and(accept(MediaType.APPLICATION_JSON)), handler::save)
    }
}