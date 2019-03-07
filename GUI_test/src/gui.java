
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
    public JPanel password;
    private JButton one;
    private JButton seven;
    private JButton four;
    private JButton eight;
    private JButton five;
    private JButton two;
    private JButton nine;
    private JButton six;
    private JButton three;
    private JButton add;
    private JButton subtract;
    private JButton divide;
    private JTextPane textPane1;
    private JButton period;
    private JButton zero;
    private JButton equals;
    private JButton multiply;

    //variables
    private String count1 = "";
    private String count2 = "";
    private float count3 = 0;
    private String symbol = "";
    private boolean addvalue = false;
    private boolean subtractvalue = false;
    private boolean dividevalue = false;
    private boolean multiplyvalue = false;
    private boolean isFloat = false;
    private boolean isFloat2 = false;

    private gui() {
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "0";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "0";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "1";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "1";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "2";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "2";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "3";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "3";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "4";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "4";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "5";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "5";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "6";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "6";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "7";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "7";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "8";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "8";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                    count2 += "9";
                    textPane1.setText(count1 + symbol + count2);
                }
                else {
                    count1 += "9";
                    textPane1.setText(count1 + symbol);
                }
            }
        });
        period.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isFloat && isFloat2) {

                }
                else {
                    if (addvalue || subtractvalue || dividevalue|| multiplyvalue) {
                        count2 += ".";
                        textPane1.setText(count1 + symbol + count2);
                        isFloat2 = true;
                    }
                    else {
                        count1 += ".";
                        textPane1.setText(count1);
                        isFloat = true;
                    }
                }

            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue || multiplyvalue) {

                }
                else if (count1.equals("")) {

                }
                else {
                    symbol += " + ";
                    textPane1.setText(count1 + symbol);
                }
                addvalue = true;
            }
        });
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue || multiplyvalue) {

                }
                else if (count1.equals("")) {

                }
                else {
                    symbol += " - ";
                    textPane1.setText(count1 + symbol);
                }
                subtractvalue = true;
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue || multiplyvalue) {

                }
                else if (count1.equals("")) {

                }
                else {
                    symbol += " / ";
                    textPane1.setText(count1 + symbol);
                }
                dividevalue = true;
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addvalue || subtractvalue || dividevalue || multiplyvalue) {

                }
                else if (count1.equals("")) {

                }
                else {
                    symbol += " * ";
                    textPane1.setText(count1 + symbol);
                }
                multiplyvalue = true;
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isFloat || isFloat2) {
                    if (addvalue || subtractvalue || dividevalue || multiplyvalue) {
                        if (addvalue) {
                            count3 = Float.parseFloat(count1) + Float.parseFloat(count2);
                            textPane1.setText(count1 + " + " + count2 + " = " + count3);
                        } else if (subtractvalue) {
                            count3 = Float.parseFloat(count1) - Float.parseFloat(count2);
                            textPane1.setText(count1 + " - " + count2 + " = " + count3);
                        } else if (dividevalue) {
                            count3 = Float.parseFloat(count1) / Float.parseFloat(count2);
                            textPane1.setText(count1 + " / " + count2 + " = " + count3);
                        } else {
                            count3 = Float.parseFloat(count1) * Float.parseFloat(count2);
                            textPane1.setText(count1 + " * " + count2 + " = " + count3);
                        }
                    } else {
                        textPane1.setText(count1);
                    }
                }
                else {
                    if (addvalue || subtractvalue || dividevalue || multiplyvalue) {
                        if (addvalue) {
                            count3 = Integer.parseInt(count1) + Integer.parseInt(count2);
                            textPane1.setText(count1 + " + " + count2 + " = " + count3);
                        } else if (subtractvalue) {
                            count3 = Integer.parseInt(count1) - Integer.parseInt(count2);
                            textPane1.setText(count1 + " - " + count2 + " = " + count3);
                        } else if (dividevalue) {
                            count3 = Float.parseFloat(count1) / Float.parseFloat(count2);
                            textPane1.setText(count1 + " / " + count2 + " = " + count3);
                        } else {
                            count3 = Integer.parseInt(count1) * Integer.parseInt(count2);
                            textPane1.setText(count1 + " * " + count2 + " = " + count3);
                        }
                    } else {
                        textPane1.setText(count1);
                    }
                }
                count1 = "";
                count2 = "";
                count3 = 0;
                symbol = "";
                addvalue = false;
                subtractvalue = false;
                dividevalue = false;
                multiplyvalue = false;
                isFloat = false;
                isFloat2 = false;
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("gui");

        try {
            frame.setContentPane(new gui().password);
        } catch (java.lang.NullPointerException e) {
            System.out.println("error");
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
