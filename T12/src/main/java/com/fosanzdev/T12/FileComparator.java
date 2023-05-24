package com.fosanzdev.T12;

import java.io.*;

public class FileComparator {

    private String path1;
    private String path2;


    //Constructor
    public FileComparator(String path1, String path2){
        this.path1 = path1;
        this.path2 = path2;
    }

    /**
     * Compare two files byte by byte
     * @return true if the files are the same, false otherwise
     */
    public boolean compareFiles(){
        // Create two files
        File file1 = new File(path1);
        File file2 = new File(path2);

        //Create two RandomAccessFile objects in read mode
        try (RandomAccessFile randomAccessFile1 = new RandomAccessFile(file1, "r");
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "r")) {

            // Compare the length of the files
            long length1 = randomAccessFile1.length();
            long length2 = randomAccessFile2.length();

            if (length1 != length2){
                return false;
            }


            //If the length is the same, compare byte by byte
            long index = 0;
            while (index < randomAccessFile1.length()){
                //If the bytes are different, return false
                if (randomAccessFile1.readByte() != randomAccessFile2.readByte()){
                    return false;
                }
                // If the bytes are the same, continue and sum 1 to the index
                index++;
            }

            // Close the files
        // Catch exceptions
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // If the files are the same, return true
        return true;
    }

    //Setters in case we want to change the paths
    public void setPath1(String path1) {
        this.path1 = path1;
    }

    public void setPath2(String path2) {
        this.path2 = path2;
    }
}
