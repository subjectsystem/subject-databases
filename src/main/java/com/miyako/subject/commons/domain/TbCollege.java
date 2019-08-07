package com.miyako.subject.commons.domain;

import javax.persistence.*;

@Table(name = "subject..tb_college")
public class TbCollege {
    /**
     * id 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 学院名称 学院名称
     */
    private String name;

    /**
     * 学院编号 学院统一表示
     */
    private String mark;

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
     * 获取学院名称 学院名称
     *
     * @return name - 学院名称 学院名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学院名称 学院名称
     *
     * @param name 学院名称 学院名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学院编号 学院统一表示
     *
     * @return mark - 学院编号 学院统一表示
     */
    public String getMark() {
        return mark;
    }

    /**
     * 设置学院编号 学院统一表示
     *
     * @param mark 学院编号 学院统一表示
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
}