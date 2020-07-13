public class Person {
    private String lastName;
    private String firstName;
    private int age;

    /*
       Default Constructor
     */
    public Person() {

        this("kalpana", "Arisetty", 21);
        System.out.println("I am in this constructor");
    }

    public Person(String lastName, String firstName, int age) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;

        System.out.println("--------  B -------------");
    }

    void printNames() {
        System.out.println(lastName + ' ' + firstName + ' ' + age);

    }

    public Person(String myLastName, String myFirstname) {
        this();
        this.lastName = myLastName;
        this.firstName = myFirstname;
        System.out.println("--------  C -------------");

//        age = myAge;

    }

    public Person(String myLastName) {
        lastName = myLastName;
//        firstName = myFirstname;
//        age = myAge;
    }

/*    public void setLastName(String mylastName) {
        lastName = mylastName;
    }

    public String getLastName() {
        return lastName;
    }*/
}