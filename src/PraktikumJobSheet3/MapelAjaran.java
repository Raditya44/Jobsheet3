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
public class MapelAjaran extends Guru {
    protected int id_mapel;
    protected String nama_mapel;
    public MapelAjaran(int id_guru, String nama, int id_mapel, String nama_mapel)
    {
        super(id_guru, nama);
        this.id_mapel = id_mapel;
        this.nama_mapel = nama_mapel;
    }
    public void tampil()
    {
        super.tampilkan();
        System.out.println("Id Mapel = "+this.id_mapel);
        System.out.println("Nama Mapel = "+this.nama_mapel);      
    }   
}
