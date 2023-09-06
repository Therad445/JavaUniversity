package lab2;

/**
 * Class "Container" working with Container
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public class Container extends Production {
    /**
     * constructor with no arg
     */
    Container(){
        productName="";
        carriage = carriageValue.notDefine;
    }

    /**
     * constructor with String args
     *
     * @param productNameValue That we use to print information
     */
    Container(String productNameValue){
        productName=productNameValue;
        carriage = carriageValue.carriageContainer;
    }

    /**
     * constructor with another Container
     *
     * @param value That we use to print information
     */
    Container(Container value){
        this.productName=value.productName;
        this.carriage=value.carriage;
    }

    /**
     * gives position to Container
     *
     * @param carriageContainer That we use to print information
     */
    public void Move(Container carriageContainer[][]){
        boolean k=false;
        for(int i=0;i<carriageContainer.length;i++) {
            for (int j = 0; j < carriageContainer[i].length; j++) {
                if (carriageContainer[i][j] == null) {
                    carriageContainer[i][j] = new Container(this);
                    k=true;
                    break;
                }
            }
            if(k){
                break;
            }
        }
    }
}
