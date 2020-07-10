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
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;//result*=i
        }
        return result;
    }
}
