package com.example.playlist.document

import org.springframework.data.annotation.Id

data class Video(
    @Id
    val id: String,
    val url: String,
    val name: String,
)
