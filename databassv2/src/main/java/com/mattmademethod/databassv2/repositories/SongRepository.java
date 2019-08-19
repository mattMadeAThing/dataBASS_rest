package com.mattmademethod.databassv2.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mattmademethod.databassv2.domain.Song;

public interface SongRepository extends CrudRepository<Song, Integer>{
	
	@Query("SELECT artist, songName, rating, songDate from Song where artist LIKE %:qArtist%")
	Iterable<Song> findByArtist(String qArtist);
	
	@Query("SELECT artist, songName, rating, songDate from Song where songName LIKE %:qSongName%")
	Iterable<Song> findBySongName(String qSongName);

	@Query("SELECT artist, songName, rating from Song where rating > 0 AND active = 1")
	Iterable<Song> activeReqs();	
	
	
}
