package co.wileyedge.docgen;

import java.io.File;

public class FileDeletion{
    public void deleteFile(String path){
        // Specify the path of the file to be deleted
        String filePath = path;

        // Create a File object with the specified file path
        File fileToDelete = new File(filePath);

        // Check if the file exists
        if (fileToDelete.exists()) {
            // Attempt to delete the file
            boolean isDeleted = fileToDelete.delete();

            // Check if the file deletion was successful
            if (isDeleted) {
                System.out.println("resourses relesed....");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            // If the file does not exist
            System.out.println("File does not exist.");
        }
    }
}
