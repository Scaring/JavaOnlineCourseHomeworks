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

        switch(strNum.length()){
            case 4:
                result.append(romanChar(Character.toString(strNum.charAt(0)), Thousands)); 
                result.append(romanChar(Character.toString(strNum.charAt(1)), Hundreds)); 
                result.append(romanChar(Character.toString(strNum.charAt(2)), Tens)); 
                result.append(romanChar(Character.toString(strNum.charAt(3)), Units)); 
                break;
            case 3:
                result.append(romanChar(Character.toString(strNum.charAt(0)), Hundreds)); 
                result.append(romanChar(Character.toString(strNum.charAt(1)), Tens)); 
                result.append(romanChar(Character.toString(strNum.charAt(2)), Units)); 
                break;
            case 2:
                result.append(romanChar(Character.toString(strNum.charAt(0)), Tens)); 
                result.append(romanChar(Character.toString(strNum.charAt(1)), Units)); 
                break;
            case 1:
                result.append(romanChar(Character.toString(strNum.charAt(0)), Units)); 
                break;        
        }      

        return result.toString();
    }
    public static void main(String[] args) {
        StringBufferPractice sbp = new StringBufferPractice();
        System.out.println(sbp.intToRoman(3999));      
    }
}
