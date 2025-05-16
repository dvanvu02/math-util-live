
package com.vnu.mathutil;
/**
 * Ta viết cái class để cung cấp tiện ích cho nơi khác sử dụng
 * 
 * khi ta cung cấp tiện ích cho nơi khác sử dụng, 
 * đó là lúc ta không cần nhớ cái gì cho riêng ta, hàm static giúp làm điều này
 */
public class MathUtil {
        
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument, n must be between 0..20");
        if (n == 0 || n == 1)
            return 1;
        long product = 1; 
        for (int i = 2; i <= n; i++) {
            // product = product * i;
            product *= i;
        }
        return product;
    }
}
