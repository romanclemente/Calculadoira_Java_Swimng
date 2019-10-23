/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Romi
 */
public class Ventana extends JFrame implements ActionListener {

    Container container;
    JTextField texto;
    JTextField texto1;
    int valora = 0;
    int valorb = 0;
    int opera = 0;
    int val;
    int resultado = 0;
    boolean operar = false;
    JButton bt_0;
    JButton bt_1;
    JButton bt_2;
    JButton bt_3;
    JButton bt_4;
    JButton bt_5;
    JButton bt_6;
    JButton bt_7;
    JButton bt_8;
    JButton bt_9;
    JButton bt_bol;
    JButton bt_bog;
    JButton bt_raiz;
    JButton bt_coseno;
    JButton bt_tan;
    JButton bt_log;
    JButton bt_seno;
    JButton bt_exponencial;
    JButton bt_porciento;
    JButton bt_multiplicar;
    JButton bt_ans;
    JButton bt_sumar;
    JButton bt_resultado;
    JButton bt_restar;
    JButton bt_dividir;
    JButton bt_extension;
    JPanel panel_sur;
    JPanel panel_nor;
    JPanel panel_surc;
    JPanel panel_surd;
    JPanel panel_este;
    JPanel panel_oeste;
    JPanel panel_centro;
    JPanel panel_nors;
    JPanel panel_norn;

    public Ventana() {
        initGUI();
    }

