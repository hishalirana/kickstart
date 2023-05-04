import java.io.*;

public class login implements Serializable{
    private double phoneNUM;
    private String Password;
    
    public login(double phoneNUM,String password){
        
            this.phoneNUM=phoneNUM;
            this.Password=password;
}
 public boolean equals(login login){
     
 return (this.phoneNUM==login.phoneNUM && this.Password.equals(login.Password));
 
 }
    public double getPhoneNUM() {
        return phoneNUM;
    }

    public void setPhoneNUM(double phoneNUM) {
        this.phoneNUM = phoneNUM;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}