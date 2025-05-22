import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        var folder = new File("."); //direktori saat ini

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        System.out.println(f.getName());
                    }
                }
            }
        } else {
            System.out.println("Direktori tidak valid.");
        }
    }
}
