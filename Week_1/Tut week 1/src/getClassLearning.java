public class getClassLearning {
    public static void main(String[] args) {
        Dog doggy = new Dog("Buddy");
        Class<?> whatclass = doggy.getClass(); // Get the Class object associated with the Dog instance
        //<?> means it can be any type, we don't know the type at compile time

        System.out.println("The class of doggy is: " + whatclass.getName()); // Print the name of the class


    }
}
