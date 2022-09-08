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

    public void frequencyCharCounter(String[] split) {
        for(int i = 0 ; i< split.length ; i++ ) { //number of loops = word count
            String s = split[i].toUpperCase().replaceAll("[^A-Z]","");

            for(int j = 0; j < s.length(); j++) { //number of loops = number of chars in s
                char c = s.charAt(j);

                for(int k = 0 ; k < frequencies.length ; k++)
                    if(k == (int) c - 65)
                        frequencies[k]++;

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
