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
import java.util.Date;


@RestController
@RequestMapping("/board")
public class ReleaseConroller {
    @GetMapping("/getStart")
    public Date getStart() {
        return null;
    }
    @GetMapping("/getEnd")
    public Date getEnd() {
        return null;
    }
    @PostMapping("/postStart")
    public Date postStart() {
        return null;
    }
    @PostMapping("/postEnd")
    public Date postEnd() {
        return null;
    }
    @DeleteMapping("/deleteStart")
    public Date deleteStart() {
        return null;
    }
    @DeleteMapping("/deleteEnd")
    public Date deleteEnd() {
        return null;
    }
    @ExceptionHandler(BusinessException.class)
    public static ResponseEntity.BodyBuilder handleException (BusinessException exception) {
        Logger log = LogManager.getLogger(ReleaseConroller.class);
        log.error(exception.getMessage(), exception);
        return ResponseEntity.ok();
    }
}
