
package com.vnu.mathutil;

//import com.vnu.mathutil.MathUtil;
import java.util.Scanner;

public class MathUtilLive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the number: ");
        int number = Integer.parseInt(sc.nextLine());
        
        long result = MathUtil.getFactorial(number);
        
        System.out.println(number + "! = " + result);
        // Software Testing: ước lượng xem giá trị trả về của hàm là gì?
    }
    
}
