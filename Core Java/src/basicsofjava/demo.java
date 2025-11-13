package basicsofjava;

/*
* Access Modifier -> public, private, protected, default
* Non-Access Modifier -> Abstract, static, final */


public class demo {
    public static void main(String[] args) {
        demoDetails d = new demoDetails("Sidh",20);
        System.out.println(d);

        overloadingDemo sh = new overloadingDemo();
        System.out.println("Area Of Square: "+sh.area(10));
        System.out.println("Area Of Rectangle: "+sh.area(10,20));
        System.out.println("Area Of Triangle: "+sh.area(10,20,30));
        System.out.println("-------------------------");
        inheritenceDemo s = new inheritenceDemo();

        cat c = new cat();
        c.sound();
    }
}
