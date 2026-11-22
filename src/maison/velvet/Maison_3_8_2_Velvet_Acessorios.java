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
public class Maison_3_8_2_Velvet_Acessorios extends javax.swing.JFrame {

    JLabel laco_rosa = new JLabel();
    JLabel coracao_xadres = new JLabel();
    JLabel flor_azul = new JLabel();
    JLabel flor_rosa = new JLabel();
    JLabel leque_florido= new JLabel();
    JLabel gargantilha_branca = new JLabel();
    JLabel voltar = new JLabel();
    JLabel proximo = new JLabel();

    JLabel acessorioEscolhido = new JLabel();;
    
    JLabel lrosa = new JLabel();
    JLabel cxadres = new JLabel();
    JLabel fazul = new JLabel();
    JLabel frosa = new JLabel();
    JLabel lflorido= new JLabel();
    JLabel gbranca = new JLabel();

    Boneca boneca = new Boneca();
    
    ImageIcon lr = new ImageIcon("src/imagens/acessorios/laco.png");
    ImageIcon cx = new ImageIcon("src/imagens/acessorios/xadres.png");
    ImageIcon fa = new ImageIcon("src/imagens/acessorios/azul.png");
    ImageIcon fr = new ImageIcon("src/imagens/acessorios/rosa.png");
    ImageIcon lf = new ImageIcon("src/imagens/acessorios/leque.png");
    ImageIcon gb = new ImageIcon("src/imagens/acessorios/colar.png");

    /**
     * Creates new form Maison_10_Velvet_Acessorios
     */
    public Maison_3_8_2_Velvet_Acessorios(Boneca boneca) {

        this.boneca = boneca;


        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_acessorios_dois.png");
        painelFundo.setLayout(null);
        setUndecorated(false);

        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(painelFundo);

        criarLabel(460, 180, 220, 150, laco_rosa, "laco_rosa");
        criarLabel(770, 180, 220, 150, coracao_xadres, "coracao_xadres");
        criarLabel(1080, 180, 220, 150, flor_azul, "flor_azul");
        criarLabel(460, 400, 220, 150, flor_rosa, "flor_rosa");
        criarLabel(770, 400, 220, 150, leque_florido, "leque_florido");
        criarLabel(1080, 400, 220, 150, gargantilha_branca, "gargantilha_branca");
        criarLabel(120, 590, 250, 80, voltar, "voltar");
        criarLabel(1050, 590, 100, 80, proximo, "proximo");

        this.add(laco_rosa);
        this.add(coracao_xadres);
        this.add(flor_azul);
        this.add(flor_rosa);
        this.add(leque_florido);
        this.add(gargantilha_branca);
        this.add(voltar);
        this.add(proximo);
        
        criarLabelImagens(155, 140, 400, 500, lrosa, lr);
        criarLabelImagens(155, 140, 400, 500, cxadres, cx);
        criarLabelImagens(155, 140, 400, 500, fazul, fa);
        criarLabelImagens(155, 140, 400, 500, frosa, fr);
        criarLabelImagens(155, 140, 400, 500, lflorido, lf);
        criarLabelImagens(155, 140, 400, 500, gbranca, gb);

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

                    case "proximo":
                        dispose();
                        new Maison_3_8_1_Velvet_Acessorios(boneca).setVisible(true);
                        break;
                    case "laco_rosa":
                            acessorioEscolhido = lrosa;
                            break;
                    case "coracao_xadres":
                        acessorioEscolhido = cxadres;
                        break;
                    case "flor_azul":
                        acessorioEscolhido = fazul;
                        break;
                    case "flor_rosa":
                        acessorioEscolhido = frosa;
                        break;
                    case "leque_florido":
                        acessorioEscolhido = lflorido;
                        break;
                    case "gargantilha_branca":
                        acessorioEscolhido = gbranca;
                        break;
                             
                }
                boneca.setAcessorio(acessorioEscolhido);
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
