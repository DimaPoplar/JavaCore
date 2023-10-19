package org.example.homework1.logic.writeinnote;

import java.io.File;
import java.io.IOException;

public class CheckFile {
    public static void checkFile (File file) throws IOException {
        if (file.createNewFile()){
            System.out.println("Фаил создан");
        } else {
            System.out.println("Запись в уже созданый фаил");
        }
    }
}
