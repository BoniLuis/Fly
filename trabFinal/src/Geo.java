public class Geo {
    private final double latitude;
    private final double longitude;

    public Geo (double umLatitude, double umLongitude) {
        latitude = umLatitude;
        longitude = umLongitude;
    }
    public Geo getLoc(double umLatitude, double umLongitude){
        return new Geo(umLatitude, umLongitude);
    }

}
