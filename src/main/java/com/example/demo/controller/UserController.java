package com.example.demo.controller;

import com.example.demo.dto.UserPointDto;
import com.example.demo.entity.Point;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<UserPointDto>> getUserPoint(){
        List<UserPointDto> dtos = userService.getAllPoint();
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity postUserPoint(@RequestBody UserPointDto dto){
        userService.createPoint(dto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PutMapping("/update")
    @ResponseBody
    public ResponseEntity updateUserPoint(@RequestBody UserPointDto dto) {
        userService.updatePoint(dto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
