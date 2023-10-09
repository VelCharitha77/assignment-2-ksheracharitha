/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author advai
 */
public class Password {
    private String userName;
    private String currentPassword;
    private ArrayList<String> oldPasswords;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        if(this.currentPassword != null)
            this.oldPasswords.add(this.currentPassword);
        this.currentPassword = currentPassword;
    }
    
    public Password(String userName) {
        this.userName = userName;
        this.oldPasswords = new ArrayList<String>();
    }

    public ArrayList<String> getOldPasswords() {
        return oldPasswords;
    }

    public void setOldPasswords(ArrayList<String> oldPasswords) {
        this.oldPasswords = oldPasswords;
    }
    
    public boolean inOldPasswords(String password) {
        password = this.hashPassword(password);
        for(String s: this.oldPasswords)
            if(s.equals(password))
                return true;
        if(this.currentPassword.equals(password))
            return true;
        return false;
    }
    
    public String hashPassword(String passwordToHash) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passwordToHash.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        }
        catch(NoSuchAlgorithmException e) {
            System.out.println("Exception in hashing occured");
            return null;
        }
    }
}
