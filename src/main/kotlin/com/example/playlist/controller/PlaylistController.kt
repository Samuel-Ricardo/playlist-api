package com.example.playlist.controller

import com.example.playlist.service.PlaylistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"])
@RestController
class PlaylistController(
    @Autowired
    val service: PlaylistService
) {

}