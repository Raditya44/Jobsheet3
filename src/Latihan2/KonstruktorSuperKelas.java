/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author User
 */
public class KonstruktorSuperKelas {
    public static void main(String[] args) {
        Employ programer1 = new Employ("12345678","Yanto",32);
        programer1.info();
        System.out.println("-------------------------------");       
        Person programer2 = new Person("Pak Darminto",69);
        programer2.info();
    }
}
