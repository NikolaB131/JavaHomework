package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu colorMenu;
    JMenu fontMenu;
    JMenuItem colorBlue;
    JMenuItem colorRed;
    JMenuItem colorBlack;
    JMenuItem fontTimesNewRoman;
    JMenuItem fontMSSansSerif;
    JMenuItem fontCourierNew;
    JTextArea textArea;

    public TextEditor() {
        setTitle("TextEditor");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        colorMenu = new JMenu("Color");
        fontMenu = new JMenu("Font");

        colorBlue = new JMenuItem("Blue");
        colorRed = new JMenuItem("Red");
        colorBlack = new JMenuItem("Black");
        fontTimesNewRoman = new JMenuItem("Times New Roman");
        fontMSSansSerif = new JMenuItem("MS Sans Serif");
        fontCourierNew = new JMenuItem("Courier New");

        colorBlue.addActionListener(this);
        colorRed.addActionListener(this);
        colorBlack.addActionListener(this);
        fontTimesNewRoman.addActionListener(this);
        fontMSSansSerif.addActionListener(this);
        fontCourierNew.addActionListener(this);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        colorMenu.add(colorBlue);
        colorMenu.add(colorRed);
        colorMenu.add(colorBlack);
        fontMenu.add(fontTimesNewRoman);
        fontMenu.add(fontMSSansSerif);
        fontMenu.add(fontCourierNew);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(200, 100));
        textArea.setLineWrap(true);
        textArea.setFont(new Font("", Font.PLAIN, 16));

        add(textArea);
        setJMenuBar(menuBar);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colorBlue) {
            textArea.setForeground(Color.blue);
        }
        if (e.getSource() == colorRed) {
            textArea.setForeground(Color.red);
        }
        if (e.getSource() == colorBlack) {
            textArea.setForeground(Color.black);
        }
        if (e.getSource() == fontTimesNewRoman) {
            textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        }
        if (e.getSource() == fontMSSansSerif) {
            textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 16));
        }
        if (e.getSource() == fontCourierNew) {
            textArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        }
    }
}
