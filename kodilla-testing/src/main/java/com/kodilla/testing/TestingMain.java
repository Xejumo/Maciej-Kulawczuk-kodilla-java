package com.kodilla.testing;

import com.kodilla.testing.calculator.Caalculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();


        Caalculator calculator = new Caalculator();

        int sum = calculator.add(55,33);
        int diff = calculator.substract(11 , 22);

        if (sum == 88){
            System.out.println("Jest dobrze:" + sum);
        }else{
            System.out.println("Nie jest dobrze:" + sum);
        }

        if (diff == -11){
            System.out.println("Jest dobrze:" + diff);
        }else{
            System.out.println("Nie jest dobrze:" + diff);
        }


    }
}
