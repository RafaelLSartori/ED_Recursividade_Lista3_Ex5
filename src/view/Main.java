package view;

import controller.Ex5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ex5 m = new Ex5();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posição da série: "));
        while (num > 20){
            JOptionPane.showMessageDialog(null,"O número da posição precisa ser menor que 20.");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente uma posição da série: "));
        }
        System.out.println(m.frecfib(num));
    }
}