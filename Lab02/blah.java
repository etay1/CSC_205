import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TextAnalyzer {
    private int lineCount;
    private int wordCount;
    private int[] frequencies = new int[26];

    public TextAnalyzer() {
        this.lineCount = 0;
        this.wordCount = 0;
    }
    public void analyzeText(String fileName) {
        BufferedReader br = null;
        String line = null;

        try {
            br = new BufferedReader(new FileReader(fileName));

            while ((line = br.readLine()) != null) { //while
                lineCount++;
                String[] split = line.split(" ");
                wordCount += split.length;
            }
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*if position is i For Example if
    A = 0 then position is 0
    if i = 0 then increase the value of i by 1*/
    //Find the frequency of characters
    public void findFrequency(String[] split) {
// loop for split array to get each String
        for(int i = 0 ; i< split.length ; i++ ) {
//remove all the non alphabetic characters from the string
            String str = split[i].toUpperCase().replaceAll("[^A-Z]","");
// loop through string
            for(int j = 0 ; j < str.length() ; j++) {
// get each character of the string
                char c = str.charAt(j);
// call method characterMatch to match each character to alphabet like A - 0, B-1 etc
                int position = characterMatch(c);
// call method frequencies to increase the frequency count of the character
                frequencies(position);
            }
        }

    }

    //increase frequency of the character at each index
    //if the char matches increment the associated value
    public void frequencies(int index) {
        for(int i = 0 ; i < frequencies.length ; i++)
            if(index == i)
                frequencies[i] = frequencies[i] + 1;
    }
    // Pair each character of alphabets
    public int characterMatch(char c) {
        if (c == 'A')
            return 0;
         else if (c == 'B')
            return 1;
        else if (c == 'C')
            return 2;
         else if (c == 'D')
            return 3;
         else if (c == 'E')
            return 4;
         else if (c == 'F')
            return 5;
        else if (c == 'G')
            return 6;
        else if (c == 'H')
            return 7;
         else if (c == 'I')
            return 8;
         else if (c == 'J')
            return 9;
         else if (c == 'K')
            return 10;
         else if (c == 'L')
            return 11;
         else if (c == 'M')
            return 12;
         else if (c == 'N')
            return 13;
         else if (c == 'O')
            return 14;
         else if (c == 'P')
            return 15;
        else if (c == 'Q')
            return 16;
        else if (c == 'R')
            return 17;
         else if (c == 'S')
            return 18;
         else if (c == 'T')
            return 19;
         else if (c == 'U')
            return 20;
         else if (c == 'V')
            return 21;
         else if (c == 'W')

            return 22;
         else if (c == 'X')
            return 23;
         else if (c == 'Y')
            return 24;
         else if (c == 'Z')
            return 25;
         else
            return -1;

    }
    public int[] getFrequencies(){
        return frequencies;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }
}
