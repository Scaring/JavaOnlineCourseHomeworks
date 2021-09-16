package module_9.task1;

public class StringBufferPractice {
    public String romanChar(String idx, String[] decimalPlaces){
        return Integer.parseInt(idx) != 0 ? decimalPlaces[Integer.parseInt(idx) - 1] : "";
    }

    public String intToRoman(int number) throws IllegalArgumentException {
        if(number <= 0 || number > 3999) throw new IllegalArgumentException();

        StringBuffer result = new StringBuffer();        
        String strNum = String.valueOf(number);

        String[] Thousands = {"M", "MM", "MMM"};
        String[] Hundreds = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] Tens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] Units = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        int lan = strNum.length();

        switch(lan){
            case 4:
                result.append(romanChar(Character.toString(strNum.charAt(lan - 4)), Thousands)); 
            case 3:
                result.append(romanChar(Character.toString(strNum.charAt(lan - 3)), Hundreds)); 
            case 2:
                result.append(romanChar(Character.toString(strNum.charAt(lan - 2)), Tens)); 
            case 1:
                result.append(romanChar(Character.toString(strNum.charAt(lan - 1)), Units)); 
                break;        
        }      

        return result.toString();
    }
    public static void main(String[] args) {
        StringBufferPractice sbp = new StringBufferPractice();
        System.out.println(sbp.intToRoman(222));      
    }
}
