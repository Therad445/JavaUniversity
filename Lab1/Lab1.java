package Lab1;

import java.util.Properties; //Импортируем пакет Properties

/**
 * Class description goes here.
 *
 * @version 1.0 09 Nov 2022
 * @author Islamov Radmir
 */

public class Lab1 {
    /* A class implementation comment can go here. */

	/**
	 * There we use Propersties for tranfer data
     */
    static Properties prop;
	/**
	 * There we use Propersties for tranfer data
     */
    public static void model() {
        prop = new Properties();
        prop.setProperty("data", "100");
    }
    
    /**
     * View can print data 
     * 
     * @param key That we use to print information
     */
    public static void view(String key) {
        if( prop.containsKey(key) ) {
            System.out.println(prop.get(key));
        } else {
            System.out.println(key);
        }
    }    
  
    /**
     * Controller must calculating centimeters in futs and inchs
     * 
     * @param args That we use for input
     */
    public static void controller(String[] args) {
        if(args.length != 0) {
            view("main Аргументы командной строки:");
            for(int i=0; i<args.length; i++) {                
                if( i== 0 ) {
                	String futs = Integer.toString((int)(Integer.parseInt(args[i]) / 30.48));
                	String inchs = Integer.toString((int)Math.round((Integer.parseInt(args[i]) / 2.54) - ((Integer.parseInt(futs) * 12))));
                	String answer = futs + " " + inchs;
                    prop.replace("data", answer); //Изменяем модель
                    view("data"); //Отображаем изменения
                } else {
                    prop.setProperty(i+"", args[i]); //Изменяем модель
                    view(Integer.toString(i)); //Отображаем изменения
                }
            }
        }
        view("Конец");    
    }    
    
    /**
     * There main process
     * 
     * @param args That we use for input
     */
    public static void main(String[] args) {
        model();
        controller(args);
    }
}

