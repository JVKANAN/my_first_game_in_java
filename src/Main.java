
import javax.swing.*;

public class Main {
    public static int sorteiaNumeroInteiro(int maximo) {
        int x = (int) (Math.random()*(maximo+1)); //gera número inteiro aleatório entre [0-maximo]
        return x;
    }

    public static void main(String[] args) {
        int maxNum = 100;
        int pontos = 100;
        int y = sorteiaNumeroInteiro(maxNum);
        boolean acertou = false;
        int tentativas = 0;
        JOptionPane.showMessageDialog(null,"Bem-Vindo! \nVamos Jogar?");
        JOptionPane.showMessageDialog(null,"A cada tentativa errada você perderá 2 pontos\n" +
                "Total de pontos: "+ pontos);
        while(!acertou) {
            int numeroLido = Integer.parseInt(JOptionPane.showInputDialog("Tente advinha um número de 0 a 100"));
            tentativas++;
            if (numeroLido ==y) {
                JOptionPane.showMessageDialog(null,"Parabéns! Você acertou. \nNúmero de tentativas:"+tentativas);
                JOptionPane.showMessageDialog(null,"Total de pontos:"+pontos);
                acertou = true;
            } else if(numeroLido < y) {
                JOptionPane.showMessageDialog(null,"Tente um numero maior");
                pontos -= 2;
                acertou = false;

            } else if (numeroLido > y) {
                JOptionPane.showMessageDialog(null,"Tente um numero menor");
                pontos -= 2;
                acertou = false;
            }
        }

    }

}
