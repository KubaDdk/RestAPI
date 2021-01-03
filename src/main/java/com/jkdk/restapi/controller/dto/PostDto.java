package com.jkdk.restapi.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Getter
@Builder
public class PostDto {
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;
}
