/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author advai
 */
public class User {
    
    public String NUID;
    public String Username;
    public String role;
    public Password password;
    public boolean Status;

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getPassword() {
        return this.password.getCurrentPassword();
    }

    public void setPassword(String passwordToHash) {
        this.password.setCurrentPassword(password.hashPassword(passwordToHash));
    }
    
    public User() {
        this.password = new Password(this.Username);
    }
    
    public boolean inOldPasswords(String p) {
        return this.password.inOldPasswords(p);
    }
    
}


