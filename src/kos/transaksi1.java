/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kos;

import java.sql.Connection;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class transaksi1 {
    public void input(int idPelanggan,int IdKamar,int IdFasilitas,String TglBayar,int TotalBayar, String Status){
         String sql = null;
        try{
            sql = "insert into transaksi(id_transaksi,id_pelanggan,tgl_transaksi,bayar,status,id_kamar,id_fasilitas) values (id_transaksi.nextval,"+idPelanggan+"," +"to_date('"+TglBayar+"','dd/mm/yyyy'),"+TotalBayar+",'"+Status+"',"+IdKamar +","+IdFasilitas+")";
            Connection conn = koneksi.getConnection();
            Kos.ks = Kos.conn.prepareStatement(sql);
//            Kos.ks.setInt(1, idPelanggan);
//            Kos.ks.setInt(2, NomorKamar);
//            Kos.ks.setString(3, TglBayar);
//            Kos.ks.setInt(4, TotalBayar);
//            Kos.ks.setString(5, Status);
            Kos.ks.execute();
            
            JOptionPane.showMessageDialog(null, "Tambah Data Berhasil !");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tambah Data Gagal");
             JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
              System.out.print(sql);
        }
    }
}
