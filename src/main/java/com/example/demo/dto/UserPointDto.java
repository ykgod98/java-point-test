package com.example.demo.dto;

import com.example.demo.entity.Point;
import com.example.demo.entity.UserPoint;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserPointDto {
        private PointDto point;

        private String nickname;


        public static UserPointDto toDto(UserPoint userPoint) {
                return new UserPointDto(new PointDto(userPoint.getPoint().getX(), userPoint.getPoint().getY()), userPoint.getNickname());
        }
}
