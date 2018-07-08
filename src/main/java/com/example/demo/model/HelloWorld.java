package com.example.demo.model;

/**
 * Created by hjt on 2018/7/8.
 */
public class HelloWorld {
    private String name;

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

    private Integer age;

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
