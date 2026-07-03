package threadsFundamental;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainPrintName {
    public static void main(String[] args) {

        //create a thread A
        PrintNameThread threadA = new PrintNameThread("A");
        PrintNameThread threadB = new PrintNameThread("B");
        PrintNameThread threadC = new PrintNameThread("C");

        threadA.start();//start is telling mvc to start a new thread and run
        //run is just running the thread
        threadB.start();
        threadC.start();
        // start() -- NOT run() -- is what actually launches each one
        // as an independent thread. The main() method itself keeps
        // running immediately after these calls too, without waiting.
    }
}