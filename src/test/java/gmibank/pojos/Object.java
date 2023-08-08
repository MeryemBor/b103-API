package gmibank.pojos;

public class Object {

    int userId;
    String username;
    String name;
    String surname;
    String birthDay;
    String birthPlace;
    String phoneNumber;
    String gender;
    int studentNumber;
    String motherName;
    String fatherName;
    String email;
    boolean active;


    public Object() {
    }

    public Object(int userId, String username, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, int studentNumber, String motherName, String fatherName, String email, boolean active) {

        this.userId = userId;

        this.username = username;

        this.name = name;

        this.surname = surname;

        this.birthDay = birthDay;

        this.birthPlace = birthPlace;

        this.phoneNumber = phoneNumber;

        this.gender = gender;

        this.studentNumber = studentNumber;

        this.motherName = motherName;

        this.fatherName = fatherName;

        this.email = email;

        this.active = active;

    }

    public void setUserId(int userId) {

        this.userId = userId;

    }

    public int getUserId() {

        return this.userId;

    }

    public void setUsername(String username) {

        this.username = username;

    }

    public String getUsername() {

        return this.username;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return this.name;

    }

    public void setSurname(String surname) {

        this.surname = surname;

    }

    public String getSurname() {

        return this.surname;

    }

    public void setBirthDay(String birthDay) {

        this.birthDay = birthDay;

    }

    public String getBirthDay() {

        return this.birthDay;

    }

    public void setBirthPlace(String birthPlace) {

        this.birthPlace = birthPlace;

    }

    public String getBirthPlace() {

        return this.birthPlace;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public String getPhoneNumber() {

        return this.phoneNumber;

    }

    public void setGender(String gender) {

        this.gender = gender;

    }

    public String getGender() {

        return this.gender;

    }

    public void setStudentNumber(int studentNumber) {

        this.studentNumber = studentNumber;

    }

    public int getStudentNumber() {

        return this.studentNumber;

    }

    public void setMotherName(String motherName) {

        this.motherName = motherName;

    }

    public String getMotherName() {

        return this.motherName;

    }

    public void setFatherName(String fatherName) {

        this.fatherName = fatherName;

    }

    public String getFatherName() {

        return this.fatherName;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getEmail() {

        return this.email;

    }

    public void setActive(boolean active) {

        this.active = active;

    }

    public boolean getActive() {

        return this.active;

    }

    @Override
    public String toString() {
        return "Object{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", studentNumber=" + studentNumber +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }
}
