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
public class PersonHistory {
     
    private ArrayList<Person> history;
    
    public PersonHistory(){
        
        this.history = new ArrayList<Person>();
    }

    public ArrayList<Person> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Person> history) {
        this.history = history;
    }
    
    public Person addNewPerson(){
        
        Person p = new Person();
        history.add(p);
        return p;
    }
    
    public Person searchPerson(String NUID){
        
        for (Person person: history){
            if(person.getNUID().equals(NUID)){
                return person;
            }
        }
        
        return null;
    }
    
}

