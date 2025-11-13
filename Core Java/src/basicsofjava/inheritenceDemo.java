package basicsofjava;

public class inheritenceDemo {
    int a =10;
    int b =10;
    int c =10;
}
class Animal{
    void sound(){
        System.out.println("Animal Sound...");
    }
}

class dog extends Animal{
    void sound(){
        System.out.println("Dog is Barking...");
    }
}

class cat extends Animal{
    void sound(){
        System.out.println("Cat is Meoww...");
    }
}
