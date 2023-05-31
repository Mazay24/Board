package Controller;

import com.example.board.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("Board/")
public class BoardController {
    @GetMapping("getId_task")
    public int getId_task() {
        return 0;
    }
    @GetMapping("getAll_tasks")
    public int getAll_tasks() {
        return 0;
    }
    @GetMapping("getDebt")
    public int getDebt() {
        return 0;
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
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> handleException (BusinessException exception) {
        log.error(exception.getMessage(), exception);
        return new ResponseEntity<>(HttpStatus.PAYMENT_REQUIRED);
    }
}
