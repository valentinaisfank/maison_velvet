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
public class Maison_3_5_Velvet_Vestido extends javax.swing.JFrame {

    JLabel vestido_amarelo = new JLabel();
    JLabel vestido_branco = new JLabel();
    JLabel vestido_verde = new JLabel();
    JLabel vestido_rosa = new JLabel();
    JLabel voltar = new JLabel();

    JLabel amarelo = new JLabel();
    JLabel branco = new JLabel();
    JLabel rosa = new JLabel();
    JLabel verde = new JLabel();

    JLabel vestidoEscolhido = new JLabel();

    Boneca boneca = new Boneca();

    ImageIcon vestidoamarelo = new ImageIcon("src/imagens/vestidos/amarelo.png");
    ImageIcon vestidobranco = new ImageIcon("src/imagens/vestidos/branco.png");
    ImageIcon vestidoverde = new ImageIcon("src/imagens/vestidos/verde.png");
    ImageIcon vestidorosa = new ImageIcon("src/imagens/vestidos/rosa.png");

    
    public Maison_3_5_Velvet_Vestido(Boneca boneca) {
        this.boneca = boneca;

        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_vestido.png");
        painelFundo.setLayout(null);
        setUndecorated(false);
        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(painelFundo);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        revalidate();
        repaint();
        initComponents();

        criarLabel(380, 250, 220, 400, vestido_amarelo, "vestido_amarelo");
        criarLabel(620, 250, 220, 400, vestido_branco, "vestido_branco");
        criarLabel(880, 250, 220, 400, vestido_verde, "vestido_verde");
        criarLabel(1120, 250, 220, 400, vestido_rosa, "vestido_rosa");
        criarLabel(100, 590, 245, 75, voltar, "voltar");
        this.add(vestido_amarelo);
        this.add(vestido_branco);
        this.add(vestido_verde);
        this.add(vestido_rosa);
        this.add(voltar);

        mostrarBoneca(boneca);

        criarLabelImagens(110, 75, 350, 450, amarelo, vestidoamarelo);
        criarLabelImagens(110, 70, 350, 450, branco, vestidobranco);
        criarLabelImagens(110, 70, 350, 450, verde, vestidoverde);
        criarLabelImagens(110, 70, 350, 450, rosa, vestidorosa);

    }

    public void criarLabelImagens(int x, int y, int largura, int altura, JLabel label, ImageIcon imagem) {
        label.setText("  ");
        label.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        label.setOpaque(false);
        label.setBounds(x, y, largura, altura);
        Image imagemRedimensionada = imagem.getImage()
                .getScaledInstance(505, 650, Image.SCALE_SMOOTH);
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
                remove(amarelo);
                remove(branco);
                remove(rosa);
                remove(verde);
                switch (op) {
                    case "voltar":
                        dispose();
                        new Maison_2_Velvet_Escolha_Inicial(false, boneca).setVisible(true);
                        break;
                    case "vestido_amarelo":
                        vestidoEscolhido = amarelo;
                        break;
                    case "vestido_branco":
                        vestidoEscolhido = branco;
                        break;
                    case "vestido_verde":
                        vestidoEscolhido = verde;
                        break;
                    case "vestido_rosa":
                        vestidoEscolhido = rosa;
                        break;

                }
                boneca.setVestido(vestidoEscolhido);
                boneca.setRoupaI(new JLabel());
                boneca.setConjunto(new JLabel());
                
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
