package com.example.playlist.service

import com.example.playlist.document.Playlist
import com.example.playlist.repository.PlaylistRepository
import org.springframework.beans.factory.annotation.Autowired
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

class PlaylistServiceImpl: PlaylistService {

    @Autowired
    lateinit var repository: PlaylistRepository;

    override fun findById(id: String): Mono<Playlist> { return repository.findById(id); }
    override fun findAll(): Flux<Playlist> {return repository.findAll()}
    override fun save(playlist: Playlist): Mono<Playlist> { return repository.save(playlist) }
}