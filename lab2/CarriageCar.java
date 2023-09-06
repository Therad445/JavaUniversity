package ru.miet.islamov.lab2;

/**
 * Class "CarriageBulk" working with CarriageBulk
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public class CarriageCar extends Carriage {
    /**
     * wagonCar - keeps data about Car position(in witch wagon in witch place)
     */
    private static Car[][] wagonCar;

    /**
     * massive Car
     */
    static String[] masCar = {"Car"};

    /**
     * Cars - all Cars
     */
    private static Car[] Cars;

    /**
     * initialisation Cars
     */
    static void modelInitCars() {
        Cars = new Car[5];
        for (int i = 0; i < Cars.length; i++) {
            Cars[i] = new Car(masCar[0]);
        }
    }

    /**
     * initialisation wagonCar
     */
    static void modelInitWagonCar() {
        wagonCar = new Car[3][];
        for (int i = 0; i < wagonCar.length; i++) {
            wagonCar[i] = new Car[(int) (1 + Math.random() * 3)];
        }
    }

    /**
     * gives every Car it's place
     */
    static void modelDefineWagonCar() {
        for (int i = 0; i < Cars.length; i++) {
            Cars[i].Move(wagonCar);
        }
    }

    /**
     * get Car
     */
    public static void getCar() {
        modelInitCars();
        view("Cars: ");
        //shows Cars
        for (int i = 0; i < Cars.length; i++) {
            view(Cars[i].toString());
        }
        view("\n\n");

        modelInitWagonCar();

        modelDefineWagonCar();
        //shows Cars places
        for (int i = 0; i < wagonCar.length; i++) {
            view((i + 1) + " wagonCar: ");
            for (int j = 0; j < wagonCar[i].length; j++) {
                if (wagonCar[i][j] != null) {
                    view(wagonCar[i][j].toString());
                } else view("empty place");
            }
        }
        view("\n\n");
    }
}