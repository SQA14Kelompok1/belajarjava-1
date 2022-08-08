package org.example;

import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest {
    @Test
    public void TestPerkalianKalkulator() {
        Kalkulator kalkulator = new Kalkulator(5,5);

        int hasil = kalkulator.getHasilPerkalian();
        int expected = 25;

        Assert.assertEquals(expected,hasil,0);
    }
//komen tambahan
    @Test
    public void TestPembagianKalkulator() {
        Kalkulator kalkulator = new Kalkulator(5,5);

        int hasil = kalkulator.getHasilPembagian();
        int expected = 1;

        Assert.assertEquals(expected,hasil,0);
    }



}
