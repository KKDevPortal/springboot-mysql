package com.kkdevportal.springboot_mysql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseEnvelope {
    private Object data;
    private HttpStatus httpStatus;
    private int totalCount;
    private Date createdOn;
    private String error;
}