    private void initGUI() {

        intancias();
        acciones();
        configurarContainer();
        setTitle("Calculadora");
        setSize(300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.pack();
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case variables.bt_ans:
                activartodo();
                desactivarnumero();
                texto.setText(Integer.toString(resultado));
                valora = 0;
                valorb = 0;

                break;

            case variables.bt_0:
                if (!texto.getText().equalsIgnoreCase("0")) {
                    String textito = texto.getText();
                    texto.setText(textito + "0");
                }
                this.pack();
                break;
            case variables.bt_1:
                if (texto.getText().equalsIgnoreCase("0")) {
                    texto.setText("1");
                } else {
                    String textito = texto.getText();
                    texto.setText(textito + "1");

                }
                this.pack();
                break;
            case variables.bt_2:
                if (texto.getText().equalsIgnoreCase("0")) {
                    texto.setText("2");
                } else {
                    String textito = texto.getText();
                    texto.setText(textito + "2");

                }
                this.pack();
                break;
            case variables.bt_3:
                if (texto.getText().equalsIgnoreCase("0")) {
                    texto.setText("3");
                } else {
                    String textito = texto.getText();
                    texto.setText(textito + "3");

                }
                this.pack();
                break;

            case variables.bt_4:
                if (texto.getText().equalsIgnoreCase("0")) {
                    texto.setText("4");
                } else {
                    String textito = texto.getText();
                    texto.setText(textito + "4");

                }
                this.pack();
                break;

            case variables.bt_5:
                if (texto.getText().equalsIgnoreCase("0")) {
                    texto.setText("5");
                } else {
                    String textito = texto.getText();
                    texto.setText(textito + "5");

                }
                this.pack();
                break;

            case variables.bt_6:
                if (texto.getText().equalsIgnoreCase("0")) {
                    texto.setText("6");
                } else {
                    String textito = texto.getText();
                    texto.setText(textito + "6");

                }
                this.pack();
                break;
            case variables.bt_7:
                if (texto.getText().equalsIgnoreCase("0")) {
                    texto.setText("7");
                } else {
                    String textito = texto.getText();
                    texto.setText(textito + "7");

                }
                this.pack();
                break;

            case variables.bt_8:
                if (texto.getText().equalsIgnoreCase("0")) {
                    texto.setText("8");
                } else {
                    String textito = texto.getText();
                    texto.setText(textito + "8");

                }
                this.pack();
                break;

            case variables.bt_9:
                if (texto.getText().equalsIgnoreCase("0")) {
                    texto.setText("9");
                } else {
                    String textito = texto.getText();
                    texto.setText(textito + "9");

                }
                this.pack();
                break;

            case variables.bt_extension:
                if (!bt_extension.getText().equalsIgnoreCase("simple")) {
                    bt_extension.setText("Simple");
                    container.add(panelDerecho(), BorderLayout.EAST);
                    pack();

                } else {
                    bt_extension.setText("Avanzado");
                    container.remove(panelDerecho());
                    pack();

                }
                break;

            case variables.bt_sumar:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    texto.setText("0");
                    resultado = valora;
                }
                opera = 1;
                break;
            case variables.bt_restar:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    texto.setText("0");
                    resultado = valora;
                }
                opera = 2;
                break;
            case variables.bt_dividir:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    texto.setText("0");
                    resultado = valora;
                }
                opera = 3;
                break;

            case variables.bt_multiplicar:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    texto.setText("0");
                    resultado = valora;
                }
                opera = 4;
                break;

            case variables.bt_raiz:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    float resul = (float) Math.sqrt(valora);
                    texto.setText(String.valueOf(resul));

                }
                this.pack();
                break;

            case variables.bt_porciento:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    texto.setText("0");
                }
                opera = 5;
                break;

            case variables.bt_coseno:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    float resul = (float) Math.cos(valora);
                    texto.setText(String.valueOf(resul));

                }
                this.pack();
                break;
            case variables.bt_seno:
                activartodo();

                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    float resul = (float) Math.sin(valora);
                    texto.setText(String.valueOf(resul));

                }
                this.pack();
                break;

            case variables.bt_tan:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    float resul = (float) Math.tan(valora);
                    texto.setText(String.valueOf(resul));

                }
                this.pack();
                break;
            case variables.bt_log:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    float resul = (float) Math.log10(valora);
                    texto.setText(String.valueOf(resul));

                }
                this.pack();
                break;
            case variables.bt_bog:
                valora = 0;
                resultado = 0;
                texto.setText("0");
                this.pack();
                operar = false;
                activartodo();
                break;

            case variables.bt_bol:
                activartodo();
                texto.setText("0");
                this.pack();
                break;

            case variables.bt_exponencial:
                activartodo();
                if (valora == 0) {
                    valora = Integer.parseInt(texto.getText());
                    float resul = (float) Math.toRadians(valora);
                    texto.setText(String.valueOf(resul));

                }
                this.pack();
                break;

            case variables.bt_resultado:
                
                if (!operar) {
                    operar = true;
                    valorb = Integer.parseInt(texto.getText());
                    val = valorb;
                }
                desactivartodo();
                switch (opera) {

                    case 1:
                        resultado = resultado + val;
                        texto.setText(Integer.toString(resultado));
                        break;

                    case 2:
                        resultado = resultado - val;
                        System.out.println(resultado);
                        texto.setText(Integer.toString(resultado));
                        break;
                    case 3:
                        resultado = resultado / val;
                        texto.setText(Integer.toString(resultado));
                        break;
                    case 4:
                        resultado = resultado * val;
                        texto.setText(Integer.toString(resultado));
                        break;
                    case 5:
                        float resul = (resultado * val) / 100;
                        texto.setText(String.valueOf(resul));
                        break;
                    case 6:

                }
                this.pack();
                break;

        }
    }

   
//este metodo te deshabilita todos los botones salvo dos en concreto cuando se cumpla cierta funcion
    private void desactivartodo() {
        bt_0.setEnabled(false);
        bt_1.setEnabled(false);
        bt_2.setEnabled(false);
        bt_3.setEnabled(false);
        bt_4.setEnabled(false);
        bt_5.setEnabled(false);
        bt_6.setEnabled(false);
        bt_7.setEnabled(false);
        bt_8.setEnabled(false);
        bt_9.setEnabled(false);
        bt_bol.setEnabled(false);
        bt_coseno.setEnabled(false);
        bt_dividir.setEnabled(false);
        bt_exponencial.setEnabled(false);
        bt_log.setEnabled(false);
        bt_multiplicar.setEnabled(false);
        bt_tan.setEnabled(false);
        bt_sumar.setEnabled(false);
        bt_seno.setEnabled(false);
        bt_restar.setEnabled(false);
        bt_raiz.setEnabled(false);
        bt_porciento.setEnabled(false);

    }
