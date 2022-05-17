public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private byte gender;
}

public Person (String firstName,String secondName){
    setFirstName(firstName);
    setSecondName(secondName);
}

public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName){
    this.firstName= firstName;
}

public String getSecondName() {

    return secondName;
}

public void setSecondName(String secondName){
    this.secondName = secondName;
}

