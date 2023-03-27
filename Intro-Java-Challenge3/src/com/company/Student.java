package com.company;

public class Student {
    private String studentName;
    private String letterGrade;

    public Student(String studentName, String letterGrade) {
        this.studentName = studentName;
        this.letterGrade = letterGrade;
        Student myStudent = new Student();
        myStudent.setStudentName("teststudent");
        myStudent.setLetterGrade("B");

    }

    public Student() {

    }

    public String getStudentName() {
        return studentName;
    }
    public String getLetterGrade() {
        return letterGrade;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }
}


