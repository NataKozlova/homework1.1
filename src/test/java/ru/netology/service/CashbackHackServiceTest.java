package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnCorrectRemainWhenAmountLessBoundary() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void shouldReturnCorrectRemainWhenAmountEqualToBoundary() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void shouldReturnCorrectRemainWhenAmountMoreBoundary() {
        int amount = 1500;
        int expected = 500;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual,expected);
    }
}
