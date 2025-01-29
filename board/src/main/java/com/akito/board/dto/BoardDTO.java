package com.akito.board.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;



@Data
public class BoardDTO {
    
    
    private Long board_UniqeId;
    private LocalDate localDate;
    private LocalTime LocalTime;
    private String Author;
    private String title;
    private String content;
    private String Delete;

}
