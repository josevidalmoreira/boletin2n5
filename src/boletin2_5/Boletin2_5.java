
package boletin2_5;
import java.util.Scanner;

public class Boletin2_5 {

 
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        float millas,cambio,metros;
        System.out.println("teclea millas:");
        millas=sc.nextFloat();
        cambio= 1852;
        metros=millas * cambio;
        System.out.println(millas + " millas son " + metros + " metros");
    }
    
}
