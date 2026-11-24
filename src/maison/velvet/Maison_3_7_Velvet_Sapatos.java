/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maison.velvet;

import entidades.Boneca;
import java.awt.Color;
import java.awt.Component;
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
public class Maison_3_7_Velvet_Sapatos extends javax.swing.JFrame {

    JLabel tenis_rosa = new JLabel();
    JLabel tenis_allstar = new JLabel();
    JLabel salto_branco = new JLabel();
    JLabel salto_preto = new JLabel();
    JLabel chinelo_branco = new JLabel();
    JLabel chinelo_preto = new JLabel();
    JLabel bota_cowboy = new JLabel();
    JLabel bota_preta = new JLabel();
    JLabel tenis_branco = new JLabel();
    JLabel tenis_preto = new JLabel();
    JLabel crocs = new JLabel();
    JLabel coturno = new JLabel();
    JLabel voltar = new JLabel();

   
    JLabel sapatoEscolhido = new JLabel();
    
    JLabel trosa = new JLabel();
    JLabel tallstar = new JLabel();
    JLabel sbranco = new JLabel();
    JLabel spreto = new JLabel();
    JLabel cbranco = new JLabel();
    JLabel cpreto = new JLabel();
    JLabel bcowboy = new JLabel();
    JLabel bpreta = new JLabel();
    JLabel tbranco = new JLabel();
    JLabel tpreto = new JLabel();
    JLabel croc = new JLabel();
    JLabel coturn = new JLabel();
    
    Boneca boneca = new Boneca();
    
    ImageIcon tr = new ImageIcon("src/imagens/sapatos/rosa.png");
    ImageIcon tas = new ImageIcon("src/imagens/sapatos/allstar.png");
    ImageIcon sb = new ImageIcon("src/imagens/sapatos/sandalia.png");
    ImageIcon sp = new ImageIcon("src/imagens/sapatos/social.png");
    ImageIcon cb = new ImageIcon("src/imagens/sapatos/chinelo.png");
    ImageIcon cp = new ImageIcon("src/imagens/sapatos/vermelho.png");
    ImageIcon bc = new ImageIcon("src/imagens/sapatos/bota.png");
    ImageIcon bp = new ImageIcon("src/imagens/sapatos/marrom.png");
    ImageIcon tb = new ImageIcon("src/imagens/sapatos/sapatilha.png");
    ImageIcon tp = new ImageIcon("src/imagens/sapatos/branco.png");
    ImageIcon cr = new ImageIcon("src/imagens/sapatos/tenis.png");
    ImageIcon c = new ImageIcon("src/imagens/sapatos/coturno.png");
    

    public Maison_3_7_Velvet_Sapatos(Boneca boneca) {
        this.boneca = boneca;
    

        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_sapatos.png");
        painelFundo.setLayout(null);
        setUndecorated(false);

        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(painelFundo);

        criarLabel(380, 180, 220, 150, tenis_rosa, "tenis_rosa");
        criarLabel(630, 180, 220, 150, tenis_allstar, "tenis_allstar");
        criarLabel(880, 180, 220, 150, salto_branco, "salto_branco");
        criarLabel(1130, 180, 220, 150, salto_preto, "salto_preto");
        criarLabel(380, 350, 220, 150, chinelo_branco, "chinelo_branco");
        criarLabel(630, 350, 220, 150, chinelo_preto, "chinelo_preto");
        criarLabel(880, 350, 220, 150, bota_cowboy, "bota_cowboy");
        criarLabel(1130, 350, 220, 150, bota_preta, "bota_preto");
        criarLabel(380, 520, 220, 150, tenis_branco, "tenis_branco");
        criarLabel(630, 530, 220, 150, tenis_preto, "tenis_preto");
        criarLabel(880, 530, 220, 150, crocs, "crocs");
        criarLabel(1130, 520, 220, 150, coturno, "coturno");
        criarLabel(100, 590, 250, 80, voltar, "voltar");

        this.add(tenis_rosa);
        this.add(tenis_allstar);
        this.add(salto_branco);
        this.add(salto_preto);
        this.add(chinelo_branco);
        this.add(chinelo_preto);
        this.add(bota_cowboy);
        this.add(bota_preta);
        this.add(tenis_branco);
        this.add(tenis_preto);
        this.add(crocs);
        this.add(coturno);
        this.add(voltar);
        
        criarLabelImagens(138, 420, 400, 500, trosa, tr);
        criarLabelImagens(138, 420, 400, 500, tallstar, tas);
        criarLabelImagens(138, 420, 400, 500, sbranco, sb);
        criarLabelImagens(138, 420, 400, 500, spreto, sp);
        criarLabelImagens(138, 420, 400, 500, cbranco, cb);
        criarLabelImagens(138, 420, 400, 500, cpreto, cp);
        criarLabelImagens(138, 420, 400, 500, bcowboy, bc);
        criarLabelImagens(138, 420, 400, 500, bpreta, bp);
        criarLabelImagens(138, 420, 400, 500, tbranco, tb);
        criarLabelImagens(138, 420, 400, 500, tpreto, tp);
        criarLabelImagens(138, 420, 400, 500, croc, cr);
        criarLabelImagens(138, 420, 400, 500, coturn, c);

        
        mostrarBoneca(boneca);

        

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
                .getScaledInstance(500, 540, Image.SCALE_SMOOTH);
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
                remove(trosa);
                remove(tallstar);
                remove(sbranco);
                remove(spreto);
                remove(cbranco);
                remove(cpreto);
                remove(bcowboy);
                remove(bpreta);
                remove(tbranco);
                remove(tpreto);
                remove(croc);
                remove(coturn);
                switch (op) {
                    case "voltar":
                        dispose();
                        new Maison_2_Velvet_Escolha_Inicial(false, boneca).setVisible(true);
                        break;
                    case "tenis_rosa":
                        sapatoEscolhido = trosa;
                        break;
                    case "tenis_allstar":
                        sapatoEscolhido = tallstar;
                        break;
                    case "salto_branco":
                        sapatoEscolhido = sbranco;
                        break;
                        case "salto_preto":
                        sapatoEscolhido = spreto;
                        break;
                        case "chinelo_branco":
                        sapatoEscolhido = cbranco;
                        break;
                        case "chinelo_preto":
                        sapatoEscolhido = cpreto;
                        break;
                        case "bota_cowboy":
                        sapatoEscolhido = bcowboy;
                        break;
                        case "bota_preto":
                        sapatoEscolhido = bpreta;
                        break;
                        case "tenis_branco":
                        sapatoEscolhido = tbranco;
                        break;
                        case "tenis_preto":
                        sapatoEscolhido = tpreto;
                        break;
                        case "crocs":
                        sapatoEscolhido = croc;
                        break;
                        case "coturno":
                        sapatoEscolhido = coturn;
                        break;   
                }
                if ("voltar".equals(op)) {
                    return;
                }
                boneca.setSapato(sapatoEscolhido);
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
