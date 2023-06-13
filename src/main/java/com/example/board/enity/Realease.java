package com.example.board.enity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "Realease")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Realease {
    @Id
    @Column(name = "Task_name", nullable = false)
    private String taskName;
    @Column(name = "Start", nullable = false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date start;
    @Column(name = "Finish", nullable = false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date end;
}
