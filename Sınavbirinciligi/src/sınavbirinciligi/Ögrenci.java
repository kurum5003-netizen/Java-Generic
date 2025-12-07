/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sınavbirinciligi;

/**
 *
 * @author BERK
 */
public abstract class Ögrenci {
    private int türkçe;
    private int matematik;
    private int  sosyal;
    private int fen;
    private String isim;
    
    public Ögrenci(int türkçe,int matematik,int sosyal,int fen,String isim){
        this.türkçe=türkçe;
        this.matematik=matematik;
        this.sosyal=sosyal;
        this.fen=fen;
        this.isim=isim;
        
        
    }

    
    public int getTürkçe() {
        return türkçe;
    }

    
    public void setTürkçe(int türkçe) {
        this.türkçe = türkçe;
    }

    
    public int getMatematik() {
        return matematik;
    }

    
    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    
    public int getSosyal() {
        return sosyal;
    }

   
    public void setSosyal(int sosyal) {
        this.sosyal = sosyal;
    }

   
    public int getFen() {
        return fen;
    }

    
    public void setFen(int fen) {
        this.fen = fen;
    }

    
    public String getIsim() {
        return isim;
    }

  
    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
   public abstract int puanHesapla();
    
    
    
    
    
    
    
    
    
    
    
}
