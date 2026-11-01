import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AtMethods {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static String checkAccess(int age){
        return (age > 18) ? "Allowed" : "Denied";
    }
    public static boolean isPositive(int n){
        return (n < 0) ? false : true;
    }
    public static String getGrade(int score){
        String x = "";
        if (score >= 0 && score <= 20) {x = "E";}
        else if (score >= 21 && score <= 40) {x = "D";}
        else if (score >= 41 && score <= 60) {x = "C";}
        else if (score >= 61 && score <= 80) {x = "B";}
        else if (score >= 81 && score <= 100) {x = "A";}
        else {x = "not in range";}
        return x;
    }
    public static String blastOff(int start) {
    String x = "";
    if (start < 0){ return "otricatelnoe";}
    int i;
    for (i = start; i > 0; i--) {x += i + " ";}
        return x += "Поехали!";
    }
    public static int sumToN(int n) {
        int s = 0;
        int i;
        for (i = n; i>0; i--) {s = s+i;}
        return s;
    }
    public static boolean hasBug(String[] messages) {
        boolean x = false;
        for (String m : messages){if (m == "Bug"){x = true;}}
        return x;
    }
    public static String getEvenInRange(int start, int end) {
        String x = "";
        int i;
       for (i=start; i <= end; i++){
           if (isEven(i)){x += i +" ";}       }
       return x;
    }
    public static int findMax(int[] arr){
    int m = arr[0];
    for (int n : arr) { if (n>m){ m = n;}}
    return m;
    }
    public static String[] reverse(String[] arrr){
        int n = arrr.length;
        int i;
        String[] rev = new String[n];
        for (i = 0; i < n;i++) {
            rev[i] = arrr[n-1-i];  }
        return rev;
    }
    public static int calcAverage(List<Integer> spisok) {
        int midle = 0;
        for (int i : spisok) {
            midle = midle + i;
        } return midle / spisok.size();
    }
    public static List<String> removeSpecificName(List<String> listt, String nameToRemove) {
        //int i = listt.size();
        //for (i=1; i > 0, )
        boolean d = listt.remove(nameToRemove);
        return listt;
    }

    public static void main(String[] args){
        System.out.println("n-чётное(chetnoe)? = " + isEven(-4));
        System.out.println("возраст Allowed / Denied ? = " + checkAccess(18));
        System.out.println("plus/ minus ? = " + isPositive(5));
        System.out.println("Grade = " + getGrade(80));
        System.out.println("n + Poehali = " + blastOff(8));
        System.out.println("summa vse do n = " + sumToN(5));
        String[] messages = {"123","Bug1","text"};
        System.out.println("has Bug ? = " + hasBug(messages));
        System.out.println("Even in range = " + getEvenInRange(-10, -4));
        int[] arr = {15, 0, -5, 23, -7};
        System.out.println("Maximum = " + findMax(arr));
        String[] arrr = {"ONE","two","three","four"};
        System.out.println("reverse = " + Arrays.toString(reverse(arrr)));
        List<Integer> spisok = List.of(4, 6, 8, 100);
        System.out.println("midle spisok = " + calcAverage(spisok));
        List<String> listt = new ArrayList<>(List.of("cat", "DOG" , "123"));
        System.out.println("list delet = " + removeSpecificName(listt, "DOG"));
    }
}