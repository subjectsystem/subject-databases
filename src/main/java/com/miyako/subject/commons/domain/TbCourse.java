package com.miyako.subject.commons.domain;

import javax.persistence.*;

@Table(name = "subject..tb_course")
public class TbCourse {
    /**
     * id 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程名 课程名
     */
    private String title;

    /**
     * 课程编号 学院+年级+时间
     */
    @Column(name = "courseNum")
    private String coursenum;

    /**
     * 课程人数 课程最大人数
     */
    @Column(name = "courseCount")
    private Integer coursecount;

    /**
     * 课程教师 教师外键
     */
    @Column(name = "teacherId")
    private Integer teacherid;

    /**
     * 开课学院 学院外键
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
     * 获取课程名 课程名
     *
     * @return title - 课程名 课程名
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置课程名 课程名
     *
     * @param title 课程名 课程名
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取课程编号 学院+年级+时间
     *
     * @return courseNum - 课程编号 学院+年级+时间
     */
    public String getCoursenum() {
        return coursenum;
    }

    /**
     * 设置课程编号 学院+年级+时间
     *
     * @param coursenum 课程编号 学院+年级+时间
     */
    public void setCoursenum(String coursenum) {
        this.coursenum = coursenum;
    }

    /**
     * 获取课程人数 课程最大人数
     *
     * @return courseCount - 课程人数 课程最大人数
     */
    public Integer getCoursecount() {
        return coursecount;
    }

    /**
     * 设置课程人数 课程最大人数
     *
     * @param coursecount 课程人数 课程最大人数
     */
    public void setCoursecount(Integer coursecount) {
        this.coursecount = coursecount;
    }

    /**
     * 获取课程教师 教师外键
     *
     * @return teacherId - 课程教师 教师外键
     */
    public Integer getTeacherid() {
        return teacherid;
    }

    /**
     * 设置课程教师 教师外键
     *
     * @param teacherid 课程教师 教师外键
     */
    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    /**
     * 获取开课学院 学院外键
     *
     * @return collegeId - 开课学院 学院外键
     */
    public Integer getCollegeid() {
        return collegeid;
    }

    /**
     * 设置开课学院 学院外键
     *
     * @param collegeid 开课学院 学院外键
     */
    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }
}