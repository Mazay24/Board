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
@RequestMapping("/authorization")
public class AuthorizationController {
    Logger log = LogManager.getLogger(AuthorizationController.class);
    @GetMapping("/getFi")
    public String getFullName() {
        return null;
    }
    @GetMapping("/getLogin")
    public String getLogin() {
        return null;
    }
    @GetMapping("/getPassword")
    public String getPassword() {
        return null;
    }
    @PostMapping("/postFi")
    public String postFullName() {
        return null;
    }
    @PostMapping("/postLogin")
    public String postLogin() {
        return null;
    }
    @PostMapping("/postPassword")
    public String postPassword() {return null;}
    @DeleteMapping("/deleteFi")
    public String deleteFullName() {
        return null;
    }
    @DeleteMapping("/deleteLogin")
    public String deleteLogin() {
        return null;
    }
    @DeleteMapping("/deletePassword")
    public String deletePassword() {
        return null;
    }
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity.BodyBuilder handleException (BusinessException exception) {
        log.error(exception.getMessage(), exception);
        return ResponseEntity.ok();
    }
}
