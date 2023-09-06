package ru.miet.islamov.Lab3;

/**
 * Class "CarriageContainer" working with CarriageContainer
 *
 * @author Islamov Radmir PIN-23
 * @version 1.0 22.11.2022
 */

public class CarriageLiquid extends Carriage {

    /**
     * wagonLiquid - keeps data about Liquid position(in witch wagon in witch place)
     */
    private static Liquid[][] wagonLiquid;
    /**
     * massive Liquid
     */
    static String[] masLiquid = {"Oil", "Diesel", "Fuel Oil"};

    /**
     * Liquids - all Liquids
     */
    private static Liquid[] Liquids;

    /**
     * initialisation Liquids
     */
    static void modelInitLiquids() {
        Liquids = new Liquid[5];
        for (int i = 0; i < Liquids.length; i++) {
            Liquids[i] = new Liquid(masLiquid[(int) (Math.random() * 4 - 1)]);
        }
    }

    /**
     * initialisation withInfraredLight
     */
    static void modelInitWagonLiquid() {
        wagonLiquid = new Liquid[3][];
        for (int i = 0; i < wagonLiquid.length; i++) {
            wagonLiquid[i] = new Liquid[(int) (1 + Math.random() * 3)];
        }
    }

    /**
     * gives every Liquid it's place
     */
    static void modelDefineWagonLiquid() {
        for (int i = 0; i < Liquids.length; i++) {
            Liquids[i].Move(wagonLiquid);
        }
    }

    /**
     * get Liquid
     */
    public static void getLiquid() {
        modelInitLiquids();
        view("Liquids: ");
        //shows Liquids
        for (int i = 0; i < Liquids.length; i++) {
            view(Liquids[i].toString());
        }
        view("\n\n");

        modelInitWagonLiquid();

        modelDefineWagonLiquid();
        //shows Liquids places
        for (int i = 0; i < wagonLiquid.length; i++) {
            view((i + 1) + " wagonLiquid: ");
            for (int j = 0; j < wagonLiquid[i].length; j++) {
                if (wagonLiquid[i][j] != null) {
                    view(wagonLiquid[i][j].toString());
                } else view("empty place");
            }
        }
        view("\n\n");
    }
}