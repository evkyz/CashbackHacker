package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void test100() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test0() {
        int amount = 0;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test1000() {
        int amount = 1000;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testminus() {
        int amount = -1;
        int expected = 1001;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

}