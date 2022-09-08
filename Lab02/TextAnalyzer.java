import java.io.BufferedReader;
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
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] split = line.split(" ");
                wordCount += split.length;
                frequencyCharCounter(split);
            }
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void frequencyCharCounter(String[] split) { //this method finds the frequency of chars in an array of strings
        for(int i = 0 ; i< split.length ; i++ ) { //number of loops = word count

            String s = split[i].toUpperCase().replaceAll("[^A-Z]","");
            //s is assigned to each string (each word) and converted to all uppercase

            for(int j = 0; j < s.length(); j++) { //number of loops = number of chars in current string (s[i])
                char c = s.charAt(j);
                //assign index to ascii value of char c then we subtract it to get into our 0-25 range
                int index = (int) c - 65;

                for(int k = 0 ; k < frequencies.length ; k++) //
                    if(index == k)
                        frequencies[k] = frequencies[k] + 1;

            }
        }
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

/*
     public void frequencyIncrementer(int index) {
        for(int i = 0 ; i < frequencies.length ; i++)
            if(index == i)
                frequencies[i] = frequencies[i] + 1;
    }

    public int charMatch(char c) {
     //   return (int) c - 65;

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
*/


/*
Correct output example for humpty dumpty
Frequency of A: 24
Frequency of B: 0
Frequency of C: 2
Frequency of D: 10
Frequency of E: 14
Frequency of F: 2
Frequency of G: 10
Frequency of H: 16
Frequency of I: 6
Frequency of J: 0
Frequency of K: 4
Frequency of L: 18
Frequency of M: 12
Frequency of N: 14
Frequency of O: 10
Frequency of P: 12
Frequency of Q: 0
Frequency of R: 6
Frequency of S: 10
Frequency of T: 26
Frequency of U: 14
Frequency of V: 0
Frequency of W: 2
Frequency of X: 0
Frequency of Y: 10
Frequency of Z: 0
*/
