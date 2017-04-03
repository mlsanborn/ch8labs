

/**
 * Write a description of class digits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class digits
{
    private int digits = 0;
    public int divide(int num){
        num = num / 10;
        if ( num >= 1 ){
            digits += 1;
            divide(num);
        }
        return digits+1;
    }
}
