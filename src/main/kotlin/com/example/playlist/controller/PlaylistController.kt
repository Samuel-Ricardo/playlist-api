package com.example.playlist.controller

import com.example.playlist.document.Playlist
import com.example.playlist.service.PlaylistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@CrossOrigin(origins = ["*"])
@RestController
class PlaylistController(
    @Autowired
    val service: PlaylistService
) {

    @GetMapping(value = ["/playlist"])
    fun getPlaylist(): Flux<Playlist> {return service.findAll()}

    @GetMapping(value = ["/playlist/{id}"])
    fun getPlaylistById(@PathVariable id:String):Mono<Playlist {return service.findById(id)}


}