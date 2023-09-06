package lab2;

/**
 * Class "CarriageBulk" working with CarriageBulk
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public class CarriageBulk extends Carriage {

    /**
     * wagonBulk - keeps data about Bulk position(in witch aquarium in witch place)
     */
    private static Bulk[][] wagonBulk;

    /**
     * massive Bulk
     */
    static String[] masBulk = {"Grain", "Coal", "Sand"};

    /**
     * Bulks - all Bulks
     */
    private static Bulk[] Bulks;

    /**
     * initialisation Bulks
     */
    static void modelInitBulks() {
        Bulks = new Bulk[5];
        for (int i = 0; i < Bulks.length; i++) {
            Bulks[i] = new Bulk(masBulk[(int) (Math.random() * 4 - 1)]);
        }
    }

    /**
     * initialisation wagonBulk
     */
    static void modelInitWagonBulk() {
        wagonBulk = new Bulk[3][];
        for (int i = 0; i < wagonBulk.length; i++) {
            wagonBulk[i] = new Bulk[(int) (1 + Math.random() * 3)];
        }
    }

    /**
     * gives every Bulk its place
     */
    static void modelDefineWagonBulk() {
        for (int i = 0; i < Bulks.length; i++) {
            Bulks[i].Move(wagonBulk);
        }
    }

    /**
     * get Bulk
     */
    public static void getBulk() {
        modelInitBulks();
        view("Bulks: ");
        //shows Bulks
        for (int i = 0; i < Bulks.length; i++) {
            view(Bulks[i].toString());
        }
        view("\n\n");

        modelInitWagonBulk();

        modelDefineWagonBulk();
        //shows Bulks places
        for (int i = 0; i < wagonBulk.length; i++) {
            view((i + 1) + " wagonBulk: ");
            for (int j = 0; j < wagonBulk[i].length; j++) {
                if (wagonBulk[i][j] != null) {
                    view(wagonBulk[i][j].toString());
                } else view("empty place");
            }
        }
        view("\n\n");
    }
}
