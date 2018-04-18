package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Table
@Entity
public class User implements Serializable {


    @Id
    @GeneratedValue
    @Column(name = "uid")
    private Integer id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(name = "user_things",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "things_id") })
    private Set<Things> things;

    @Column
    private Integer age;

    @Column
    private String gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<Things> getThings() {
        return things;
    }

    public void setThings(Set<Things> things) {
        this.things = things;
    }
}
