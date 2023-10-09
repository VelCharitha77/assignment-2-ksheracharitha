/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author advai
 */

public class UserHistory {
    private ArrayList<User> history1;
    
   ;
    public UserHistory(){
        this.history1 = new ArrayList<User>();
    }

    public ArrayList<User> getHistory1() {
        return history1;
    }

    public void setHistory1(ArrayList<User> history1) {
        this.history1 = history1;
    }
    
    public User addUser(){
        User user = new User();
        history1.add(user);
        return user;
    }
    
    public void deleteUser(User user){
       history1.remove(user);
    }
    
    public boolean disableuser(User user){
        
        user.setStatus(false);
        return user.isStatus();
    }
    
    public User searchUser(String NUID){
        for(User user: history1){
            if(user.getNUID().equals(NUID)){
                return user;
            }
        }
        
        return null;
    }
    
    public User updateUserID(String Username, String NUID){
        for(User user: history1){
            if(user.getNUID().equals(NUID)){
              user.setUsername(Username);
              return user;
            }
        }
        
        return null;
        
    }
}
