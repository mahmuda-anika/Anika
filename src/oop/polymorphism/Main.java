
package oop.polymorphism;


public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10.2,20.3));
    }
}
