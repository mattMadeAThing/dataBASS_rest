package com.mattmademethod.databassv2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.mattmademethod.databassv2.domain.Song;
import com.mattmademethod.databassv2.repositories.SongRepository;
import com.mattmademethod.databassv2.services.SongService;
import com.mattmademethod.databassv2.services.SongServiceImpl;



@Controller
@RequestMapping(SongController.BASE_URL)
public class SongController {

	public static final String BASE_URL = "api";
	 
	@Autowired
	private SongRepository songRepository;
	
	
	@CrossOrigin
	@GetMapping("/byartist/{artist}")
	public @ResponseBody Iterable<Song> getSongsByArtist(@RequestParam String artistInput){
		return songRepository.findByArtist(artistInput);
	}
	
	@CrossOrigin
	@GetMapping("/bysong/{songName}") 
	public @ResponseBody Iterable<Song> getSongsByTitle(@RequestParam String songName) {
		return songRepository.findBySongName(songName);
	}
	@CrossOrigin
	@GetMapping("/activereqs") 
	public @ResponseBody Iterable<Song> getActiveReqs() {
		return songRepository.activeReqs();
	}
	
	@CrossOrigin
	@PatchMapping("/flipactive/{id}")
	public void flipActive(@RequestParam int id){
		Song flip = songRepository.findById(id).get();
		flip.setActive(true);
		songRepository.save(flip);
	}
	
	@CrossOrigin
	@PatchMapping("rateup/{id}")
	public void rateUp(@RequestParam int id){
		Song song = songRepository.findById(id).get();
		song.setRating(song.getRating() + 1);
		songRepository.save(song);
	}
	@CrossOrigin
	@PatchMapping("ratedown/{id}")
	public void rateDown(@RequestParam int id) {
		Song song = songRepository.findById(id).get();
		song.setRating(song.getRating() - 1);
		songRepository.save(song);
	} 
	
	
	
	
	
}
