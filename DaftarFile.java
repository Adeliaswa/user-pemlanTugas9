import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        var folder = new File("."); //direktori saat ini

        if (folder.exists() && folder.isDirectory()) { //mengecek apakah folder ada dan merupakan direktori
            File[] files = folder.listFiles(); //mengambil semua file dan folder di dalam direktori
            if (files != null) { //mengecek apakah hasilnya tidak null (berarti bisa dibaca)
                for (File f : files) { //mengulang setiap file/folder
                    if (f.isFile()) { //mengecek apakah file/folder merupakan file (bukan folder)
                        System.out.println(f.getName()); 
                    }
                }
            }
        } else { //jika folder tidak ada atau bukan direktori
            System.out.println("Direktori tidak valid.");
        }
    }
}
