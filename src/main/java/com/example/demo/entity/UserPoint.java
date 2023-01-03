package com.example.demo.entity;

import com.example.demo.dto.UserPointDto;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserPoint {
    @EmbeddedId
    private Point point;

    @Column
    private String nickname;

    public static UserPoint toEntity(UserPointDto dto) {
        return new UserPoint(new Point(dto.getPoint().getX(), dto.getPoint().getY()), dto.getNickname());
    }
}
