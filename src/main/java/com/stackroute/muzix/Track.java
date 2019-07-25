package com.stackroute.muzix;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Track {
    @Id
    @ApiModelProperty(notes = "The Track id")
    int trackid;
    @ApiModelProperty(notes = "Name of the track")
    String trackname;
    @ApiModelProperty(notes = "Comments about the track")
    String trackcomment;

}
