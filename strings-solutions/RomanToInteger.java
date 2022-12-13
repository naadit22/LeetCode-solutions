public class RomanToInteger {
    public static void main(String[] args) {
        String str = "MCMIVI";
        System.out.println(convert(str));
    }

    static int returnNumbers(char ch){
        switch (ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return -1;
    }

    static int convert(String str){
        int res = 0;
        for(int i = 0;i<str.length();i++){
            int ch1 = returnNumbers(str.charAt(i));

            if(i+1<str.length()){
                int ch2 = returnNumbers(str.charAt(i+1));
                if(ch1>=ch2){
                    res+=ch1;
                }
                else{
                    res = res + ch2 - ch1;
                    i++;
                }
            }
            else{
                res+=ch1;
            }
        }
        return res;
    }
}
