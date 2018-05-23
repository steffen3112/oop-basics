package singletonPattern;

import singletonPattern.singletons.Singleton;

public class Client {

    public static void main(String[] args){

        Singleton mySingleton = Singleton.getSingleton("Singleton A", "Description A");

        Singleton myNewSingleton =  Singleton.getSingleton("Singleton B" , "This won´t work because of Singletons internals");

        mySingleton.doSomething();

        myNewSingleton.doSomething();



    }
}
