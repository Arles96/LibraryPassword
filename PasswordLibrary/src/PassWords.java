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
 * TODO realizar los metodos para cada seccion de informacion de la persona
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
        password += informationFamilyWithPerson();
        password += informationFamilyWithPets();
        password += informationFamilyWithDates();
        password += informationFamilyWithExtra();
        password += informationPetsWithPerson();
        password += informationPetsWithFamily();
        password += informationPetsWithDates();
        password += informationPetsWithExtra();
        password += informationDatesWithPerson();
        password += informationDatesWithFamily();
        password += informationDatesWithPets();
        password += informationDatesWithExtra();
        password += informationExtraWithPerson();
        password += informationExtraWithFamily();
        password += informationExtraWithDates();
        password += informationExtraWithPets();
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
    
    private String informationFamilyWithPets(){
        String password = "";
        for (Family family : person.getFamilies()) {
            for (Pets pet : person.getPets()) {
                //Union del primer nombre del familiar con el nombre de la mascota
                password += family.getFirsName() + pet.getName() + "\n";
                //Union del segundo nombre del familiar con el nombre de la mascota
                password += family.getMiddleName() + pet.getName() + "\n";
                //Union del primer apellido del familiar con el nombre de la mastoca
                password += family.getLastname1() + pet.getName() + "\n";
                //Union del segundo apellido del familair con el nombre de la mascota
                password += family.getLastName2() + pet.getName() + "\n";
            }
        }
        return password;
    }
    
    private String informationFamilyWithDates(){
        String password = "";
        for (Family family : person.getFamilies()) {
            for (DatePerson date : person.getDates()) {
                //Union del primer nombre del familiar con el dia
                password += family.getFirsName() + date.getDay() + "\n";
                //Union del segundo nombre del familair con el dia
                password += family.getMiddleName() + date.getDay() + "\n";
                //Union del primer apellido del familiar con el dia
                password += family.getLastname1() + date.getDay() + "\n";
                //Union del segundo apellido del familiar con el dia
                password += family.getLastName2() + date.getDay() + "\n";
                //Union del primer nombre del familiar con el mes
                password += family.getFirsName() + date.getMonth() + "\n";
                //Union del segundo nombre del familiar con el mes
                password += family.getMiddleName() + date.getMonth() + "\n";
                //Union del primer apellido del familiar con el mes
                password += family.getLastname1() + date.getMonth() + "\n";
                //Union del segundo apellido del familiar con el mes
                password += family.getLastName2() + date.getMonth() + "\n";
                //Union del primer nombre del familiar con el año
                password += family.getFirsName() + date.getYears() + "\n";
                //Union del segundo nombre del familiar con el año
                password += family.getMiddleName() + date.getYears() + "\n";
                //Union del primer apellido del familiar con el año
                password += family.getLastname1() + date.getYears() + "\n";
                //Union del segundo apellido del familiar con el año
                password += family.getLastName2() + date.getYears() + "\n";
                //Union del primer nombre del familiar con toda la informacionde las fechas
                password += family.getFirsName() + date.getDay() + date.getMonth() + 
                        date.getYears() + "\n";
                //Union del segundo nombre del familiar con toda la informacion de las fechas
                password += family.getMiddleName() + date.getDay() + date.getMonth() +
                        date.getYears() + "\n";
                //Union del primer apellido del familiar con toda la informacion de las fechas
                password += family.getLastname1() + date.getDay() + date.getMonth() + 
                        date.getYears() + "\n";
                //Union del segundo apellido del familiar con toda la informacion de las fechas
                password += family.getLastName2() + date.getDay() + date.getMonth() + 
                        date.getYears() + "\n";
            }
        }
        return password;
    }
    
    private String informationFamilyWithExtra(){
        String password = "";
        for (Family family : person.getFamilies()) {
            for (OtherThings extra : person.getExtra()) {
                //Union del primer nombre del familiar con la palabra extra
                password += family.getFirsName() + extra.getWord() + "\n";
                //Union del segundo nombre del familiar con la palabra extra
                password += family.getMiddleName() + extra.getWord() + "\n";
                //Union del primer apellido del familiar con la palabra extra
                password += family.getLastname1() + extra.getWord() + "\n";
                //Union del segundo apellido del familiar con la palabra extra
                password += family.getLastName2() + extra.getWord() + "\n";                
            }
        }
        return password;
    }
    
    private String informationPetsWithPerson(){
        String password = "";
        for (Pets pet : person.getPets()) {
            //Union del nombre de la mascota con el primer nombre de la victima
            password += pet.getName() + person.getFirsName() + "\n";
            //Union del nombre de la mascota con el seguno nombre de la victima
            password += pet.getName() + person.getMiddleName() + "\n";
            //Union del nombre de la mascota con el primer apellido de la victima
            password += pet.getName() + person.getLastname1() + "\n";
            //Union del nombre de la mascota con el segundo apellido de la victima
            password += pet.getName() + person.getLastName2() + "\n";
            //Union del nombre de la mascota con toda la informacion de la victima
            password += pet.getName() + person.getFirsName() + person.getMiddleName() +
                    person.getLastname1() + person.getLastName2() + "\n";
        }
        return password;
    }
    
    private String informationPetsWithFamily(){
        String password = "";
        for (Pets pet : person.getPets()) {
            for (Family family : person.getFamilies()) {
                //Union del nombre de la mascota con el primer nombre del familiar
                password += pet.getName() + family.getFirsName() + "\n";
                //Union del nombre de la mascota con el segundo nombre del familiar
                password += pet.getName() + family.getMiddleName() + "\n";
                //Union del nombre de la mascota con el primer apellido del familiar
                password += pet.getName() + family.getLastname1() + "\n";
                //Union del nombre de la mascota con el segundo apellido del familiar
                password += pet.getName() + family.getLastName2() + "\n";
                //Union del nombre de la mascota con toda la informacion del familiar
                password += pet.getName() + family.getFirsName() +  family.getMiddleName() +
                        family.getLastname1() + family.getLastName2() + "\n";               
            }
        }
        return password;
    }
    
    private String informationPetsWithDates(){
        String password = "";
        for (Pets pet : person.getPets()) {
            for (DatePerson date : person.getDates()) {
                //Union con el nombre de la mascota con el dia
                password += pet.getName() + date.getDay() + "\n";
                //Union con el onmbre de la mascota con el mes
                password += pet.getName() + date.getMonth() + "\n";
                //Union con el nombre de la mascota con el año
                password += pet.getName() + date.getYears() + "\n";
                //Union con el nombre de la mascota con toda la informacion de las fechas
                password += pet.getName() + date.getDay() + date.getMonth() + 
                        date.getYears() + "\n";
            }
        }
        return password;
    }
    
    private String informationPetsWithExtra(){
        String password = "";
        for (Pets pet : person.getPets()) {
            for (OtherThings extra : person.getExtra()) {
                //Union del nombre de la mascota con la palabra extra
                password += pet.getName() + extra.getWord() + "\n";
            }
        }
        return password;
    }
    
    private String informationDatesWithPerson(){
        String password = "";
        for (DatePerson date : person.getDates()) {
            //union del dia con el primer nombre de la persona
            password += date.getDay() + person.getFirsName() + "\n";
            //Union del dia con el segundo nombre  de la persona
            password += date.getDay() + person.getMiddleName() + "\n";
            //Union del dia con el primer apellido de la persona
            password += date.getDay() + person.getLastname1() + "\n";
            //Union del dia con el segundo apellido de la persona
            password += date.getDay()+ person.getLastName2() + "\n";
            //Union con el mes con el primer nombre de la persona
            password += date.getMonth() + person.getFirsName() + "\n";
            //Union con el mes con el segundo nombre de la persona
            password += date.getMonth() + person.getMiddleName() + "\n";
            //Union del mes con el primer apellido de la persona
            password += date.getMonth() + person.getLastname1() + "\n";
            //Union del mes conn el segundo apellido de la persona
            password += date.getMonth() + person.getLastName2() + "\n";
            //Union del año con el primer nombre de la persona
            password += date.getYears() + person.getFirsName() + "\n";
            //Union del año con el segundo nombre de la persona
            password += date.getYears() + person.getMiddleName() + "\n";
            //Union del año con el primer apellido de la persona
            password += date.getYears() + person.getLastname1() + "\n";
            //Union del año con el segundo apellido de la persona
            password += date.getYears() + person.getLastName2() + "\n";
        }
        return password;
    }
    
    private String informationDatesWithFamily(){
        String password = "";
        for (DatePerson date : person.getDates()) {
            for (Family family : person.getFamilies()) {
                //Union del dia con el primer nombre del familiar
                password += date.getDay() + family.getFirsName() + "\n";
                //Union del dia con el segundo nombre del familiar
                password += date.getDay() + family.getMiddleName() + "\n";
                //Uion del dia con el primer apellido del familiar
                password += date.getDay() + family.getLastname1() + "\n";
                //Uion del dia con el segundo apellido del familiar
                password += date.getDay() + family.getLastName2() + "\n";
                //Union con el mes con el primer nombre de familiar
                password += date.getMonth() + family.getFirsName() + "\n";
                //Union con el mes con el segundo nombre del familiar
                password += date.getMonth() + family.getMiddleName() + "\n";
                //Union con el mes con el primer apellido del familiar
                password += date.getMonth() + family.getLastname1() + "\n";
                //Union con el mes con el segundo apellido del familiar
                password += date.getMonth() + family.getLastName2() + "\n";
                //Union con el año con el primer nombre del familiar
                password += date.getYears() + family.getFirsName() + "\n";
                //Union del año con el segundo nombre del familiar
                password += date.getYears() + family.getMiddleName() + "\n";
                //Union del año con el primer apellido del familiar
                password += date.getYears() + family.getLastname1() + "\n";
                //Union del año con el segundo apellido del familiar
                password += date.getYears() + family.getLastName2() + "\n";
            }
        }
        return password;
    }
    
    private String informationDatesWithPets(){
        String password = "";
        for (DatePerson date : person.getDates()) {
            for (Pets pet : person.getPets()) {
                //Union del dia con el nombre de la mascota
                password += date.getDay() + pet.getName() + "\n";
                //Union del mes con el nombre de la mascota
                password += date.getMonth() + pet.getName() + "\n";
                //Union del año con el nombre de la mascota 
                password += date.getYears() + pet.getName() + "\n";
            }
        }
        return password;
    }
    
    private String informationDatesWithExtra(){
        String password = "";
        for (DatePerson date : person.getDates()) {
            for (OtherThings extra : person.getExtra()) {
                //Union del dia con la palabra extra
                password += date.getDay() + extra.getWord() + "\n";
                //Union del mes con la palabra extra
                password += date.getDay() + extra.getWord() + "\n";
                //Union del año con la palabra extra
                password += date.getDay() + extra.getWord() + "\n";
            }
        }
        return password;
    }
    
    private String informationExtraWithPerson(){
        String password = "";
        for (OtherThings extra : person.getExtra()) {
            //Union de la palabra extra con el primer nombre de la persona
            password += extra.getWord() + person.getFirsName() + "\n";
            //Union de la palabra extra con el segundo nombre de la persona
            password += extra.getWord() + person.getMiddleName() + "\n";
            //Union de la palabra extra con el primer apellido de la persona
            password += extra.getWord() + person.getLastname1() + "\n";
            //Union de la palabra extra con el segundo apellido de la persona
            password += extra.getWord() + person.getLastName2() + "\n";
        }
        return password;
    }
    
    private String informationExtraWithFamily(){
        String password = "";
        for (OtherThings extra : person.getExtra()) {
            for (Family family : person.getFamilies()) {
                //Union de la palabra extra con el prmer nombre del familiar
                password += extra.getWord() + family.getFirsName() + "\n";
                //Union de la palabra extra con el segundo nombre del familiar
                password += extra.getWord() + family.getMiddleName() + "\n";
                //Union de la palabra extra con el primer apellido del familiar
                password += extra.getWord() + family.getLastname1() + "\n";
                //Union de la palabra extra con el segundo apellido del familiar
                password += extra.getWord() + family.getLastName2() + "\n";
            }
        }
        return password;
    }
    
    private String informationExtraWithPets(){
        String password = "";
        for (OtherThings extra : person.getExtra()) {
            for (Pets pet : person.getPets()) {
                //Union de la palabra extra con el nombre de la mascota
                password += extra.getWord() + pet.getName() + "\n";
            }
        }
        return password;
    }
    
    private String informationExtraWithDates(){
        String password = "";
        for (OtherThings extra : person.getExtra()) {
            for (DatePerson date : person.getDates()) {
                //Union de la palabra extra con el dia
                password += extra.getWord() + date.getDay() + "\n";
                //Union de la palabra extra con el mes
                password += extra.getWord() + date.getMonth() + "\n";
                //Union de la palabra extra con el año
                password += extra.getWord() + date.getYears() + "\n";
            }
        }
        return password;
    }
    
}
