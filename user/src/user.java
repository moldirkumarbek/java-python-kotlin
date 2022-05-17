public class user extends Person {
    private static int id;
    private String Password;
    private String DateOfBirth;
}
public user (String Password, String DateOfBirth ){
    setPassword(Password);
    setDataOfBirth(DateOfBirth);
}

public String getPassword(){
    return Password;
}

public void setPassword(String password){
    this.Password;
}

public String getDateOfBirth(){
    return DateOfBirth;
}
public void setDataOfBirth(){
    this.DateOfBirth;
}