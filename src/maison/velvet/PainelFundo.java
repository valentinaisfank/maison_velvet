package maison.velvet;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PainelFundo extends JPanel {

    private Image imagem;

    public PainelFundo(String caminho) {
        imagem = new ImageIcon(caminho).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
    }
}
