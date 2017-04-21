
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arles Cerrato
 */
public class Victim extends People{
    
    private ArrayList<Family> families = new ArrayList();
    private ArrayList<Pets> pets = new ArrayList();
    private ArrayList<DatePerson> dates = new ArrayList();
    private ArrayList<OtherThings> extra = new ArrayList();   

    public Victim() {
    }

    public Victim(String firsName, String middleName, String lastname1, String lastName2) {
        super(firsName, middleName, lastname1, lastName2);
    }

    public ArrayList<Family> getFamilies() {
        return families;
    }

    public void setFamilies(ArrayList<Family> families) {
        this.families = families;
    }

    public ArrayList<Pets> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pets> pets) {
        this.pets = pets;
    }

    public ArrayList<DatePerson> getDates() {
        return dates;
    }

    public void setDates(ArrayList<DatePerson> dates) {
        this.dates = dates;
    }

    public ArrayList<OtherThings> getExtra() {
        return extra;
    }

    public void setExtra(ArrayList<OtherThings> extra) {
        this.extra = extra;
    }
    
    //Metodos de admisnitracion
    
    public void addFamily(Family family){
        this.families.add(family);
    }
    
    public void addPet(Pets pet){
        pets.add(pet);
    }
    
    public void addDate(DatePerson date){
        dates.add(date);
    }
    
    public void addExtra(OtherThings information){
        extra.add(information);
    }
    
    public Family getFamily(int i){
        return families.get(i);
    }
    
    public Pets getPet(int i){
        return pets.get(i);
    }
    
    public DatePerson getDate(int i){
        return dates.get(i);
    }
    
    public OtherThings getExtraIfo(int i){
        return extra.get(i);
    }
    
}
