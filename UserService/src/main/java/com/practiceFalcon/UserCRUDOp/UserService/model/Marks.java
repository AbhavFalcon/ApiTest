package com.practiceFalcon.UserCRUDOp.UserService.model;

import jakarta.persistence.*;

@Entity
public class Marks {
    @Id
    private int id;
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    @OneToOne
    @JoinColumn(name="userId")
    private User user;
    public Marks() {}

//    public Marks(int subject1, int subject2, int subject3, int subject4){
//        this.subject1 = subject1;
//        this.subject2 = subject2;
//        this.subject3 = subject3;
//        this.subject4 = subject4;
//    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSubject1() {
        return subject1;
    }
    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }
    public int getSubject2() {
        return subject2;
    }
    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }
    public int getSubject3() {
        return subject3;
    }
    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }
    public int getSubject4() {
        return subject4;
    }
    public void setSubject4(int subject4) {
        this.subject4 = subject4;
    }
}
