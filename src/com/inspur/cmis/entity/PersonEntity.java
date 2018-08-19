package com.inspur.cmis.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by LiuLiHao on 2018/8/15 20:28.
 * 描述：
 * 作者： LiuLiHao
 */
@Entity
@Table(name = "person", schema = "popular_bank_dev")
public class PersonEntity {
    private int id;
    private String name;
    private Integer age;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity that = (PersonEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
