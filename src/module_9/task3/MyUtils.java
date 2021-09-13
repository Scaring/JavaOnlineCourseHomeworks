package module_9.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtils {
    public String withSeparator(String text, String separator){
        if(text.length() == 0) return "";
        Pattern p = Pattern.compile("[aeiouy]", Pattern.CASE_INSENSITIVE);

        String[] separatedText = text.split(separator);
        String lastChar = "";

        if(separatedText.length > 1){
            String lastWord = separatedText[separatedText.length - 1];        
            lastChar = Character.toString(lastWord.charAt(lastWord.length() - 1));

            if(lastChar.equals("!") || lastChar.equals(".")){
                separatedText[separatedText.length - 1] = lastWord.substring(0, lastWord.length() - 1);
            }
        }

        for (int i = 0; i < separatedText.length; i++) {
            String curentWord = separatedText[i];

            if(curentWord.contains("-")) {
                separatedText[i] =  withSeparator(curentWord, "-");
                continue;
            };

            String firstLetter = Character.toString(curentWord.charAt(0));
            Matcher m = p.matcher(firstLetter);

            if (m.find()) {
                separatedText[i] = curentWord + "hay";
            } else {
                int counter = 0;
                String nextLetter = firstLetter;

                while (!p.matcher(nextLetter).find() && curentWord.length() > counter) {
                    curentWord = curentWord.substring(1) + nextLetter;
                    if(curentWord.length() > counter){
                        nextLetter = Character.toString(curentWord.charAt(0));
                    }
                    counter++;
                }

                separatedText[i] = curentWord  + "ay";
            }
        }

        return (lastChar.equals("!") || lastChar.equals(".")) ? String.join(separator, separatedText) + lastChar : String.join(separator, separatedText);
    }

    public String pigLatinConverter(String text) {
        return withSeparator(text, " ");
    }

    public static void main(String[] args) {
        MyUtils m1 = new MyUtils();

        System.out.println(m1.pigLatinConverter("The name is used for its English connotations as a strange and foreign-sounding language."));
    }
}


// PigLatinConverterTest.checkTextMixWords()
// "regular expressions are fun!"
// PigLatinConverterTest.checkTextUppercaseWords()
// "REGULAR EXPRESSIONS ARE FUN!"
// PigLatinConverterTest.checkTextMixUppercaseLetters()
// "The name is used for its English connotations as a strange and foreign-sounding language."