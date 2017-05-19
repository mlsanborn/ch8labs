

/**
 * Write a description of class gcd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gcd
{
    private int r;
    public int getgcd(int num1, int num2){
        if ((num2 <= num1) && ((num1 % num2) == 0)){
            r = num2;
        }else if(num1 < num2){
            getgcd(num2,num1);
        }else{
            getgcd(num2, num1%num2);
        }
        return r;
    }
}
