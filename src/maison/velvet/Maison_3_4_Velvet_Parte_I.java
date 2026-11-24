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
public class Maison_3_4_Velvet_Parte_I extends javax.swing.JFrame {

    JLabel calca_preta = new JLabel();
    JLabel calca_bege = new JLabel();
    JLabel calca_jeans = new JLabel();
    JLabel calca_cinza = new JLabel();
    JLabel shorts_preto = new JLabel();
    JLabel saia_branca = new JLabel();
    JLabel shorts_jeans = new JLabel();
    JLabel saia_rosa = new JLabel();
    JLabel voltar = new JLabel();

    JLabel roupaDeBaixo = new JLabel();

    JLabel cpreta = new JLabel();
    JLabel cbege = new JLabel();
    JLabel cjeans = new JLabel();
    JLabel ccinza = new JLabel();
    JLabel spreto = new JLabel();
    JLabel sbranca = new JLabel();
    JLabel sjeans = new JLabel();
    JLabel srosa = new JLabel();

    Boneca boneca = new Boneca();

    ImageIcon cp = new ImageIcon("src/imagens/calca/preta.png");
    ImageIcon cb = new ImageIcon("src/imagens/calca/bege.png");
    ImageIcon cj = new ImageIcon("src/imagens/calca/jeans.png");
    ImageIcon cc = new ImageIcon("src/imagens/calca/cinza.png");
    ImageIcon sp = new ImageIcon("src/imagens/calca/preto.png");
    ImageIcon sb = new ImageIcon("src/imagens/calca/branco.png");
    ImageIcon sj = new ImageIcon("src/imagens/calca/shorts.png");
    ImageIcon sr = new ImageIcon("src/imagens/calca/rosa.png");

    public Maison_3_4_Velvet_Parte_I(Boneca boneca) {
        this.boneca = boneca;

        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_partes_i.png");
        painelFundo.setLayout(null);
        setUndecorated(false);
        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(painelFundo);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        criarLabel(380, 170, 220, 330, calca_preta, "calca_preta");
        criarLabel(630, 170, 220, 330, calca_bege, "calca_bege");
        criarLabel(880, 170, 220, 330, calca_jeans, "calca_jeans");
        criarLabel(1110, 170, 220, 330, calca_cinza, "calca_cinza");
        criarLabel(380, 520, 220, 160, shorts_preto, "shorts_preto");
        criarLabel(630, 520, 220, 160, saia_branca, "saia_branca");
        criarLabel(880, 520, 220, 160, shorts_jeans, "shorts_jeans");
        criarLabel(1110, 520, 220, 160, saia_rosa, "saia_rosa");
        criarLabel(100, 590, 245, 75, voltar, "voltar");

        this.add(calca_bege);
        this.add(calca_preta);
        this.add(calca_jeans);
        this.add(calca_cinza);
        this.add(shorts_preto);
        this.add(saia_branca);
        this.add(shorts_jeans);
        this.add(saia_rosa);
        this.add(voltar);

        criarLabelImagens(90, 150, 400, 500, cpreta, cp);
        criarLabelImagens(90, 150, 400, 500, cbege, cb);
        criarLabelImagens(90, 150, 400, 500, cjeans, cj);
        criarLabelImagens(90, 150, 400, 500, ccinza, cc);
        criarLabelImagens(90, 150, 350, 500, spreto, sp);
        criarLabelImagens(90, 150, 400, 500, sbranca, sb);
        criarLabelImagens(90, 140, 400, 500, sjeans, sj);
        criarLabelImagens(90, 150, 400, 500, srosa, sr);

        mostrarBoneca(boneca);
        revalidate();
        repaint();

    }

    public void criarLabelImagens(int x, int y, int largura, int altura, JLabel label, ImageIcon imagem) {
        label.setText("  ");
        label.setOpaque(false);
        label.setBounds(x, y, largura, altura);
        Image imagemRedimensionada = imagem.getImage()
                .getScaledInstance(490, 550, Image.SCALE_SMOOTH);
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
                remove(cpreta);
                remove(cbege);
                remove(cjeans);
                remove(ccinza);
                remove(spreto);
                remove(sbranca);
                remove(sjeans);
                remove(srosa);

                switch (op) {
                    case "voltar":
                        new Maison_2_Velvet_Escolha_Inicial(false, boneca).setVisible(true);
                        dispose();
                        break;
                    case "calca_preta":
                        roupaDeBaixo = cpreta;
                        break;
                    case "calca_bege":
                        roupaDeBaixo = cbege;
                        break;
                    case "calca_jeans":
                        roupaDeBaixo = cjeans;
                        break;
                    case "calca_cinza":
                        roupaDeBaixo = ccinza;
                        break;
                    case "shorts_preto":
                        roupaDeBaixo = spreto;
                        break;
                    case "saia_branca":
                        roupaDeBaixo = sbranca;
                        break;
                    case "shorts_jeans":
                        roupaDeBaixo = sjeans;
                        break;
                    case "saia_rosa":
                        roupaDeBaixo = srosa;
                        break;
                }
                if ("voltar".equals(op)) {
                    return;
                }
                remove(boneca.getVestido());
                remove(boneca.getConjunto());
                boneca.setRoupaI(roupaDeBaixo);
                boneca.setVestido(new JLabel());
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
