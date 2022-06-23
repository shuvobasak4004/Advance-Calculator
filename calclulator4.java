import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calclulator4 {
    private JTextField tfDisplay;
    private JTextField tfRawInput;
    private JButton bOne;
    private JButton bTwo;
    private JButton bEqual;
    private JButton bPoint;
    private JButton bZero;
    private JButton bThree;
    private JButton bFour;
    private JButton bFive;
    private JButton bSix;
    private JButton bAdd;
    private JButton bSub;
    private JButton bDel;
    private JButton bSeven;
    private JButton bEight;
    private JButton bNine;
    private JButton bMul;
    private JButton bDiv;
    private JButton bClear;
    private JButton bExit;
    private JButton bNext;
    private JButton bPrevious;
    public JPanel main6;



    //------------container variables---------------
    //private JTextField tfDisplay = new JTextField();//result displaying screen
    //private JTextField tfRawInput = new JTextField();

    private String sRawInput = "";
    private String sDisplay = "";//Input string
    private boolean isPlus = true;//Is the sign of the operand is plus
    private boolean isPoint = false;//is there is decimal point in the operands
    private boolean isOperation = false;
    private double number1 = 0;// 1st operand
    private double number2 = 0;// 2nd operand
    private double result = 0;// Result
    private char operation = ' ';// Operation

/////////////////////////////////////////////////////




    public static JFrame frame;//globle
    /*

    public static void main(String[] args) {
        frame = new JFrame("Shuvo-04");
        frame.setContentPane(new calclulator4().main6);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(410,300);
         frame.setResizable(false);

    }*/


    public calclulator4() {

        //1
        bOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (e.getSource() == bOne)
                {
                    if(operation == '=')
                    {
                        sDisplay = "1";
                        sRawInput = "1";
                        tfRawInput.setText(sRawInput);
                        operation = ' ';
                    }
                    else
                    {
                        sDisplay = sDisplay + "1";
                        sRawInput += "1";
                        tfRawInput.setText(sRawInput);
                    }
                }




            }
        });

        //1end

             //2

        bTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                   if (e.getSource() == bTwo)
                {
                    if(operation == '=')
                    {
                        sDisplay = "2";
                        sRawInput = "2";
                        tfRawInput.setText(sRawInput);
                        operation = ' ';
                    }
                    else
                    {
                        sDisplay = sDisplay + "2";
                        sRawInput += "2";
                        tfRawInput.setText(sRawInput);
                    }
                }

            }
        });

        //2end

             //3
        bThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 if (e.getSource() == bThree)
                {
                    if(operation == '=')
                    {
                        sDisplay = "3";
                        sRawInput = "3";
                        tfRawInput.setText(sRawInput);
                        operation = ' ';
                    }
                    else
                    {
                        sDisplay = sDisplay + "3";
                        sRawInput += "3";
                        tfRawInput.setText(sRawInput);
                    }
                }

            }
        });
        //3end

                  //4
        bFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bFour)
                {
                    if(operation == '=')
                    {
                        sDisplay = "4";
                        sRawInput = "4";
                        tfRawInput.setText(sRawInput);
                        operation = ' ';
                    }
                    else
                    {
                        sDisplay = sDisplay + "4";
                        sRawInput += "4";
                        tfRawInput.setText(sRawInput);
                    }
                }

            }
        });

        //4end

           //5
        bFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bFive)
                {
                    if(operation == '=')
                    {
                        sDisplay = "5";
                        sRawInput = "5";
                        tfRawInput.setText(sRawInput);
                        operation = ' ';
                    }
                    else
                    {
                        sDisplay = sDisplay + "5";
                        sRawInput += "5";
                        tfRawInput.setText(sRawInput);
                    }
                }

            }
        });
        //5end

           //6
        bSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bSix)
                {
                    if(operation == '=')
                    {
                        sDisplay = "6";
                        sRawInput = "6";
                        tfRawInput.setText(sRawInput);
                        operation = ' ';
                    }
                    else
                    {
                        sDisplay = sDisplay + "6";
                        sRawInput += "6";
                        tfRawInput.setText(sRawInput);
                    }
                }
            }
        });
        //6end

           //7
        bSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bSeven)
                {
                    if(operation == '=')
                    {
                        sDisplay = "7";
                        sRawInput = "7";
                        tfRawInput.setText(sRawInput);
                        operation = ' ';
                    }
                    else
                    {
                        sDisplay = sDisplay + "7";
                        sRawInput += "7";
                        tfRawInput.setText(sRawInput);
                    }
                }

            }
        });
        //7end

