import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// ТУДУ: сделать красивое расположение кнопок
public class Gui extends JFrame{
    private int madridScore, milanScore;
    JLabel resultLabel = new JLabel("Result: ");
    JLabel scorerLabel = new JLabel("Last Scorer: ");
    Label winnerLabel = new Label("Winner: ");

    public Gui(){
        super("GUI");
        madridScore = milanScore = 0;
        // Создание фрейма
        setSize(800, 100);
        setLocation(150, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(1, 3, 5, 15);
        panel.setLayout(layout);
        // Создание кнопок
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        // Создание надписей

        // Добавление элементов на фрейм
        panel.add(milanButton);
        panel.add(resultLabel);
        panel.add(winnerLabel);
        panel.add(scorerLabel);
        panel.add(madridButton);

        getContentPane().add(panel);
        // Работа с экшн листенерами 
        milanButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                milanScore++;
                scorerLabel.setText("Last Scorer "+ '\n'+"  AC Milan");
                resultLabel.setText("Result: " + milanScore + 'x' + madridScore);
                if(madridScore>milanScore){
                    winnerLabel.setText("Winner: Real Madrid");
                }
                else {
                    winnerLabel.setText("Winner: AC Milan");
                }
                if(madridScore == milanScore){
                    winnerLabel.setText("Winner: Tie!");
                }
            }
        });
        madridButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                madridScore++;
                scorerLabel.setText("Last Scorer:  Real Madrid");
                resultLabel.setText("Result: " + milanScore + 'x' + madridScore);
                if(madridScore>milanScore){
                    winnerLabel.setText("Winner: Real Madrid");
                }
                else {
                    winnerLabel.setText("Winner: AC Milan");
                }
                if(madridScore == milanScore){
                    winnerLabel.setText("Winner: Tie!");
                }
            }
        });
        setVisible(true);
    }
}