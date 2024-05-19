import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Random;

public class Reply {

    private JFrame frame = new JFrame();
    private JLabel label;
    private JTextArea textArea;

    private Color one = new Color(54, 69, 79);
    private Color two = new Color(255, 255, 0);
    private Color three = new Color(173, 216, 230);

    private Font Ss40 = new Font("Arial", Font.BOLD, 24);

    Reply() {

        frame.setTitle("DogGPT");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(one);

        label = new JLabel("DogGPT");
        label.setForeground(two);
        label.setFont(Ss40);
        label.setBounds(225, 10, 150, 50); // Center horizontally, 10 pixels from the top
        frame.add(label);

        textArea = new JTextArea();
        textArea.setBounds(50, 400, 500, 50); // Set bounds for text area
        textArea.setEditable(false);
        textArea.setForeground(three);
        textArea.setBackground(one);
        textArea.setFont(Ss40);

        ImageIcon randomImage = getRandomImage();
        ImageIcon resizedImage = resizeImage(randomImage, 300, 275);
        JLabel klabel = new JLabel(resizedImage);
        klabel.setBounds(150, 70, 300, 275); // Center horizontally, 70 pixels from the top

        // Initialize textArea before using it
        Woofrandom woofrandom = new Woofrandom();
        textArea.setText(woofrandom.getRandomWoof());

        frame.add(textArea);
        frame.add(klabel);

        frame.setLayout(null); // Set layout to null for manual positioning
        frame.setVisible(true);
    }

    private ImageIcon getRandomImage() {
        Random random = new Random();
        int randomNumber = random.nextInt(8) + 1; // Generate a random number between 1 and 8
        String imagePath = "Pictures/" + randomNumber + ".jpg"; // Adjust the path as needed
        return new ImageIcon(imagePath);
    }

    private ImageIcon resizeImage(ImageIcon imageIcon, int width, int height) {
        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
