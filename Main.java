package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player1 player = new Player1("Harsh","sword",500);
        Scanner sc=new Scanner(System.in);

        System.out.println("Player 1 Name"+" "+player.getName());
        System.out.println("Player 1 Health"+" "+player.getHealth());
        System.out.println("Player 1 weapon"+" "+player.getWeapon());

                   player.damageByGun1();
                   player.damageByGun2();
                   player.heal();

//        Player2 player2 = new Player2("Parag","machinegun",80,false);
//
//        System.out.println("Player 2 Name"+" "+player.getName());
//        System.out.println("Player 2 Health"+" "+player.getHealth());
//        System.out.println("Player 2 weapon"+" "+player.getWeapon());
//                player2.damageByGun1();
//                player2.damageByGun2();
//                player2.heal();
    }
}
