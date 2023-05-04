import java.io.*;
public class Registration implements Serializable {
    
    private String name;
    private double phone;
    private String email;
    private String Linkedin;
    private String pass;
    private String cpass;
    private login login;

    public Registration(String name, double phone, String email, String Linkedin, String pass, String cpass, login login) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.Linkedin = Linkedin;
        this.pass = pass;
        this.cpass = cpass;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedin() {
        return Linkedin;
    }

    public void setLinkedin(String Linkedin) {
        this.Linkedin = Linkedin;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public login getLogin() {
        return login;
    }

    public void setLogin(login login) {
        this.login = login;
    }
    
    
    
}
