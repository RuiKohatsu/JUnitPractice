import java.util.regex.Matcher;
public class Util {
    public static boolean isNumber(String str){
        var num = Integer.parseInt(str);
        if(num >= -2147483647 && num <= 2147483647){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPostalCode(String str){
        return str.matches("\\d{7}$");

    }

    public static boolean isSmallAlphabet(String str){
        return str.matches("[a-z]+");
    }

    public static boolean isTriangle(int num, int num1, int num2){
        if(num <= 0 || num1 <= 0 || num2 <= 0){
            return false;
        }else if(num + num1 <= num2 || num + num2 <= num1 || num1 + num2 <= num){
            return false;
        }else{
            return true;
        }
    }

    public static int isSquareNumber(int num){
        int sqrt = (int)Math.sqrt(num);
        if (num < 0 || num > 10000) {
            return -1;
        }else if(sqrt * sqrt != num){
            return -1;
        }else if(sqrt * sqrt == num){
            return sqrt;
        }
        return 0;
    }


}
