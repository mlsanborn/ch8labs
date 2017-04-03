

/**
 * Write a description of class gcd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gcd
{
    private int num1, num2;
    public gcd(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getGCD(int div){
        if ( (num1 % div == 0) && (num2 % div == 0) ){
            div+=1;
            getGCD(div);
            System.out.print("hi");
        }
        return div;
    }
}
