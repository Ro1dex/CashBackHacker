package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
 @Test
    public void shouldGivePercent (){
     CashbackHackService service = new CashbackHackService();
     int amount = 500;
     int exp = 500;
     int act = service.remain(amount);
     assertEquals (act, exp);


     amount = 1000;
     exp = 1000;
     act = service.remain(amount);
     assertEquals(act, exp);

     amount = 1500;
     exp = 500;
     act = service.remain(amount);
     assertEquals(act,exp);

     amount = 2000;
     exp = 1000;
     act = service.remain(amount);
     assertEquals(act,exp);

 }
}