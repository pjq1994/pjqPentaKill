package com.panda.complex.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private int id;
    private String name;
    private int money;

    public Employee(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }
}
