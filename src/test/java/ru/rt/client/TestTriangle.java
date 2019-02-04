package ru.rt.client;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTriangle {

    @Test
    public void testArea(){
        Triangle t=new Triangle(6, 7);
        Assert.assertEquals(t.area(), 21.0);
    }
}
