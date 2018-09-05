/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author User
 */
public class Mountaintruck extends Truck{
    public int seatHeight, Down;
    public Mountaintruck(int startHeight, int Break, int startCadence, int startSpeed, int startGear, int down)
    {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
        Down = down;
    }
    public void seatHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public void down(int speedup, int applybrake)
    {
        Down = speedup - applybrake;
    }   
    public static void main(String[] args) {
        System.out.println("Mulai Berjalan");
        Mountaintruck MB = new Mountaintruck(0,0,0,0,0,0);
        System.out.println("Gear  : "+MB.gear);
        System.out.println("Speed : "+MB.speed);
        MB.setGear(2);
        MB.speedup(2);
        System.out.println("Gear  : "+MB.gear);
        System.out.println("Speed : "+MB.speed);
        MB.speedup(5);
        MB.down(5,1);
        System.out.println("Gear  : "+MB.gear);
        System.out.println("Speed : "+MB.Down);
        
    }
}
