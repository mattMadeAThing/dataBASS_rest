package com.mattmademethod.databassv2.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import com.mattmademethod.databassv2.repositories.SongRepository;
import com.mattmademethod.databassv2.domain.Song;

public class SongServiceImpl implements SongService {
	
	private final SongRepository songRepository;
	
	public SongServiceImpl(SongRepository songRepository) {
		this.songRepository = songRepository;
	}

	@Override
	public Iterable<Song> listSongsByArtist(String artistInput) {
		return null;
	}

	@Override
	public Iterable<Song> listSongsByTitle(String songInput) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Song> songsInQueue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rateUp(Song songSelect) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateDown(Song songSelect) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearSong(Song songSelect) {
		// TODO Auto-generated method stub
		
	}
}
	

