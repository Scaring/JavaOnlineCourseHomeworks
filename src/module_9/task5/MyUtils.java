package module_9.task5;

public class MyUtils {
    public String reformatLines(String text) {
        String[] wordsArr = text.split("[\\r\\n\\s]+");
        StringBuilder result = new StringBuilder();
        int maxLineLength = 60;
        int linesCounter = 1;
        int temp = 0;

        for (String word : wordsArr) {
            if(word.equals("")) continue;

            if (result.length() + word.length() + temp > maxLineLength * linesCounter) {
                result.deleteCharAt(result.length());
                result.append("\n");
                temp += (maxLineLength * linesCounter) - result.length() + 1;
                linesCounter += 1;
            }

            result.append(word + " ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        MyUtils m1 = new MyUtils();
        String testText = """
                 The   name
                 is used
                 for its English connotations as
                 a strange and foreign-sounding
                language.""";
        System.out.println(m1.reformatLines(testText));
    }
}

// ReformatLinesTest.checkTwoWordMaxSymbols()
// ThenameisusedforitsEnglishconnotationsasastrangeandforeign-
// ThenameisusedforitsEnglishconnotationsasastrangeandforeign-

// ReformatLinesTest.checkManyLines()
/*
 * The name is used for its English connotations as a strange and
 * foreign-sounding language.
 */

// ReformatLinesTest.checkOutputManyLines()
// The name is used for its English connotations as a strange and
// foreign-sounding language.