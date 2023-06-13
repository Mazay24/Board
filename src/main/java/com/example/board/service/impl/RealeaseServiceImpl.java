package com.example.board.service.impl;

import com.example.board.dto.*;
import com.example.board.enity.Authentication;
import com.example.board.enity.Realease;
import com.example.board.exception.Code;
import com.example.board.exception.CommonException;
import com.example.board.repository.RealeaseRepository;
import com.example.board.service.RealeaseService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class RealeaseServiceImpl implements RealeaseService {
    private final RealeaseRepository realeaseRepository;

    public RealeaseServiceImpl(RealeaseRepository realeaseRepository) {
        this.realeaseRepository = realeaseRepository;
    }

    @Override
    public ReleaseResponse getRealease(String name) {
        Realease realease = realeaseRepository.findByTaskName(name);
        if (realease == null) {
            System.out.println("задача не найдена");
            throw CommonException.builder().code(Code.TASK_ERROR).message("Задача с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            System.out.println(realease);

        }
        return new ReleaseResponse(realease.getTaskName(),realease.getStart(), realease.getEnd());
    }

    @Override
    public ReleaseResponse createRealease(ReleaseRequest releaseRequest) {
        Realease realease = realeaseRepository.findByTaskName(releaseRequest.getTaskName());
        if (realease == null){
            realeaseRepository.saveAndFlush(releaseRequest.toDAO());
        }
        else {
            System.out.println("Задача не найдена");
            throw CommonException.builder().code(Code.TASK_ERROR).message("Задача с таким названием уже существует").httpStatus(HttpStatus.BAD_REQUEST).build();

        }
        return new ReleaseResponse(releaseRequest.getTaskName(),releaseRequest.getStart(),releaseRequest.getEnd());
    }

    @Override
    public ReleaseResponse update(String name, ReleaseRequest releaseRequest) {
        Realease realease = realeaseRepository.findByTaskName(name);
        if (realease == null) {
            System.out.println("Задача не найдена");
            throw CommonException.builder().code(Code.TASK_ERROR).message("Задача с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            realeaseRepository.delete(realease);
            realeaseRepository.saveAndFlush(releaseRequest.toDAO());
        }
        return new ReleaseResponse(releaseRequest.getTaskName(),releaseRequest.getStart(),releaseRequest.getEnd());
    }

    @Override
    public void delete(String name) {
        Realease realease = realeaseRepository.findByTaskName(name);
        if (realease == null) {
            System.out.println("Пользователь не найден!");
            throw CommonException.builder().code(Code.TASK_ERROR).message("Задача с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            realeaseRepository.delete(realease);
        }
    }
}
