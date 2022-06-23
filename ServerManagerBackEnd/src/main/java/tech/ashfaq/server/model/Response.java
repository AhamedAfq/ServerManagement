package tech.ashfaq.server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

/**
 *
Using a class to return it everytime when building the API.
We use this class to sent information over to the user through the frontEnd.
This class represents the response that the user gets everytime the user send the request.
*/

/**
 * @JsonInclude(NON_NULL) at line number 26 because whenever there is a success response,
 * the developerMessage and the reason values are going to be null.So to avoid sending them in response,
 * in the case of success we are using this annotation
 */

@Data
@SuperBuilder
@JsonInclude(NON_NULL)
public class Response {

    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
    protected String developerMessage;
    protected Map<?,?> data;

}

