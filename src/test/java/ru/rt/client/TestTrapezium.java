package ru.rt.client;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrapezium {

@Test
    public void testArea(){
    Trapezium tr=new Trapezium(7, 8, 3);
    Assert.assertEquals(tr.area(),22.5);
    }
}
