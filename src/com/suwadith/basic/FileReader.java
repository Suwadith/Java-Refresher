package com.suwadith.basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws IOException {

        File file = new File("external/captmidn.txt");
        Scanner sc = new Scanner(file);

        String fileContent = "";

        //Appends all the lines in the original txt file to a String variable
        while(sc.hasNextLine()) {
//            System.out.println(sc.nextLine());
            fileContent = fileContent.concat(sc.nextLine() + "\n");
        }

        //Writes all the content stored within the String variable to a new txt file
        FileWriter fw = new FileWriter("external/copy.txt");
        fw.write(fileContent);
        fw.close();
    }

}
