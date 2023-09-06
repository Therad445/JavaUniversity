package lab2;

/**
 * Class "Bulk" working with Bulk
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public class Bulk extends Production {
    /**
     * constructor with no arg
     */
    Bulk() {
        productName = "";
        carriage = carriageValue.notDefine;
    }

    /**
     * constructor with String args
     *
     * @param productNameValue That we use to print information
     */
    Bulk(String productNameValue) {
        productName = productNameValue;
        carriage = carriageValue.carriageBulk;
    }

    /**
     * constructor with another Bulk
     *
     * @param value That we use to print information
     */
    Bulk(Bulk value) {
        this.productName = value.productName;
        this.carriage = value.carriage;
    }

    /**
     * gives position to Bulk
     *
     * @param carriageBulk That we use to print information
     */
    public void Move(Bulk carriageBulk[][]) {
        boolean k = false;
        for (int i = 0; i < carriageBulk.length; i++) {
            for (int j = 0; j < carriageBulk[i].length; j++) {
                if (carriageBulk[i][j] == null) {
                    carriageBulk[i][j] = new Bulk(this);
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
