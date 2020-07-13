public class Test {

    public static void main(String[] args) {
        Person P1 = new Person("Singh", "Gangesh");
        P1.printNames();

        // this() leads to call the defult contructor , then setter

        Person P2 = new Person("Sharma");
        P2.printNames();

        Person P3 = new Person();   // Run default constructor which has This() method.
        P3.printNames();

    }
}
