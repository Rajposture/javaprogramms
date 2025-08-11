import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    TextField display;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button bPlus, bMinus, bMultiply, bDivide, bEquals, bClear;

    public SimpleCalculator() {
        setTitle("AWT Calculator");
        setLayout(new FlowLayout());

        display = new TextField(20);
        add(display);

        b0 = new Button("0"); b1 = new Button("1"); b2 = new Button("2");
        b3 = new Button("3"); b4 = new Button("4"); b5 = new Button("5");
        b6 = new Button("6"); b7 = new Button("7"); b8 = new Button("8");
        b9 = new Button("9");

        bPlus = new Button("+"); bMinus = new Button("-");
        bMultiply = new Button("*"); bDivide = new Button("/");
        bEquals = new Button("="); bClear = new Button("Clear");

        add(b7); add(b8); add(b9); add(bDivide);
        add(b4); add(b5); add(b6); add(bMultiply);
        add(b1); add(b2); add(b3); add(bMinus);
        add(b0); add(bClear); add(bEquals); add(bPlus);

        b0.addActionListener(this); b1.addActionListener(this);
        b2.addActionListener(this); b3.addActionListener(this);
        b4.addActionListener(this); b5.addActionListener(this);
        b6.addActionListener(this); b7.addActionListener(this);
        b8.addActionListener(this); b9.addActionListener(this);

        bPlus.addActionListener(this); bMinus.addActionListener(this);
        bMultiply.addActionListener(this); bDivide.addActionListener(this);
        bEquals.addActionListener(this); bClear.addActionListener(this);

        setSize(250, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("Clear")) {
            display.setText("");
        } else if (command.equals("=")) {
            // Basic evaluation (for a full calculator, you'd need a more robust parser)
            try {
                String expression = display.getText();
                // Simple example: assumes only one operation at a time
                if (expression.contains("+")) {
                    String[] parts = expression.split("\\+");
                    double result = Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
                    display.setText(String.valueOf(result));
                } else if (expression.contains("-")) {
                    String[] parts = expression.split("-");
                    double result = Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
                    display.setText(String.valueOf(result));
                } // ... add more operations
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        } else {
            display.setText(display.getText() + command);
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}