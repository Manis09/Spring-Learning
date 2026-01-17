package com.springcore.autowiring.xmlbased;

public class Course {
    private int id;
    private String courseName;
    private int duration;

    public Course(int id, String courseName, int duration) {
        this.id = id;
        this.courseName = courseName;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
