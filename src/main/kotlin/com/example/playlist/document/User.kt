package com.example.playlist.document

import org.springframework.data.annotation.Id

data class User(
    @Id
    val id: String,
    val name: String,
    val favorites: Playlist,
    val playlists: MutableList<Playlist>,
)
