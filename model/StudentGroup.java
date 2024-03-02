package hw5.model;

import java.util.ArrayList;
import java.util.List;


public class StudentGroup {
    private Teacher teacher;
    private Integer numberGroup;
    private List<Student> students;

    public StudentGroup(Integer numberGroup, Teacher teacher, ArrayList<Student> students) {
        this.teacher = teacher;
        this.numberGroup = numberGroup;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Student group number - " + numberGroup +
                ", teacher in the group - " + teacher +
                ", students in the group - " + students;
    }
}