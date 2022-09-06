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
        String line;
        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                lineCount++;
                //then we'll use split to get the word counts based on spaces and the length
                //we'll also be calling the methods required to get the frequency of chars in this try catch block
                String[] split = line.split(" ");
                wordCount += split.length;
            }
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public int getLineCount() {
        return lineCount;
    }
    public int getWordCount() {
        return wordCount;
    }
}
