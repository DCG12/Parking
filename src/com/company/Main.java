package com.company;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero de plazas del parking");

        int numplaces = sc.nextInt();

        System.out.println("Dame el numero de coches que vendran al parking");

        int numcoche = sc.nextInt();

        Semaphore semaphore = new Semaphore(numplaces);

        Coche coches[] = new Coche[numcoche];

        for (int j = 0; j < numcoche; j++) {
            coches[j] = new Coche();
            coches[j].start();
        }
        sc.close();
    }
}

