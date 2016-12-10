package ch.tebe;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ResourceBundle rb = ResourceBundle.getBundle("ApplicationResources");
        String appname = rb.getString("application.name");
        String version = rb.getString("application.version");
        System.out.println( "This is " + appname + " (Version " + version +")");
        System.out.println( "Hello World!" );
    }
}
