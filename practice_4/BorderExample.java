package practice_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BorderExample extends JFrame{
    JPanel[] pnl = new JPanel[3];
    private int MilanScore = 0;
    private int MadridScore = 0;
    private String get_winner(int MilanScoreCheck, int MadridScoreCheck){
        if (MilanScoreCheck>MadridScoreCheck) return "AC Milan";
        if (MilanScoreCheck<MadridScoreCheck) return "Real Madrid";
        return "Draw";
    }

    public BorderExample(){
        setLayout(new GridLayout(1,3));
        for(int i = 0 ; i < pnl.length ; i++){
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(250,250,250));
            pnl[i].setLayout(new BorderLayout());
            add(pnl[i]);
        }
        JButton but1 = new JButton("AC Milan");
        JButton but2 = new JButton("Real Madrid");

        JLabel label1 = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        JLabel label2 = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        JLabel label3 = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        but1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MilanScore++;
                label1.setText("Result: " + MilanScore + " X " + MadridScore);
                label2.setText("Last Scorer: AC Milan");
                label3.setText("Winner: "+get_winner(MilanScore, MadridScore));
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        but2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MadridScore++;
                label1.setText("Result: " + MilanScore + " X " + MadridScore);
                label2.setText("Last Scorer: Real Madrid");
                label3.setText("Winner: "+get_winner(MilanScore, MadridScore));
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        pnl[0].add(but1, BorderLayout.CENTER);
        pnl[2].add(but2, BorderLayout.CENTER);

        pnl[1].add(label1, BorderLayout.SOUTH);
        pnl[1].add(label2, BorderLayout.NORTH);
        pnl[1].add(label3, BorderLayout.CENTER);
        setSize(500, 300);
}

    public static void main(String[]args){
      new BorderExample().setVisible(true);
    }
}