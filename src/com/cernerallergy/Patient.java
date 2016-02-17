package com.cernerallergy;

/**
 * Created by GuruTeja on 2/16/2016.
 */
import java.security.PrivateKey;
import java.util.*;
public class Patient {

    private String name;
    private int age;
    //creating objects of type List for Allergy and Disease Classes.
    private List<Allergy> allergyList;
    private List<Allergy> severityList;
    private List<Disease> diseaseList;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public List<Allergy> getAllergyList(){
        return allergyList;
    }
    public void setAllergyList(List<Allergy> allergyList) {
        this.allergyList = allergyList;
    }
    public List<Allergy> getSeverityList(){
        return severityList;
    }
    public void setSeverityList(List<Allergy> severityList){
        this.severityList = severityList;
    }
    public List<Disease> getDiseaseList() {
        return diseaseList;
    }
    public void setDiseaseList(List<Disease> diseaseList){
        this.diseaseList = diseaseList;
    }
}
