import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args){
        String s = "codeleet" ;
        int[] indices = {4,5,6,7,0,2,1,3};
        shuffle(s, indices);
    }

    static void shuffle(String s, int[] indices){
        //ArryaList al = new ArryaList();
        char[] arr = new char[indices.length];
        for(int i= 0;i<s.length();i++){
            arr[indices[i]] = s.charAt(i);
        }
        String str = "";
        for(int i = 0;i< arr.length;i++){
            str += arr[i];
        }
        //System.out.println(str);
    }
}
