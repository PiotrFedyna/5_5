package com.company;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Random liczba = new Random();
    int i,x,q=0;
    int tab[] = new int [10];
    for (i=0;i<10;i++)
    {
    int los = liczba.nextInt(-100,100);
    tab[i]=los;
    System.out.println(tab[i]);
    }
for (i=0;i<10;i++)
{
    q=q+tab[i];
}
q=q/10;
System.out.println("Srednia to "+q);
    }
}
