public class Student {
    
    String firstname;
    char middlename;
    String surname;
    int age;
    String dateOfbirth;
    int studentNumber;
    String emailaddress;
    boolean iAmAwesome;

public void sayMyStudentNumber() {
    System.out.println("My student number " + studentNumber);
}
public void sayMyEmailAddress() {
    System.out.println("My email address " + emailaddress);
}
public void amIAwesome() {
    System.out.println("am I Awesome:" + iAmAwesome);
}
}