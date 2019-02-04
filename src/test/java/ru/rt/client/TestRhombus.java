package ru.rt.client;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRhombus {

    @Test
    public void testArea(){
        Rhombus r=new Rhombus(4, 5);
        Assert.assertEquals(r.area(), 20.0);
    }

}
