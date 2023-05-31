package Controller;

import com.example.board.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("Task/")

public class TaskController {
    @GetMapping("getTask_name")
    public String getTask_name() {
        return "Всё ОК";
    }
    @GetMapping("getExecutor")
    public String getExecutor() {
        return null;
    }
    @GetMapping("getTask_status")
    public String getTask_status() {
        return null;
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
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> handleException (BusinessException exception) {
        log.error(exception.getMessage(), exception);
        return new ResponseEntity<>(HttpStatus.PAYMENT_REQUIRED);
    }

}
