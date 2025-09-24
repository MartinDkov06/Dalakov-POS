public class Student
{
    private String name;
    private float kg;
    private int cm;
    private char gender;

    // Constructor
    public Student (String name, float kg, int cm, char gender) {
        if (kg >625 || kg <3 ) {
        throw new IllegalArgumentException("Ungültig");
        
    }
    if (cm >272 || cm <30 ) {
        throw new IllegalArgumentException("Ungültig");
        
    }
    if (name.length()<3 || name.length()>50 ) {
        throw new IllegalArgumentException("Ungültig");
    
        
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
        this.gender = gender;
    }

    public String setGewicht () {
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
    
    
     
}

