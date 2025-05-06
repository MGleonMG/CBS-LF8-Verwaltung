package verwaltung;

import java.util.ArrayList;

//test
public abstract class Person {
    protected String lastName;
    protected String firstName;
    protected String address;
    protected String dateOfBirth;

    private static ArrayList<Person> personList = new ArrayList<>();

    public Person(String lastName, String firstName, String address, String dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        personList.add(this);
    }

    public Person() {
        personList.add(this);
    }

    public abstract void showInfo();

    public static int getNumberOfPersons() {
        return personList.size();
    }

    public static void printPersons() {
        for (Person p : personList) {
            p.showInfo();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
