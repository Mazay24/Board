package Controller;

import com.example.board.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("Project/")
public class ProjectController {
    @GetMapping("getId_project")
    public int getId_project() {
        return 0;
    }
    @GetMapping("getProject_author")
    public String getProject_author() {
        return null;
    }
    @GetMapping("getProject_name")
    public String getProject_name() {
        return null;
    }
    @GetMapping("getProject_description")
    public String getProject_description() {
        return null;
    }
    @GetMapping("getProject_status")
    public String getProject_status() {
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
