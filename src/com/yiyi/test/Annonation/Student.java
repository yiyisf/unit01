package com.yiyi.test.Annonation;

/**
 * Created by liuzhe on 2016/7/5.
 */
@Table("tb_student")
public class Student {
    @TableField(name = "id",type = "int", len = 10)
    private int id;
    @TableField(name = "name",type = "verchar", len = 30)
    private String name;
    @TableField(name = "age",type = "int", len = 3)
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
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
