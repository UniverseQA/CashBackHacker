package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateFrom800() {

        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateFrom1000() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateFrom0() {

        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateFrom75() {

        CashbackHackService service = new CashbackHackService();

        int amount = 75;

        int actual = service.remain(amount);
        int expected = 925;

        Assert.assertEquals(actual, expected);
    }
}