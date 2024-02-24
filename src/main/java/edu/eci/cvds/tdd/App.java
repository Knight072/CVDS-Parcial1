package edu.eci.cvds.tdd;

import edu.eci.cvds.tdd.registry.AppException;

/**
 * Hello world!
 *
 */
public class App extends Exception {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static boolean correctIncorrectAge(int age) throws Exception {
       if(age > 17){
            return false;
        }
       else if(age < 0){
           throw new Exception("No deberia ingresar una edad negativa");
       }
       else return age <= 17;
    }
}
