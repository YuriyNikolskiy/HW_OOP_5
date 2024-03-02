package hw5.model;

public abstract class User {
    private String name;
    private String secondName;
    private Integer age;

    public User(String name, String secondName, Integer age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "First name - '" + name + '\'' +
                ", Last name - '" + secondName + '\'' +
                ", Year of birth - " + age;
    }
}
