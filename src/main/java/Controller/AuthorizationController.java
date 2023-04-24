package Controller;

import com.example.board.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("Authorization/")
public class AuthorizationController {
    @GetMapping("getFi")
    public String getFi() {
        return null;
    }
    @GetMapping("getLogin")
    public String getLogin() {
        return null;
    }
    @GetMapping("getPassword")
    public String getPassword() {
        return null;
    }
    @PostMapping("postFi")
    public String postFi() {
        return null;
    }
    @PostMapping("postLogin")
    public String postLogin() {
        return null;
    }
    @PostMapping("postPassword")
    public String postPassword() {return null;}
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
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> handleException (BusinessException exception) {
        log.error(exception.getMessage(), exception);
        return new ResponseEntity<>(HttpStatus.PAYMENT_REQUIRED);
    }
}
