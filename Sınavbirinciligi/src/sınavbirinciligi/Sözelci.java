/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sınavbirinciligi;


public class Sözelci extends Ögrenci {
    
   public Sözelci(int türkçe,int matematik,int sosyal,int fen,String isim){
       
       super(türkçe,matematik,sosyal,fen,isim);
       
       
   } 

    @Override
    public int puanHesapla() { //puan hesapla kısmı rastgele yapılmıştır kendinize göre ayarlayabilirsiniz
       
        return ((getTürkçe()*5)+(getMatematik()* 3)+(getSosyal()*4)+(getFen()*1));
    }
    
    
    
    
    
}
