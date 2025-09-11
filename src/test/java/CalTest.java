import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalTest {
    Cal cal = new Cal();

    @Test
   public  void addMe() {
        assertEquals(9, cal.addMe(4,5));
    }

    @Test
    public void subMe() {
        assertEquals(1, cal.addMe(5,4));
    }

    @Test
    public void mulMe() {
        assertEquals(20, cal.addMe(4,5));
    }

    @Test
    public void divMe() {
        assertEquals(3, cal.addMe(6,2));
    }
}