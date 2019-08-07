package com.miyako.subject.commons.domain;

import javax.persistence.*;

@Table(name = "subject..tb_teacher")
public class TbTeacher {
    /**
     * id 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名 教师姓名
     */
    private String name;

    /**
     * 密码 登陆密码
     */
    private String password;

    /**
     * 性别 男：0，女：1
     */
    private Integer gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 所属学院 学院外键
     */
    @Column(name = "collegeId")
    private Integer collegeid;

    /**
     * 获取id 主键
     *
     * @return id - id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id 主键
     *
     * @param id id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名 教师姓名
     *
     * @return name - 用户名 教师姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名 教师姓名
     *
     * @param name 用户名 教师姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码 登陆密码
     *
     * @return password - 密码 登陆密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码 登陆密码
     *
     * @param password 密码 登陆密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别 男：0，女：1
     *
     * @return gender - 性别 男：0，女：1
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别 男：0，女：1
     *
     * @param gender 性别 男：0，女：1
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取所属学院 学院外键
     *
     * @return collegeId - 所属学院 学院外键
     */
    public Integer getCollegeid() {
        return collegeid;
    }

    /**
     * 设置所属学院 学院外键
     *
     * @param collegeid 所属学院 学院外键
     */
    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }
}