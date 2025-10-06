import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class AutoTest
{
    @Test
    public void testEinsteigen() {
        Auto BMW = new Auto("Galdon", 1250);
        Person JohnSmith = new Person("JohnSmith", 80f, 175, 'm');
        assertNotNull(JohnSmith);
        BMW.einsteigen(JohnSmith);
        JohnSmith = null;
        assertNull(JohnSmith);
    }
    
    @Test
    public void testGesamtGewicht_eigengewicht_FALSCH_5000kg() { 
        try {
        Auto BMW = new Auto("Galdon", 1250);
        
        assertEquals(1250, BMW.getEigengewicht());
        BMW.setEigengewicht(5000);
        assertEquals(1250, BMW.getEigengewicht());
        
        BMW.setEigengewicht(400);
        assertEquals(1250, BMW.getEigengewicht());
    }
    catch (IllegalArgumentException exception) {
    System.out.println("Test ist gut gelaufen");
    
    }

    }
    
    @Test
    public void testGesamtGewicht_eigenwicht_ok_2999kg() { 
        try {
        Auto BMW = new Auto("Galdon", 1250);
        
        assertEquals(1250, BMW.getEigengewicht());
        BMW.setEigengewicht(2999);
        assertEquals(2999, BMW.getEigengewicht());
        
        
    }
    catch (IllegalArgumentException exception) {
    System.out.println("Test ist NICHT gut gelaufen");
    fail ();
    
    }

    }
}