package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class AnimationPanel extends JPanel implements ActionListener {
    ArrayList<Image> animation1; // список кадров

    public AnimationPanel() {
        final String PATH_TO_FRAMES_FOLDER = "src/lab5/Frames/IMG_"; // путь до папки с кадрами
        final int NUMBER_OF_FRAMES = 24; // количество кадров анимации
        int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 100; // высота экрана - 100
        // соотношение сторон изображения
        double aspectRatio =
                  (double) new ImageIcon(PATH_TO_FRAMES_FOLDER + "1.png").getImage().getHeight(null) /
                  (double) new ImageIcon(PATH_TO_FRAMES_FOLDER + "1.png").getImage().getWidth(null);

        animation1 = new ArrayList<>(); // список кадров
        for (int i = 1; i != NUMBER_OF_FRAMES + 1; i++) {
            animation1.add(resizeImage(new ImageIcon(PATH_TO_FRAMES_FOLDER + i + ".png").getImage(),
                    (int) (screenHeight / aspectRatio), screenHeight));
        }
        setPreferredSize(new Dimension((int) (screenHeight / aspectRatio), screenHeight)); // размер окна

        Timer timer = new Timer(90, this); // actionPerformed вызывается каждую секунду
        timer.start();
    }

    int i = 0;
    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        System.out.println(i + 1 + " " + animation1.get(i));
        g2D.drawImage(animation1.get(i++), 0, 0, null);
        if (i == 24) {
            i = 0;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    // преобразует изображение до необходимого размера (код не мой)
    private BufferedImage resizeImage(final Image image, int width, int height) {
        final BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        final Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setComposite(AlphaComposite.Src);
        //below three lines are for RenderingHints for better image quality at cost of higher processing time
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
        return bufferedImage;
    }
}
