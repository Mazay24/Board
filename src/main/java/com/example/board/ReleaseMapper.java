package com.example.board;

import com.example.board.dto.ReleaseRequest;
import com.example.board.dto.ReleaseResponse;
import com.example.board.enity.Release;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReleaseMapper {
    ReleaseMapper INSTANCE = Mappers.getMapper(ReleaseMapper.class);
    Release toDAO(ReleaseRequest releaseRequest);
    ReleaseResponse toResponse(ReleaseRequest releaseRequest);
    ReleaseResponse fromEnity(Release realease);
}
