package module_9.task2;

public class MyUtil {
    public boolean verifyBrackets(String text) {
        String str = text;

        System.out.println(text);
        if (text == null) {
            return false;
        }

        while (str.contains("\\[") || str.contains("\\]") || str.contains("\\{") || 
                str.contains("\\}") || str.contains("\\(") || str.contains("\\)")) {

            str = str.replaceAll("\\\\\\[", "").replaceAll("\\\\\\]", "").replaceAll("\\\\\\{", "")
                .replaceAll("\\\\\\}", "").replaceAll("\\\\\\(", "").replaceAll("\\\\\\)", "");
        }   

        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "").replaceAll("\\[\\]", "").replaceAll("\\{\\}", "");
        }

        return (str.length() == 0);

    }

    public static void main(String[] args) {
        MyUtil m1 = new MyUtil();
        String str = "{]}";

        System.out.println(m1.verifyBrackets(str));
    }
}
