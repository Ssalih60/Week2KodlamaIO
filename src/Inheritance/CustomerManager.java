package Inheritance;

import Java.PersonManager;

public class CustomerManager extends PersonManager{
    public void List(){
        System.out.println("Musteri listelendi ");
    }
    public void add(){
        System.out.println("Musteri eklendi ");
    }

}
