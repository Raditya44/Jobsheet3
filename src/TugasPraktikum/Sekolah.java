/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author User
 */
public class Sekolah {
    protected int id;
    protected String nama;
    
    public Sekolah(int id_guru, String nama_guru)
    {
        this.id = id_guru;
        this.nama = nama_guru;
    }
    public void tampilan()
    {
        System.out.println("Id Guru                  = "+this.id);
        System.out.println("Nama Guru                = "+this.nama);
    }
}
