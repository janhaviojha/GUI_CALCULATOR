/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

    public class Calc_swing extends javax.swing.JFrame {


        public Calc_swing()
        {
            initComponents();
        }




        private void initComponents() {

            clearallbutton = new javax.swing.JButton();
            dividebutton = new javax.swing.JButton();
            button7 = new javax.swing.JButton();
            button8 = new javax.swing.JButton();
            button9 = new javax.swing.JButton();
            multiplybutton = new javax.swing.JButton();
            button6 = new javax.swing.JButton();
            button5 = new javax.swing.JButton();
            button4 = new javax.swing.JButton();
            minusbutton = new javax.swing.JButton();
            button3 = new javax.swing.JButton();
            button2 = new javax.swing.JButton();
            addbutton = new javax.swing.JButton();
            button1 = new javax.swing.JButton();
            button0 = new javax.swing.JButton();
            decibutton = new javax.swing.JButton();
            equalsbutton = new javax.swing.JButton();
            plusminusbutton = new javax.swing.JButton();
            clearbutton = new javax.swing.JButton();
            delbutton = new javax.swing.JButton();
            jTextField1 = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(0, 0, 0));

            clearallbutton.setBackground(new java.awt.Color(51, 153, 0));
            clearallbutton.setText("C");
            clearallbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    clearallbuttonActionPerformed(evt);
                }
            });

            dividebutton.setBackground(new java.awt.Color(51, 153, 0));
            dividebutton.setText("/");
            dividebutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dividebuttonActionPerformed(evt);
                }
            });

            button7.setBackground(new java.awt.Color(204, 255, 204));
            button7.setText("7");
            button7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button7ActionPerformed(evt);
                }
            });

            button8.setBackground(new java.awt.Color(204, 255, 204));
            button8.setText("8");
            button8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button8ActionPerformed(evt);
                }
            });

            button9.setBackground(new java.awt.Color(204, 255, 204));
            button9.setText("9");
            button9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button9ActionPerformed(evt);
                }
            });

            multiplybutton.setBackground(new java.awt.Color(51, 153, 0));
            multiplybutton.setText("*");
            multiplybutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    multiplybuttonActionPerformed(evt);
                }
            });

            button6.setBackground(new java.awt.Color(204, 255, 204));
            button6.setText("6");
            button6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button6ActionPerformed(evt);
                }
            });

            button5.setBackground(new java.awt.Color(204, 255, 204));
            button5.setText("5");
            button5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button5ActionPerformed(evt);
                }
            });

            button4.setBackground(new java.awt.Color(204, 255, 204));
            button4.setText("4");
            button4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button4ActionPerformed(evt);
                }
            });

            minusbutton.setBackground(new java.awt.Color(51, 153, 0));
            minusbutton.setText("-");
            minusbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    minusbuttonActionPerformed(evt);
                }
            });

            button3.setBackground(new java.awt.Color(204, 255, 204));
            button3.setText("3");
            button3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button3ActionPerformed(evt);
                }
            });

            button2.setBackground(new java.awt.Color(204, 255, 204));
            button2.setText("2");
            button2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button2ActionPerformed(evt);
                }
            });

            addbutton.setBackground(new java.awt.Color(51, 153, 0));
            addbutton.setText("+");
            addbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addbuttonActionPerformed(evt);
                }
            });

            button1.setBackground(new java.awt.Color(204, 255, 204));
            button1.setText("1");
            button1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button1ActionPerformed(evt);
                }
            });

            button0.setBackground(new java.awt.Color(204, 255, 204));
            button0.setText("0");
            button0.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button0ActionPerformed(evt);
                }
            });

            decibutton.setBackground(new java.awt.Color(51, 153, 0));
            decibutton.setText(".");
            decibutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    decibuttonActionPerformed(evt);
                }
            });

            equalsbutton.setBackground(new java.awt.Color(51, 153, 0));
            equalsbutton.setText("=");
            equalsbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    equalsbuttonActionPerformed(evt);
                }
            });

            plusminusbutton.setBackground(new java.awt.Color(51, 153, 0));
            plusminusbutton.setText("+-");
            plusminusbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    plusminusbuttonActionPerformed(evt);
                }
            });

            clearbutton.setBackground(new java.awt.Color(51, 153, 0));
            clearbutton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
            clearbutton.setText("CE");
            clearbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    clearbuttonActionPerformed(evt);
                }
            });

            delbutton.setBackground(new java.awt.Color(51, 153, 0));
            delbutton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
            delbutton.setText("Del");
            delbutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    delbuttonActionPerformed(evt);
                }
            });

            jTextField1.setEditable(false);
            jTextField1.setBackground(new java.awt.Color(153, 255, 153));
            jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel1.setBackground(new java.awt.Color(153, 255, 153));
            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

            jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("DHUMPOTASH");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 13, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                    .addComponent(delbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                    .addComponent(clearallbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                    .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addContainerGap())
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(minusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(multiplybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(dividebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(plusminusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(decibutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(equalsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addContainerGap()))))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                            .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                            .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                            .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                            .addComponent(multiplybutton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                            .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(minusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(clearallbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(delbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(dividebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(plusminusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(decibutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(equalsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(21, Short.MAX_VALUE))
            );

            pack();
        }



        private boolean deci=false;
        private boolean isminus=false;
        private String sign;
        private double firstval, secondval, realvalue, finalresult;

        private ArrayList<String> arr = new ArrayList<String>();

        private void button0ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"0");
        }
        private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"1");
        }
        private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"2");
        }
        private void button3ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"3");
        }
        private void button4ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"4");
        }
        private void button5ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"5");
        }
        private void button6ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"6");
        }
        private void button7ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"7");
        }
        private void button8ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"8");
        }
        private void button9ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText(jTextField1.getText()+"9");
        }

        private void dividebuttonActionPerformed(java.awt.event.ActionEvent evt)
        {
            sign="/";
            if (jTextField1.getText().length()>0)
                store(sign);
        }

        private void addbuttonActionPerformed(java.awt.event.ActionEvent evt)
        {
            sign="+";
            if (jTextField1.getText().length()>0)
                store(sign);
        }

        private void minusbuttonActionPerformed(java.awt.event.ActionEvent evt)
        {
            sign="-";
            if (jTextField1.getText().length()>0)
                store(sign);

        }

        private void multiplybuttonActionPerformed(java.awt.event.ActionEvent evt)
        {
            sign="*";
            if (jTextField1.getText().length()>0)
                store(sign);
        }


        private void decibuttonActionPerformed(java.awt.event.ActionEvent evt)
        {
            if(deci==false)
            {
                jTextField1.setText(jTextField1.getText()+".");
                deci=true;
            }
        }

        private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt)
        {
            jTextField1.setText("");
        }

        private void clearallbuttonActionPerformed(java.awt.event.ActionEvent evt)
        {
            jTextField1.setText("");
            jLabel1.setText("");
            firstval=0;
            secondval=0;
            arr.clear();      //nahi toh previous values reh jata
            deci=false;         //decii button crashed
            isminus=false;      //s2s

        }

        private void plusminusbuttonActionPerformed(java.awt.event.ActionEvent evt)
        {

            String temp=jTextField1.getText();
            if(isminus==false)              //jodi minus na hoy then add minus
            {
                jTextField1.setText("-"+temp);
                isminus=true;
            }
            else
            {
                temp=temp.replace("-","");      //if minus, then hatake nothing cuz nothing plus
                jTextField1.setText(temp);
                isminus=false;
            }
        }

        private void delbuttonActionPerformed(java.awt.event.ActionEvent evt)
        {
            String temp= jTextField1.getText();
            int len= temp.length();
            if (len>0)
            {
                if (temp.charAt(len-1)=='.')
                    deci=false;
                if (temp.charAt(len-1)=='-')
                    isminus=false;

                jTextField1.setText(temp.substring(0,len-1));

            }
        }


        private void equalsbuttonActionPerformed(java.awt.event.ActionEvent evt)
        {
            String temp= jTextField1.getText();

            if(temp.length()>0)
            {
                jLabel1.setText(jLabel1.getText()+temp);
                arr.add(temp);


            /*//////////////////////////////////// DUBUGGING PURPOSE////////////////////////////////////////////////////
            int j=0;
            while(j<arr.size())
            {
                System.out.println(arr.get(j));
                j++;
            }*//////////////////////////////////////////////////////////////////////////////////////////////////////////


                int pri;
                int wheresign, numberofsign=0;

                //For counting oto gulo signs ache, use? It'll be used to terminate the loop
                for (int x = 0; x < arr.size(); x++)
                {
                    if (arr.get(x) == "+" || arr.get(x) == "*" || arr.get(x) == "-" || arr.get(x) == "/")
                        numberofsign++;
                }

                while(true)
                {
                    pri=0;          //precedence
                    wheresign=0;    //sign ta list e where? use? sign front back numbers will be used


                    //loop to find the operator with shobche besshi precedence
                    for (int x = 0; x < arr.size(); x++)
                    {
                        if (arr.get(x) == "+" || arr.get(x) == "*" || arr.get(x) == "-" || arr.get(x) == "/")
                        {

                            if(borokonta(arr.get(x))>=pri)
                            {
                                pri = borokonta(arr.get(x));
                                wheresign=x;        //which position is the operator   4+2*3.33
                                firstval = Double.parseDouble(arr.get(x - 1));        //prev number eg: 3+4 e etate 3 store
                                secondval = Double.parseDouble(arr.get(x + 1));       //front number eg: 3+4 e etate 4 store
                            }
                        }
                    }



                /*/////////////////////////////////////DEBUG PURPOSE////////////////////////////////////////////////////
                System.out.print("firstval");
                System.out.println(firstval);
                System.out.print("secondval");
                System.out.println(secondval);
                *///////////////////////////////////////////////////////////////////////////////////////////////////////


                    switch(arr.get(wheresign))
                    {
                        case "+": realvalue= sum(firstval,secondval ); break;
                        case "-": realvalue= subtract(firstval, secondval); break;
                        case "*": realvalue= multiply(firstval, secondval); break;
                        case "/": realvalue= divide(firstval, secondval);  break;
                    }

                    numberofsign--;     //use? loop will run the amount of timesss as the no. of operators
                    //tai when that becomes 0, stop the loooop

                    if (numberofsign==0)
                    {
                        finalresult=realvalue;
                        break;
                    }

                /*///////////////////////////////////DEBUGGING PURPOSES/////////////////////////////////////////////////
                System.out.print("Wheresign=");
                System.out.println(wheresign);
                *///////////////////////////////////////////////////////////////////////////////////////////////////////

                    arr.set(wheresign-1, Double.toString(realvalue));
                    arr.remove(wheresign);
                    arr.remove(wheresign);

                /* V important part
                        recall 4 +   2  * 3.33     example
                               0 1   2  3 4
                 */

                /* /////////////////////////////////DEBUGGING PURPOSES/////////////////////////////////////////////////
                j=0;
                while(j<arr.size())
                {
                    System.out.println(arr.get(j));
                    j++;
                }

                SetResult(Double.toString(realvalue));
                *///////////////////////////////////////////////////////////////////////////////////////////////////////

                }

                SetResult(Double.toString(finalresult));

            }
        }

        private int borokonta(String s)
        {
            if (s=="/" || s=="*")
                return 2;

            return 1;

        }


        private void store(String sign)
        {
            String val= jTextField1.getText();
            arr.add(val);
            arr.add(sign);
            deci=false;
            isminus=false;
            jLabel1.setText(jLabel1.getText()+ " " + val + " "+ sign);
            jTextField1.setText("");

        }


        double sum(double a, double b)
        {
            double temp=a+b;
            return(temp);
        }

        double subtract(double a, double b)
        {
            double temp=a-b;
            return(temp);
        }

        double multiply(double a, double b)
        {
            double temp= a*b;
            return(temp);
        }

        double divide(double a, double b)
        {
            double temp=a/b;
            return(temp);
        }

        private void SetResult(String result)
        {
            jTextField1.setText(result);
            jLabel1.setText("");
        }

        ///////////////////////////NOT WORKING DURING RUNTIME///////////////////////////////////////
    /*private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt)
    {



            //System.out.println("peepoopeepoo");   Debug




    }*/
        /////////////////////////////////////////////////////////////////////////////////////////////


        public static void main(String args[])
        {
            java.awt.EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    new Calc_swing().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify
        private javax.swing.JButton addbutton;
        private javax.swing.JButton button0;
        private javax.swing.JButton button1;
        private javax.swing.JButton button2;
        private javax.swing.JButton button3;
        private javax.swing.JButton button4;
        private javax.swing.JButton button5;
        private javax.swing.JButton button6;
        private javax.swing.JButton button7;
        private javax.swing.JButton button8;
        private javax.swing.JButton button9;
        private javax.swing.JButton clearallbutton;
        private javax.swing.JButton clearbutton;
        private javax.swing.JButton decibutton;
        private javax.swing.JButton delbutton;
        private javax.swing.JButton dividebutton;
        private javax.swing.JButton equalsbutton;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JButton minusbutton;
        private javax.swing.JButton multiplybutton;
        private javax.swing.JButton plusminusbutton;
        // End of variables declaration
    }



