package apass.saladereuniao.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ErrorDetails extends Exception {
    private Date timestamp;
    private String message;
    private String details;
    
    public ErrorDetails(Date timestamp, String message, String details) {
	super(message);
	this.timestamp = timestamp;
	this.message = message;
	this.details = details;
    }
    
    
}
