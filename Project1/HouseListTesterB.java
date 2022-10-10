import java.util.Scanner;
public class HouseListTesterB {

    //information hiding
    private static HouseList availableHouses;
    private static int minPrice;
    private static int maxPrice;
    private static int minArea;
    private static int maxArea;
    private static int minNumBeds;
    private static int maxNumBeds;

    //-------------------------------------------------------------
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter text file containing housing data");
        String textFile = input.next();

        availableHouses = new HouseList(textFile);

        System.out.println("Enter the following criteria\n");

        System.out.println("Enter minimum price: ");
        minPrice = input.nextInt();
        System.out.println("Enter maximum price: ");
        maxPrice = input.nextInt();
        System.out.println("Enter minimum area: ");
        minArea = input.nextInt();
        System.out.println("Enter maximum area: ");
        maxArea = input.nextInt();
        System.out.println("Enter minimum number of bedrooms");
        minNumBeds = input.nextInt();
        System.out.println("Enter maximum number of bedrooms");
        maxNumBeds = input.nextInt();

        //Create criteria object c ->
        Criteria c = new Criteria(minPrice, maxPrice,
                                minArea, maxArea,
                                minNumBeds, maxNumBeds);
        availableHouses.printHouses(c);


    }
}
