import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trip {
   
    static int calculateTrips(int[] packages, int maxWeigth){
        int maxQtPackages = 2;
        int trips=0;
        int currentTrip, currentQtPackages;
       
        Arrays.sort(packages);
        List<Integer> list = new ArrayList<>();
       
        for (int i=(packages.length -1);i >= 0  ; i--)
            list.add(packages[i]);
       
        do {
            currentTrip = 0;
            currentQtPackages = 0;
            for (int i=0; (i < list.size()) & (currentQtPackages <= maxQtPackages); i++){
                if ((currentTrip + list.get(i)) < maxWeigth){
                    currentTrip = currentTrip + list.get(i);
                    list.remove(i);
                    currentQtPackages++;
                    i--;
                }
            }
            trips++;
        } while ( list.size() > 0);
        return trips;
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maxWeigth = 100;
        int[] packages = {20,10,70};
       
        int trips = calculateTrips(packages,maxWeigth);
        System.out.println("Total trips: " + trips);
    }
   
}