//8
        bEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bEight)
                {
                    if(operation == '=')
                    {
                        sDisplay = "8";
                        sRawInput = "8";
                        tfRawInput.setText(sRawInput);
                        operation = ' ';
                    }
                    else
                    {
                        sDisplay = sDisplay + "8";
                        sRawInput += "8";
                        tfRawInput.setText(sRawInput);
                    }
                }

            }
        });
        //8end
//9

        bNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bNine)
                {
                    if(operation == '=')
                    {
                        sDisplay = "9";
                        sRawInput = "9";
                        tfRawInput.setText(sRawInput);
                        operation = ' ';
                    }
                    else
                    {
                        sDisplay = sDisplay + "9";
                        sRawInput += "9";
                        tfRawInput.setText(sRawInput);
                    }
                }
            }
        });
        //9end

//0
        bZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bZero)
                {
                    if(sDisplay.equals(""))  //zero at first
                    {
                        sDisplay = "0";
                        sRawInput += "0";
                        tfRawInput.setText(sRawInput);
                    }
                    else
                    {
                        sDisplay = sDisplay + "0";
                        sRawInput += "0";
                        tfRawInput.setText(sRawInput);
                    }
                }
            }
        });
        //0end
            //.
        bPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bPoint) ///when bPoint is clicked
                {
                    if(sDisplay.equals(""))//bPoint at starting of a number
                    {
                        sDisplay = "0.";
                        sRawInput += "0.";
                        tfRawInput.setText(sRawInput);
                    }
                    else if(!isPoint)//when there is no bPoint till now then just add the bPoint
                    {
                        sDisplay = sDisplay + ".";
                        sRawInput += ".";
                        tfRawInput.setText(sRawInput);
                    }
                    isPoint = true;//when the bPoint button is clicked once set the bPoint flag to true
                }
            }
        });
        //.end

