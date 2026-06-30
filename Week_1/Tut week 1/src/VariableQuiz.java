
public class VariableQuiz {

    static int staticVar = 10;//staticVar: Initially set to 10. One copy, shared by all.
    int instanceVar = 5;//instanceVar: Initially set to 5. Each object will have its own copy.

    /*1. Static Variable
Declared with the static keyword.
Shared by all instances of the class.
Only one copy exists, regardless of how many objects are created.
Changes made via any object or via the class name affect the same variable.
2. Instance Variable
Declared without static.
Unique to each object created from the class.
Each object gets its own copy.
*/

    @SuppressWarnings("static-access")
    public static void main(String[] args)
    { //obj1 and obj2 are two separate instances of VariableQuiz.
        //Both objects initially:
        //staticVar (shared): 10
        //obj1.instanceVar: 5
        //obj2.instanceVar: 5
        VariableQuiz obj1 = new VariableQuiz();
        VariableQuiz obj2 = new VariableQuiz();

        //First modification:
        obj1.staticVar = 20;
        obj1.instanceVar = 15;

        //staticVar is set to 20 via obj1.
        //This changes the static variable for all instances (and the class itself).
        //obj1.instanceVar is set to 15.
        //Only obj1's instance variable changes.
        //State after this:
        //staticVar (shared): 20
        //obj1.instanceVar: 15
        //obj2.instanceVar: 5

        //Second modification:
        obj2.staticVar = 35;
        obj2.instanceVar = 25;

        //staticVar is set to 35 via obj2.
        //This changes the static variable for all instances (and the class itself).
        //obj2.instanceVar is set to 25.
        //Only obj2's instance variable changes


        System.out.println(obj1.staticVar + " " + obj1.instanceVar);
    }

   /* Final state:
    staticVar (shared): 35
    obj1.instanceVar: 15
    obj2.instanceVar: 25 */
}

