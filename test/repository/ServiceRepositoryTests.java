package repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ServiceRepositoryTests{

    ServiceRepository<Service> sr = new ServiceRepository<>();

    @Test
    public void checkSizeAfterAdd(){
        int sizeBefore = sr.getLists().size();
        sr.add(new InitPrinter());

        int sizeAfter = sr.getLists().size();
        assertTrue("no change the size after add ", (sizeAfter != sizeBefore));

    }

}
