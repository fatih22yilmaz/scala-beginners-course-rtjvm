package playground;

import java.util.Objects;

public class Car {
    private String name;
    private Integer age;
    private Integer sth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int hashCodee() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setAge(5);
        car.setName("BMW");

        Car car2 = new Car();
        car2.setAge(5);
        car2.setName("BMW");

        System.out.println(car.hashCodee());
        System.out.println(car2.hashCodee());
    }
}
