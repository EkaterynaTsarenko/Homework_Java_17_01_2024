public class Main {
    public static void main(String[] args) {


        // 0000 0000 - 8 бита
        byte byteVar = 120;

        // 0000 0000 0000 0000 - 16 бит
        short shortVar = 80;
        //Операция расширения
        shortVar = byteVar;

        //Операция сужения
        byteVar = (byte)shortVar;

        System.out.println(byteVar);

        int intVar = 200;
        long  longVar = 400;

        longVar = intVar;
        intVar = (int)longVar;

        System.out.println(intVar);

        float floatVar = 400;
        double doubleVar = 500;

        doubleVar = floatVar;
        floatVar = (float)doubleVar;

        System.out.println(floatVar);










    }
}