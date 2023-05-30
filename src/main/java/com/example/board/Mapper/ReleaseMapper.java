package com.example.board.Mapper;

import com.example.board.DTO.ProjectRequest;
import com.example.board.DTO.ProjectResponse;
import com.example.board.DTO.ReleaseRequest;
import com.example.board.DTO.ReleaseResponse;
import com.example.board.enity.Project;
import com.example.board.enity.Realease;
import org.mapstruct.Mapper;

@Mapper
public interface ReleaseMapper {
    ReleaseRequest fromRequestToResponse(ReleaseResponse releaseResponse);

    ReleaseResponse fromResponseToRequest(ReleaseRequest releaseRequest);

    Realease fromEntityToRequest(ReleaseRequest releaseRequest);

    Realease fromEntityToResponse(ReleaseResponse releaseResponse);

    ReleaseRequest fromRequestToEntity(Realease realease);

    ReleaseResponse fromResponseToEntity(Realease realease);
}
