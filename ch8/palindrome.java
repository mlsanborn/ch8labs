/**
 * Write a description of class palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class palindrome
{
    private boolean palindrome;
    //private String word = "";
    public boolean isPal(String word)
    {
        word = word.replace(" ", "");
        if(word.length() > 1){
            if ( word.charAt(0) != word.charAt(word.length()-1) ){
                palindrome = false;
            }else if( word.charAt(0) == word.charAt(word.length()-1) ){
                isPal( word.substring(1 ,word.length()-1) );
            }
            System.out.println(word);
        }else{
            palindrome = true;
        }
        return palindrome;
    }
    
}

















