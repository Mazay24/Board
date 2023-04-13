package com.example.board;

import com.example.board.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
@Slf4j
@RestController
@RequestMapping("controller/")
public class Controller{
    Data data = new Data();
    @GetMapping("getFi")
    public String getFi() {
        return data.getFi();
    }
@GetMapping("getLogin")
    public String getLogin() {
        return data.getLogin();
    }
@GetMapping("getPassword")
    public String getPassword() {
        return data.getPassword();
    }
@GetMapping("getId_project")
    public int getId_project() {
        return data.getId_project();
    }
@GetMapping("getProject_author")
    public String getProject_author() {
        return data.getProject_author();
    }
@GetMapping("getProject_name")
    public String getProject_name() {
        return data.getProject_name();
    }
@GetMapping("getProject_description")
    public String getProject_description() {
        return data.getProject_description();
    }
@GetMapping("getProject_status")
    public String getProject_status() {
        return data.getProject_status();
    }
@GetMapping("getId_task")
    public int getId_task() {
        return data.getId_task();
    }
@GetMapping("getAll_tasks")
    public int getAll_tasks() {
        return data.getAll_tasks();
    }
@GetMapping("getDebt")
    public int getDebt() {
        return data.getDebt();
    }
@GetMapping("getTask_name")
    public String getTask_name() {
        return "Всё ОК";
    }
@GetMapping("getExecutor")
    public String getExecutor() {
        return data.getExecutor();
    }
@GetMapping("getTask_status")
    public String getTask_status() {
        return data.getTask_status();
    }
@GetMapping("getStart")
    public Date getStart() {
        return data.getStart();
    }
@GetMapping("getEnd")
    public Date getEnd() {
        return data.getEnd();
    }
    ////////
    @GetMapping("postFi")
    public String postFi() {
        return null;
    }
    @GetMapping("postLogin")
    public String postLogin() {
        return null;
    }
    @GetMapping("postId_project")
    public int postId_project() {
        return 5;
    }
    @PostMapping("postProject_author")
    public String postProject_author() {
        return "";
    }
    @PostMapping("postProject_name")
    public String postProject_name() {
        return "";
    }
    @PostMapping("postProject_description")
    public String postProject_description() {
        return "";
    }
    @PostMapping("postProject_status")
    public String postProject_status() {
        return "";
    }
    @PostMapping("postId_task")
    public int postId_task() {
        return 5;
    }
    @PostMapping("postAll_tasks")
    public int postAll_tasks() {
        return 5;
    }
    @PostMapping("postDebt")
    public int postDebt() {
        return 5;
    }
    @PostMapping("postTask_name")
    public String postTask_name() {
        return "";
    }
    @PostMapping("postExecutor")
    public String postExecutor() {
        return "";
    }
    @PostMapping("postTask_status")
    public String postTask_status() {
        return "";
    }
    @PostMapping("postStart")
    public Date postStart() {
        return null;
    }
    @PostMapping("postEnd")
    public Date postEnd() {
        return null;
    }
    //////////////////
    @DeleteMapping("deleteFi")
    public String deleteFi() {
        return null;
    }
    @DeleteMapping("deleteLogin")
    public String deleteLogin() {
        return null;
    }
    @DeleteMapping("deletePassword")
    public String deletePassword() {
        return null;
    }
    @DeleteMapping("deleteId_project")
    public int deleteId_project() {
        return 0;
    }
    @DeleteMapping("deleteProject_author")
    public String deleteProject_author() {
        return null;
    }
    @DeleteMapping("deleteProject_name")
    public String deleteProject_name() {
        return null;
    }
    @DeleteMapping("deleteProject_description")
    public String deleteProject_description() {
        return null;
    }
    @DeleteMapping("deleteProject_status")
    public String deleteProject_status() {
        return null;
    }
    @DeleteMapping("deleteId_task")
    public int deleteId_task() {
        return 0;
    }
    @DeleteMapping("deleteAll_tasks")
    public int deleteAll_tasks() {
        return 0;
    }
    @DeleteMapping("deleteDebt")
    public int deleteDebt() {
        return 0;
    }
    @DeleteMapping("deleteTask_name")
    public String deleteTask_name() {
        return null;
    }
    @DeleteMapping("deleteExecutor")
    public String deleteExecutor() {
        return null;
    }
    @DeleteMapping("deleteTask_status")
    public String deleteTask_status() {
        return null;
    }
    @DeleteMapping("deleteStart")
    public Date deleteStart() {
        return null;
    }
    @DeleteMapping("deleteEnd")
    public Date deleteEnd() {
        return null;
    }
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> handleException (BusinessException exception){
        log.error(exception.getMessage(), exception);
return new ResponseEntity<>(HttpStatus.PAYMENT_REQUIRED);
    }
}


