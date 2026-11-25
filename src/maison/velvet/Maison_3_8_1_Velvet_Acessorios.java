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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Escola João XXIII
 */
public class Maison_3_8_1_Velvet_Acessorios extends javax.swing.JFrame {

    JLabel oculos_quadrado = new JLabel();
    JLabel oculos_coracao = new JLabel();
    JLabel oculos_redondo = new JLabel();
    JLabel chapeu_palha = new JLabel();
    JLabel boina_rosa = new JLabel();
    JLabel tiara_branca = new JLabel();
    JLabel voltar = new JLabel();
    JLabel proximo = new JLabel();

    JLabel acessorioEscolhido = new JLabel();

    JLabel oquadrado = new JLabel();
    JLabel ocoracao = new JLabel();
    JLabel oredondo = new JLabel();
    JLabel cpalha = new JLabel();
    JLabel brosa = new JLabel();
    JLabel tbranca = new JLabel();

    Boneca boneca = new Boneca();

    ImageIcon oq = new ImageIcon("src/imagens/acessorios/oculos.png");
    ImageIcon oc = new ImageIcon("src/imagens/acessorios/coracao.png");
    ImageIcon or = new ImageIcon("src/imagens/acessorios/redondo.png");
    ImageIcon cp = new ImageIcon("src/imagens/acessorios/chapeu.png");
    ImageIcon br = new ImageIcon("src/imagens/acessorios/boina.png");
    ImageIcon tb = new ImageIcon("src/imagens/acessorios/tiara.png");

    /**
     * Creates new form Maison_10_Velvet_Acessorios
     */
    public Maison_3_8_1_Velvet_Acessorios(Boneca boneca) {

        this.boneca = boneca;

        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_acessorios_um.png");
        painelFundo.setLayout(null);
        setUndecorated(false);

        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(painelFundo);

        criarLabel(460, 180, 220, 150, oculos_quadrado, "oculos_quadrado");
        criarLabel(770, 180, 220, 150, oculos_coracao, "oculos_coracao");
        criarLabel(1080, 180, 220, 150, oculos_redondo, "oculos_redondo");
        criarLabel(460, 400, 220, 150, chapeu_palha, "chapeu_palha");
        criarLabel(770, 400, 220, 150, boina_rosa, "boina_rosa");
        criarLabel(1080, 400, 220, 150, tiara_branca, "tiara_branca");
        criarLabel(120, 590, 250, 80, voltar, "voltar");
        criarLabel(1180, 590, 100, 80, proximo, "proximo");

        this.add(oculos_quadrado);
        this.add(oculos_coracao);
        this.add(oculos_redondo);
        this.add(chapeu_palha);
        this.add(boina_rosa);
        this.add(tiara_branca);
        this.add(voltar);
        this.add(proximo);

        criarLabelImagens(120, -160, 400, 500, oquadrado, oq);
        criarLabelImagens(120, -160, 400, 500, ocoracao, oc);
        criarLabelImagens(120, -163, 400, 500, oredondo, or);
        criarLabelImagens(130, -175, 400, 500, cpalha, cp);
        criarLabelImagens(130, -170, 400, 500, brosa, br);
        criarLabelImagens(123, -165, 400, 500, tbranca, tb);

        mostrarBoneca(boneca);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        revalidate();
        repaint();
    }

    public void criarLabelImagens(int x, int y, int largura, int altura, JLabel label, ImageIcon imagem) {
        label.setText("  ");
        label.setOpaque(false);
        label.setBounds(x, y, largura, altura);
        Image imagemRedimensionada = imagem.getImage()
                .getScaledInstance(345, 200, Image.SCALE_SMOOTH);
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
                remove(oquadrado);
                remove(ocoracao);
                remove(oredondo);
                remove(cpalha);
                remove(brosa);
                remove(tbranca);
                remove(boneca.getAcessorio());
                switch (op) {
                    case "voltar":
                        dispose();
                        new Maison_2_Velvet_Escolha_Inicial(false, boneca).setVisible(true);
                        break;
                    case "proximo":
                        dispose();
                        new Maison_3_8_2_Velvet_Acessorios(boneca).setVisible(true);
                        break;
                    case "oculos_quadrado":
                        acessorioEscolhido = oquadrado;
                        break;
                    case "oculos_coracao":
                        acessorioEscolhido = ocoracao;
                        break;
                    case "oculos_redondo":
                        acessorioEscolhido = oredondo;
                        break;
                    case "chapeu_palha":
                        acessorioEscolhido = cpalha;
                        break;
                    case "boina_rosa":
                        acessorioEscolhido = brosa;
                        break;
                    case "tiara_branca":
                        acessorioEscolhido = tbranca;
                        break;
                }
                if ("voltar".equals(op) || "proximo".equals(op)) {
                    return;
                }
                boneca.setAcessorio(acessorioEscolhido);
                mostrarBoneca(boneca);
            }
        });
    }

    public void mostrarBoneca(Boneca boneca) {
        this.add(boneca.getAcessorio());
        this.add(boneca.getCabelo());
        this.add(boneca.getBolsa());
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
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
