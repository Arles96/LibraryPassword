/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arles Cerrato
 */

/**
* TODO hacer la union de la informacion de la familia con las mascotas
* TODO hacer la union de la informacion de la familia con las fechas
* TODO hacer la union de la informacion de la familia con la informacion extra
* TODO hacer la union de la informacion de la mascotas con las victima
* TODO hacer la union de la informacion de la mascota con la familia
* TODO hacer la union de la informacion de la mascota con las fechas
* TODO hacer la union de la informacion de la mascota con la informacion extra
* TODO hacer la union de la informacion de las fechas con la victima
* TODO hacer la union de la informacion de la fechas con la familia
* TODO hacer la union de la informacion de las fechas con las mascotas
* TODO hacer la union de la informacion de las fechas con la informacion extra
* TODO hacer la union de la informacion extra con la victima
* TODO hacer la union de la informacion extra con la familia
* TODO hacer la union de la informacion extra con las fechas
* TODO hacer la union de la informacion extra con las mascotas
*/
public class PassWords {
    
    private Victim person;

    //Constructores
    
    public PassWords() {
    }

    public PassWords(Victim person) {
        this.person = person;
    }
    
    //mutadores

    public Victim getPerson() {
        return person;
    }

    public void setPerson(Victim person) {
        this.person = person;
    }
    
    //Metodos de admisnitracion
    
    public String allPassword(){
        String password="";
        password += informationPersonWithDates();
        password += informationPersonWithFamily();
        password += informationPersonWithPets();
        password += informationPersonWithExtra();
        return password;
    }
    
    private String informationPersonWithDates(){
        String password="";
        //Union del primer nombre de la victima con el dia de la informaicon de las fechas
        for (DatePerson date : person.getDates()) {
            password += person.getFirsName() + date.getDay() + "\n";
        }
        //Union del segundo nombre con el dia
        for (DatePerson date : person.getDates()) {
            password += person.getMiddleName() + date.getDay() + "\n";
        }
        //Union del primer apellido con el dia
        for (DatePerson date : person.getDates()) {
            password += person.getLastname1() + date.getDay() + "\n";
        }
        //Union del segundo apellido con el dia
        for (DatePerson date : person.getDates()) {
            password += person.getLastName2() + date.getDay() + "\n";
        }
        //Union del primer nombre con el mes
        for (DatePerson date : person.getDates()) {
            password += person.getFirsName() + date.getMonth() + "\n";
        }
        //Union del segundo nombre con el mes
        for (DatePerson date : person.getDates()) {
            password += person.getMiddleName() + date.getMonth() + "\n";
        }
        //Union del primer apellido con el mes
        for (DatePerson date : person.getDates()) {
            password += person.getLastname1() + date.getMonth() + "\n";
        }
        //Union del segundo apellido con el mes
        for (DatePerson date : person.getDates()) {
            password += person.getLastName2()+ date.getMonth() + "\n";
        }   
        //Union del primer nombre con el año
        for (DatePerson date  : person.getDates()) {
            password += person.getFirsName() + date.getYears() + "\n";
        }
        //Union del segundo nombre con el año
        for (DatePerson date : person.getDates()) {
            password += person.getMiddleName() + date.getYears() + "\n";
        }
        //Union del primer apellido con el año
        for (DatePerson date : person.getDates()) {
            password += person.getLastname1() + date.getYears() + "\n";
        }
        //Union del primer nombre con todos los datos de las fechas
        for (DatePerson date : person.getDates()) {
            password += person.getFirsName() + date.getDay() + date.getMonth() +
                    date.getYears() + "\n";
        }
        //Union del segundo nombre con todos los datos de las fechas
        for (DatePerson date : person.getDates()) {
            password += person.getMiddleName() + date.getDay() + date.getMonth() +
                    date.getYears() + "\n";
        }
        //Union del primer apellido con todos los datos de la fecha
        for (DatePerson date : person.getDates()) {
            password += person.getLastname1() + date.getDay() + date.getMonth() + 
                    date.getYears() + "\n";
        }
        //Union del segundo nombre con todos los datos de las fechas
        for (DatePerson date : person.getDates()) {
            password += person.getLastName2() + date.getDay() + date.getMonth() +
                    date.getYears() + "\n";
        }
        return password;
    }
    
