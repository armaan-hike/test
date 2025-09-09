package org.hike;

public class Singleton {

    // This is the eager way of creating singleton
    private static Singleton singleton = new Singleton();

    static Singleton getSingleton(){
        return singleton;
    }

 /*

    private static Singleton singleton;

    xyzxyzyxyz

    //Constructor
    private Singleton(){}


    // This is lazy initialization, object will be created when client asks for
    // not good for multi thread options as thread safety would be compromised
    // we can use method syncronized keyword for this as T1 would use, T2 would wait and then execute
    // better practice would be to use the block syncronization
    public static Singleton getSingleton(){

        //Object of this class
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

  */
}
/*
* 1. Keep the constructor private
*
* 2. object creation with the help of method
*
* 3. create field to store the object be private
*
* */