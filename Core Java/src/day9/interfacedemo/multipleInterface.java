package day9.interfacedemo;

interface dept_ece{
    void curr_period();
}
interface  dept_cse{
    void day_order();
}
interface dept_it{
    void have_pt();
}


public class multipleInterface implements dept_cse, dept_it, dept_ece {
    public void curr_period(){
        System.out.println("Java....");
    }

    public void day_order(){
        System.out.println("Five....");
    }

    public void have_pt(){
        System.out.println("Yes....");
    }
}
