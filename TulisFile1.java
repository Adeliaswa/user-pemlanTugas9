import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile1 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan teks yang akan disimpan: ");
        var text = keyboard.nextLine();

        try (var writer = new FileWriter("test.txt", true)) { //baris 13 diganti true maka semua input akan disimpan berurutan, sedangkan jika false maka hanya input terakhir yang akan disimpan karena inputan terakhir menimpa inputan sebelumnya
            writer.write(text);
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file");
        }
    }
}
