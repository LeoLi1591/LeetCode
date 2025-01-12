public class L415_AddString {
    public String addStrings(String num1, String num2) {
        // use string builder
        // O(max(len1,len2))

        int len1 = num1.length()-1;
        int len2 = num2.length()-1;

        int carry = 0;
        StringBuilder sb =new StringBuilder();

        while(len1 >= 0 || len2 >=0 || carry >0){
            int char1 = len1 >= 0 ? num1.charAt(len1) - '0' : 0;
            int char2 = len2 >= 0 ? num2.charAt(len2) - '0' : 0;
            int value = (char1+char2 + carry) %10;

            carry = (char1 + char2 + carry) / 10;
            sb.append(value);
            len1--;
            len2--;
        }

        return sb.reverse().toString();


    }
}
