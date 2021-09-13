package module_9.task5;

import java.util.StringTokenizer;

public class test {
    public String reformatLines(String text) {
      String newText = text.trim().replaceAll(" +", " ").replace("\n", "").replace("\r", "");
        StringTokenizer tok = new StringTokenizer(newText, " ");
        int maxCharInLine = 60;
        int lineLen = 0;
        String finalText = "";
        while (tok.hasMoreTokens()) {
            String word = tok.nextToken();

            while(word.length() > maxCharInLine){
              finalText += word.substring(0, maxCharInLine-lineLen) + "\n";
                word = word.substring(maxCharInLine-lineLen);
                lineLen = 0;
            }

            if (lineLen + word.length() > maxCharInLine) {
              finalText = finalText.substring(0, finalText.length() - 1) + "\n";
                lineLen = 0;
            }
            finalText += word + " ";

            lineLen += word.length() + 1;
        }
        return finalText.trim();
    }

    public static void main(String[] args) {
        test t1 = new test();
        String testText = """
        The   name
        is used
        for its English connotations as
        a strange and foreign-sounding
        language.""";
        System.out.println(t1.reformatLines(testText));
    }
}