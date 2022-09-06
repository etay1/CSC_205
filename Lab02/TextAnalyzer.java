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
        //here we can initialize the br so we can use the io exception
        BufferedReader br = null;
        String line = null;

        try {
            /*to save lines, instead of creating a fr for file reader
            we can just use the new FileReader and the analyzeText parameter
            to read into our buffered reader
             */
            br = new BufferedReader(new FileReader(fileName));
            /*
            tried to do a do loop but it failed so here's this
            i want a do loop...
            -assign our initialized line to read each line of the file (1 at a time)
            -then if that line isn't null repeat the block
            * */
            while ((line = br.readLine()) != null) { //while
                //simple increment to the lineCount every loop
                lineCount++;
                //split the text by spaces
                String[] split = line.split(" ");
                // wordCount should be equal to the number of spaces in-between words
                wordCount += split.length;

                /*I think this is where we will call the frequency method
                * and probably a charMatch method or maybe combine the two somehow
                *Sample Output for the HumptyDumpty.txt
                Enter the name of the file:
                HumptyDumpty.txt
                Number of Lines: 8
                Number of Words: 54
                Letter Counts
                *--so now we just have to make the frequency method and post the array of indices [0-25]
                * ASCII?
                * */
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
