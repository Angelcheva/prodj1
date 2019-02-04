package ru.rt.client;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRectangle{
@Test

    public void testArea(){
        Rectangle r = new Rectangle(5, 6);
    Assert.assertEquals(r.area(),11.0);

    }
}
