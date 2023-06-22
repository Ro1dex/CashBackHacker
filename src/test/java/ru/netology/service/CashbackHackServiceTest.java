package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
 @Test
    public void shouldGivePercent (){
     CashbackHackService service = new CashbackHackService();
     int amount = 500;
     int exp = 500;
     int act = service.remain(amount);
     Assert.assertEquals(exp,act);


     amount = 1000;
     exp = 1000;
     act = service.remain(amount);
     Assert.assertEquals(act, exp);

     amount = 1500;
     exp = 500;
     act = service.remain(amount);
     Assert.assertEquals(act,exp);

     amount = 2000;
     exp = 1000;
     act = service.remain(amount);
     Assert.assertEquals(act,exp);

 }
}