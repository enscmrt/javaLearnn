package j24_Inheritance.Tasks.Task01;

public class A {

    static String name;

    public A(String name) {
        A.name = name;
    }

    public A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        A.name = name;
    }
}
