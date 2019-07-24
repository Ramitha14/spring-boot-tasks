package com.stackroute.repository;

import com.stackroute.muzix.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer>
{
}
