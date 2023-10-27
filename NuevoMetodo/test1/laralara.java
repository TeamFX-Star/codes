package one;

public class Class1 {
    public int atributo1;

}

package one;

public class Class2 {
    public static void main(String[] args) {
        Class1 objeto1 = new Class1();
        objeto1.atributo1 = 15;
    }
}

package two;
import one.Class1;

public class Class3 {
    public static void main(String[] args) {
        Class1 objeto1 = new Class1();
        objeto1.atributo1 = 15;
    }
}
