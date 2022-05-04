package com.example.playlist.service

import com.example.playlist.document.Playlist
import com.example.playlist.repository.PlaylistRepository
import org.springframework.beans.factory.annotation.Autowired
import reactor.core.publisher.Mono

class PlaylistServiceImpl: PlaylistService {

    @Autowired
    val repository: PlaylistRepository = TODO();

    override fun findById(id: String): Mono<Playlist> { return repository.findById(id); }
}