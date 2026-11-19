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
public class Maison_3_9_Velvet_Bolsas extends javax.swing.JFrame {

    JLabel bolsa_rosa = new JLabel();
    JLabel bolsa_branca = new JLabel();
    JLabel bolsa_azul = new JLabel();
    JLabel bolsa_palha = new JLabel();
    JLabel bolsa_florida = new JLabel();
    JLabel bolsa_xadrez = new JLabel();
    JLabel voltar = new JLabel();
    
    JLabel brosa = new JLabel();
    JLabel bbranca = new JLabel();
    JLabel bazul = new JLabel();
    JLabel bpalha = new JLabel();
    JLabel bflorida = new JLabel();
    JLabel bxadrez = new JLabel();


    JLabel bolsaEscolhida = new JLabel();
    
    ImageIcon br = new ImageIcon();
    ImageIcon bb = new ImageIcon();
    ImageIcon ba = new ImageIcon();
    ImageIcon bp = new ImageIcon();
    ImageIcon bf = new ImageIcon();
    ImageIcon bx = new ImageIcon();

    Boneca boneca = new Boneca();

    /**
     * Creates new form Maison_3_9_Velvet_Bolsas
     */
    public Maison_3_9_Velvet_Bolsas(Boneca boneca) {
        this.boneca = boneca;
        
        //testando o git

        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_acessorios_um.png");
        painelFundo.setLayout(null);
        setUndecorated(false);

        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(painelFundo);

        criarLabel(460, 180, 220, 150, bolsa_rosa, "bolsa_rosa");
        criarLabel(770, 180, 220, 150, bolsa_branca, "bolsa_branca");
        criarLabel(1080, 180, 220, 150, bolsa_azul, "bolsa_azul");
        criarLabel(460, 400, 220, 150, bolsa_palha, "bolsa_palha");
        criarLabel(770, 400, 220, 150, bolsa_florida, "bolsa_florida");
        criarLabel(1080, 400, 220, 150, bolsa_xadrez, "bolsa_xadrez");
        criarLabel(120, 590, 250, 80, voltar, "voltar");

        this.add(bolsa_rosa);
        this.add(bolsa_branca);
        this.add(bolsa_azul);
        this.add(bolsa_palha);
        this.add(bolsa_florida);
        this.add(bolsa_xadrez);
        this.add(voltar);
        
        criarLabelImagens(155, 140, 400, 500, brosa, br);
        criarLabelImagens(155, 140, 400, 500, bbranca, bb);
        criarLabelImagens(155, 140, 400, 500, bazul, ba);
        criarLabelImagens(155, 140, 400, 500, bpalha, bp);
        criarLabelImagens(155, 140, 400, 500, bflorida, bf);
        criarLabelImagens(155, 140, 400, 500, bxadrez, bx);
        

        mostrarBoneca(boneca);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        revalidate();
        repaint();

    }
    
    public void criarLabelImagens(int x, int y, int largura, int altura, JLabel label, ImageIcon imagem) {
        label.setText("  ");
        label.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        label.setOpaque(false);
        label.setBounds(x, y, largura, altura);
        Image imagemRedimensionada = imagem.getImage()
                .getScaledInstance(958, 540, Image.SCALE_SMOOTH);
//        label.setHorizontalAlignment(JLabel.CENTER);
        label.setIcon(new ImageIcon(imagemRedimensionada));
    }

    public void criarLabel(int x, int y, int largura, int altura, JLabel label, String op) {
        label.setText("  ");
        label.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
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
                    case "voltar":
                        dispose();
                        new Maison_2_Velvet_Escolha_Inicial(false, boneca).setVisible(true);
                        break;
                    case "bolsa_rosa":
                        bolsaEscolhida = brosa;
                        break;
                    case "bolsa_branca":
                        bolsaEscolhida = bbranca;
                        break;
                    case "bolsa_azul":
                        bolsaEscolhida = bazul;
                        break;
                    case "bolsa_palha":
                        bolsaEscolhida = bpalha;
                        break;
                    case "bolsa_florida":
                        bolsaEscolhida = bflorida;
                        break;
                    case "bolsa_xadrez":
                        bolsaEscolhida = bxadrez;
                        break;
                }
                boneca.setVestido(bolsaEscolhida);
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
