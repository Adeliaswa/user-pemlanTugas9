import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        var folder = new File("cekhapusdirektori"); //folder yang saya gunakan untuk mengecek kode yaitu menghapus direktorinya

        if (folder.exists() && folder.isDirectory()) { //cek apakah folder ada dan benar-benar direktori
            File[] files = folder.listFiles(); //mengambil semua file yang ada di direktori tersebut

            if (files != null) { //memastikan apakah daftar file tidak null (folder bisa diakses)
                for (File file : files) { 
                    if (file.isFile()) { //cek apakah file yang diakses adalah file biasa bukan direktori
                        file.delete(); //hapus file
                    }
                }
            }

            boolean success = folder.delete(); //hapus direktori setelah kosong/ tidak ada file lagi
            System.out.println(success ? "Direktori berhasil dihapus" : "Gagal menghapus direktori");
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
