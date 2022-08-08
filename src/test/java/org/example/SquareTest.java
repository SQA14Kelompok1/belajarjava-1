package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void TestLuasSquare(){
        Square square = new Square(5);

        int luas = square.getluas();

        Assert.assertEquals(25,luas);

    }
}
