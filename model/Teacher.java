package hw5.model;

public class Teacher extends User{
    private Integer id;
    public Teacher(String name, String secondName, Integer age, Integer id) {
        super(name, secondName, age);
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher: ID - '" + id + '\'' +
                ", First name - '" + getName() + '\'' +
                ", Last name - '" + getSecondName() + '\'' +
                ", Year of birth - " + getAge();
    }
}
