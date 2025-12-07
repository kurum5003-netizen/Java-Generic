/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sınavbirinciligi;

import java.util.Scanner;


public class Sınavbirinciligi {
    private static Sayısalcı sayısalcı1;
    private static Sayısalcı sayısalcı2;
    private static Sayısalcı sayısalcı3;
    private static Sözelci sözelci1;
    private static Sözelci sözelci2;
    private static Sözelci sözelci3;
    
    
    
    
    
    
    public static <E extends Ögrenci> E Sırala(E e1,E e2,E e3){
        
        if(e1.puanHesapla()>e2.puanHesapla() && e1.puanHesapla()>e3.puanHesapla())
             return e1;
        else if(e2.puanHesapla()>e1.puanHesapla() && e2.puanHesapla()>e3.puanHesapla())
           return e2;
        else
            return e3;
        
        
    }
    
    
    
    
    
    
    
    
    

   
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        String islemler="çıkış için q ya basın\n" + "Sayısal puan hesaplama için 1 e basın\n" +"Sözel puan hesaplama için 2 ye basın\n";
        String islem;
        System.out.println("******* PUAN HESAPLAMA *******");
        while(true){
            System.out.println("işlemninizi seçiniz:");
            islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("SAYISAL PUAN HESAPLAMA SİSTEMİ");
                // 1.öğrenci
                System.out.println("Matematik netinizi giriniz(tam sayı):");
                int mat1=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Türkçe netinizi giriniz(tam sayı):");
                int türk1=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sosyal netinizi giriniz(tam sayı):");
                int sos1=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Fen netinizi giriniz(tam sayı):");
                int fen1=scanner.nextInt();
                scanner.nextLine();
                //2.öğrenci
                 System.out.println("Matematik netinizi giriniz(tam sayı):");
                int mat2=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Türkçe netinizi giriniz(tam sayı):");
                int türk2=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sosyal netinizi giriniz(tam sayı):");
                int sos2=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Fen netinizi giriniz(tam sayı):");
                int fen2=scanner.nextInt();
                scanner.nextLine();
                //3.öğrenci
                 System.out.println("Matematik netinizi giriniz(tam sayı):");
                int mat3=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Türkçe netinizi giriniz(tam sayı):");
                int türk3=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sosyal netinizi giriniz(tam sayı):");
                int sos3=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Fen netinizi giriniz(tam sayı):");
                int fen3=scanner.nextInt();
                scanner.nextLine();
                sayısalcı1=new Sayısalcı(türk1,mat1,sos1,fen1,"Ahmet");
                sayısalcı2=new Sayısalcı(türk2,mat2,sos2,fen2,"Tuğçe");
                sayısalcı3=new Sayısalcı(türk3,mat3,sos3,fen3,"Berfin");
                
                System.out.println("Sınav birincisi" + Sırala(sayısalcı1,sayısalcı2,sayısalcı3).getIsim()+ "puanı:"+ Sırala(sayısalcı1,sayısalcı2,sayısalcı3).puanHesapla());
                
                
            }
            else if(islem.equals("2")){
                System.out.println("SÖZEL PUAN HESAPLAMA SİSTEMİ");
                 // 1.öğrenci
                System.out.println("Matematik netinizi giriniz(tam sayı):");
                int mat1=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Türkçe netinizi giriniz(tam sayı):");
                int türk1=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sosyal netinizi giriniz(tam sayı):");
                int sos1=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Fen netinizi giriniz(tam sayı):");
                int fen1=scanner.nextInt();
                scanner.nextLine();
                 // 2.öğrenci
                System.out.println("Matematik netinizi giriniz(tam sayı):");
                int mat2=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Türkçe netinizi giriniz(tam sayı):");
                int türk2=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sosyal netinizi giriniz(tam sayı):");
                int sos2=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Fen netinizi giriniz(tam sayı):");
                int fen2=scanner.nextInt();
                scanner.nextLine();
                 // 3.öğrenci
                System.out.println("Matematik netinizi giriniz(tam sayı):");
                int mat3=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Türkçe netinizi giriniz(tam sayı):");
                int türk3=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sosyal netinizi giriniz(tam sayı):");
                int sos3=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Fen netinizi giriniz(tam sayı):");
                int fen3=scanner.nextInt();
                scanner.nextLine();
                sözelci1=new Sözelci(türk1,mat1,sos1,fen1,"Berk");
                sözelci2=new Sözelci(türk2,mat2,sos2,fen2,"Muhyeddin");
                sözelci3=new Sözelci(türk3,mat3,sos3,fen3,"Kazım");
                
                System.out.println("Sınav birincisi" + Sırala(sözelci1,sözelci2,sözelci3).getIsim()+ "puanı:"+ Sırala(sözelci1,sözelci2,sözelci3).puanHesapla());
                
                
    
                
            }
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
