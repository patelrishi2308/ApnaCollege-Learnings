public class OOPS_constructors {
    public static void main(String[] args) {

        // Access modifiers/Specifiers
        BankAccount myAcc = new BankAccount();
        myAcc.username = "shradhaKhapra";
        myAcc.setPassword("abcdefghi");
    

        // geters and seters
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        //Constructors
        Student s1 = new Student();
        Student s2 = new Student("Rishi");
        Student s3 = new Student(123);
        s1.name = "Shradha";
        s1.roll = 456;
        s1.password = "abcd";
        
        Student s4 = new Student(s1);
        s4.password = "xyz";
    }
}

class BankAccount{  
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}

class Student{
    String name;
    int roll;
    String password;
    // Constructor Overloading 
    // Polymorphism
    Student(){  // Non-Parameterized constructor is called automatically if not made. 
        System.out.println("constructor is called..");
    }
    Student(String name){  // Parameterized constructor
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }

    //copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
}