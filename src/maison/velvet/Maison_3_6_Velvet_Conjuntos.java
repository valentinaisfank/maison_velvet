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
public class Maison_3_6_Velvet_Conjuntos extends javax.swing.JFrame {

    JLabel macacao_branco = new JLabel();
    JLabel macacao_verde = new JLabel();
    JLabel macacao_rosa = new JLabel();
    JLabel macacao_azul = new JLabel();
    JLabel voltar = new JLabel();

    JLabel conjuntoEscolhido = new JLabel();

    JLabel mbranco = new JLabel();
    JLabel mverde = new JLabel();
    JLabel mrosa = new JLabel();
    JLabel mazul = new JLabel();

    ImageIcon mb = new ImageIcon("src/imagens/conjunto/branco.png");
    ImageIcon mv = new ImageIcon("src/imagens/conjunto/verde.png");
    ImageIcon mr = new ImageIcon("src/imagens/conjunto/rosa.png");
    ImageIcon ma = new ImageIcon("src/imagens/conjunto/azul.png");

    Boneca boneca = new Boneca();

    /**
     * Creates new form Maison_8_Velvet_Conjuntos
     */
    public Maison_3_6_Velvet_Conjuntos(Boneca boneca) {
        this.boneca = boneca;

        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_conjuntos.png");
        painelFundo.setLayout(null);
        setUndecorated(false);

        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(painelFundo);

        criarLabel(370, 190, 230, 430, macacao_branco, "branco");
        criarLabel(620, 190, 230, 430, macacao_verde, "verde");
        criarLabel(870, 190, 230, 430, macacao_rosa, "rosa");
        criarLabel(1110, 190, 230, 430, macacao_azul, "azul");
        criarLabel(100, 590, 250, 80, voltar, "voltar");

        this.add(macacao_branco);
        this.add(macacao_verde);
        this.add(macacao_rosa);
        this.add(macacao_azul);
        this.add(voltar);

        criarLabelImagens(110, -15, 400, 600, mbranco, mb);
        criarLabelImagens(108,-25, 400, 600, mverde, mv);
        criarLabelImagens(110,-20, 400, 600, mrosa, mr);
        criarLabelImagens(110, -20, 400, 600, mazul, ma);

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
                .getScaledInstance(500, 550, Image.SCALE_SMOOTH);
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
                remove (mbranco);
                remove (mverde);
                remove (mrosa);
                remove (mazul);
                switch (op) {
                    case "voltar":
                        dispose();
                        new Maison_2_Velvet_Escolha_Inicial(false, boneca).setVisible(true);
                        break;
                    case "branco":
                        conjuntoEscolhido = mbranco;
                        break;
                    case "verde":
                        conjuntoEscolhido = mverde;
                        break;
                    case "rosa":
                        conjuntoEscolhido = mrosa;
                        break;
                    case "azul":
                        conjuntoEscolhido = mazul;
                        break;

                }
                boneca.setVestido(conjuntoEscolhido);
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
