package se.ecutb.webservicejava.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDate;

public class User {
    @Id
    private String id;
    //@Field("fname")
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private String mail;
    private String phone;
    @Indexed(unique = true)
    private String username;
    private String password;

    public User() { }

    public User(String firstName, String lastName, LocalDate birthdate, String mail, String phone, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.mail = mail;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
