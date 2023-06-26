package com.example.board.service.impl;


import com.example.board.ReleaseMapper;
import com.example.board.dto.*;
import com.example.board.enity.Release;
import com.example.board.exception.NotFoundException;
import com.example.board.repository.RealeaseRepository;
import com.example.board.service.RealeaseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RealeaseServiceImpl implements RealeaseService {
    private final RealeaseRepository realeaseRepository;
    private final ReleaseMapper mapper = ReleaseMapper.INSTANCE;



    public RealeaseServiceImpl(RealeaseRepository realeaseRepository) {
        this.realeaseRepository = realeaseRepository;
    }

    @Override
    public ReleaseResponse getRealease(Integer idTask) {
        Release realease = realeaseRepository.findByIdTask(idTask);
        if (realease == null) {
            System.out.println("задача не найдена");
            throw new NotFoundException("Задача не найдена");
        } else {
            System.out.println(realease);
        }
        return mapper.fromEnity(realease);
    }



    @Override
    public ReleaseResponse createRealease(ReleaseRequest releaseRequest) {
        realeaseRepository.saveAndFlush(mapper.toDAO(releaseRequest));
        return mapper.toResponse(releaseRequest);
    }

    @Override
    public ReleaseResponse update(Integer idTask, ReleaseRequest releaseRequest) {
        Release realease = realeaseRepository.findByIdTask(idTask);
        if (realease == null) {
            throw new NotFoundException("Задача не найдена");
        } else {
            realeaseRepository.delete(realease);
            realeaseRepository.saveAndFlush(mapper.toDAO(releaseRequest));
        }
        return mapper.toResponse(releaseRequest);
    }
    @Override
    public void delete(Integer idTask) {
        Release realease = realeaseRepository.findByIdTask(idTask);
        if (realease == null) {
            throw new NotFoundException("Задача не найдена");
        } else {
            realeaseRepository.delete(realease);
        }
    }
    @Override
    public ReleaseResponse debtSearch() {
        List<Release> list = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            realeaseRepository.findAll();

        }
        return null;
    }
}
