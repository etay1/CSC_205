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
            System.out.println("File not found:  \nPossible issues " +
                                "\nCheck if input is spelled properly .txt included" +
                                "\nCheck if text files are in lab folder");
            e.printStackTrace();
        }
    }

    public void frequencyCharCounter(String[] split) {
        for(int i = 0 ; i< split.length ; i++ ) {
            split[i] = split[i].toUpperCase();
            char ch[] = split[i].toCharArray();

            for (char c: ch) {
                for (int k = 0; k < frequencies.length; k++)
                    if (k == (int) c - 65)
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
