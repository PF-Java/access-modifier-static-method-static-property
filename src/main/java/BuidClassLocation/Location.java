package BuidClassLocation;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(double[][] a) {
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location(a);
        double maxValue = a[0][0];
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                if (a[row][column]>maxValue){
                    maxValue = a[row][column];
                    location.row = row;
                    location.column = column;
                    location.maxValue = maxValue;
                }
            }
        }
        return location;
    }
}
