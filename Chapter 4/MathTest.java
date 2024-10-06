public class MathTest {
    public static void main(String[] args) {
        
        double valueForSqrt = 37;
        double valueForSin = -Math.PI / 2;
        double valueForCos = Math.PI;
        double floorValue = 22.5;
        double ceilValue = 22.5;
        double roundValue = 22.5;
        int maxValue1 = 68;
        int maxValue2 = 71;
        int minValue1 = 68;
        int minValue2 = 71;
        double randomValue = Math.random() * 100; 
         
       
        System.out.println("SQRT: " + Math.sqrt(valueForSqrt));
        System.out.println("SIN: " + Math.sin(valueForSin));
        System.out.println("COS: " + Math.cos(valueForCos));
        System.out.println("FLOOR: " + Math.floor(floorValue) + 
                           " CEIL: " + Math.ceil(ceilValue) + 
                           " ROUND: " + Math.round(roundValue));
        System.out.println("MAX: " + Math.max(maxValue1, maxValue2));
        System.out.println("MIN: " + Math.min(minValue1, minValue2));
        System.out.println("RANDOM: " + randomValue);
    }
}