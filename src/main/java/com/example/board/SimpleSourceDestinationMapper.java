package com.example.board;

import DTO.*;
import com.example.board.enity.*;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
    Board sourceToDestination(Authorization source);
    Authorization destinationToSource(Board destination);
    AuthorizationRequest sourceToDestination(BoardRequest source);
    BoardRequest destinationToSource(AuthorizationRequest destination);
    Realease sourceToDestination(Project source);
    Project destinationToSource(Realease destination);
    ReleaseRequest sourceToDestination(ProjectRequest source);
    ProjectRequest destinationToSource(ReleaseRequest destination);


}