//+
        bAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                if (e.getSource() == bAdd && (!sDisplay.equals("") || operation == '=')) // + button is clicked and input is not empty
                {
                    if(!isOperation)//to check if plus without number1
                    {
                        number1 = Double.parseDouble(sDisplay);
                        sDisplay = "";
                        operation = '+';
                        isPlus = true;
                        sRawInput += " + ";
                        tfRawInput.setText(sRawInput);
                        if(isPoint)//when there is any bPoint number or any bDivision operation, there may be a bPoint in the result
                        {
                            tfDisplay.setText(""+number1);
                        }
                        else if(!isPoint)//when there is no bPoint in the result
                        {
                            tfDisplay.setText(""+(long)number1);
                        }
                    }
                    else if(isOperation && operation != '=')
                    {
                        number2  = Double.parseDouble(sDisplay);

                        if(operation == '+')
                        {
                            result = number1 + number2;
                        }
                        else if(operation == '-')
                        {
                            result = number1 - number2;
                        }
                        else if(operation == '*')
                        {
                            result = number1 * number2;
                        }
                        else if(operation == '/')
                        {
                            result = number1 / number2;
                        }

                        else
                        {
                            result = number2;
                        }
                        String temp = "";
                        if(isPoint || operation == '/')//when there is any bPoint number or any bDivision operation, there may be a bPoint in the result
                        {
                            tfDisplay.setText(""+result);
                            temp = ""+result;
                        }
                        else if(!isPoint)//when there is no bPoint in the result
                        {
                            tfDisplay.setText(""+(long)result);
                            temp = ""+(long)result;
                        }
                        operation = '+';
                        sDisplay = "";
                        number1 = result;
                        isPlus = true;
                        isPoint = false;
                        isOperation = true;
                        sRawInput += " + ";
                        tfRawInput.setText(sRawInput);
                        sRawInput = temp + " + ";
                    }
                    else if(operation == '=')
                    {
                        sDisplay = "";
                        operation = '+';
                        isPlus = true;
                        isOperation = true;
                        sRawInput += " + ";
                        tfRawInput.setText(sRawInput);
                    }
                    isOperation = true;
                }

            }
        });
        //+end



        //-

        bSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bSub && (!sDisplay.equals("") || operation == '='))  // - button is clicked and input is not empty
                {
                    if(!isOperation)//to check if plus without number1
                    {
                        number1 = Double.parseDouble(sDisplay);
                        sDisplay = "";
                        operation = '-';
                        isPlus = true;
                        sRawInput += " - ";
                        tfRawInput.setText(sRawInput);
                        if(isPoint)//when there is any bPoint number or any bDivision operation, there may be a bPoint in the result
                        {
                            tfDisplay.setText(""+number1);
                        }
                        else if(!isPoint)//when there is no bPoint in the result
                        {
                            tfDisplay.setText(""+(long)number1);
                        }
                    }
                    else if(isOperation && operation != '=')
                    {
                        number2  = Double.parseDouble(sDisplay);

                        if(operation == '+')
                        {
                            result = number1 + number2;
                        }
                        else if(operation == '-')
                        {
                            result = number1 - number2;
                        }
                        else if(operation == '*')
                        {
                            result = number1 * number2;
                        }
                        else if(operation == '/')
                        {
                            result = number1 / number2;
                        }

                        else
                        {
                            result = number2;
                        }
                        String temp = "";
                        if(isPoint || operation == '/')//when there is any bPoint number or any bDivision operation, there may be a bPoint in the result
                        {
                            tfDisplay.setText(""+result);
                            temp = ""+result;
                        }
                        else if(!isPoint)//when there is no bPoint in the result
                        {
                            tfDisplay.setText(""+(long)result);
                            temp = ""+(long)result;
                        }
                        operation = '-';
                        sDisplay = "";
                        number1 = result;
                        isPlus = true;
                        isPoint = false;
                        isOperation = true;
                        sRawInput += " - ";
                        tfRawInput.setText(sRawInput);
                        sRawInput = temp + " + ";
                    }
                    else if(operation == '=')
                    {
                        sDisplay = "";
                        operation = '-';
                        isPlus = true;
                        isOperation = true;
                        sRawInput += " - ";
                        tfRawInput.setText(sRawInput);
                    }
                    isOperation = true;
                }

            }
        });
        //-end

        //*

        bMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bMul && (!sDisplay.equals("") || operation == '='))  // * button is clicked and input is not empty
                {
                    if(!isOperation)//to check if plus without number1
                    {
                        number1 = Double.parseDouble(sDisplay);
                        sDisplay = "";
                        operation = '*';
                        isPlus = true;
                        sRawInput += " \u00D7 ";
                        tfRawInput.setText(sRawInput);
                        if(isPoint)//when there is any bPoint number or any bDivision operation, there may be a bPoint in the result
                        {
                            tfDisplay.setText(""+number1);
                        }
                        else if(!isPoint)//when there is no bPoint in the result
                        {
                            tfDisplay.setText(""+(long)number1);
                        }
                    }
                    else if(isOperation && operation != '=')
                    {
                        number2  = Double.parseDouble(sDisplay);

                        if(operation == '+')
                        {
                            result = number1 + number2;
                        }
                        else if(operation == '-')
                        {
                            result = number1 - number2;
                        }
                        else if(operation == '*')
                        {
                            result = number1 * number2;
                        }
                        else if(operation == '/')
                        {
                            result = number1 / number2;
                        }

                        else
                        {
                            result = number2;
                        }
                        String temp = "";
                        if(isPoint || operation == '/')//when there is any bPoint number or any bDivision operation, there may be a bPoint in the result
                        {
                            tfDisplay.setText(""+result);
                            temp = ""+result;
                        }
                        else if(!isPoint)//when there is no bPoint in the result
                        {
                            tfDisplay.setText(""+(long)result);
                            temp = ""+(long)result;
                        }
                        operation = '*';
                        sDisplay = "";
                        number1 = result;
                        isPlus = true;
                        isPoint = false;
                        isOperation = true;
                        sRawInput += " \u00D7 ";
                        tfRawInput.setText(sRawInput);
                        sRawInput = temp + " \u00D7 ";
                    }
                    else if(operation == '=')
                    {
                        sDisplay = "";
                        operation = '*';
                        isPlus = true;
                        isOperation = true;
                        sRawInput += " \u00D7 ";
                        tfRawInput.setText(sRawInput);
                    }
                    isOperation = true;
                }

            }
        });
        //*end

