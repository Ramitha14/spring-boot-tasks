package com.stackroute.service;

import com.stackroute.muzix.Track;

import java.util.List;

public interface TrackService {

   public Track saveTrack(Track track);

   public void deleteTrack(int id);

   public List<Track> getAllTracks();

    public Track getTrackById(int id);

     public List<Track> getTrackByName(String name);
}
