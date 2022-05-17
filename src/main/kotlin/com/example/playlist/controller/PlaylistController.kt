package com.example.playlist.controller

import com.example.playlist.document.Playlist
import com.example.playlist.document.Video
import com.example.playlist.service.PlaylistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.LocalDateTime

@CrossOrigin(origins = ["*"])
@RestController
class PlaylistController(
    @Autowired
    val service: PlaylistService
) {

    @GetMapping(value = ["/playlist"])
    fun getPlaylist(): Flux<Playlist> {return service.findAll()}

    @GetMapping(value = ["/playlist/{id}"])
    fun getPlaylistById(@PathVariable id:String):Mono<Playlist> {return service.findById(id)}

    @GetMapping(value = ["/playlist/mvc"])
    fun getPlaylistByMVC(): Playlist {

        println("---Start get Playlists by MVC--- " + LocalDateTime.now());

        var playList = Playlist(
            id = LocalDateTime.now().toString(),
            name = "Pedro Playlists >:()",
            videos = ArrayList<Video>()
        );

        playList.videos.add(Video(
            id = Math.random().toString(),
            name = "Pedro Videos >:()",
            url = "https://www.pedro_videos.irados.com"
        ))
        playList.videos.add(Video(
            id = Math.random().toString(),
            name = "Rogério Teki Tutoriais <:()",
            url = "https://www.youtube.com/watch?v=064_8_TIs9I"
        ))
        playList.videos.add(Video(
            id = Math.random().toString(),
            name = "Curiosidades Para Whatsapp <:()",
            url = "https://www.youtube.com/watch?v=4cVo-nLbjsY&t=49s"
        ))

        return playList;
    }

}