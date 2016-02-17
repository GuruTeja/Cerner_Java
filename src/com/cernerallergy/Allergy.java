package com.cernerallergy;

/**
 * Created by GuruTeja on 2/16/2016.
 */
import java.util.*;
public class Allergy {

    private String allergyName;
    private String severity;

    public String getAllergyName(){
        return allergyName;
    }
    public void setAllergyName(String newallergyName){
        this.allergyName = newallergyName;
    }
    public String getSeverity(){
        return severity;
    }
    public void setSeverity(String newSeverity){
        this.severity = newSeverity;
    }
}
