/* There are two ways to create a thread:

By extending Thread class
By implementing Runnable interface.

Thread class:
Thread class provide constructors and methods to create and perform operations on a thread.
Thread class extends Object class and implements Runnable interface.

public void start(): starts the execution of the thread.JVM calls the run() method on the thread.

The start() method of Thread class is used to start a newly created thread. It performs the following tasks:

A new thread starts(with new callstack).
The thread moves from New state to the Runnable state.
When the thread gets a chance to execute, its target run() method will run.             */

//CODE-

public class MyThread1  
{  
// Main method  
public static void main(String argvs[])  
{  
// creating an object of the Thread class using the constructor Thread(String name)   
Thread t= new Thread("My first thread");  
  
// the start() method moves the thread to the active state  
t.start();  
// getting the thread name by invoking the getName() method  
String str = t.getName();  
System.out.println(str);  
}  
}  
