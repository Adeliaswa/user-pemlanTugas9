import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        var folder = new File("cekhapusdirektori"); // ganti "data" dengan nama folder kamu

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        file.delete(); // hapus file
                    }
                }
            }

            boolean success = folder.delete(); // hapus direktori setelah kosong
            System.out.println(success ? "Direktori berhasil dihapus" : "Gagal menghapus direktori");
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
