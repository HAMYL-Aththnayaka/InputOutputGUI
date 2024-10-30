import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputOutputGUI extends JFrame {
    
    private JTextField inputField;
    private JButton submitButton;
    private JLabel outputLabel;

    public InputOutputGUI() {
        // Set up the frame
        setTitle("Input Output GUI");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create components
        JLabel inputLabel = new JLabel("Enter your text:");
        inputLabel.setBounds(20, 20, 100, 30);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(130, 20, 200, 30);
        add(inputField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(130, 60, 80, 30);
        add(submitButton);

        outputLabel = new JLabel("Output will appear here.");
        outputLabel.setBounds(20, 100, 300, 30);
        add(outputLabel);

        // Add button listener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                outputLabel.setText("You entered: " + inputText);
            }
        });
    }

    public static void main(String[] args) {
        // Run the GUI application
        SwingUtilities.invokeLater(() -> {
            InputOutputGUI gui = new InputOutputGUI();
            gui.setVisible(true);
        });
    }
}
