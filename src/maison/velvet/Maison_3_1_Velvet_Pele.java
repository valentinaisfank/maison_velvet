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
public class Maison_3_1_Velvet_Pele extends javax.swing.JFrame {

    JLabel pele_um = new JLabel();
    JLabel pele_dois = new JLabel();
    JLabel pele_tres = new JLabel();
    JLabel pele_quatro = new JLabel();
    JLabel pele_cinco = new JLabel();
    JLabel voltar = new JLabel();

    JLabel boneca_0 = new JLabel();
    JLabel boneca_1 = new JLabel();
    JLabel boneca_2 = new JLabel();
    JLabel boneca_3 = new JLabel();
    JLabel boneca_4 = new JLabel();
    JLabel boneca_5 = new JLabel();

    JLabel peleEscolhida = new JLabel();

    ImageIcon boneca_pele_zero = new ImageIcon("src/imagens/bonecas/pele_0.png");
    ImageIcon boneca_pele_um = new ImageIcon("src/imagens/bonecas/pele_1.png");
    ImageIcon boneca_pele_dois = new ImageIcon("src/imagens/bonecas/pele_2.png");
    ImageIcon boneca_pele_tres = new ImageIcon("src/imagens/bonecas/pele_3.png");
    ImageIcon boneca_pele_quatro = new ImageIcon("src/imagens/bonecas/pele_4.png");
    ImageIcon boneca_pele_cinco = new ImageIcon("src/imagens/bonecas/pele_5.png");

    Boneca boneca = new Boneca();

    public Maison_3_1_Velvet_Pele(Boneca boneca) {
        this.boneca = boneca;

        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_tom_pele.png");
        painelFundo.setLayout(null);
        setUndecorated(false);

        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(painelFundo);

        criarLabel(455, 200, 232, 170, pele_um, "pele um");
        criarLabel(750, 200, 232, 170, pele_dois, "pele dois");
        criarLabel(1050, 200, 232, 170, pele_tres, "pele tres");
        criarLabel(600, 410, 232, 170, pele_quatro, "pele quatro");
        criarLabel(915, 410, 232, 170, pele_cinco, "pele cinco");
        criarLabel(130, 580, 320, 80, voltar, "voltar");
        criarLabelImagens(110, -120, 400, 800, boneca_0, boneca_pele_zero);
        criarLabelImagens(110, -120, 400, 800, boneca_1, boneca_pele_um);
        criarLabelImagens(110, -120, 400, 800, boneca_2, boneca_pele_dois);
        criarLabelImagens(110, -120, 400, 800, boneca_3, boneca_pele_tres);
        criarLabelImagens(110, -120, 400, 800, boneca_4, boneca_pele_quatro);
        criarLabelImagens(110, -120, 400, 800, boneca_5, boneca_pele_cinco);

        this.add(pele_um);
        this.add(pele_dois);
        this.add(pele_tres);
        this.add(pele_quatro);
        this.add(pele_cinco);
        this.add(voltar);
        
        
        mostrarBoneca(boneca);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        revalidate();
        repaint();
    }

    public void criarLabelImagens(int x, int y, int largura, int altura, JLabel label, ImageIcon imagem) {
        label.setText(" ");
        label.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        label.setOpaque(false);
        label.setBounds(x, y, largura, altura);
        Image imagemRedimensionada = imagem.getImage()
                .getScaledInstance(500, 550, Image.SCALE_SMOOTH);
//        label.setHorizontalAlignment(JLabel.CENTER);
        label.setIcon(new ImageIcon(imagemRedimensionada));
    }

    public void criarLabel(int x, int y, int largura, int altura, JLabel label, String op) {
        label.setText(" ");
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
                remove(boneca_0);
                remove(boneca_1);
                remove(boneca_2);
                remove(boneca_3);
                remove(boneca_4);
                remove(boneca_5);
                switch (op) {
                    case "voltar":
                        dispose();
                        new Maison_2_Velvet_Escolha_Inicial(false, boneca).setVisible(true);
                        break;
                    case "pele um":
                        add(boneca_1);
                        peleEscolhida = boneca_1;
                        revalidate();
                        repaint();
                        break;
                    case "pele dois":
                        add(boneca_2);
                        peleEscolhida = boneca_2;
                        revalidate();
                        repaint();
                        break;
                    case "pele tres":
                        add(boneca_3);
                        peleEscolhida = boneca_3;
                        revalidate();
                        repaint();
                        break;
                    case "pele quatro":
                        add(boneca_4);
                        peleEscolhida = boneca_4;
                        revalidate();
                        repaint();
                        break;
                    case "pele cinco":
                        add(boneca_5);
                        peleEscolhida = boneca_5;
                        revalidate();
                        repaint();
                        break;
                }
                removerBoneca(boneca);
                boneca.setPele(peleEscolhida);
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
    
        public void removerBoneca(Boneca boneca) {
        this.remove(boneca.getCabelo());
        this.remove(boneca.getBolsa());
        this.remove(boneca.getAcessorio());
        this.remove(boneca.getRoupaS());
        this.remove(boneca.getRoupaI());
        this.remove(boneca.getVestido());
        this.remove(boneca.getConjunto());
        this.remove(boneca.getPele());
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
