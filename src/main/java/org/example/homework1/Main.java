package org.example.homework1;


import java.io.File;
import java.io.IOException;

import static org.example.homework1.logic.Input.InputText;
import static org.example.homework1.logic.writeinnote.CheckFile.checkFile;
import static org.example.homework1.logic.writeinnote.Write.writeNote;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Project\\IT-обучение\\Курс 12. Java Core\\JavaCore\\src\\main\\java\\org\\example\\homework\\Note.txt");
        checkFile(file);
        String text = InputText();
        writeNote(file, text);
    }
}
