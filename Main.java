package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Player 1 information
        Player1 player1 = new Player1("Player 1","Groza",100);
        System.out.println("Name:-"+" "+player1.getName());
        System.out.println("Health:-"+" "+player1.getHealth());
        System.out.println("Weapon:-"+" "+player1.getWeapon());
        System.out.println("========================================");
         // Player 2 information
        Player1 player2 = new Player1("Player 2","M416",100);
        System.out.println("Name:-"+" "+player2.getName());
        System.out.println("Health:-"+" "+player2.getHealth());
        System.out.println("weapon:-"+" "+player2.getWeapon());
        System.out.println("========================================");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to choose Player 1");
        System.out.println("Enter 2 to choose Player 2");
        int n=sc.nextInt();
        char op='\0';
          if(n==1)
          {   System.out.println("What would you like to do?");
              System.out.println();
              System.out.println("A. Player 2 Damage by Gun 1.");
              System.out.println("B. Player 2 Damage by Gun 2.");
              System.out.println("C. Heal Player 1");
               do {
                   System.out.println();
                   System.out.println("Enter an option: ");
                   char option1 = sc.next().charAt(0);
                   op = Character.toUpperCase(option1);
                   switch (op) {
                       case 'A':
                           player2.damageByGun1();
                           break;
                       case 'B':
                           player2.damageByGun2();
                           break;
//                       case 'C':
//                           player1.heal();
//                           break;
                       default:
                           System.out.println("Error: invalid option. Please enter A,B and C.");
                           break;
                   }}
                   while(player1.health != 0);
                   {
                       System.out.println("Player 2 dead");
                   }
          }
          else if(n==2)
          {
              System.out.println("What would you like to do?");
              System.out.println();
              System.out.println("A. Player 1 Damage by Gun 1.");
              System.out.println("B. Player 1 Damage by Gun 2.");
              System.out.println("C. Heal Player 2");
              do {
                  System.out.println();
                  System.out.println("Enter an option: ");
                  char option1 = sc.next().charAt(0);
                  op = Character.toUpperCase(option1);
                  switch (op) {
                      case 'A':
                          player1.damageByGun1();
                          break;
                      case 'B':
                          player1.damageByGun2();
                          break;
//                       case 'C':
//                           player1.heal();
//                           break;
                      default:
                          System.out.println("Error: invalid option. Please enter A,B and C.");
                          break;
                  }}
              while(player2.health != 0);
              {
                  System.out.println("Player 1 dead");
              }
          }
    }
}
