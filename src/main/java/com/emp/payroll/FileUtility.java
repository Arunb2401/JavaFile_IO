package com.emp.payroll;

import java.io.File;

public class FileUtility {
    public static boolean deleteFile(File fileToBeDeleted){
        File[] allContent = fileToBeDeleted.listFiles();
        if(allContent != null) {
            for (File file : allContent) {
                deleteFile(file);
            }
        }
        return fileToBeDeleted.delete();
    }

}