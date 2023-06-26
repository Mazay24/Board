package com.example.board.controller;

import com.example.board.dto.ReleaseRequest;
import com.example.board.dto.ReleaseResponse;
import com.example.board.dto.TaskRequest;
import com.example.board.service.RealeaseService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
@RequestMapping("/release")
public class ReleaseController {
    private final RealeaseService realeaseService;

    public ReleaseController(RealeaseService realeaseService) {
        this.realeaseService = realeaseService;
    }

    @GetMapping("/{idTask}/release-info")
    ResponseEntity<ReleaseResponse> getRelease(@PathVariable("idTask") Integer idTask){
        return ResponseEntity.ok(realeaseService.getRealease(idTask));
    }
    @PutMapping("/{idTask}/release")
    ResponseEntity<ReleaseResponse> updateRelease(@PathVariable("idTask") Integer idTask,  @RequestBody ReleaseRequest releaseRequest){
       return ResponseEntity.ok(realeaseService.update(idTask, releaseRequest));
    }


    @Operation(summary = "Создания релиза")
    @PostMapping("/release")
    ResponseEntity<ReleaseResponse> createRelease(@Validated @RequestBody ReleaseRequest releaseRequest){
        return ResponseEntity.ok(realeaseService.createRealease(releaseRequest));
    }
    @DeleteMapping("/{idTask}/release")
    ResponseEntity<?> deleteRelease(@PathVariable("idTask") Integer idTask){
        realeaseService.delete(idTask);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/task-debt")
    ResponseEntity<?> debtSearch(){
        return ResponseEntity.ok(realeaseService.debtSearch());
    }



}
