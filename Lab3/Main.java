package Lab3;


/**
 * Class "Main" shows program work
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public class Main {

    /**
     * shows information
     */
    static void view(String line) {
        System.out.println(line);
    }

    /**
     * main method
     */
    static void controller() {
        view("\n\n");
        view("Train includes wagons: ");
        view("\n\n");
        CarriageBulk.getBulk();
        CarriageCar.getCar();
        CarriageContainer.getContainer();
        CarriageLiquid.getLiquid();
    }


    /**
     * Start main method
     *
     * @param args That we use to print information
     */
    public static void main(String[] args) {
        controller();
    }
}

