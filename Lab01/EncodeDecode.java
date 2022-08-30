public class EncodeDecode {
    String[] originalList;
    String[] encodedList;
    String[] decodedList;

    public EncodeDecode(String[] oL) {
        this.originalList = oL;
        encodedList = new String[oL.length];
        decodedList = new String[oL.length];

        //encode & decode methods are repeated for each array of strings
        for(int i=0;i < oL.length;i++) {
            encodedList[i]= encode(originalList[i]);
            decodedList[i]= decode(encodedList[i]);
        }
    }

    public String encode(String originalWord) {
        String codedWord = "";
        /*this process takes each char from a single string
         * and increments it by two if its a digit or letter
         * i.e.
         * Z->B
         * 0->2
         * 8->0
         * y->a
         * */
        for(int i=0; i < originalWord.length();i++)
            codedWord=codedWord + forwardMap(originalWord.charAt(i));

        return codedWord;
    }

    public String decode(String codedWord) {
        String decodedWord = "";
        /*this process takes each char from a single string
         * and decrements it by two if its a digit or letter
         * i.e.
         * a->y
         * 3->1
         * 1->9
         * z->x
         * */

        for(int i=0;i<codedWord.length();i++)
            decodedWord = decodedWord + backMap(codedWord.charAt(i));

        return decodedWord;
    }

    public char forwardMap(char ch) {
        //method responsible for incrementing each char in encoder
        char forwardch = ch;

        if(Character.isLetterOrDigit(ch)) {
            int ascii = (int) ch + 2;

            if (Character.isLowerCase(ch)) {
                if(ascii <= 122) {
                    forwardch= (char)ascii;
                } else {
                    ascii = ascii - 26;
                    forwardch = (char) ascii;
                }
            } else if (Character.isUpperCase(ch)) {
                if(ascii <= 90) {
                    forwardch = (char) ascii;
                } else {
                    ascii = ascii - 26;
                    forwardch = (char) ascii;
                }
            } else {
                if(ascii <= 57) {
                    forwardch = (char) ascii;
                } else {
                    ascii = ascii - 10;
                    forwardch = (char) ascii;
                }
            }
        }

        return forwardch;
    }

    public char backMap(char ch) {
        //method responsible for decrementing each char in decoder
        char backch = ch;

        if(Character.isLetterOrDigit(ch)) {
            int ascii = (int) ch - 2;

            if (Character.isLowerCase(ch)) {
                if(ascii < 97) {
                    ascii = ascii + 26;
                    backch= (char)ascii;
                } else {
                    backch = (char)ascii;
                }
            } else if (Character.isUpperCase(ch)) {
                if(ascii < 65) {
                    ascii = ascii + 26;
                    backch = (char) ascii;
                } else {
                    backch = (char) ascii;
                }
            } else {
                if(ascii < 48) {
                    ascii = ascii - 10;
                    backch = (char) ascii;
                } else {
                    backch = (char) ascii;
                }
            }
        }

        return backch;
    }

    public void getEncodedList() {
        for(int i=0; i<encodedList.length; i++)
            System.out.println(encodedList[i]);
    }

    public void getDecodedList () {
        for(int i=0; i<decodedList.length; i++)
            System.out.println(decodedList[i]);
    }

}

