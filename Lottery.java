package com.company;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
	int lottery =(int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pick (two digits): ");
        int pick = input.nextInt();
        int Ldigit1 = lottery / 10;
        int Ldigit2 = lottery % 10;
        int pickdigit1 = pick / 10;
        int pickdigit2 = pick % 10;
        System.out.println("The lottery number is " + lottery);
        if (pick == lottery)
            System.out.println("Exact match");
        else if (pickdigit2  == Ldigit1 && pickdigit1 == Ldigit2 )
            System.out.println("Match all digit");
        else if (pickdigit1 == Ldigit1 || pickdigit1 == Ldigit2 || pickdigit2 == Ldigit1 || pickdigit2 == Ldigit2)
            System.out.println("Match 1");
        else
            System.out.println("No match");

    }
}
