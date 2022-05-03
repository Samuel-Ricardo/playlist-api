package com.example.playlist.document

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Playlist(
    @Id
    val id: String,
    val name: String,
    val videos: List<Video>
)
