package com.example.playlist.service

import com.example.playlist.document.Playlist
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
interface PlaylistService {
    fun findAll(): Flux<Playlist>
    fun findById(id: String): Mono<Playlist>
    fun save(playlist: Playlist): Mono<Playlist>
}