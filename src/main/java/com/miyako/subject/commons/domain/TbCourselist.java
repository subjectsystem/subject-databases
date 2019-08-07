package com.miyako.subject.commons.domain;

import javax.persistence.*;

@Table(name = "subject..tb_courselist")
public class TbCourselist {
    /**
     * id 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程id 课程外键
     */
    @Column(name = "courseId")
    private Integer courseid;

    /**
     * 学生id 学生外键
     */
    @Column(name = "studentId")
    private Integer studentid;

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
     * 获取课程id 课程外键
     *
     * @return courseId - 课程id 课程外键
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * 设置课程id 课程外键
     *
     * @param courseid 课程id 课程外键
     */
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    /**
     * 获取学生id 学生外键
     *
     * @return studentId - 学生id 学生外键
     */
    public Integer getStudentid() {
        return studentid;
    }

    /**
     * 设置学生id 学生外键
     *
     * @param studentid 学生id 学生外键
     */
    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }
}