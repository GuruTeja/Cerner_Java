package com.cernerallergy;

/**
 * Created by GuruTeja on 2/16/2016.
 */
import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class PatientHealthInfo {
    public static void main(String[] args){
        Patient p = new Patient();
        //set patient age
        p.setAge(21);
        //set patient name
        p.setName("Guru");

        Allergy a = new Allergy();
        //set allergy name
        a.setAllergyName("itching");
        //set severity
        a.setSeverity("moderate");
        Allergy a1 = new Allergy();
        a1.setAllergyName("cough");
        a1.setSeverity("Low");

        System.out.println("Allergy added for patient 1 are :" + a.getAllergyName() + ", " + a.getSeverity());

        //creting new list as 'allergyList' for Allergy class
        List<Allergy> allergyList = new ArrayList<Allergy>();
        allergyList.add(a);
        allergyList.add(a1);
        p.setAllergyList(allergyList);
        p.setSeverityList(allergyList);

        System.out.println("allergyList size is :" + allergyList.size());

        System.out.println("Patient with name :" + p.getName() + " has following allergies :" + p.getAllergyList());

        // For patient 2
        Patient p1 = new Patient();
        p1.setName("Teja");
        p1.setAge(24);

        Disease d1 = new Disease();
        d1.setDiseaseName("sinus");
        d1.setDiseaseSeverity("moderate");
        Disease d2 = new Disease();
        d2.setDiseaseName("Sinus1");
        d2.setDiseaseSeverity("Low");

        List<Disease> diseaseList = new ArrayList<Disease>();
        diseaseList.add(d1);
        diseaseList.add(d2);

        p1.setDiseaseList(diseaseList);
        System.out.println("ur here");
        String str1 = Patient(p);
        System.out.println(str1);
//        String str2 = Patient(p1);
       // System.out.println(str2);
    }

    public static String Patient(Patient pnew){
        if((pnew.getAllergyList().size()) > 0){
            return pnew.getName() + " has allergy";
        }
        else if((pnew.getDiseaseList().size())> 0) {
            return pnew.getName()+ "has disease";
        }
        return null;
    }
}

