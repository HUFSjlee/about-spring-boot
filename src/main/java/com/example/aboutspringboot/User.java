package com.example.aboutspringboot;

public class User {

    private Long id; //1. 사용자 고유 ID(식별자)
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //'id' 필드의 Getter Setter 추가
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
