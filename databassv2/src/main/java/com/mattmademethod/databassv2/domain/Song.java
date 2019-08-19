package com.mattmademethod.databassv2.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer songId;
	
	private String artist;
	
	private String songName;
	
	private Date songDate;
	
	private int rating;
	
	private boolean active;
	
	public Integer getSongId() {
		return songId;
	}

	public void setSongId(Integer songId) {
		this.songId = songId;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSong() {
		return songName;
	}

	public void setSong(String song) {
		this.songName = song;
	}

	public Date getSongDate() {
		return songDate;
	}

	public void setSongDate(Date songDate) {
		this.songDate = songDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	/*public void activateReq() {
		this.active
	}*/

	
}
