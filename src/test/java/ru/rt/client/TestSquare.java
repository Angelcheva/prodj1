package ru.rt.client;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSquare {

    @Test
    public void testArea(){
        Square s= new Square(2);
        Assert.assertEquals( s.area(), 4.0);
    }
}
