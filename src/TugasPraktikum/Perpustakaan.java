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
public class Perpustakaan extends Sekolah{
    protected String karya;
    public Perpustakaan(String karya, int id, String nama)
    {
        super(id, nama);
        this.karya = karya;     
    }
    public void Tampilan()
    {
        System.out.println("Buku yang dicetak        = "+this.karya);
        super.tampilan();
    }
}
