/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arles Cerrato
 */
public class People {
    
    private String firsName;
    private String middleName;
    private String lastname1;
    private String lastName2;

    public People() {
    }

    public People(String firsName, String middleName, String lastname1, String lastName2) {
        this.firsName = firsName;
        this.middleName = middleName;
        this.lastname1 = lastname1;
        this.lastName2 = lastName2;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    
}
