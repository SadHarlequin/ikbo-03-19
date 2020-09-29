package lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private final String rules = "<html>Угадайте число в диапазоне от 0 до 20. У вас будет три попытки,<br/>прежде чем игра завершится</html>";
    private int number_try = 0;
    private int rndNumber;
    private JButton button;
    private JTextField text;
    private JLabel label;

    public Game(){
        super("Game");
        addInputElement();
        rndNumber=((int)(Math.random()*(19)));
        System.out.print(rndNumber);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (text.getText().isEmpty()) return;
                int check = Integer.parseInt(text.getText());
                if (number_try < 3 && check != rndNumber){
                    number_try++;
                    text.setText("");
                    if (number_try == 3) {
                        dispose();
                        JOptionPane.showMessageDialog(null,"Вы проиграли.");
                    }
                    if (check<rndNumber && number_try!=3){
                        JOptionPane.showMessageDialog(null,"Число "+check+" меньше загаданного.");
                    }
                    if (check>rndNumber && number_try!=3){
                        JOptionPane.showMessageDialog(null,"Число "+check+" больше загаданного.");
                    }
                }
                else {
                    dispose();
                    JOptionPane.showMessageDialog(null,"Вы выиграли!");
                }
            }
        }
        );
        setSize(800, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void addInputElement() {
        button = new JButton("Попробовать угадать");
        text = new JTextField();
        label = new JLabel(rules, SwingConstants.CENTER);

        label.setBounds(200, 50, 400, 200);
        label.setFont(new Font("Times new Roman", Font.ITALIC, 22));
        text.setBounds(300, 250, 200, 50);
        button.setFont(new Font("Times new Roman", Font.ITALIC, 22));
        button.setBounds(250, 350, 300, 100);

        add(label);
        add(text);
        add(button);
    }
}
