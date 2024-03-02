package hw5.model;

public class Student extends User{
    private Integer id;

    public Student(String name, String secondName, Integer age, Integer id) {
        super(name, secondName, age);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Student: ID - '" + id + '\'' +
                ", First name - '" + getName() + '\'' +
                ", Last name - '" + getSecondName() + '\'' +
                ", Year of birth - " + getAge();
    }
}