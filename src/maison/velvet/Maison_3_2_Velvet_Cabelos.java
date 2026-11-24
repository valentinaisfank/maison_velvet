/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maison.velvet;

import entidades.Boneca;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JFrame;

/**
 *
 * @author Escola João XXIII
 */
public class Maison_3_2_Velvet_Cabelos extends javax.swing.JFrame {

    JLabel cabelo1 = new JLabel();
    JLabel cabelo2 = new JLabel();
    JLabel cabelo3 = new JLabel();
    JLabel cabelo4 = new JLabel();
    JLabel cabelo5 = new JLabel();
    JLabel cabelo6 = new JLabel();
    JLabel cabelo7 = new JLabel();
    JLabel cabelo8 = new JLabel();
    JLabel cabelo9 = new JLabel();
    JLabel cabelo10 = new JLabel();
    JLabel voltar = new JLabel();

    JLabel c1 = new JLabel();
    JLabel c2 = new JLabel();
    JLabel c3 = new JLabel();
    JLabel c4 = new JLabel();
    JLabel c5 = new JLabel();
    JLabel c6 = new JLabel();
    JLabel c7 = new JLabel();
    JLabel c8 = new JLabel();
    JLabel c9 = new JLabel();
    JLabel c10 = new JLabel();

    JLabel peleEscolhida = new JLabel();
    List<JLabel> vestimenta = new ArrayList<>();
    JLabel cabeloEscolhido = new JLabel();
    Boneca boneca = new Boneca();

    ImageIcon cebelo_um = new ImageIcon("src/imagens/cabelos/um.png");
    ImageIcon cabelo_dois = new ImageIcon("src/imagens/cabelos/dois.png");
    ImageIcon cabelo_tres = new ImageIcon("src/imagens/cabelos/tres.png");
    ImageIcon cabelo_quatro = new ImageIcon("src/imagens/cabelos/quatro.png");
    ImageIcon cabelo_cinco = new ImageIcon("src/imagens/cabelos/cinco.png");
    ImageIcon cabelo_seis = new ImageIcon("src/imagens/cabelos/seis.png");
    ImageIcon cabelo_sete = new ImageIcon("src/imagens/cabelos/sete.png");
    ImageIcon cabelo_oito = new ImageIcon("src/imagens/cabelos/oito.png");
    ImageIcon cabelo_nove = new ImageIcon("src/imagens/cabelos/nove.png");
    ImageIcon cabelo_dez = new ImageIcon("src/imagens/cabelos/dez.png");

    /**
     * Creates new form Maison_Velvet_Cabelos
     */
    public Maison_3_2_Velvet_Cabelos(Boneca boneca) {
        this.boneca = boneca;

        this.peleEscolhida = peleEscolhida;
        this.cabeloEscolhido = cabeloEscolhido;

        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_cabelo.png");
        painelFundo.setLayout(null);
        setUndecorated(false);

        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(painelFundo);

        criarLabel(330, 140, 180, 210, cabelo1, "cabelo1");
        criarLabel(530, 140, 180, 210, cabelo2, "cabelo2");
        criarLabel(720, 140, 180, 210, cabelo3, "cabelo3");
        criarLabel(920, 140, 180, 210, cabelo4, "cabelo4");
        criarLabel(1100, 140, 180, 210, cabelo5, "cabelo5");
        criarLabel(330, 390, 180, 210, cabelo6, "cabelo6");
        criarLabel(530, 390, 180, 210, cabelo7, "cabelo7");
        criarLabel(720, 390, 180, 210, cabelo8, "cabelo8");
        criarLabel(920, 390, 180, 210, cabelo9, "cabelo9");
        criarLabel(1100, 390, 180, 210, cabelo10, "cabelo10");
        criarLabel(95, 590, 245, 75, voltar, "voltar");
        this.add(cabelo1);
        this.add(cabelo2);
        this.add(cabelo3);
        this.add(cabelo4);
        this.add(cabelo5);
        this.add(cabelo6);
        this.add(cabelo7);
        this.add(cabelo8);
        this.add(cabelo9);
        this.add(cabelo10);
        this.add(voltar);

        mostrarBoneca(boneca);

        criarLabelImagens(142, -92, 400, 800, c1, cebelo_um);
        criarLabelImagens(142, -92, 400, 800, c2, cabelo_dois);
        criarLabelImagens(142, -92, 400, 800, c3, cabelo_tres);
        criarLabelImagens(145, -92, 400, 800, c4, cabelo_quatro);
        criarLabelImagens(145, -92, 400, 800, c5, cabelo_cinco);
        criarLabelImagens(142, -92, 400, 800, c6, cabelo_seis);
        criarLabelImagens(142, -92, 400, 800, c7, cabelo_sete);
        criarLabelImagens(145, -92, 400, 800, c8, cabelo_oito);
        criarLabelImagens(142, -92, 400, 800, c9, cabelo_nove);
        criarLabelImagens(142, -90, 400, 800, c10, cabelo_dez);

        this.add(this.peleEscolhida);
        this.add(this.cabeloEscolhido);
        if (vestimenta != null) {
            for (JLabel v : vestimenta) {
                this.add(v);
            }
        }

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        revalidate();
        repaint();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        revalidate();
        repaint();
    }

