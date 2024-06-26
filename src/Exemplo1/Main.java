package Exemplo1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando as threads");
        Thread t1 = new Thread(new ExemploThread(), "T1");
        Thread t2 = new Thread(new ExemploThread(), "T2");
        Thread t3 = new Thread(new ExemploThread(), "T3");
        Thread t4 = new Thread(new ExemploThread(), "T4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("Threads iniciadas");

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Threads finalizadas");
    }
}