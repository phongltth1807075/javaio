package entity;

public class Student {
    private String EnrollID;
    private String FirstName;
    private String LastNmae;
    private String Age;

    public Student(String enrollID, String firstName, String lastNmae, String age) {
        EnrollID = enrollID;
        FirstName = firstName;
        LastNmae = lastNmae;
        Age = age;
    }

    public Student(String enrolID) {
    }

    public String getEnrollID() {
        return EnrollID;
    }

    public void setEnrollID(String enrollID) {
        EnrollID = enrollID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastNmae() {
        return LastNmae;
    }

    public void setLastNmae(String lastNmae) {
        LastNmae = lastNmae;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}
