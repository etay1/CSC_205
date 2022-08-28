public class EncodeDecodeTester {

    public static void main(String[] args) {
        String[] list = {"ABC", "123", "def", "456", "GHI", "&*#"};

        EncodeDecode obj = new EncodeDecode(list);

        System.out.println("Original List:");
        for(int i=0;i<list.length;i++) {
            System.out.println(list[i]);
        }

        System.out.println("Encoded List:");
        obj.getEncodedList();

        System.out.println("Decoded List:");
        obj.getDecodedList();
    }

}