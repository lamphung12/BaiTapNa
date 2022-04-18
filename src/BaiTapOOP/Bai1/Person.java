package BaiTapOOP.Bai1;

public class Person {
    private String name;
    private int age ;
    private int numberCMND;

    public Person() {
    }

    public Person(String name, int age, int numberCMND) {
        this.name = name;
        this.age = age;
        this.numberCMND = numberCMND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberCMND() {
        return numberCMND;
    }

    public void setNumberCMND(int numberCMND) {
        this.numberCMND = numberCMND;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numberCMND=" + numberCMND +
                '}';
    }

}
