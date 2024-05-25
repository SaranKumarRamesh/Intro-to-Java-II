package busesPractice;

import java.util.ArrayList;

public class BusDepotApp {
    
    // Method 1
    public static int countMaxAbove(ArrayList<BusDepot> depots, int passengers) {
        int counter = 0;
        for (BusDepot depot : depots) {
            if (depot.getMaxPassengers() > passengers) {
                counter++;
            }
        }
        return counter;
    }

    // Method 2
    public static Bus findBus(ArrayList<Bus> buses, Bus searchBus) {
        for (Bus bus : buses) {
            if (bus.equals(searchBus)) {
                return bus;
            }
        }
        return null;
    }

    // Method 3
    public static int countStowable(ArrayList<Bus> buses) {
        int counter = 0;
        for (Bus bus : buses) {
            if (bus instanceof Stowable && ((Stowable) bus).canStow()) {
                counter++;
            }
        }
        return counter;
    }

    // Below commented for error missing depot
    // Method 4
//    public static ArrayList<Bus> gatherOrphans(ArrayList<Bus> buses, ArrayList<Depot> depots) {
//        ArrayList<Bus> orphanList = new ArrayList<>();
//        for (Bus bus : buses) {
//            boolean canPark = true;
//            for (Depot depot : depots) {
//                if (!depot.canEnter(bus)) {
//                    canPark = false;
//                    break;
//                }
//            }
//            if (!canPark) {
//                orphanList.add(bus);
//            }
//        }
//        return orphanList;
//    }

    // Method 5
    public static ArrayList<String> setFeatures(boolean movies, boolean gaming, boolean music) {
        ArrayList<String> features = new ArrayList<>();
        if (movies) {
            features.add("Movies");
        }
        if (gaming) {
            features.add("Gaming");
        }
        if (music) {
            features.add("Music");
        }
        return features;
    }

    // Method 6
    // This would involve modifying the Bus class to include an ArrayList for passengers,
    // creating a Passenger class if needed, and implementing methods for ticket processing.
}
