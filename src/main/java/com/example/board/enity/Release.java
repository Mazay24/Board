package com.example.board.enity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "realease")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Release {
    @Id
    @Column(name = "id_Task", nullable = false)
    private Integer idTask;
    @Column(name = "start", nullable = false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date start;
    @Column(name = "finish", nullable = false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date end;
}
