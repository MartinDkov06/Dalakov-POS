import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Person
{
    private String name;
    private float kg;
    private int cm;
    private char gender;

    // Constructor
    public Person (String name, float kg, int cm, char gender) {
        if (kg >625) {
        throw new IllegalArgumentException("Gewicht muss kleiner als 625kg sein!");
        
    } else if (kg <0) {
    throw new IllegalArgumentException("Gewicht muss größer als 0 sein!");
    }
    if (cm >272) {
        throw new IllegalArgumentException("Größe muss kleiner als 272cm sein!");
        
    } else if (cm <30) {
    throw new IllegalArgumentException("Größe muss größer als 30cm sein!");
    
    }
    if (name.length()<3 || name.length()>50 ) {
        throw new IllegalArgumentException("Name muss mehr als drei Buchstaben haben!");
    
        
    }
    
        
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        this.setGender(gender);
    }
    // setter für name
    public void setName (String name) {
        this.name = name;
    }

    // setter für kg
    public void setKg (float kilogramm) {
        this.kg = kilogramm;
    }

    // setter für cm
    public void setCm (int cm) {
        this.cm = cm;
    }
    
    // calculate bmi
    public float bmi () {
        return this.kg/((this.cm/100.0f)*(this.cm/100.0f));
    }

    public String mannOderFrau () {
        if (this.gender == 'm') return "männlich";
        // this.
        return "weiblich";
    }

    public String toString () {
        return "Name: " + this.name + " (" + this.mannOderFrau() + ")" + mannOderFrau();
    }

    public void setGender (char gender) { //String = Alles in den grünen anführungszeichen (oft Buchstaben)
        gender = Character.toLowerCase(gender);
        if(gender !='m' && gender !='w') {
            throw new IllegalArgumentException ("Geschlecht darf nur m oder w sein!");
            
        } else
        
        
        
        
        this.gender = gender;
    }

    public String bmiBewerter () {
        if (this.gender == 'm') {
            if (bmi() < 20) {
                return "untergewicht";

            } else if (bmi() > 25) {
                return "übergewicht";

            
            } else {
                return "normalgewicht";

            }

        }
        if (this.gender == 'w') {
            if (bmi() < 19) {
                return "untergewicht";

            } else if (bmi() > 24) {
                return "übergewicht";

            
            } else {
                return "normalgewicht";

            }

        }
        return "GondiBalsam";
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getKg()
    {
        return kg;
    }
    
    public int getCm() {
    return cm;
    }
    
    public char getGender() {
    return gender;
    }
    
}

