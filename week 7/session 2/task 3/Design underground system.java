import java.util.*;

class UndergroundSystem {

    // id -> [station, checkInTime]
    Map<Integer, String> stationMap = new HashMap<>();
    Map<Integer, Integer> timeMap = new HashMap<>();

    // route -> [totalTime, numberOfTrips]
    Map<String, double[]> trips = new HashMap<>();

    public UndergroundSystem() {
    }

    public void checkIn(int id, String stationName, int t) {
        stationMap.put(id, stationName);
        timeMap.put(id, t);
    }

    public void checkOut(int id, String stationName, int t) {
        String start = stationMap.get(id);
        int startTime = timeMap.get(id);

        String route = start + "#" + stationName;
        double travelTime = t - startTime;

        if (!trips.containsKey(route)) {
            trips.put(route, new double[]{0, 0});
        }

        trips.get(route)[0] += travelTime;
        trips.get(route)[1]++;

        stationMap.remove(id);
        timeMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "#" + endStation;

        double[] data = trips.get(route);

        return data[0] / data[1];
    }
}

Input
["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]
Output
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]