//este solamente desactiva todos los numeros
    private void desactivarnumero() {
        bt_0.setEnabled(false);
        bt_1.setEnabled(false);
        bt_2.setEnabled(false);
        bt_3.setEnabled(false);
        bt_4.setEnabled(false);
        bt_5.setEnabled(false);
        bt_6.setEnabled(false);
        bt_7.setEnabled(false);
        bt_8.setEnabled(false);
        bt_9.setEnabled(false);

    }
//esto lo vuelve a activar
    private void activartodo() {
        bt_0.setEnabled(true);
        bt_1.setEnabled(true);
        bt_2.setEnabled(true);
        bt_3.setEnabled(true);
        bt_4.setEnabled(true);
        bt_5.setEnabled(true);
        bt_6.setEnabled(true);
        bt_7.setEnabled(true);
        bt_8.setEnabled(true);
        bt_9.setEnabled(true);
        bt_ans.setEnabled(true);
        bt_bol.setEnabled(true);
        bt_coseno.setEnabled(true);
        bt_dividir.setEnabled(true);
        bt_exponencial.setEnabled(true);
        bt_log.setEnabled(true);
        bt_multiplicar.setEnabled(true);
        bt_tan.setEnabled(true);
        bt_sumar.setEnabled(true);
        bt_seno.setEnabled(true);
        bt_restar.setEnabled(true);
        bt_raiz.setEnabled(true);
        bt_porciento.setEnabled(true);

    }
    
    
    //crea la instacias para los componentes de la pantalla

    private void intancias() {

        container = this.getContentPane();
        texto = new JTextField("0");
        texto1 = new JTextField("0");
        bt_extension = new JButton("Avanzada");
        bt_extension.setActionCommand(variables.bt_extension);
        bt_extension.setBackground(new Color(161, 128, 186));
        bt_0 = new JButton("0");
        bt_0.setBackground(new Color(88, 168, 252));
        bt_1 = new JButton("1");
        bt_1.setBackground(new Color(88, 168, 252));
        bt_2 = new JButton("2");
        bt_2.setBackground(new Color(252, 183, 88));
        bt_3 = new JButton("3");
        bt_3.setBackground(new Color(88, 168, 252));
        bt_4 = new JButton("4");
        bt_4.setBackground(new Color(252, 183, 88));
        bt_5 = new JButton("5");
        bt_5.setBackground(new Color(88, 168, 252));
        bt_6 = new JButton("6");
        bt_6.setBackground(new Color(252, 183, 88));
        bt_7 = new JButton("7");
        bt_7.setBackground(new Color(88, 168, 252));
        bt_8 = new JButton("8");
        bt_8.setBackground(new Color(252, 183, 88));
        bt_9 = new JButton("9");
        bt_9.setBackground(new Color(88, 168, 252));
        bt_bog = new JButton("C");
        bt_bog.setBackground(new Color(176, 231, 92));
        bt_bol = new JButton("CE");
        bt_bol.setBackground(new Color(176, 231, 92));
        bt_raiz = new JButton("√");
        bt_raiz.setBackground(new Color(176, 231, 92));
        bt_coseno = new JButton("COS");
        bt_coseno.setBackground(new Color(176, 231, 92));
        bt_seno = new JButton("SIN");
        bt_seno.setBackground(new Color(176, 231, 92));
        bt_exponencial = new JButton("RAD");
        bt_exponencial.setBackground(new Color(176, 231, 92));
        bt_porciento = new JButton("%");
        bt_porciento.setBackground(new Color(176, 231, 92));
        bt_multiplicar = new JButton("*");
        bt_multiplicar.setBackground(new Color(176, 231, 92));
        bt_ans = new JButton("ANS");
        bt_ans.setBackground(new Color(176, 231, 92));
        bt_sumar = new JButton("+");
        bt_sumar.setBackground(new Color(176, 231, 92));
        bt_resultado = new JButton("=");
        bt_resultado.setBackground(new Color(176, 231, 92));
        bt_restar = new JButton("-");
        bt_restar.setBackground(new Color(176, 231, 92));
        bt_dividir = new JButton("/");
        bt_dividir.setBackground(new Color(176, 231, 92));
        bt_tan = new JButton("TAN");
        bt_tan.setBackground(new Color(176, 231, 92));
        bt_log = new JButton("LOG");
        bt_log.setBackground(new Color(176, 231, 92));
        panel_nor = new JPanel();
        panel_sur = new JPanel();
        panel_surc = new JPanel();
        panel_surd = new JPanel();
        panel_este = new JPanel();
        panel_oeste = new JPanel();
        panel_centro = new JPanel();
        panel_nors = new JPanel();
        panel_norn = new JPanel();
    }
 //configura los dos paneles en el container y dentro los botones que lleva
    private void configurarContainer() {
        container.setLayout(new BorderLayout());
        container.add(panelSuperior(), BorderLayout.NORTH);
        container.add(panelInferior(), BorderLayout.CENTER);

    }

    private JPanel panelSuperiorN() {
        panel_norn.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel_norn.add(bt_extension);
        return panel_norn;
    }

    private JPanel panelSuperiorS() {
        panel_nors.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
        panel_nors.add(texto);
        return panel_nors;
    }

    private JPanel panelSuperior() {
        panel_nor.setLayout(new BorderLayout());
        panel_nor.add(panelSuperiorN(), BorderLayout.NORTH);
        panel_nor.add(panelSuperiorS(), BorderLayout.CENTER);
        return panel_nor;
    }

    private JPanel panelInferior() {
        panel_sur.setLayout(new BorderLayout());
        panel_sur.add(panelInferiorC(), BorderLayout.CENTER);
        panel_sur.add(panelInferiorD(), BorderLayout.EAST);
        return panel_sur;
    }

    private JPanel panelInferiorC() {

        panel_surc.setLayout(new GridLayout(5, 3));
        panel_surc.add(bt_porciento);
        panel_surc.add(bt_raiz);
        panel_surc.add(bt_ans);
        panel_surc.add(bt_1);
        panel_surc.add(bt_2);
        panel_surc.add(bt_3);
        panel_surc.add(bt_4);
        panel_surc.add(bt_5);
        panel_surc.add(bt_6);
        panel_surc.add(bt_7);
        panel_surc.add(bt_8);
        panel_surc.add(bt_9);
        panel_surc.add(bt_bol);
        panel_surc.add(bt_0);
        panel_surc.add(bt_bog);
        return panel_surc;
    }

    private JPanel panelInferiorD() {

        panel_surd.setLayout(new GridLayout(5, 1));
        panel_surd.add(bt_sumar);
        panel_surd.add(bt_restar);
        panel_surd.add(bt_multiplicar);
        panel_surd.add(bt_dividir);
        panel_surd.add(bt_resultado);
        return panel_surd;
    }

    private void acciones() {
        bt_extension.addActionListener(this);
        bt_0.addActionListener(this);
        bt_1.addActionListener(this);
        bt_2.addActionListener(this);
        bt_3.addActionListener(this);
        bt_4.addActionListener(this);
        bt_5.addActionListener(this);
        bt_6.addActionListener(this);
        bt_7.addActionListener(this);
        bt_8.addActionListener(this);
        bt_9.addActionListener(this);
        bt_bog.addActionListener(this);
        bt_bol.addActionListener(this);
        bt_raiz.addActionListener(this);
        bt_coseno.addActionListener(this);
        bt_seno.addActionListener(this);
        bt_exponencial.addActionListener(this);
        bt_porciento.addActionListener(this);
        bt_multiplicar.addActionListener(this);
        bt_ans.addActionListener(this);
        bt_sumar.addActionListener(this);
        bt_resultado.addActionListener(this);
        bt_restar.addActionListener(this);
        bt_dividir.addActionListener(this);
        bt_tan.addActionListener(this);
        bt_log.addActionListener(this);

    }

    private Component panelDerecho() {
        panel_oeste.setLayout(new GridLayout(5, 1));
        panel_oeste.add(bt_coseno);
        panel_oeste.add(bt_seno);
        panel_oeste.add(bt_tan);
        panel_oeste.add(bt_exponencial);
        panel_oeste.add(bt_log);
        return panel_oeste;
    }

}
