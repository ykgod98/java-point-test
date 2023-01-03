package com.example.demo.service;

import com.example.demo.dto.UserPointDto;
import com.example.demo.entity.UserPoint;
import com.example.demo.repository.UserPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {

    @Autowired
    private UserPointRepository userPointRepository;
    public void createPoint(UserPointDto dto) {

        if (null == userPointRepository.findByNickname(dto.getNickname())) {
            UserPoint userPoint = UserPoint.toEntity(dto);
            userPointRepository.save(userPoint);
        }

        // x

    }

    public List<UserPointDto> getAllPoint() {
        List<UserPoint> list = userPointRepository.findAll();

        List<UserPointDto> dtos = list.stream().map(x -> UserPointDto.toDto(x)).collect(Collectors.toList());
        return dtos;
    }

    public void updatePoint(UserPointDto dto) {
        UserPoint userPoint = UserPoint.toEntity(dto);
        userPointRepository.save(userPoint);
    }
}
