package Module;

import java.io.Serializable;

public class Kollega implements Serializable {
    private String navn;
    private String birthday;
    private String role;

    public Kollega(String navn){
        this.navn = navn;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
