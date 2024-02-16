public class User {
    private String lastName;
    private String firstName;
    private String middleName;
    private int birthYear;
    private String email;

    public User(String lastName, String firstName, String middleName, int birthYear, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
    }


    public void printUserInfo() {

        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
    }

    public int getBirthYear() {

        return birthYear;
    }

    public String getEmail() {

        return email;
    }
}


