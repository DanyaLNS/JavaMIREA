import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Fifth extends JPanel {
    public static void main(String[] args) {
        // создание фрейма
        JFrame frm1 = new JFrame();
        // создание класса анимации
        Fifth pn1 = new Fifth();
        // добавление анимации на экран
        frm1.getContentPane().add(pn1);
        // установка размера, видимости и операции закрытия 
        frm1.setSize(190, 210);
        frm1.setVisible(true);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // image - карта для анимации, i - номер кадра, sprites - массив с координатами спрайтов 
    BufferedImage image;
    int i = 0;
    int[][] sprites = { { 40, 0, 175, 175 },
                        { 280, 0, 175, 175 }, 
                        { 520, 0, 175, 175 },
                        { 770, 0, 175, 175 }, 
                        { 1025, 0, 175, 175 }, 
                        { 1270, 0, 175, 175 } };
    // Сама анимация: смена кадров, стирание предыдущего и вывод нового 
    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            i++;
            if (i == sprites.length) {
                i = 0;
            }
            revalidate();
            repaint();
        }
    };
    // конструктор
    public Fifth() {
        // создание и запуск таймера
        Timer timer = new Timer(50, actionListener);
        timer.start();
        // загрузка в image карты спрайтов 
        try {
            image = ImageIO.read(new File("pic.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // метод вывода изображения
    @Override
    public void paintComponent(Graphics g) {
        // загрузка в subSprite отдельного кадра
        Image subSprite;
        super.paintComponent(g);
        subSprite = image.getSubimage(sprites[i][0], sprites[i][1], sprites[i][2], sprites[i][3]);
        g.drawImage(subSprite, 0, 0, null);
    }
}

