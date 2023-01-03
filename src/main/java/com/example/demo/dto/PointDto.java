package com.example.demo.dto;


import lombok.Getter;

@Getter
public class PointDto {

    private int x;
    private int y;

    public PointDto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
