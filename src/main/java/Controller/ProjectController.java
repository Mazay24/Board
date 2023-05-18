package Controller;

import com.example.board.exception.BusinessException;
import com.example.board.exception.ControllerAdvice;
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
@RequestMapping("/project")
public class ProjectController {
    @GetMapping("/getId_project")
    public int getIdproject() {
        return 0;
    }
    @GetMapping("/getProject_author")
    public String getProjectauthor() {
        return null;
    }
    @GetMapping("/getProject_name")
    public String getProjectname() {
        return null;
    }
    @GetMapping("/getProject_description")
    public String getProjectdescription() {
        return null;
    }
    @GetMapping("/getProject_status")
    public String getProjectstatus() {
        return null;
    }
    @GetMapping("/postId_project")
    public int postIdproject() {
        return 5;
    }
    @PostMapping("/postProject_author")
    public String postProjectauthor() {
        return "";
    }
    @PostMapping("/postProject_name")
    public String postProjectname() {
        return "";
    }
    @PostMapping("/postProject_description")
    public String postProjectdescription() {
        return "";
    }
    @PostMapping("/postProject_status")
    public String postProjectstatus() {
        return "";
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
        Logger log = LogManager.getLogger(ProjectController.class);
        log.error(exception.getMessage(), exception);
        return ResponseEntity.ok();
    }
}
