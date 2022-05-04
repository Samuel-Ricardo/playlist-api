package com.example.playlist.repository

import com.example.playlist.document.Playlist
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface PlaylistRepository:ReactiveMongoRepository<Playlist, String>
