import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.volume());
    }

    @Test
    public void drinkWater(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void refillBottle(){
        assertEquals(100, waterbottle.full());
    }
}
