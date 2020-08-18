/**
 * Copyright (C), 2019, 因特驰
 * FileName: Student
 * Author:   zyl
 * Date:     2020/8/14 10:08
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/14
 * @since 1.0.0
 */
@Entity(name = "t_student")
public class Student {

    @Id
    @GeneratedValue
    @Column(name="stuid",length = 20)
    private  Integer stuid;

    @Column(name="stu_name",length = 255)
    private String stuname;


    private Integer stuage;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                '}';
    }

    public Student() {
    }
}
