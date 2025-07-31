package CodeWar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListStringTest {
    @Test
    public void testThatlongestReturnsTheloongst(){
        ListString listString = new ListString();
        List<String> list = new ArrayList<>();
        list.add("flower");
        list.add("flow");
        list.add("flights");
        assertEquals("fl", listString.longest(list));
    }

}