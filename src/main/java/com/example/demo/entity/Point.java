package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
@Getter
public class Point implements Serializable {
    @Column
    private int x;
    @Column
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
}
