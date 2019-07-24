package com.stackroute.service;

import com.stackroute.muzix.Track;

import java.util.List;

public interface TrackService {

    Track saveTrack(Track track);

    void deleteTrack(int id);

    List<Track> getAllTracks();

    Track getTrackById(int id);

}
