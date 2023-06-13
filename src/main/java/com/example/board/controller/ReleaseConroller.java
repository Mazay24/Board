package com.example.board.controller;

import com.example.board.dto.ReleaseRequest;
import com.example.board.service.RealeaseService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/board")
public class ReleaseConroller {
    private final RealeaseService realeaseService;

    public ReleaseConroller(RealeaseService realeaseService) {
        this.realeaseService = realeaseService;
    }

    @GetMapping("/{name}/release-info")
    ResponseEntity<?> getRelease(@PathVariable("name") String name){
        return new ResponseEntity<>(realeaseService.getRealease(name), HttpStatus.OK);
    }
    @PutMapping("/{name}/release")
    ResponseEntity<?> updateRelease(@PathVariable("name") String name,  @RequestBody ReleaseRequest releaseRequest){
       return new ResponseEntity<>(realeaseService.update(name, releaseRequest), HttpStatus.OK);
    }
    @Operation(summary = "Создания релиза")
    @PostMapping("/release")
    ResponseEntity<?> createRelease(@Validated @RequestBody ReleaseRequest releaseRequest){
        return new ResponseEntity<>(realeaseService.createRealease(releaseRequest), HttpStatus.CREATED);
    }
    @DeleteMapping("/{name}/release")
    ResponseEntity<?> deleteRelease(@PathVariable("name") String name){
        realeaseService.delete(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
