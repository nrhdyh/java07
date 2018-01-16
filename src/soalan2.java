/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class soalan2 {
  public static void main(String[] args) {
      
      int bm, bi, mat, sej, jumlah;
      double purata, peratus;
      
      bm=78;
      bi=53;
      mat=81;
      sej=97;
      
      jumlah= bm+bi+mat+sej;
      purata= jumlah/4;
      peratus=jumlah*100/400;
      
      System.out.println("B.Melayu:"+bm+" \t B.Inggeris :"+bi);
      System.out.println("Matematik:"+mat+" \t\t Sejarah :"+sej);
      System.out.println("Jumlah markah keseluruhan : "+jumlah);
      System.out.println("Purata markah keseluruhan : "+purata);
      System.out.println("Peratus markah keseluruhan : "+peratus);
  }  
}