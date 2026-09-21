class ParkingSystem {
    int big, medium, small;

    ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        }
        if (carType == 2 && medium > 0) {
            medium--;
            return true;
        }
        if (carType == 3 && small > 0) {
            small--;
            return true;
        }
        return false;
    }
}

Input
["ParkingSystem","addCar","addCar","addCar","addCar"]
[[1,1,0],[1],[2],[3],[1]]
Output
[null,true,true,false,false]
