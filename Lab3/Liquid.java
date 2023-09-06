package ru.miet.islamov.Lab3;

/**
 * Class "Liquid" working with Liquid
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public class Liquid extends Production {
    /**
     * constructor with no arg
     */
    Liquid() {
        productName = "";
        carriage = null;
    }

    /**
     * constructor with String args
     *
     * @param productNameValue That we use to print information
     */
    Liquid(String productNameValue) {
        productName = productNameValue;
        carriage = carriageValue.carriageLiquid;
    }

    /**
     * constructor with another Liquid
     *
     * @param value That we use to print information
     */
    Liquid(Liquid value) {
        this.productName = value.productName;
        this.carriage = value.carriage;
    }

    /**
     * gives position to Liquid
     *
     * @param carriageLiquid That we use to print information
     */
    public void Move(Liquid carriageLiquid[][]) {
        boolean k = false;
        for (int i = 0; i < carriageLiquid.length; i++) {
            for (int j = 0; j < carriageLiquid[i].length; j++) {
                if (carriageLiquid[i][j] == null) {
                    carriageLiquid[i][j] = new Liquid(this);
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
