package DTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

public class ReleaseResponse {
    private Date start;
    private Date end;

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
    @PostMapping("/release")
    public ResponseEntity<ReleaseResponse> createProduct(
            @RequestBody ReleaseRequest request) {
        return null;
    }
}
