package edu.eci.cvds.tdd;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static boolean correctIncorrectAge(int age){
       if(age < 0 || age > 17){
            return false;
        }
        else return age <= 17;
    }
}
