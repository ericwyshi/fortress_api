package com.hybris.fortress.jaxb;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "MyStudent", namespace = "http://example.sam.jaxb")
@XmlType(
 name = "StudentType",
 namespace = "http://example2.sam.jaxb",
 propOrder = {"name", "id", "course"}
)
@XmlAccessorType(
 value = XmlAccessType.FIELD
)
//@XmlAccessorOrder(value = XmlAccessOrder.ALPHABETICAL) 作用与上述 propOrder 类似
public class Student {

    @XmlElement(name = "sid", required = true)
    private String id;
    private String name;

    @XmlTransient
    private Integer age;

    @XmlElementWrapper(name = "courses")
    private List<String> course;

    public Student(){
    }

    public Student(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
