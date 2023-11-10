import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter a paragraph:");
        JTextField textField = new JTextField(20);
        JButton countButton = new JButton("Count Words");
        JLabel resultLabel = new JLabel("Word count: 0");

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String paragraph = textField.getText();
                int wordCount = countWords(paragraph);
                resultLabel.setText("Word count: " + wordCount);
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(countButton);
        panel.add(resultLabel);
        frame.add(panel);
        frame.setVisible(true);
    }

    private static int countWords(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            return 0;
        }

        String[] words = paragraph.split("\\s+"); // Split the paragraph into words using space as delimiter
        return words.length;
    }
}
