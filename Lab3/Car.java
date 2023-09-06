package Lab3;

/**
 * Class "Car" working with Car
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public class Car extends Production {
    /**
     * constructor with no arg
     */
    Car() {
        productName = "";
        carriage = carriageValue.notDefine;
    }

    /**
     * constructor with String args
     *
     * @param productNameValue That we use to print information
     */
    Car(String productNameValue) {
        productName = productNameValue;
        carriage = carriageValue.carriageCar;
    }

    /**
     * constructor with another Car
     *
     * @param value That we use to print information
     */
    Car(Car value) {
        this.productName = value.productName;
        this.carriage = value.carriage;
    }

    /**
     * gives position to Car
     *
     * @param carriageCar That we use to print information
     */
    public void Move(Car carriageCar[][]) {
        boolean k = false;
        for (int i = 0; i < carriageCar.length; i++) {
            for (int j = 0; j < carriageCar[i].length; j++) {
                if (carriageCar[i][j] == null) {
                    carriageCar[i][j] = new Car(this);
                    k = true;
                    break;
                }
            }
            if (k) {
                break;
            }
        }
    }
}
