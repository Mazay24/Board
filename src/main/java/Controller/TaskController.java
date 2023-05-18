package Controller;

import com.example.board.exception.BusinessException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestController
@RequestMapping("/task")

public class TaskController {
    @GetMapping("/getTask_name")
    public String getTaskname() {
        return "Всё ОК";
    }
    @GetMapping("/getExecutor")
    public String getExecutor() {
        return null;
    }
    @GetMapping("/getTask_status")
    public String getTaskstatus() {
        return null;
    }
    @PostMapping("/postTask_name")
    public String postTaskname() {
        return "";
    }
    @PostMapping("/postExecutor")
    public String postExecutor() {
        return "";
    }
    @PostMapping("/postTask_status")
    public String postTaskstatus() {
        return "";
    }
    @PostMapping("/deleteTask_name")
    public String deleteTaskname() {
        return "";
    }
    @PostMapping("/deleteExecutor")
    public String deleteExecutor() {
        return "";
    }
    @PostMapping("/deleteTask_status")
    public String deleteTaskstatus() {
        return "";
    }

    @ExceptionHandler(BusinessException.class)
    public static ResponseEntity.BodyBuilder handleException (BusinessException exception) {
        Logger log = LogManager.getLogger(TaskController.class);
        log.error(exception.getMessage(), exception);
        return ResponseEntity.ok();
    }

}
