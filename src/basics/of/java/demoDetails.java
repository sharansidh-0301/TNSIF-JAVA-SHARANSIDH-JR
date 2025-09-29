package basics.of.java;

public class demoDetails {
    String name;
    int age;

    @Override
    public String toString() {
        return "demoDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    demoDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
