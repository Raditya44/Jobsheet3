/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumJobSheet3;

/**
 *
 * @author User
 */
public class Guru {
    protected int id_guru;
    protected String  nama;
    public Guru(int id_guru, String nama)
    {
        this.id_guru = id_guru;
        this.nama = nama;    
    }
    public void tampilkan()
    {
        System.out.println("Id Guru = "+this.id_guru);
        System.out.println("Nama Guru = "+this.nama);
    }
}
