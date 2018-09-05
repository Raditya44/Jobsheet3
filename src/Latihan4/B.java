/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author User
 */
public class B extends A{
    private int b, d;
    public void setB(int nilai)
    {
        b = nilai;
    }
    public int getB()
    {
        return b;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    
    public void tampilkaNilai()
    {
        super.tampilkanNilai();
        System.out.println("Nilai b : "+getB());
    }
    public void tampilkanNilaiD()
    {
        System.out.println("Nilai d : "+getD());
    }
    public void tampilkanNilaiPenjumlahan()
    {
        System.out.println("Nilai Jumlah : "+(getD()+getB()+getA()));
    }
}
