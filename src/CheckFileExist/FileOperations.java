package CheckFileExist;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String path = "C:\\Users\\dkushc\\PetProjects\\testFileExist\\";
        String fileName = "randomFile.txt";

        System.out.println("File exist: " + checkFileExistance(path, fileName));
    }

    public static boolean checkFileExistance(String directoryPath, String fileName) {
        boolean res = false;

        try {
            File tempFile = new File(directoryPath + fileName);
            res = tempFile.exists();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }
}
