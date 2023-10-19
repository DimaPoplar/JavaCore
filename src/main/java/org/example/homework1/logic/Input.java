package org.example.homework1.logic;

import java.util.Scanner;


public class Input {
    public static String InputText (){
        Scanner text = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        return text.nextLine();
    }
}
