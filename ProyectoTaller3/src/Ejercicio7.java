
public class Ejercicio7 {
           public static void main(String[] args) {
        double v1, v2, v3, v4, v5, v6, v7, v8;
        boolean result7;
        
        v1 = Math.sqrt(81)+9;
        v2 = 3;
        v3 = 9;
        v4 = 10;
        v5 = 1;
        v6 = 100;
        v7 = 25;
        v8 = Math.sqrt(100);
        result7 = ((v1/v2)== v3) || (v4 > v5) && ((v6/v7)>=v8);
        System.out.println("result7 = " + result7);
    }
}