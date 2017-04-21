/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arles Cerrato
 */
public class Family extends People{
    
    private String description;

    public Family() {
    }

    public Family(String description, String firsName, String middleName, String lastname1, String lastName2) {
        super(firsName, middleName, lastname1, lastName2);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
        
}
