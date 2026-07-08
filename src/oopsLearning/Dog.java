package oopsLearning;

//Example for inheritance taken from animal which will extend animals
public class Dog extends Animal {
    // Dog can use both bark and eat;
    void bark() {
        System.out.println("Dog is Barking");
    }


    @Override
    void sound(){
        System.out.println("Polymorphism Dog class sounds override the extended animal sound");
    }
}
