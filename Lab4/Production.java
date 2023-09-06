package Lab4;

/**
 * Class "Production" working with Production
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public class Production {
    /**
     * There we initialization productName
     */
    protected String productName;
    /**
     * There we initialization carriage
     */
    protected carriageValue carriage;
    /**
     * There initialization enum for carriage
     */
    protected enum carriageValue {carriageBulk, carriageCar, carriageContainer, carriageLiquid};
    /**
     * constructor with no arg
     */
    Production() {
        productName = "";
        carriage = null;
    }
    /**
     * constructor with String arg
     *
     * @param productNameValue That we use to print information
     */
    Production(String productNameValue, String Value) {
        productName = productNameValue;
        switch (Value) {
            case "carriageBulk" -> carriage = carriageValue.carriageBulk;
            case "carriageCar" -> carriage = carriageValue.carriageCar;
            case "carriageContainer" -> carriage = carriageValue.carriageContainer;
            case "carriageLiquid" -> carriage = carriageValue.carriageLiquid;
            default -> System.out.println("Ошибка ввода");
        }
    }
    /**
     * constructor with another Production
     *
     * @param value That we use to print information
     */
    Production(Production value) {
        this.productName = value.productName;
        this.carriage = value.carriage;
    }

    /**
     * set productName
     *
     * @param productName That we use to print information
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * show as String
     */
    public String toString() {
        return "productName: " + productName + "|\t" + "carriage: " + carriage;
    }

    /**
     * gives position to Production
     *
     * @param notDefineAviaries That we use to print information
     */
    public void Move(Production notDefineAviaries[][]) {
        boolean k = false;
        for (int i = 0; i < notDefineAviaries.length; i++) {
            for (int j = 0; j < notDefineAviaries[i].length; j++) {
                if (notDefineAviaries[i][j] == null) {
                    notDefineAviaries[i][j] = this;
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
