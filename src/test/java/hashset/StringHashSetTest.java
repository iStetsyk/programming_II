package hashset;

import org.junit.Test;

import java.util.Set;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

public class StringHashSetTest {

    @org.junit.Test
    public void shouldReturnCountOfElementsInderted() {

        Set<String> set = new StringHashSet();
        set.add("Igor");
        set.add("Asia");
        set.add("Aleks");
        set.add("Rafał");
        set.add("Łukasz");
        set.add("Adrian");

        assertEquals(11, set.size());
    }

    @org.junit.Test
    public void shouldReturn0ForEmptySet() {
        Set<String> set = new StringHashSet();
        assertEquals(0, set.size());

    }

    @Test
    public void shouldReturn0ForEmptiedSet() {
        Set<String> set = new StringHashSet();

        set.add("Igor");
        set.remove("Igor");
        assertEquals(0, set.size());
    }

    @Test
    public void checkIfAdded() {
        Set<String> set = new StringHashSet();

        assertEquals("Marek", "Marek");
    }

    @Test
    public void shouldFindNameInTheList() {
        Set<String> set = new StringHashSet();


    }
}