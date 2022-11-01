import java.util.*;

public class Inventory {
    private ArrayList<Part> inventoryList = new ArrayList<Part>();
/*
    public void sortedInsert(Part part) {
        for (int i = 0; i < inventoryList.size(); i++)
            if(part.compareTo() >= inventoryList.get(i).compareTo())
                inventoryList.add(part);

    }
*/
    public double totalInventoryValue() {
        double total = 0;

        for(int i = 0; i < inventoryList.size(); i++)
            total += inventoryList.get(i).getValue();

        return total;
    }

    public String searchByColor(String s) {
        String res = null;
        for(int i = 0; i < inventoryList.size(); i++) {
            if(s.compareToIgnoreCase(inventoryList.get(i).getColor()) == 0)
               res += inventoryList.get(i).toString();
        }
        return res;
    }

    public String heaviestPart() {
        int hP = 0;
        double temp = inventoryList.get(0).getWeight();

        //Bubble Compare
        for(int i = 1; i<inventoryList.size(); i++) {
            if (inventoryList.get(i).getWeight() > temp) {
                hP = i;
                temp = inventoryList.get(i).getWeight();
            }
        }

        return inventoryList.get(hP).toString();
    }

    public int numPartsInStock(String s) {
        int res = 0;

        for(int i = 0; i < inventoryList.size(); i++)
            if(s.compareToIgnoreCase(inventoryList.get(i).getPartName())==0)
                res += inventoryList.get(i).getAmountInStock();

        return res;
    }

    public String reOrderList() {
        ArrayList<Part> reOrderedList = new ArrayList<Part>();

        for (int i = 0; i < inventoryList.size(); i++)
            if(inventoryList.get(i).getAmountInStock() < inventoryList.get(i).getReorderPoint())
                reOrderedList.add(inventoryList.get(i));

        return reOrderedList.toString();
    }

}
