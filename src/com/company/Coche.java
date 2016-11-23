package com.company;


import java.util.Random;
import java.util.concurrent.Semaphore;

public class Coche extends Thread {

    int matricula;
    int temps;

    Semaphore sem = new Semaphore(5);

    public void run(){

        Random rd = new Random();
        this.matricula = rd.nextInt(9999);
        this.temps = rd.nextInt(1500);
        try {
                sem.acquire();
                System.out.println("El coche a entrado, matricula " + this.matricula);
                sleep(rd.nextInt(1500));
                sem.release();
                System.out.println("El coche a dejado el parking, matricula " + this.matricula + " ha tardado en salir " + this.temps + " segundos");

        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
