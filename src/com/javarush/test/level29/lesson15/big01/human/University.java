package com.javarush.test.level29.lesson15.big01.human;

import java.util.ArrayList;
import java.util.List;

public class University{
    private int age;
    private String name;
    private static List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public static List<Student> getStudents()
    {
        return students;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public static void setStudents(List<Student> students)
    {
        University.students = students;
    }


    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade)
                return student;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        int iMax = 0;
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() > students.get(iMax).getAverageGrade())
                iMax = i;
        }
        return students.size() == 0 ? null : students.get(iMax);
    }

    public Student getStudentWithMinAverageGrade() {
        int iMin = 0;
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() < students.get(iMin).getAverageGrade())
                iMin = i;
        }
        return students.size() == 0 ? null : students.get(iMin);
    }

    public void expel(Student student) {
        students.remove(student);
    }
}