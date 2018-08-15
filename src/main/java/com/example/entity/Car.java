package com.example.entity;

import norm.anno.Column;
import norm.anno.Id;
import norm.anno.Table;

@Table("cars")
public class Car {
    @Id
    @Column("ID")
    private Integer id;
    @Column("NAME")
    private String name;
    @Column("DESCRIPTION")
    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
