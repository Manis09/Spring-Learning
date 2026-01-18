package com.springjdbc.crudoperation;

public class Student {
    private int stu_id;
    private String f_name;
    private String l_name;

    public Student() {
    }

    public Student(int stu_id, String f_name, String l_name) {
        this.stu_id = stu_id;
        this.f_name = f_name;
        this.l_name = l_name;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                '}';
    }
}
