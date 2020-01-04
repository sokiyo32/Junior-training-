
package lab;

class LabProperties {
    private String name;
    private String SSN;
    private String email;
    private static int iD = 1000;
    private String userId;
    private String phoneNumber;
    private String city;
    private String state;
    private String showCourse;

    LabProperties() {
        System.out.println ("New Student Added.");
    }

    public void newAccount(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
        this.email = name + "@email.gmail.com";
        System.out.println ("Your email address is: " + email);
        setStudentId ( );
        setEmail (name);
    }

    public final String setSSN(String SSN) {
        SSN = this.SSN;
        return SSN;
    }

    public final String getSSN() {
        return setSSN (this.SSN);
    }

    public String setStudentId() {
        int random = (int) (Math.random ( ) * 10000);
        this.userId = "" + iD + "" + random + "" + SSN.substring (5, 10);
        iD++;
        System.out.println ("Your Student ID is: " + userId);
        return userId;
    }

    public void setEmail(String name) {
        email = name + "@gmail.com";
        System.out.println ("Your email ID is: " + email);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println ("Your phone number is: " + phoneNumber);
    }

    public void setCity(String city) {
        this.city = city;
        System.out.println ("Your city is: " + city);
    }

    public void setState(String state) {
        this.state = state;
        System.out.println ("your state is: " + state);
    }

    public void setCourse(String course) {
        this.showCourse = course;
    }

    void enroll() {
    }

    void pay() {
    }

    void checkBalance() {
    }

    @Override
    public String toString() {
        return "[" + name + "] [" + email + "]";
    }

    void showCourses(String course) {
        this.showCourse = course;
        System.out.println ("Your course is: " + course + "\n");
    }

}

public class Lab {
    public static void main(String[] args) {

        LabProperties student1 = new LabProperties ( );
        student1.newAccount ("John", "9542056963");
        student1.setState ("California");
        student1.setCity ("LA");
        student1.setPhoneNumber ("2132000202");
        student1.showCourses ("Computer Science");

    }
}