    public void criarLabelImagens(int x, int y, int largura, int altura, JLabel label, ImageIcon imagem) {
        label.setText("  ");
        label.setOpaque(false);
        label.setBounds(x, y, largura, altura);
        Image imagemRedimensionada = imagem.getImage()
                .getScaledInstance(550, 600, Image.SCALE_SMOOTH);
//        label.setHorizontalAlignment(JLabel.CENTER);
        label.setIcon(new ImageIcon(imagemRedimensionada));
    }

    public void criarLabel(int x, int y, int largura, int altura, JLabel label, String op) {
        label.setText("  ");
        label.setOpaque(false);
        label.setBounds(x, y, largura, altura);
//        label.setBounds(x, y, 232, 90);
        label.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                remove(c1);
                remove(c2);
                remove(c3);
                remove(c4);
                remove(c5);
                remove(c6);
                remove(c7);
                remove(c8);
                remove(c9);
                remove(c10);
                switch (op) {
                    case "voltar":
                        dispose();
                        new Maison_2_Velvet_Escolha_Inicial(false, boneca).setVisible(true);
                        break;
                    case "cabelo1":
                        cabeloEscolhido = c1;
                        break;
                    case "cabelo2":
                        cabeloEscolhido = c2;
                        break;
                    case "cabelo3":
                        cabeloEscolhido = c3;
                        break;
                    case "cabelo4":
                        cabeloEscolhido = c4;
                        break;
                    case "cabelo5":
                        cabeloEscolhido = c5;
                        break;
                    case "cabelo6":
                        cabeloEscolhido = c6;
                        break;
                    case "cabelo7":
                        cabeloEscolhido = c7;
                        break;
                    case "cabelo8":
                        cabeloEscolhido = c8;
                        break;
                    case "cabelo9":
                        cabeloEscolhido = c9;
                        break;
                    case "cabelo10":
                        cabeloEscolhido = c10;
                        break;
                }
                if ("voltar".equals(op)) {
                    return;
                }
                boneca.setCabelo(cabeloEscolhido);
                mostrarBoneca(boneca);
            }
        });

    }

    public void mostrarBoneca(Boneca boneca) {
        this.add(boneca.getCabelo());
        this.add(boneca.getBolsa());
        this.add(boneca.getAcessorio());
        this.add(boneca.getRoupaS());
        this.add(boneca.getRoupaI());
        this.add(boneca.getVestido());
        this.add(boneca.getConjunto());
        this.add(boneca.getPele());
        revalidate();
        repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
