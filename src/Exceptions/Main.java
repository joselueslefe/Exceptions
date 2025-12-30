package Exceptions;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            File arquivo = new File("Arquvo_inexistente.txt");
            Scanner sc = new Scanner(arquivo);
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }

        try {
            String [] vetor = {"Julia","Pedro","Carlos"};
            System.out.println(vetor[2]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index não encontrado>");
        }
    }

}
