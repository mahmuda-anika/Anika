
package oop.polymorphism;

public class RunTime {
    
}
class Animal{
public void move(){
    System.out.println("Animals can move");
}
}

class Dog extends Animal{
@Override
public void move(){
    System.out.println("Dogs can run");
}

}
class Test{
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
    }
}