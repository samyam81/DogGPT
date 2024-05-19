import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hehe {

    private Color one = new Color(54, 69, 79);
    private Color two = new Color(255, 255, 0);
    private Color three = new Color(173, 216, 230);

    private Font Ss40 = new Font("Arial", Font.BOLD, 24);

    private JFrame frame = new JFrame();
    private JLabel label;
    private JTextArea[] textAreas;
    private JPanel panel;
    private JTextArea textArea1 = new JTextArea();
    private JButton cuteButton = new JButton("Woof");

    public Hehe() {

        frame.setTitle("DogGPT");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(one);

        label = new JLabel("DogGPT");
        label.setForeground(two);
        label.setFont(Ss40);
        label.setBounds(175, 50, 150, 50);

        panel = new JPanel(new GridLayout(1, 3)); // One row, three columns
        textAreas = new JTextArea[3];
        for (int i = 0; i < 3; i++) {
            JTextArea textArea = new JTextArea(10, 20); // 10 rows, 20 columns
            textArea.setEditable(false); // Set text area as non-editable
            textArea.setLineWrap(true); // Enable line wrapping
            textArea.setWrapStyleWord(true); // Wrap at word boundaries
            textArea.setBackground(one); // Set background color to match frame

            textArea.setForeground(three);
            textArea.setBorder(new EmptyBorder(10, 10, 10, 10)); // 10 pixels top, left, bottom, right

            panel.add(textArea);
            textAreas[i] = textArea;
            Woofrandom woofrandom = new Woofrandom();
            textArea.setText(woofrandom.getRandomWoof());
        }

        // Set bounds for the panel
        panel.setBounds(50, 100, 500, 300);
        panel.setBackground(one);

        textArea1.setBounds(50, 300, 450, 45);
        cuteButton.setBounds(500, 300, 70, 45); // Position the button to the right of the text area

        cuteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform some action when the button is clicked
                try {
                    new Reply();
                } catch (Exception R) {
                    System.out.print("Error");
                }
            }
        });

        frame.setLayout(null); // Set layout to null for manual positioning
        frame.add(textArea1);
        frame.add(cuteButton);
        frame.add(label);
        frame.add(panel);
        frame.setVisible(true);

    }
}
