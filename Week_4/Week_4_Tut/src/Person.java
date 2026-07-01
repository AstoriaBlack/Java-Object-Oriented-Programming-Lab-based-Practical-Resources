public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        myName = name; //if u used name instead of myName, u have to use this.name
        myAge = age;
        myGender = gender;
    }
    public String toString() {
        return "name: "+ myName + "age: " + myAge + "gender: " +myGender;
    }

    public String getName() {
        return myName;
    }
    public int getAge() {
        return myAge;
    }
    public String getGender() {
        return myGender;
    }
    public void setName(String newName) {
        myName = newName;
    }
    public void setAge(int newAge) {
        myAge = newAge;
    }
    public void setGender(String newGender) {
        myGender = newGender;
    }
}