    private String informationPersonWithFamily(){
        String password = "";
        //Union del primer nombre de la victima con el primer nombre del familiar
        for (Family family : person.getFamilies()) {
            password += person.getFirsName() + family.getFirsName() + "\n";
        }
        //Union del segundo nombre de la victima con el primer nombre del familiar
        for (Family family : person.getFamilies()) {
            password += person.getMiddleName() + family.getFirsName() + "\n";
        }
        //Union del primer apellido de la victima con el primer nombre del familiar
        for (Family family : person.getFamilies()) {
            password += person.getLastname1() + family.getFirsName() + "\n";
        }
        //Union del segundo apellido de la victima con el primer nombre del familiar
        for (Family family : person.getFamilies()) {
            password += person.getLastName2() + family.getFirsName() + "\n";
        }
        //Union del primer nombre de la victima con el segundo nombre del familiar
        for (Family family : person.getFamilies()) {
            password += person.getFirsName() + family.getMiddleName() + "\n";
        }
        //Union del segundo nombre de la victima con el segundo nombre del familiar
        for (Family family : person.getFamilies()) {
            password += person.getMiddleName() + family.getMiddleName() + "\n";
        }
        //Union del primer apellido de la victima con el segundo nombre del familiar
        for (Family family : person.getFamilies()) {
            password += person.getLastname1() + family.getMiddleName() + "\n";
        }
        //Union del segundo apellido de la victima con el segundo nombre del familiar
        for (Family family : person.getFamilies()) {
            password += person.getLastName2() + family.getMiddleName() + "\n";
        }
        //Union del primer nombre de la victima con el primer apellido del familiar
        for (Family family : person.getFamilies()) {
            password += person.getFirsName() + family.getLastname1() + "\n";
        }
        //Union del segundo nombre de la victima con el primer apelllido del familiar
        for (Family family : person.getFamilies()) {
            password += person.getMiddleName() + family.getLastname1() + "\n";
        }
        //Union del primer apellido de la victima con el primer apellido del familair
        for (Family family : person.getFamilies()) {
            password += person.getLastname1() + family.getLastname1() + "\n";
        }
        //Union del segundo apellido de la victima con el primer apellido del familiar
        for (Family family : person.getFamilies()) {
            password += person.getLastName2() + family.getLastname1() + "\n";
        }
        //Union del primer nombre de la victima con el segundo apellido del familiar
        for (Family family : person.getFamilies()) {
            password += person.getFirsName() + family.getLastName2() + "\n";
        }
        //Union del segundo nombre de la victima con el segundo apellido del familiar
        for (Family family : person.getFamilies()) {
            password += person.getMiddleName() + family.getLastName2() + "\n";
        }
        //Union del primer apellido de la victima con el segundo apellido del familair
        for (Family family : person.getFamilies()) {
            password += person.getLastname1() + family.getLastName2() + "\n";
        }
        //Union del segundo apellido de la victima con el segundo apellido del familiar
        for (Family family : person.getFamilies()) {
            password += person.getLastName2() + family.getLastName2() + "\n";
        }
        //Union del primer nombre de la victima con toda la informacion del familiar
        for (Family family : person.getFamilies()) {
            password += person.getFirsName() + family.getFirsName() + family.getMiddleName() +
                    family.getLastname1() + family.getLastName2() + "\n";
        }
        //Union del segundo nombre de la victima con toda la informacion del familiar
        for (Family family : person.getFamilies()) {
            password += person.getMiddleName() + family.getFirsName() + family.getMiddleName() +
                    family.getLastname1() + family.getLastName2() + "\n";
        }
        //Union del primer apellido de la victima con toda la informacion del familiar
        for (Family family : person.getFamilies()) {
            password += person.getLastname1() + family.getFirsName() + family.getMiddleName() + 
                    family.getLastname1() + family.getLastName2() + "\n";
        }
        //Union del segundo apellido de la victima con toda la informacion del familiar
        for (Family family : person.getFamilies()) {
            password += person.getLastName2() + family.getFirsName() + family.getMiddleName() + 
                    family.getLastname1() + family.getLastName2() + "\n";
        }
        return password;
    }
    
