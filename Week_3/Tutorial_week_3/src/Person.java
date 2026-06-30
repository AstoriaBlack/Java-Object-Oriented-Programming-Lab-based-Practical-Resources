public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void displayName() {
        System.out.println(name);
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }
    public void setAge (int age) {
        this.age = age;
    }

    public String getWholeName() {
        return name + " " + surname;
    }
    public int getAge() {
        return age;
    }
}

