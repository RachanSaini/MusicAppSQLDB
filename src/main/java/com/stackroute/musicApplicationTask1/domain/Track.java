package com.stackroute.musicApplicationTask1.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//@Document(collection = "Tracks")
@Entity
@Data
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Track Id")
    private int trackId;
    @ApiModelProperty(notes = "Track name")
    private String trackName;
    @ApiModelProperty(notes = "Track comments")
    private String comments;
}
