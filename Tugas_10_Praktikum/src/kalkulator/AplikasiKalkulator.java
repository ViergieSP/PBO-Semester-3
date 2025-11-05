package kalkulator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;

public class AplikasiKalkulator extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField displayField;
    private JButton btn7, btn8, btn9, btnPlus, btnMinus;
    private JButton btn4, btn5, btn6, btnMultiply, btnDivide;
    private JButton btn1, btn2, btn3, btnEquals, btnPercent;
    private JButton btnDot, btn0, btnClear, btnBackspace, btnExit;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator = ' '; // Inisialisasi dengan spasi agar lebih jelas
    private String currentInput = "";
    
    // Variabel baru untuk menandai apakah operasi sebelumnya adalah '='
    private boolean afterEquals = false;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AplikasiKalkulator frame = new AplikasiKalkulator();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public AplikasiKalkulator() {
        setTitle("Aplikasi AplikasiKalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450);
        setResizable(false);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel displayPanel = new JPanel();
        displayPanel.setBounds(10, 10, 364, 70);
        displayPanel.setBackground(new Color(255, 204, 204));
        displayPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        displayPanel.setLayout(null);
        contentPane.add(displayPanel);

        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setText("0");
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        displayField.setFont(new Font("Arial", Font.BOLD, 32));
        displayField.setBounds(10, 10, 344, 50);
        displayPanel.add(displayField);

        btn7 = new JButton("7");
        btn7.setFont(new Font("Arial", Font.BOLD, 20));
        btn7.setBounds(10, 90, 65, 65);
        contentPane.add(btn7);

        btn8 = new JButton("8");
        btn8.setFont(new Font("Arial", Font.BOLD, 20));
        btn8.setBounds(85, 90, 65, 65);
        contentPane.add(btn8);

        btn9 = new JButton("9");
        btn9.setFont(new Font("Arial", Font.BOLD, 20));
        btn9.setBounds(160, 90, 65, 65);
        contentPane.add(btn9);

        btnPlus = new JButton("+");
        btnPlus.setFont(new Font("Arial", Font.BOLD, 20));
        btnPlus.setBounds(235, 90, 65, 65);
        contentPane.add(btnPlus);

        btnMinus = new JButton("-");
        btnMinus.setFont(new Font("Arial", Font.BOLD, 20));
        btnMinus.setBounds(310, 90, 65, 65);
        contentPane.add(btnMinus);

        btn4 = new JButton("4");
        btn4.setFont(new Font("Arial", Font.BOLD, 20));
        btn4.setBounds(10, 165, 65, 65);
        contentPane.add(btn4);

        btn5 = new JButton("5");
        btn5.setFont(new Font("Arial", Font.BOLD, 20));
        btn5.setBounds(85, 165, 65, 65);
        contentPane.add(btn5);

        btn6 = new JButton("6");
        btn6.setFont(new Font("Arial", Font.BOLD, 20));
        btn6.setBounds(160, 165, 65, 65);
        contentPane.add(btn6);

        btnMultiply = new JButton("*");
        btnMultiply.setFont(new Font("Arial", Font.BOLD, 20));
        btnMultiply.setBounds(235, 165, 65, 65);
        contentPane.add(btnMultiply);
        
        btnDivide = new JButton("/");
        btnDivide.setFont(new Font("Arial", Font.BOLD, 20));
        btnDivide.setBounds(310, 165, 65, 65);
        contentPane.add(btnDivide);

        btn1 = new JButton("1");
        btn1.setFont(new Font("Arial", Font.BOLD, 20));
        btn1.setBounds(10, 240, 65, 65);
        contentPane.add(btn1);

        btn2 = new JButton("2");
        btn2.setFont(new Font("Arial", Font.BOLD, 20));
        btn2.setBounds(85, 240, 65, 65);
        contentPane.add(btn2);

        btn3 = new JButton("3");
        btn3.setFont(new Font("Arial", Font.BOLD, 20));
        btn3.setBounds(160, 240, 65, 65);
        contentPane.add(btn3);

        btnEquals = new JButton("=");
        btnEquals.setFont(new Font("Arial", Font.BOLD, 20));
        btnEquals.setBounds(235, 240, 65, 65);
        contentPane.add(btnEquals);

        btnPercent = new JButton("%");
        btnPercent.setFont(new Font("Arial", Font.BOLD, 20));
        btnPercent.setBounds(310, 240, 65, 65);
        contentPane.add(btnPercent);

        btnDot = new JButton(".");
        btnDot.setFont(new Font("Arial", Font.BOLD, 20));
        btnDot.setBounds(10, 315, 65, 65);
        contentPane.add(btnDot);

        btn0 = new JButton("0");
        btn0.setFont(new Font("Arial", Font.BOLD, 20));
        btn0.setBounds(85, 315, 65, 65);
        contentPane.add(btn0);

        btnClear = new JButton("C");
        btnClear.setFont(new Font("Arial", Font.BOLD, 20));
        btnClear.setBounds(160, 315, 65, 65);
        contentPane.add(btnClear);
        
        btnBackspace = new JButton("B");
        btnBackspace.setFont(new Font("Arial", Font.BOLD, 20));
        btnBackspace.setBounds(235, 315, 65, 65);
        contentPane.add(btnBackspace);

        btnExit = new JButton("E");
        btnExit.setFont(new Font("Arial", Font.BOLD, 20));
        btnExit.setBounds(310, 315, 65, 65);
        contentPane.add(btnExit);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDot.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnPercent.addActionListener(this);
        btnEquals.addActionListener(this);
        btnClear.addActionListener(this);
        btnBackspace.addActionListener(this);
        btnExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            if (afterEquals) {
                currentInput = "";
                afterEquals = false;
            }
            if (command.equals(".") && currentInput.contains(".")) {
                return;
            }
            currentInput += command;
            displayField.setText(currentInput);
        }

        else if (command.equals("C")) {
            currentInput = "";
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = ' ';
            displayField.setText("0");
            afterEquals = false;
        } 
        else if (command.equals("B")) {
            if (afterEquals) {
                return;
            }
            if (!currentInput.isEmpty()) {
                currentInput = currentInput.substring(0, currentInput.length() - 1);
                if (currentInput.isEmpty()) {
                    displayField.setText("0");
                } else {
                    displayField.setText(currentInput);
                }
            }
        } 
        else if (command.equals("E")) {
            System.exit(0);
        }

        else if (command.equals("%")) {
            if (!currentInput.isEmpty()) {
                double value = Double.parseDouble(currentInput);
                value /= 100.0;
                currentInput = String.valueOf(value);
                displayField.setText(currentInput);
            }
        }

        else if (command.equals("=")) {
            if (operator != ' ') {
                if (currentInput.isEmpty()) {
                    num2 = num1;
                } else {
                    num2 = Double.parseDouble(currentInput);
                }
                performCalculation();
                operator = ' ';
                afterEquals = true;
            }
        }

        else {
            if (!currentInput.isEmpty()) {
                if (operator != ' ') {
                    num2 = Double.parseDouble(currentInput);
                    performCalculation();
                } else {
                    num1 = Double.parseDouble(currentInput);
                }
            }
            operator = command.charAt(0);
            currentInput = "";
            afterEquals = false;
        }
    }

    private void performCalculation() {
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) {
                    displayField.setText("Error: Div by 0");
                    currentInput = "";
                    num1 = 0;
                    operator = ' ';
                    return;
                }
                result = num1 / num2;
                break;
        }

        if (result == (long) result) {
            displayField.setText(String.format("%d", (long) result));
        } else {
            displayField.setText(String.valueOf(result));
        }

        num1 = result;
    }
}