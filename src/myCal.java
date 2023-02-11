import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class myCal {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton ACButton;
    private JButton BtnBack;
    private JButton BtnDiff;
    private JButton BtnMulti;
    private JButton BtnDiv;
    private JButton BtnEqual;
    private JButton Btn7;
    private JButton Btn4;
    private JButton Btn1;
    private JButton Btn00;
    private JButton BtnAdd;
    private JButton Btn8;
    private JButton Btn5;
    private JButton Btn2;
    private JButton Btn0;
    private JButton BtnPlusOuMoins;
    private JButton Btn9;
    private JButton Btn6;
    private JButton btnPoint;
    private JButton Btn3;

    //declaration des variables
    double firstNumber,secondNumber, result;
    String opChar,choice;



    public myCal() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        BtnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if(txtDisplay.getText().length()>0){
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }
            }


        });
        Btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn7.getText());
            }
        });
        Btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn8.getText());
            }
        });
        Btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn9.getText());
            }
        });
        Btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn4.getText());
            }
        });
        Btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn5.getText());
            }
        });
        Btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn6.getText());
            }
        });
        Btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn1.getText());
            }
        });
        Btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn2.getText());
            }
        });
        Btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+Btn3.getText());
            }
        });
        Btn00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn00.getText());
            }
        });
        Btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ Btn0.getText());
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText()+btnPoint.getText());
                }
            }
        });
        BtnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble( txtDisplay.getText());
                txtDisplay.setText("");
                choice = "/";
            }
        });
        BtnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble( txtDisplay.getText());
                txtDisplay.setText("");
                choice = "*";
            }
        });
        BtnDiff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble( txtDisplay.getText());
                txtDisplay.setText("");
                choice = "-";
            }
        });
        BtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble( txtDisplay.getText());
                txtDisplay.setText("");
                choice = "+";
            }
        });
        BtnPlusOuMoins.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().contains(".")){
                    double op= Double.parseDouble(String.valueOf(txtDisplay.getText()));
                    op = op * (-1);
                    txtDisplay.setText(String.valueOf(op));
                }else {
                    long OP= Long.parseLong(String.valueOf(txtDisplay.getText()));
                    OP = OP * (-1);
                    txtDisplay.setText(String.valueOf(OP));
                }
            }
        });

        BtnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber = Double.parseDouble(txtDisplay.getText());
                if (choice == "+") {
                    result = firstNumber + secondNumber;
                    txtDisplay.setText(String.valueOf(result));
                } else if (choice == "-") {
                     result = firstNumber - secondNumber;
                     txtDisplay.setText(String.valueOf(result));
                } else if (choice == "*") {
                     result = firstNumber * secondNumber;
                     txtDisplay.setText(String.valueOf(result));
                }else if (choice == "/") {
                     result = firstNumber / secondNumber;
                     txtDisplay.setText(String.valueOf(result));
                }


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("myCal");
        frame.setContentPane(new myCal().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
