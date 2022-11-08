public class HouseListTesterA {
    //info hiding
    private static HouseList availableHouses;

    public static void main(String[] args) {

        availableHouses = new HouseList("houses.txt");

        System.out.println("Test 1");
        Criteria c1 = new Criteria(1000, 500000, 100, 5000, 0, 10);
        availableHouses.printHouses(c1);

        System.out.println("Test 2");
        Criteria c2 = new Criteria(1000, 100000, 500, 1200, 0, 3);
        availableHouses.printHouses(c2);


        System.out.println("Test 3");
        Criteria c3 = new Criteria(100000, 200000, 1000, 2000, 2, 3);
        availableHouses.printHouses(c3);

        System.out.println("Test 4");
        Criteria c4 = new Criteria(200000, 300000, 1500, 4000, 3, 6 );
        availableHouses.printHouses(c4);


        System.out.println("Test 5");
        Criteria c5 = new Criteria(100000, 500000, 2500, 5000, 3, 6);
        availableHouses.printHouses(c5);

        System.out.println("Test 6");
        Criteria c6 = new Criteria(150000, 300000, 1500, 4000, 3, 6);
        availableHouses.printHouses(c6);

        System.out.println("Test 7");
        Criteria c7 = new Criteria(100000, 200000, 2500, 5000, 4, 6);
        availableHouses.printHouses(c7);

    }

}