    private String informationPersonWithPets(){
        String password = "";
        //Union del primer nombre de la victima con el nombre de la mascota
        for (Pets pet : person.getPets()) {
            password += person.getFirsName() + pet.getName() + "\n";
        }
        //Union del segundo nombre de la victima con el nombre de la mascota
        for (Pets pet : person.getPets()) {
            password += person.getMiddleName() + pet.getName() + "\n";
        }
        //Union del primer apellido de la victima con el nombre de la mascota
        for (Pets pet : person.getPets()) {
            password += person.getLastname1() + pet.getName() + "\n";
        }
        //Union del segundo apellido de la victima con el nombre de la mascota
        for (Pets pet : person.getPets()) {
            password += person.getLastName2() + pet.getName() + "\n";
        }
        return password;
    }

    private String informationPersonWithExtra(){
        String password = "";
        //Union del primer nombre de la victima con la palabra extra
        for (OtherThings extra : person.getExtra()) {
            password += person.getFirsName() + extra.getWord() + "\n";
        }
        //Union del segundo nombre de la victima con la palabra extra
        for (OtherThings extra : person.getExtra()) {
            password += person.getMiddleName() + extra.getWord() + "\n";
        }
        //Union del primer apellido de la victima con la palabra extra
        for (OtherThings extra : person.getExtra()) {
            password += person.getLastname1() + extra.getWord() + "\n";
        }
        //Union del segundo apellido de la victima con la palabra extra
        for (OtherThings extra : person.getExtra()) {
            password += person.getLastName2() + extra.getWord() + "\n";
        }
        return password;
    }
    
    private String informationFamilyWithPerson(){
        String password = "";
        for (Family family : person.getFamilies()) {
            //Union del primer nombre del familiar con el primer nombre de la victima
            password += family.getFirsName() + person.getFirsName() + "\n";
            //Union del segundo nombre del familiar con el primer nombre de la victima
            password += family.getMiddleName() + person.getFirsName() + "\n";
            //Union del primer apellido del familiar con el primer nombre de la victima
            password += family.getLastname1() + person.getFirsName() + "\n";
            //Union del segundo apellido del familiar con el primer nombre de la victima
            password += family.getLastName2() + person.getFirsName() + "\n";
            //Union del primer nombre del familiar con el segundo nombre de la victima
            password += family.getFirsName() + person.getMiddleName() + "\n";
            //Union del segundo nombre del familiar con el segundo nombre de la victima
            password += family.getMiddleName() + person.getMiddleName() + "\n";
            //Union del primer apellido del familiar con el seguno nombre de la victima
            password += family.getLastname1() + person.getLastname1() + "\n";
            //Union del segundo apellido del familiar con el segundo nombre de la victima
            password += family.getLastName2() + person.getMiddleName() + "\n";
            //Union del primer nombre del familiar con el primer apellido de la victima
            password += family.getFirsName() + person.getLastname1() + "\n";
            //Union del segundo nombre del familair con el primer apellido de la victima
            password += family.getMiddleName() + person.getLastname1() + "\n";
            //Union del primer apellido del familiar con el primer apellido de la victima
            password += family.getLastname1() + person.getLastname1() + "\n";
            //Union del segundo apellido del familiar con el primer apellido de la victima
            password += family.getLastName2() + person.getLastname1() + "\n";
            //Union del primer nombre del familair con el seguno apellido de la victima
            password += family.getFirsName() + person.getLastName2() + "\n";
            //Union del segundo nombre del familiar con el segundo apellido de la victima
            password += family.getMiddleName() + person.getLastName2() + "\n";
            //Union del primer apellido del familiar con el seguno apellido de la victima
            password += family.getLastname1() + person.getLastName2() + "\n";
            //Union del segundo apellido del familiar con el segundo apellido de la victima
            password += family.getLastName2() + person.getLastName2() + "\n";
            //Union del primer nombre del familiar con toda la informacion de la victima
            password += family.getFirsName() + person.getFirsName() + person.getMiddleName() +
                    person.getLastname1() + person.getLastName2() + "\n";
            //Union del segundo nombre del familiar con toda la informacion de la victima
            password += family.getMiddleName() + person.getFirsName() + person.getMiddleName() +
                    person.getLastname1() + person.getLastName2() + "\n";
            //Union del primer apellido del familiar con toda la informacion de la victima
            password += family.getLastname1() + person.getFirsName() + person.getMiddleName() + 
                    person.getLastname1() + person.getLastName2() + "\n";
            //Union del segundo apellido del familiar con toda la informacion de la victima
            password += family.getLastName2() + person.getFirsName() + person.getMiddleName() +
                    person.getLastname1() + person.getLastName2() + "\n";
        }
        return password;
    }
}