//div
        bDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bDiv && (!sDisplay.equals("") || operation == '='))  // bDivision button is clicked and input is not empty
                {
                    if (!isOperation)//to check if plus without number1
                    {
                        number1 = Double.parseDouble(sDisplay);
                        sDisplay = "";
                        operation = '/';
                        isPlus = true;
                        sRawInput += " / ";
                        tfRawInput.setText(sRawInput);
                        if (isPoint)//when there is any bPoint number or any bDivision operation, there may be a bPoint in the result
                        {
                            tfDisplay.setText("" + number1);
                        } else if (!isPoint)//when there is no bPoint in the result
                        {
                            tfDisplay.setText("" + (long) number1);
                        }
                    } else if (isOperation && operation != '=') {
                        number2 = Double.parseDouble(sDisplay);

                        if (operation == '+') {
                            result = number1 + number2;
                        } else if (operation == '-') {
                            result = number1 - number2;
                        } else if (operation == '*') {
                            result = number1 * number2;
                        } else if (operation == '/') {
                            result = number1 / number2;
                        }


                        else if(number2==0)
                        {
                           tfDisplay.setText("Error");

                        }

                        else {
                            result = number2;
                        }
                        String temp = "";
                        if (isPoint || operation == '/')//when there is any bPoint number or any bDivision operation, there may be a bPoint in the result
                        {
                            tfDisplay.setText("" + result);
                            temp = "" + result;
                        } else if (!isPoint)//when there is no bPoint in the result
                        {
                            tfDisplay.setText("" + (long) result);
                            temp = "" + (long) result;
                        }
                        operation = '*';
                        sDisplay = "";
                        number1 = result;
                        isPlus = true;
                        isPoint = false;
                        isOperation = true;
                        sRawInput += " / ";
                        tfRawInput.setText(sRawInput);
                        sRawInput = temp + " / ";
                    } else if (operation == '=') {
                        sDisplay = "";
                        operation = '/';
                        isPlus = true;
                        isOperation = true;
                        sRawInput += " / ";
                        tfRawInput.setText(sRawInput);
                    }
                    isOperation = true;
                }


            }
        });
        //div end

            //=
        bEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bEqual && !sDisplay.equals(""))//when bEqual button is clicked and the input is not empty
                {
                    number2  = Double.parseDouble(sDisplay);

                    if(operation == '+')
                    {
                        result = number1 + number2;
                    }
                    else if(operation == '-')
                    {
                        result = number1 - number2;
                    }
                    else if(operation == '*')
                    {
                        result = number1 * number2;
                    }
                    else if(operation == '/')
                    {
                        result = number1 / number2;
                    }

                    else
                    {
                        result = number2;
                    }
                    String temp = "";
                    if(isPoint || operation == '/')//when there is any bPoint number or any bDivision operation, there may be a bPoint in the result
                    {
                        tfDisplay.setText(""+result);
                        temp = ""+result;
                    }
                    else if(!isPoint)//when there is no bPoint in the result
                    {
                        tfDisplay.setText(""+(long)result);
                        temp = ""+(long)result;
                    }
                    sDisplay = "";
                    number1 = result;
                    isPlus = true;
                    isPoint = false;
                    isOperation = true;
                    sRawInput += " = ";
                    tfRawInput.setText(sRawInput);
                    sRawInput = temp;
                    operation = '=';
                }

            }
        });
        //=end
        //////////////////////

          //del
        bDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bDel && !sDisplay.equals(""))//DE button
                {
                    sDisplay = sDisplay.substring(0, sDisplay.length()-1);
                    sRawInput = sRawInput.substring(0, sRawInput.length()-1);
                    if(sRawInput.equals(""))//after deleting the last digit
                    {
                        //tfDisplay.setText("0");
                        tfRawInput.setText("0");
                    }
                    else
                    {
                        //tfDisplay.setText(sDisplay);
                        tfRawInput.setText(sRawInput);
                    }
                }

            }
        });
        //del end

            //clear
        bClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == bClear)//Clear button
                {
                    number1 = number2 = result = 0;
                    sDisplay = "";
                    operation = ' ';
                    tfDisplay.setText("0");
                    isPoint = false;
                    isPlus = true;
                    isOperation = false;
                    sRawInput = "";
                    tfRawInput.setText("0");
                }

            }
        });
        //clear end
            //exit
        bExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == bExit)//exit button
                {
                    System.exit(0);
                }
            }
        });
        //exit end

        //next
        bNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               Shuvo.frame.setContentPane(new Advance().main5);
                Shuvo.frame.show();

            }
        });
        //next end

        bPrevious.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Shuvo.frame.setContentPane(new allButton().c1);
                Shuvo.frame.show();
            }
        });
    }
}
