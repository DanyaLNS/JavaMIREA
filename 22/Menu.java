import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Menu extends JFrame{
    public Menu(){
        // Создание окна
        super("6 практика");
        JFrame jFrame = new JFrame("menu");
        jFrame.setVisible(true);
        jFrame.setBounds(200, 200, 570, 410);;
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание меню
        JMenuBar jMenuBar = new JMenuBar();
        JMenu color = new JMenu("Color");
        JMenu font = new JMenu("Font");
        jMenuBar.add(color);
        jMenuBar.add(font);

        // Cоздание многострочных полей
        JTextArea area1 = new JTextArea("", 20, 50);
        // Шрифт и табуляция
        area1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        area1.setTabSize(10);
      
        // Параметры переноса слов
        area1.setLineWrap(true);
        area1.setWrapStyleWord(true);

        // изменение цвета и шрифта
        color.add(new JMenuItem("Red", 'R')).addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                area1.setForeground(Color.RED);
            }
        });
        color.add(new JMenuItem("Blue")).addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                area1.setForeground(Color.BLUE);
            }
        });;
        color.add(new JMenuItem("Black")).addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                area1.setForeground(Color.BLACK);
            }
        });;
        font.add(new JMenuItem("Times New Roman", 'T')).addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                area1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            }
        });;
        font.add(new JMenuItem("MS Sans Serif")).addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                area1.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });;
        font.add(new JMenuItem("Courier New")).addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                area1.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });;
        // вывод меню на экран
        jFrame.setJMenuBar(jMenuBar);
        JPanel contents = new JPanel();
        contents.add(new JScrollPane(area1));
        jFrame.setContentPane(contents);
        jFrame.revalidate();
    }
}

