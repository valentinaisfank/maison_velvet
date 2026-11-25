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

/**
 *
 * @author Escola João XXIII
 */
public class Maison_2_Velvet_Escolha_Inicial extends javax.swing.JFrame {

    JLabel pele_0 = new JLabel();
    ImageIcon boneca_pele_zero = new ImageIcon("src/imagens/bonecas/pele_0.png");

    JLabel pele = new JLabel();
    JLabel cabelo = new JLabel();
    JLabel roupas_s = new JLabel();
    JLabel roupas_i = new JLabel();
    JLabel vestidos = new JLabel();
    JLabel macacao = new JLabel();
    JLabel calsado = new JLabel();
    JLabel bolsa = new JLabel();
    JLabel pronto = new JLabel();
    JLabel sair = new JLabel();
    JLabel acessorios = new JLabel();

    JLabel peleEscolhida = new JLabel();
    JLabel cabeloEscolhido = new JLabel();
    List<JLabel> vestimenta = new ArrayList<>();

    Boneca boneca = new Boneca();

    public Maison_2_Velvet_Escolha_Inicial(boolean ehInicio, Boneca boneca) {
        this.boneca = boneca;

        this.peleEscolhida = peleEscolhida;
        this.remove(peleEscolhida);
        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_escolha.png");
        painelFundo.setLayout(null);
        //setUndecorated(false);

        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        setContentPane(painelFundo);
        if (ehInicio || this.boneca.getPele().getIcon() == null) {
            criarLabelImagens(125, -120, 410, 800, pele_0, boneca_pele_zero);
            this.boneca.setPele(pele_0);
        }

        criarLabel(470, 215, 232, 90, pele, "pele");
        criarLabel(770, 215, 232, 90, cabelo, "cabelo");
        criarLabel(1060, 215, 232, 90, roupas_s, "roupas_superiores");
        criarLabel(470, 360, 232, 90, roupas_i, "roupas_inferiores");
        criarLabel(770, 360, 232, 90, vestidos, "vestidos");
        criarLabel(1060, 360, 232, 90, macacao, "macacao");
        criarLabel(470, 490, 232, 90, calsado, "calsado");
        criarLabel(770, 490, 232, 90, acessorios, "acessorio");
        criarLabel(1060, 490, 232, 90, bolsa, "bolsa");
        criarLabel(680, 45, 420, 120, pronto, "pronto");
        criarLabel(1250, 30, 80, 80, sair, "sair");
        this.add(pele);
        this.add(cabelo);
        this.add(roupas_s);
        this.add(roupas_i);
        this.add(vestidos);
        this.add(macacao);
        this.add(calsado);
        this.add(acessorios);
        this.add(bolsa);
        this.add(pronto);
        this.add(sair);

        mostrarBoneca(this.boneca);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    public void criarLabelImagens(int x, int y, int largura, int altura, JLabel label, ImageIcon imagem) {
        label.setText("  ");
        label.setOpaque(false);
        label.setBounds(x, y, largura, altura);
        Image imagemRedimensionada = imagem.getImage()
                .getScaledInstance(200, 550, Image.SCALE_SMOOTH);
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
                switch (op) {
                    case "pele":
                        dispose();
                        new Maison_3_1_Velvet_Pele(boneca).setVisible(true);
                        break;
                    case "cabelo":
                        dispose();
                        new Maison_3_2_Velvet_Cabelos(boneca).setVisible(true);
                        break;
                    case "roupas_superiores":
                        dispose();
                        new Maison_3_3Velvet_Parte_S(boneca).setVisible(true);
                        break;
                    case "roupas_inferiores":
                        dispose();
                        new Maison_3_4_Velvet_Parte_I(boneca).setVisible(true);
                        break;
                    case "vestidos":
                        dispose();
                        new Maison_3_5_Velvet_Vestido(boneca).setVisible(true);
                        break;
                    case "macacao":
                        dispose();
                        new Maison_3_6_Velvet_Conjuntos(boneca).setVisible(true);
                        break;
                    case "calsado":
                        dispose();
                        new Maison_3_7_Velvet_Sapatos(boneca).setVisible(true);
                        break;
                    case "acessorio":
                        dispose();
                        new Maison_3_8_1_Velvet_Acessorios(boneca).setVisible(true);
                        break;
                    case "bolsa":
                        dispose();
                        new Maison_3_9_Velvet_Bolsas(boneca).setVisible(true);
                        break;
                    case "sair":
                        System.exit(0);
                        break;
                    case "pronto":
                        dispose();
                        new Maison_4_Velvet_Pronto(boneca).setVisible(true);
                        break;
                }
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
        this.add(boneca.getSapato());
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
            .addGap(0, 2072, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
