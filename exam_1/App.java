public class App {
   public static void main(String[] args) {

        Student Student = new Student();
        Student.firstname = "Louis";
        Student.middlename = 'T';
        Student.surname = "Salazar";
        Student.dateOfbirth = "09/01/2003";
        Student.studentNumber = 2022102518;
        Student.emailaddress = "salazarlt@students.national-u.edu.ph";
        Student.iAmAwesome = true;

        Student.sayMyStudentNumber(); 
        Student.sayMyEmailAddress();
        Student.amIAwesome();
   }
}


      