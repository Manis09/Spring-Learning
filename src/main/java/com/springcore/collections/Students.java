package com.springcore.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Students {
    private int studentId;
    private String studentName;
    private List<Integer> marks;
    private Set<String> subjects;
    private HashMap<String,String> results;

    public Students() {
        System.out.println("Object get created");
    }

    public Students(int id, String studentName, List<Integer> marks, Set<String> subjects, HashMap<String, String> results) {
        this.studentId = id;
        this.studentName = studentName;
        this.marks = marks;
        this.subjects = subjects;
        this.results = results;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public HashMap<String, String> getResults() {
        return results;
    }

    public void setResults(HashMap<String, String> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                ", subjects=" + subjects +
                ", results=" + results +
                '}';
    }
}
