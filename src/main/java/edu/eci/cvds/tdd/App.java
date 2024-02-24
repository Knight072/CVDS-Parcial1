package edu.eci.cvds.tdd;

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
       /*if(age > 17){
            return false;
        }
       else if(age < 0){
           throw new Exception("No deberia ingresar una edad negativa");
       }
        else return age <= 17;*/
        return true;
    }
}
