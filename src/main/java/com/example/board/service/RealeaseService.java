package com.example.board.service;

import com.example.board.dto.ReleaseRequest;
import com.example.board.dto.ReleaseResponse;
import com.example.board.dto.TaskRequest;


public interface RealeaseService {
    ReleaseResponse getRealease(Integer idTask);
    ReleaseResponse createRealease(ReleaseRequest releaseRequest);
    ReleaseResponse update(Integer idTask, ReleaseRequest releaseRequest);
    void delete(Integer idTask);
    ReleaseResponse debtSearch();

}
