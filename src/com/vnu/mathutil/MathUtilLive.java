
package com.vnu.mathutil;

// import com.vnu.mathutil.MathUtil;
// import java.util.Scanner;

public class MathUtilLive {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Input the number: ");
        // int number = Integer.parseInt(sc.nextLine());
        
        long result = MathUtil.getFactorial(5);
        
        // System.out.println(number + "! = " + result);
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));
        System.out.println("expected: 1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: " + MathUtil.getFactorial(3));
        // THÊM CODE - SỬA CODE SAU KHI ĐƯA CODE LÊN SERVER 12:20
    }
    
}
