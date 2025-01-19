// Task 1: Create class A with a method named meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {
    
}

public class Main {
    public static void main(String[] args) {
        B objB = new B();
        System.out.println(objB.meth());
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B objB = new B();
        System.out.println(objB.meth()); 
    }
}
