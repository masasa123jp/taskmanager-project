package com.example.taskmanager.model;
import jakarta.persistence.*;import org.springframework.data.elasticsearch.annotations.Document;
@Entity @Table(name="tasks") @Document(indexName="tasks")
public class Task{
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String title; private String description; private String status;
 @ManyToOne(fetch=FetchType.EAGER) private User assignee;
 public Task(){} public Task(String t,String d,String s,User a){title=t;description=d;status=s;assignee=a;}
 public Long getId(){return id;} public String getTitle(){return title;} public String getStatus(){return status;}
 public User getAssignee(){return assignee;}
}
