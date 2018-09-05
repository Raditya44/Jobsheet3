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
public class Matpel extends Perpustakaan{
    protected String mapel;
    public Matpel(String mapel, String nama, int id, String karya)
    {
        super(nama, id, karya);
        this.mapel = mapel;
    }
    public void Tampil()
    {
        System.out.println("Mengajar Mata Pelajaran  = "+this.mapel);
        super.Tampilan();
    }
}
