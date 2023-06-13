package com.example.board.service;

import com.example.board.dto.BoardRequest;
import com.example.board.dto.BoardResponse;
import com.example.board.dto.ReleaseRequest;
import com.example.board.dto.ReleaseResponse;
import com.example.board.enity.Realease;

public interface RealeaseService {
    ReleaseResponse getRealease(String name);
    ReleaseResponse createRealease(ReleaseRequest releaseRequest);
    ReleaseResponse update(String name, ReleaseRequest releaseRequest);
    public void delete(String name);

}
