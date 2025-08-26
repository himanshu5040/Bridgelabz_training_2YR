// Que 7 Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

public class earthvolume {
    public static void main(String[] args) {
        double rkm = 6378;
        double volumeKm = (4.0/3.0) * Math.PI * Math.pow(rkm,3);
        double rMiles = rkm * 1.6;
        double volumeMiles = (4.0/3.0) * Math.PI * Math.pow(rMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +" and cubic miles is " + volumeMiles);
    }
    
}
