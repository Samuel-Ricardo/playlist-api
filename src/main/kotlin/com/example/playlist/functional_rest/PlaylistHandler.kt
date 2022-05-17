package com.example.playlist.functional_rest

import com.example.playlist.document.Playlist
import com.example.playlist.service.PlaylistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

@Component
class PlaylistHandler(
    @Autowired
    val service: PlaylistService
) {

    fun findAll(request: ServerRequest): Mono<ServerResponse>{
        return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(service.findAll(), Playlist::class.java)
    }
}