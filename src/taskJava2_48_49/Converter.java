package taskJava2_48_49;

public class Converter {

    public String to3(int i){  //Метод перевода числа в троичную систему счисления
        String str = "";
        while (i>0){
            str += i%3;
            i = i/3;
        }
        return reverse(str);
    }
    public String reverse(String str){
        String rev = "";
        for (int i = str.length() - 1; i>=0 ; i--){
            rev += str.charAt(i);
        }
        return rev;
    }

}
