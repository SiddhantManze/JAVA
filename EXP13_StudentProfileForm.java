import java.awt.*;
import java.awt.event.*;

public class EXP13_StudentProfileForm extends Frame { ///change to StudentProfileForm
    private Label nameLabel, ageLabel, genderLabel;
    private TextField nameField, ageField;
    private CheckboxGroup genderGroup;
    private Checkbox maleCheckbox, femaleCheckbox;
    private Button submitButton;

    public EXP13_StudentProfileForm() {
        setTitle("Student Profile Form");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        nameLabel = new Label("Name:");
        nameField = new TextField(20);

        ageLabel = new Label("Age:");
        ageField = new TextField(5);

        genderLabel = new Label("Gender:");
        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, false);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);

        submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String gender = genderGroup.getSelectedCheckbox().getLabel();
                
                // Display the submitted information
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
            }
        });

        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(genderLabel);
        add(maleCheckbox);
        add(femaleCheckbox);
        add(submitButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        EXP13_StudentProfileForm profileForm = new EXP13_StudentProfileForm();
        profileForm.setVisible(true);
    }
}
