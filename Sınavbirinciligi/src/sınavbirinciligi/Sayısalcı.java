/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sınavbirinciligi;


public class Sayısalcı extends Ögrenci {
     public Sayısalcı(int türkçe,int matematik,int sosyal,int fen,String isim){
       
       super(türkçe,matematik,sosyal,fen,isim);
       
       
   } 

    @Override
    public int puanHesapla() { //puan hesapla kısmı rastgele yapılmıştır kendinize göre ayarlayabilirsiniz
       
        return ((getTürkçe()*3)+(getMatematik()* 5)+(getSosyal()*1)+(getFen()*4));
    }
    
    
    
    
    
    
    
}
