public class StringConcat {
    public static void main(String[] args) {
        String nama = "Budi";
        int umur = 15;
        String pekerjaan = "Programmer";

        // * Modern Concatenation using String.format()
        String pesan1 = String.format("Halo, nama saya %s. Umur %d tahun.", nama, umur);
        System.out.println(pesan1);

        // * Modern Concatenation using "text".formatted(args...)
        String pesan2 = "Halo, nama saya %s. Umur %d tahun.".formatted(nama, umur);
        System.out.println(pesan2);

        // * Clean tab format
        String info = """
        Biodata Pribadi:
            Nama       : %s
            Umur       : %d Tahun
            Pekerjaan  : %s
        """.formatted(nama, umur, pekerjaan);
        System.out.println(info);

        // ! Format data specifiers:
        
        //* %s : String
        //* %d : Integer (decimal)
        //* %f : Floating-point number
        //* %.2f : Floating-point number with 2 decimal places
        //* %c : Character
        //* %b : Boolean

        // * Alternative Concatenation using String.join()
        String cv = String.join(
            " - ",
            nama, 
            String.valueOf(umur) + " Years Old", 
            pekerjaan
        );
        System.out.println(cv);
    }
}