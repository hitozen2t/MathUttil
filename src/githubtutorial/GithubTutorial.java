/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubtutorial;

import static nhan.util.MathUtil.computeFactorial;
//them static la mot cau lenh moi xuat hien tu jdk8 => dep luon ten class viet nhu ham trong c

/**
 *
 * @author ASUS
 */
public class GithubTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hy vong ham tra ve 120 neu tinh 5!
        System.out.println("5! = "+computeFactorial(5));
        //hy vong ham tra ve 1 neu tinh 1!
        System.out.println("1!="+computeFactorial(1));
        //expected 1 if 0!
        System.out.println("0!="+computeFactorial(0));
        //expected Exception if cf(-5)
        System.out.println("-5!="+computeFactorial(-5));
    }
    
}
