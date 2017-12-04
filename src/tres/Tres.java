/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int a,b=0,c=0,e=0;
Scanner d =new Scanner (System.in);
System.out.println("digite el numero binario  ");
a= d.nextInt();

do{
b = a%10;
c = c+b*(int)Math.pow(2, e);
e++;
a=a/10;

}while (a>0);
    System.out.println("el numero en decimal es: "+c);
    }
    
}
