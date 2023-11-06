import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EXP12_InteractiveGUIExample { // Change to InteractiveGUIExample
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Interactive GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);

        // Add a label
        JLabel label = new JLabel("Welcome to Interactive GUI!");
        panel.add(label);

        // Add buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);

        // Add checkboxes
        JCheckBox checkbox1 = new JCheckBox("Checkbox 1");
        JCheckBox checkbox2 = new JCheckBox("Checkbox 2");
        panel.add(checkbox1);
        panel.add(checkbox2);

        // Add radio buttons
        JRadioButton radio1 = new JRadioButton("Radio 1");
        JRadioButton radio2 = new JRadioButton("Radio 2");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);
        panel.add(radio1);
        panel.add(radio2);

        // Create a scroll pane with a list
        String[] listData = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
        JList<String> list = new JList<>(listData);
        JScrollPane scrollPane = new JScrollPane(list);
        panel.add(scrollPane);

        // Create a menu bar with menus and items
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // Add action listeners to buttons
        button1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button 1 clicked!"));
        button2.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button 2 clicked!"));

        // Add item listeners to checkboxes
        checkbox1.addItemListener(e -> {
            if (checkbox1.isSelected()) {
                label.setText("Checkbox 1 selected");
            } else {
                label.setText("Checkbox 1 deselected");
            }
        });

        checkbox2.addItemListener(e -> {
            if (checkbox2.isSelected()) {
                label.setText("Checkbox 2 selected");
            } else {
                label.setText("Checkbox 2 deselected");
            }
        });

        // Add item listeners to radio buttons
        radio1.addItemListener(e -> {
            if (radio1.isSelected()) {
                label.setText("Radio 1 selected");
            }
        });

        radio2.addItemListener(e -> {
            if (radio2.isSelected()) {
                label.setText("Radio 2 selected");
            }
        });

        // Display the JFrame
        frame.setVisible(true);
    }
}
