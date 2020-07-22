/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhan.util;

/**
 *
 * @author ASUS
 */
//class ham` toan hoc xai chung , 
public class MathUtil {

    //tinh n!=1.2.3...n vi` n! tsng gia tri rat nhanh , som tran mien int
    //int chi toi da 2 ty 1, nen ta xai long moi an toan
    //thuc ra 15! to lawsm roi nen ta chi tinh giai thua tu 15 tro lai
    public static long computeFactorial(int n) {
        if(n<0 || n > 15) throw new IllegalArgumentException("Invalid input. N must be >= 0 ");
        if(n==0 || n==1)
            return 1;
            //ddieu kien dung cua de quy 
            //song sot den lenh cho nayf thi n chac chan roi vao 2.......15
            return n*computeFactorial(n-1); // n*(n-1)
        
    }
    public static long computeFactorialrecusrion(int n,long result) {
        if(n<0 || n > 15) throw new IllegalArgumentException("Invalid input. N must be >= 0 ");
        else if(n==1){
            return result;
        }
        else {
           
            return computeFactorialrecusrion(n-1,result*n);
        }
      
    }
}
