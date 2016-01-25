package junit;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CatTests {

    private Cat cat;

    @Before
    public void init(){
        cat = new Cat();
    }

    @Test
    public void checkCatNameDefaultValue(){
        String name  = cat.getName();
        assertNull("default name of cat should be null", name);

    }

    @Test
    public void checkCatWeightDefaultValue(){
        double weight  = cat.getWeight();
        assertTrue("default weight of cat should be 0", weight == 0.0);

    }

    @Test
    public void checkCatisHungryDefaultValue(){
        boolean isHungry  = cat.isHungry();
        assertTrue("cat should be hungry by default.", isHungry);

    }

}

