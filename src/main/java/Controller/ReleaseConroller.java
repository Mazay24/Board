package Controller;

import com.example.board.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("Board/")
public class ReleaseConroller {
    @GetMapping("getStart")
    public Date getStart() {
        return null;
    }
    @GetMapping("getEnd")
    public Date getEnd() {
        return null;
    }
    @PostMapping("postStart")
    public Date postStart() {
        return null;
    }
    @PostMapping("postEnd")
    public Date postEnd() {
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
    public ResponseEntity<String> handleException (BusinessException exception) {
        log.error(exception.getMessage(), exception);
        return new ResponseEntity<>(HttpStatus.PAYMENT_REQUIRED);
    }
}
