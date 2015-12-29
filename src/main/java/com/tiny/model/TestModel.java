package com.tiny.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Tiny
 * Date: 14-1-28
 * Time: 下午10:40
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class TestModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
