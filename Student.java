package application;

public class Student {
    private String id;
    private String name;
    private String grade;
    private String address;
    private String contact;

    // Constructor
    public Student(String id, String name, String grade, String address, String contact) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.address = address;
        this.contact = contact;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    // Override toString() for easy display
    @Override
    public String toString() {
        return "Student ID: " + id + "\nName: " + name + "\nGrade: " + grade +
               "\nAddress: " + address + "\nContact: " + contact;
    }
}
