package com.example.taskmanager.model;
import jakarta.persistence.*;import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity @Table(name="users")
public class User{
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(unique=true) private String username;
 @JsonIgnore private String password;
 public User(){} public User(String u,String p){this.username=u;this.password=p;}
 public Long getId(){return id;} public String getUsername(){return username;}
 public String getPassword(){return password;}
}
