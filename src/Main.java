import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
        Cuadrado cuadrado = new Cuadrado();

        //Interfaz Grafica
        JFrame ventana = new JFrame("Cuadrado de un numero: ");
        ventana.setSize(450,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel elements = new JLabel("Ingrese un numero: ");
        JTextField input = new JTextField();
        input.setColumns(5);

        JLabel elements1 = new JLabel("Su numero es: ");
        JTextField input1 = new JTextField();
        input1.setColumns(5);

        JLabel elements2 = new JLabel("Su numero es: ");
        JTextField input2 = new JTextField();
        input2.setColumns(5);

        JButton boton = new JButton("Color: ");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt((input.getText()));
                int valor = cuadrado.obtenerNumero(number);
                int cuadrado_numero = cuadrado.cuadradoNumero(number);

                String valorString = Integer.toString(valor);
                String cuadradoString = Integer.toString(cuadrado_numero);

                input1.setText(valorString);
                input2.setText(cuadradoString);

            }
        });
        JPanel panel = new JPanel();
        panel.add(elements);
        panel.add(input);

        JPanel panel1 = new JPanel();
        panel1.add(elements1);
        panel1.add(input1);

        JPanel panel2 = new JPanel();
        panel2.add(elements2);
        panel2.add(input2);

        JPanel panel3 = new JPanel();
        panel3.add(boton);

        ventana.add(panel, BorderLayout.NORTH);
        ventana.add(panel1, BorderLayout.CENTER);
        ventana.add(panel2, BorderLayout.AFTER_LINE_ENDS);
        ventana.add(panel3, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
}