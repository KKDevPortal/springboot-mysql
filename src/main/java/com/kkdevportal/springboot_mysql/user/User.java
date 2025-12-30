package com.kkdevportal.springboot_mysql.user;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="USER")
public class User {
    @Id
    @Column(name="userId")
    private String userId;

    @Column(name="userName")
    private String userName;

    @Column(name="mobileNumber")
    private String mobileNumber;

    @Column(name="emailId")
    private String emailId;

    @Column(name="createdOn")
    private Date createdOn;
}
