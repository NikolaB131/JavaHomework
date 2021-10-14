package lab5;

import javax.swing.*;

public class Animation extends JFrame {
    public Animation() {
        setTitle("Some animation :)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(new AnimationPanel());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
