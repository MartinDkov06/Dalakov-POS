import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testSetName()
    {
        // String name, float kg, int cm, char gender
        Person s = new Person("Dalakov", 89.0f, 190, 'm');
        assertEquals("Dalakov", s.getName());
        s.setName("Graf");
        assertEquals("Graf", s.getName());
        
    }
    
    @Test
    public void testSetKg()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 89.0f, 190, 'm');
        assertEquals(89.0f, f.getKg(),0.1);
        f.setKg(79.0f);
        assertEquals(79.0f, f.getKg(), 0.1);
        
    }
    
    @Test
    public void testSetCm()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 89.0f, 190, 'm');
        assertEquals(190, f.getCm());
        f.setCm(180);
        assertEquals(180, f.getCm());
        
    }
    
    @Test
    public void testSetGender()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 89.0f, 190, 'm');
        assertEquals('m', f.getGender());
        f.setGender('w');
        assertEquals('w', f.getGender());
        
    }
    
    
    //Aufgabe vom 25.09.2025
    @Test
    public void testBmiBewerter_mann_normalgewichtig()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 89.0f, 190, 'm');
        assertEquals("normalgewicht", f.bmiBewerter());
        
    }
    @Test
    public void testBmiBewerter_mann_übergewichtig()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 120.0f, 190, 'm');
        assertEquals("übergewicht", f.bmiBewerter());
        
    }
    @Test
    public void testBmiBewerter_mann_untergewichtig()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 50.0f, 190, 'm');
        assertEquals("untergewicht", f.bmiBewerter());
        
    }
    @Test
    public void testBmiBewerter_frau_normalgewichtig()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Rosa", 50.0f, 155, 'w');
        assertEquals("normalgewicht", f.bmiBewerter());
        
    }
    @Test
    public void testBmiBewerter_frau_übergewichtig()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Rosa", 89.0f, 167, 'w');
        assertEquals("übergewicht", f.bmiBewerter());
        
    }
    @Test
    public void testBmiBewerter_frau_untergewichtig()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 35.0f, 165, 'w');
        assertEquals("untergewicht", f.bmiBewerter());
        
    }
    @Test
    public void testBmi_dalakov_untergewichtig()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 35.0f, 165, 'm');
        assertEquals(12.9f,f.bmi(),0.1f);
        
    }
    @Test
    public void testBmi_dalakov_normalgewichtig()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 75.0f, 185, 'm');
        assertEquals(21.9f,f.bmi(),0.1f);
        
    }
    @Test
    public void testBmi_dalakov_übergewichtig()
    {
        // String name, float kg, int cm, char gender
        Person f = new Person("Dalakov", 120.0f, 175, 'm');
        assertEquals(39.2f,f.bmi(),0.1f);
        
    }
    @Test
    public void falschesGeschlecht() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person("Rosa", 60.0f, 170, 'x');
        });
    }
}
    
    
  





