public class PrimitiveData {
    public static void main(String[] args) {
        //*Character 
        char grade = 'A';

        //*Boolean
        boolean isPassed = true;
        boolean isFailed = false;

        //*Integer
        byte ukuranKecil = 10; //* Value between -128 to 127, 1 byte
        short ukuranSedang = 1_000; //* Value between -32,768 to 32,767, 2 bytes
        int ukuranBesar = 1_00_000; //* Value between -2,147,483,648 to 2,147,483,647, 4 bytes
        long ukuranSangatBesar = 1_00_000L; //* Value between -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, 8 bytes
        //*Floating Point (Decimal)
        float decimalRendah = 10.5f; //* Up to 7 decimal digits, 4 bytes
        double decimalTinggi = 20.99; //* Up to 15 decimal digits, 8 bytes


        //Output
        System.out.println("Character Grade: " + grade);
        System.out.println("Is Passed: " + isPassed);
        System.out.println("Is Failed: " + isFailed);
        System.out.println("Byte Size: " + ukuranKecil);
        System.out.println("Short Size: " + ukuranSedang);
        System.out.println("Integer Size: " + ukuranBesar);
        System.out.println("Long Size: " + ukuranSangatBesar);
        System.out.println("Float Value: " + decimalRendah);
        System.out.println("Double Value: " + decimalTinggi);
    }
}