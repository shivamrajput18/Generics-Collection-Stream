
package org.example;

public class ExceptionHandlingTest {
    public  int divide(int a , int b){
        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return  a/b;
    }

}
