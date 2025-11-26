public class DataType {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 24;
        char bloodType = 'A';
        double height = 155.5;
        boolean isGraduated = true;
        boolean isUnderGraduate = false;

        System.out.println("Hello, my name is " + name + ". I'm " + age + " years old. Below are my biodata: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Height: " + height);
        System.out.println("Graduated: " + isGraduated);
        System.out.println("Undergraduate: " + isUnderGraduate);
    }

    /*
    ! Aturan Penulisan Variabel:
    * 1. Nama variabel harus diawali dengan huruf (a-z, A-Z), tanda underscore (_), atau tanda dollar ($). Tidak boleh diawali dengan angka (0-9).
    * 2. Setelah karakter pertama, nama variabel dapat mengandung huruf, angka (0-9), tanda underscore (_), atau tanda dollar ($).
    * 3. Nama variabel bersifat case-sensitive (misalnya, myVar dan myvar adalah variabel yang berbeda).
    * 4. Hindari penggunaan kata kunci (keywords) Java sebagai nama variabel, seperti int, class, public, static, dll.
    * 5. Gunakan konvensi penamaan camelCase untuk variabel, di mana kata pertama dimulai dengan huruf kecil dan setiap kata berikutnya dimulai dengan huruf besar (misalnya, myVariableName).
    */
}