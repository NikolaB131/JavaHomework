package pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame implements ActionListener {
    JButton acMilan;
    JButton realMadrid;
    JLabel result;
    JLabel lastScorer;
    JLabel winner;
    int acMilanScore = 0;
    int realMadridScore = 0;

    public FootballMatch() {
        setTitle("Football match");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        acMilan = new JButton("AC Milan");
        acMilan.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.ipadx = 18; // увеличивает ширину кнопки на 18 пикселей
        gbc.insets = new Insets(4, 4, 4, 15); // отступы
        add(acMilan, gbc);

        gbc.ipadx = 0; // чтобы не повлияло на другие эелементы

        realMadrid = new JButton("Real Madrid");
        realMadrid.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.insets = new Insets(4, 15, 4, 4);
        add(realMadrid, gbc);

        gbc.insets = new Insets(0, 0, 0, 0); // чтобы не повлияло на другие эелементы

        result = new JLabel("Result: 0 X 0");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(result, gbc);

        lastScorer = new JLabel("Last Scorer: N/A");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        add(lastScorer, gbc);

        winner = new JLabel("Winner: DRAW");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.insets = new Insets(4, 0, 4, 0);
        add(winner, gbc);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == acMilan) {
            acMilanScore++;
            result.setText("Result: " + acMilanScore + " X " + realMadridScore);
            lastScorer.setText("Last Scorer: AC Milan");
        }
        if (e.getSource() == realMadrid) {
            realMadridScore++;
            result.setText("Result: " + acMilanScore + " X " + realMadridScore);
            lastScorer.setText("Last Scorer: Real Madrid");
        }
        if (acMilanScore > realMadridScore) {
            winner.setText("Winner: AC Milan");
        } else if (realMadridScore > acMilanScore) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }
}
