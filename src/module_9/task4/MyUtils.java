package module_9.task4;

public class MyUtils {
    public String differentWords(String originalText, String modifyText) {
        if(originalText.length() == 0) return modifyText.toUpperCase();

        String[] originalSepar = originalText.split(" ");
        String[] modifySepar = modifyText.split(" ");
        int counter = 0;

        StringBuffer result = new StringBuffer(100);

        for (int i = 0; i < modifySepar.length; i++) {
            if (modifySepar[i].equals(originalSepar[counter])) {
                result.append(modifySepar[i]);

                do{
                    if(counter < originalSepar.length - 1) counter++;
                } while(counter < originalSepar.length - 1 && originalSepar[counter].equals(""));
                
                
                if (modifySepar.length - 1 != i)
                    result.append(" ");
            } else {
                result.append(modifySepar[i].toUpperCase());

                if(originalSepar[counter].equals("")){
                    counter++;
                }

                if (modifySepar.length - 1 != i)
                    result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        MyUtils m1 = new MyUtils();
        String origin = "";
        String mod = "Java is a general-purpose programming language";
        System.out.println(m1.differentWords(origin, mod));
    }
}