package org.example.homework1.logic.writeinnote;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Write {
    public static void writeNote(File file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.write(" -> ");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        writer.write(formatter.format(date));
        writer.flush();
    }
}
