package com.example.board.controller;

import com.example.board.DTO.ReleaseRequest;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.text.DateFormat;


@RestController
@RequestMapping("/board")
public class ReleaseConroller {
    @GetMapping("/release-info")
    ResponseEntity<?> getRelease(@RequestHeader(value = "start")DateFormat start, @RequestHeader(value = "end")DateFormat end){
        return null;
    }
    @Operation(summary = "Создания релиза")
    @PostMapping("/release")
    ResponseEntity<?> createRelease(@Validated @RequestBody ReleaseRequest releaseRequest){
        return null;
    }
    @DeleteMapping("/release")
    ResponseEntity<?> deleteRelease(){
        return null;
    }

}
