package com.task2.task2.Model;
import jakarta.persistence.*;


@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String gender;
    @Column
    private String phoneNumber;
    @Column
    private String email;

    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }
}
