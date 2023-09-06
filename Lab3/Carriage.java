package Lab3;

/**
 * Class "Carriage" working with Carriage
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public abstract class Carriage {

    /**
     * Print line
     *
     * @param line That we use to print information
     */
    static void view(String line) {
        System.out.println(line);
    }

    /**
     * wagonContainer - keeps data about Container position(in witch wagon in witch place)
     */
    private static Container[][] wagonContainer;
    /**
     * massive Container
     */
    static String[] masContainer = {};
    /**
     * Containers - all Containers
     */
    private static Container[] Containers;

    /**
     * initialisation Containers
     */
    static void modelInitContainers() {
        Containers = new Container[5];
        for (int i = 0; i < Containers.length; i++) {
            Containers[i] = new Container(masContainer[0]);
        }
    }

    /**
     * initialisation wagonContainer
     */
    static void modelInitWagonContainer() {
        wagonContainer = new Container[3][];
        for (int i = 0; i < wagonContainer.length; i++) {
            wagonContainer[i] = new Container[(int) (1 + Math.random() * 3)];
        }
    }

    /**
     * gives every Container it's place
     */
    static void modelDefineWagonContainer() {
        for (int i = 0; i < Containers.length; i++) {
            Containers[i].Move(wagonContainer);
        }
    }

    /**
     * get Container
     */
    public static void getContainer() {
        modelInitContainers();
        view("Containers: ");
        //shows Containers
        for (int i = 0; i < Containers.length; i++) {
            view(Containers[i].toString());
        }
        view("\n\n");

        modelInitWagonContainer();

        modelDefineWagonContainer();
        //shows Containers places
        for (int i = 0; i < wagonContainer.length; i++) {
            view((i + 1) + " wagonContainer: ");
            for (int j = 0; j < wagonContainer[i].length; j++) {
                if (wagonContainer[i][j] != null) {
                    view(wagonContainer[i][j].toString());
                } else view("empty place");
            }
        }
        view("\n\n");
    }
}
