package com.stackroute.muzix;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Track {
    @Id
    int trackid;
    String trackname;
    String trackcomment;
}
