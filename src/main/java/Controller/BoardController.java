package Controller;

import com.example.board.exception.BusinessException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;


@RestController
@RequestMapping("/board")
public class BoardController {
    Logger log = LogManager.getLogger(BoardController.class);
    @GetMapping("/getId_task")
    public int getIdtask() {
        return 0;
    }
    @GetMapping("/getAll_tasks")
    public int getAlltasks() {
        return 0;
    }
    @GetMapping("/getDebt")
    public int getDebt() {
        return 0;
    }
    @PostMapping("/postId_task")
    public int postIdtask() {
        return 5;
    }
    @PostMapping("/postAll_tasks")
    public int postAlltasks() {
        return 5;
    }
    @PostMapping("/postDebt")
    public int postDebt() {
        return 5;
    }

    @DeleteMapping("/deleteId_task")
    public int deleteIdtask() {
        return 0;
    }
    @DeleteMapping("/deleteAll_tasks")
    public int deleteAlltasks() {
        return 0;
    }
    @DeleteMapping("/deleteDebt")
    public int deleteDebt() {
        return 0;
    }

    @DeleteMapping("/deleteId_project")
    public int deleteIdproject() {
        return 0;
    }
    @DeleteMapping("/deleteProject_author")
    public String deleteProjectauthor() {
        return null;
    }
    @DeleteMapping("/deleteProject_name")
    public String deleteProjectname() {
        return null;
    }
    @DeleteMapping("/deleteProject_description")
    public String deleteProjectdescription() {
        return null;
    }
    @DeleteMapping("/deleteProject_status")
    public String deleteProjectstatus() {
        return null;
    }
    @ExceptionHandler(BusinessException.class)
    public static ResponseEntity.BodyBuilder handleException (BusinessException exception) {
        Logger log = LogManager.getLogger(BoardController.class);
        log.error(exception.getMessage(), exception);
        return ResponseEntity.ok();
    }
}
