import java.io.File;

public class UkuranFile { //soal nomor 2
    public static void main(String[] args) {
        var file = new File("test.txt"); //membuat file txt

        if (file.exists()) { //untuk mengecek apakah file test.txt ada
            long size = file.length(); //untuk mendapatkan ukuran filenya
            if (size < 1024 * 1024) { //untuk mengecek apakah ukuran file kurang dari 1MB
                double kb = size / 1024.0; //untuk mengubah ukuran file ke KB
                System.out.printf("Ukuran file: %.2f KB\n", kb); 
            } else { //jika ukuran file lebih dari 1MB
                double mb = size / (1024.0 * 1024); //untuk mengubah ukuran file ke MB
                System.out.printf("Ukuran file: %.2f MB\n", mb);
            }
        } else {
            System.out.println("File tidak ditemukan."); //jika file tidak ditemukan
        }
    }
}
