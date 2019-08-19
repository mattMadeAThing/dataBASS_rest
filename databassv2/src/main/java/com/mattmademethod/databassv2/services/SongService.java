package com.mattmademethod.databassv2.services;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.mattmademethod.databassv2.domain.Song;
import com.mattmademethod.databassv2.repositories.SongRepository;



public interface SongService{
	
	@Query("SELECT artist, song FROM springschema.song WHERE artist LIKE :artistInput")
	Iterable<Song> listSongsByArtist(@Param("artistInput") String artistInput);
	
	Iterable<Song> listSongsByTitle(String songInput);
	
	Iterable<Song> songsInQueue();
	
	void rateUp(Song songSelect);
	
	void rateDown(Song songSelect);
	
	void clearSong(Song songSelect);
}
