package day9.interfacedemo;
/* Interface only accepts abstract methods only
* Abstract keyword is not mandantory when implementing interface
* Why Interface ?
*       Code Refine - Because methods alone are stored in seperate interface
* Variables declared in interface will acting like a static and final
* An Interface may not declared as final
* Marker Interface
*   Marker interfaces, also known as tag interfaces, are empty interfaces in Java that serve to "mark" a class with a specific property or capability, without requiring it to implement any methods
* Example -- bank Account and Credit card
*  */
interface shape{
    void draw();
}
public class interfaceDemo implements shape {
    @Override
    public void draw(){
       System.out.println("drawing.....");
    }
    public static void main(String[] args) {
        interfaceDemo o = new interfaceDemo();
        o.draw();
        //Interface called without using Object
        shape sh = () -> System.out.println("Writing.....");
        sh.draw();
        multipleInterface ml = new  multipleInterface();
        ml.curr_period();
        ml.day_order();
        ml.have_pt();
    }
}


