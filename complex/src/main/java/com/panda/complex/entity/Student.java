package com.panda.complex.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Student implements Serializable {

    private static final long serialVersionUID = 4745273575096559860L;
    private Integer sid;
    private String name;
    private String gender;
    private Integer age;
    private String address;

}
