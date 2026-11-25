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
import javax.swing.SwingConstants;

/**
 *
 * @author Escola João XXIII
 */
public class Maison_3_3Velvet_Parte_S extends javax.swing.JFrame {

    JLabel blusaVermelha = new JLabel();
    JLabel regataPreta = new JLabel();
    JLabel blusaRosa = new JLabel();
    JLabel regataAzul = new JLabel();
    JLabel blusaMarrom = new JLabel();
    JLabel regataFlorida = new JLabel();
    JLabel blusaAzul = new JLabel();
    JLabel regataRoxa = new JLabel();
    JLabel blusaVerde = new JLabel();
    JLabel casacoBranco = new JLabel();
    JLabel blusaBranca = new JLabel();
    JLabel camisaRosa = new JLabel();
    JLabel voltar = new JLabel();

    JLabel vermelha = new JLabel();
    JLabel preta = new JLabel();
    JLabel rosa_1 = new JLabel();
    JLabel azul_1 = new JLabel();
    JLabel marrom = new JLabel();
    JLabel florida = new JLabel();
    JLabel azul_2 = new JLabel();
    JLabel roxa = new JLabel();
    JLabel verde = new JLabel();
    JLabel branco_1 = new JLabel();
    JLabel branca_2 = new JLabel();
    JLabel rosa_2 = new JLabel();

    JLabel blusaEscolhida = new JLabel();

    Boneca boneca = new Boneca();

    ImageIcon rv = new ImageIcon("src/imagens/blusas/vermelho.png");
    ImageIcon rp = new ImageIcon("src/imagens/blusas/preto.png");
    ImageIcon br = new ImageIcon("src/imagens/blusas/rosa.png");
    ImageIcon ra = new ImageIcon("src/imagens/blusas/azulx.png");
    ImageIcon bm = new ImageIcon("src/imagens/blusas/marrom.png");
    ImageIcon rf = new ImageIcon("src/imagens/blusas/florido.png");
    ImageIcon ba = new ImageIcon("src/imagens/blusas/azul.png");
    ImageIcon rr = new ImageIcon("src/imagens/blusas/rosax.png");
    ImageIcon bv = new ImageIcon("src/imagens/blusas/verde.png");
    ImageIcon cb = new ImageIcon("src/imagens/blusas/moletom.png");
    ImageIcon bb = new ImageIcon("src/imagens/blusas/branco.png");
    ImageIcon cr = new ImageIcon("src/imagens/blusas/roxo.png");

    
    public Maison_3_3Velvet_Parte_S(Boneca boneca) {
        this.boneca = boneca;

        PainelFundo painelFundo = new PainelFundo("src/imagens/maison_velvet_parte_s.png");
        painelFundo.setLayout(null);
        setUndecorated(false);

        setTitle("Jogo de Vestir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(painelFundo);

        criarLabel(370, 170, 230, 160, blusaVermelha, "blusa_vermelha");
        criarLabel(620, 170, 230, 160, regataPreta, "regata_preta");
        criarLabel(870, 170, 230, 160, blusaRosa, "blusa_rosa");
        criarLabel(1120, 170, 230, 160, regataAzul, "regata_azul");
        criarLabel(370, 350, 230, 160, blusaMarrom, "blusa_marrom");
        criarLabel(620, 350, 230, 160, regataFlorida, "regata_florida");
        criarLabel(870, 350, 230, 160, blusaAzul, "blusa_azul");
        criarLabel(1120, 350, 230, 160, regataRoxa, "regata_roxa");
        criarLabel(370, 520, 230, 160, blusaVerde, "blusa_verde");
        criarLabel(620, 520, 230, 160, casacoBranco, "casaco_branco");
        criarLabel(870, 520, 230, 160, blusaBranca, "blusa_branca");
        criarLabel(1120, 520, 230, 160, camisaRosa, "camisa_rosa");
        criarLabel(100, 590, 245, 75, voltar, "voltar");

        this.add(blusaVermelha);
        this.add(regataPreta);
        this.add(blusaRosa);
        this.add(regataAzul);
        this.add(blusaMarrom);
        this.add(regataFlorida);
        this.add(blusaAzul);
        this.add(regataRoxa);
        this.add(blusaVerde);
        this.add(casacoBranco);
        this.add(blusaBranca);
        this.add(camisaRosa);
        this.add(voltar);

        criarLabelImagens(133, 85, 400, 500, vermelha, rv);
        criarLabelImagens(133, 90, 400, 500, preta, rp);
        criarLabelImagens(133, 95, 400, 500, rosa_1, br);
        criarLabelImagens(133, 90, 400, 500, azul_1, ra);
        criarLabelImagens(133, 90, 400, 500, marrom, bm);
        criarLabelImagens(133, 90, 400, 500, florida, rf);
        criarLabelImagens(130, 90, 400, 500, azul_2, ba);
        criarLabelImagens(130, 95, 400, 500, roxa, rr);
        criarLabelImagens(133, 95, 400, 500, verde, bv);
        criarLabelImagens(133, 95, 400, 500, branco_1, cb);
        criarLabelImagens(133, 95, 400, 500, branca_2, bb);
        criarLabelImagens(133, 90, 400, 500, rosa_2, cr);

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
                .getScaledInstance(480, 505, Image.SCALE_SMOOTH);
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
                remove(boneca.getRoupaS());
                remove (blusaEscolhida);
                remove(vermelha);
                remove(preta);
                remove(rosa_1);
                remove(azul_1);
                remove(marrom);
                remove(florida);
                remove(roxa);
                remove(verde);
                remove(branco_1);
                remove(branca_2);
                remove(rosa_2);     
                switch (op) {
                    case "voltar":
                        dispose();
                        new Maison_2_Velvet_Escolha_Inicial(false, boneca).setVisible(true);
                        break;
                    case "blusa_vermelha":
                        blusaEscolhida = vermelha;
                        break;
                    case "regata_preta":
                        blusaEscolhida = preta;
                        break;
                    case "blusa_rosa":
                        blusaEscolhida = rosa_1;
                        break;
                    case "regata_azul":
                        blusaEscolhida = azul_1;
                        break;
                    case "blusa_marrom":
                        blusaEscolhida = marrom;
                        break;
                    case "regata_florida":
                        blusaEscolhida = florida;
                        break;
                    case "blusa_azul":
                        blusaEscolhida = azul_2;
                        break;
                    case "regata_roxa":
                        blusaEscolhida = roxa;
                        break;
                    case "blusa_verde":
                        blusaEscolhida = verde;
                        break;
                    case "casaco_branco":
                        blusaEscolhida = branco_1;
                        break;
                    case "blusa_branca":
                        blusaEscolhida = branca_2;
                        break;
                    case "camisa_rosa":
                        blusaEscolhida = rosa_2;
                        break;
                }
                if ("voltar".equals(op)) {
                    return;
                }
                remove(boneca.getVestido());
                remove(boneca.getConjunto());
                boneca.setRoupaS(blusaEscolhida);
                boneca.setVestido(new JLabel());
                boneca.setConjunto(new JLabel());
                mostrarBoneca(boneca);
            }
        });
    }

    public void mostrarBoneca(Boneca boneca) {
        this.add(boneca.getRoupaS());
        this.add(boneca.getCabelo());
        this.add(boneca.getConjunto());
        this.add(boneca.getBolsa());
        this.add(boneca.getAcessorio());
        this.add(boneca.getRoupaI());
        this.add(boneca.getVestido());
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
