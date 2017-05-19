
/**
 * Write a description of class fundraiser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fundraiser
{
    //private int money = 0;
    public int collect(int monetaryGoal)
    {
        if (monetaryGoal > 1){
            return collect(monetaryGoal/10);
        }else{
            return 1;
        }
    }
}
