public class Dog
{   String name;
    Dog(String name){
        this.name = name;
    }
//let's override it so two dogs with same name equals true
    @Override
    public boolean equals(Object obj) { // Object class
        if (this == obj) return true; // Check if both references point to the same object only become true when we use dog1.equals(dog1)
        if (!(obj instanceof Dog)) return false; // Check if obj is an instance of Dog or else it would be same name but different object
        Dog otherDog = (Dog) obj; // Cast obj to Dog
        return this.name.equals(otherDog.name);
    }

    //hashCode method is not mandatory but it's a good practice to override it when equals is overridden
    @Override
    public int hashCode() {
        return name.hashCode();// Use the hash code of the name string
    }


}
