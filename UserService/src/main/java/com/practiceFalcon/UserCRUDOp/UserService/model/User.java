package com.practiceFalcon.UserCRUDOp.UserService.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String userEmail;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Marks marks;

    public User() {}

//    public User(String userName, String userEmail) {
//        this.userName = userName;
//        this.userEmail = userEmail;
//    }

    // setters and getters
    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}
    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}
    public String getUserEmail() {return userEmail;}
    public void setUserEmail(String userEmail) {this.userEmail = userEmail;}

}
