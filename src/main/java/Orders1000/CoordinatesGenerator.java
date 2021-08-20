package Orders1000;

public class CoordinatesGenerator {
    public static final double latitudemin=48.7;
    public static final double latitudemax=51.2;
    public static final double longitudemin=24.5;
    public static final double longitudemax=34.1;
    public static final int ordersAmount=1000;

    public static void coordinatesArrayCreator(){
        CoordinatesPolygon[] coordinatesManyPolygons=new CoordinatesPolygon[ordersAmount+1];
        int count=0;
        int divider=(int)Math.sqrt(ordersAmount)+1;
        double latitudeStep=(latitudemax-latitudemin)/divider;
        double longitudeStep=(longitudemax-longitudemin)/divider;
        for (int i=0; i<divider;i++){
            double latitude1=latitudemin+latitudeStep*i;
            double latitude2=latitudemin+latitudeStep*(i+0.9);
            for (int j=0; j<divider; j++){
                 coordinatesManyPolygons[count]=new CoordinatesPolygon(latitude1,(longitudemin+longitudeStep*j),latitude2,(longitudemin+longitudeStep*(j+0.3)));
                System.out.print("Order #:" + count);
                System.out.println("   P1:N " + coordinatesManyPolygons[count].point1[0]+ "E " + coordinatesManyPolygons[count].point1[1]);
                System.out.println("              P2:N " + coordinatesManyPolygons[count].point2[0]+ "  E " + coordinatesManyPolygons[count].point2[1]);
                System.out.println("              P3:N " + coordinatesManyPolygons[count].point3[0]+ "  E " + coordinatesManyPolygons[count].point3[1]);
                System.out.println("              P4:N " + coordinatesManyPolygons[count].point4[0]+ "  E " + coordinatesManyPolygons[count].point4[1]);

                count++;
            }
        }
    }

    public static void main(String[] args) {
        coordinatesArrayCreator();
    }

}

class CoordinatesPolygon {
    String[] point1, point2, point3, point4;

    CoordinatesPolygon(double latitude1, double longitude1, double latitude2, double longitude2){
        this.point1= new String[]{Double.toString(latitude1), Double.toString(longitude1)};
        this.point2= new String[]{Double.toString(latitude1), Double.toString(longitude2)};
        this.point3= new String[]{Double.toString(latitude2), Double.toString(longitude1)};
        this.point4= new String[]{Double.toString(latitude2), Double.toString(longitude2)};

    }
}
