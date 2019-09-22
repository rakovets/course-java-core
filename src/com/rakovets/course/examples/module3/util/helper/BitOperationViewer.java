package com.rakovets.course.examples.module3.util.helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Визуализирует переключение битов в числе и преобразхование в различные
 * системы счисления
 * 
 * @author VUnguryan
 * @since 0.0.1
 */
public class BitOperationViewer extends JFrame
{
    private static final long serialVersionUID = 1L;
    private List<JButton> buttonsOne = new ArrayList<>(8);
    private List<JButton> buttonsTwo = new ArrayList<>(8);
    private List<JLabel> result = new ArrayList<>(8);
    private JLabel labelOne = new JLabel("0");
    private JLabel labelTwo = new JLabel("0");
    private JLabel labelResult = new JLabel("0");
    private String operation;

    private int bitSize = 8;

    public BitOperationViewer(String[] args)
    {
        if (args != null && args.length > 0)
        {
            operation = args[0];
        }
        else
        {
            Object[] possibilities = { "OR", "AND", "XOR", "NOT", "<<", ">>", ">>" };
            operation = (String) JOptionPane.showInputDialog(null, "Выберите тип операции\n", "Битовые опреации",
                    JOptionPane.PLAIN_MESSAGE, null, possibilities, "OR");
            if(operation == null){
                System.exit(0);
            }
        }
        setSize(800, 400);
        setTitle("Bits viewer for students");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initLabel(labelOne);
        initLabel(labelTwo);
        initLabel(labelResult);
        JPanel buttonBitPanel = new JPanel(new GridLayout(0, 9, 5, 5));

        for (int i = 0; i < bitSize; i++)
        {
            JButton button = new JButton("0");
            buttonsOne.add(button);
            button.setFont(new Font("Arial", Font.BOLD, 46));
            button.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    JButton button = (JButton) e.getSource();
                    if (button.getText().equals("0"))
                    {
                        button.setText("1");
                    }
                    else
                    {
                        button.setText("0");
                    }
                    changeValue();
                }
            });
            buttonBitPanel.add(button);
        }
        buttonBitPanel.add(labelOne);
        buttonBitPanel.add(new JLabel());
        buttonBitPanel.add(new JLabel());
        buttonBitPanel.add(new JLabel());
        buttonBitPanel.add(new JLabel());
        JLabel operationLabel = new JLabel(operation);
        operationLabel.setForeground(Color.MAGENTA);
        operationLabel.setFont(new Font("Areal", Font.BOLD, 36));
        buttonBitPanel.add(operationLabel);
        buttonBitPanel.add(new JLabel());
        buttonBitPanel.add(new JLabel());
        buttonBitPanel.add(new JLabel());
        buttonBitPanel.add(new JLabel());
        if (!"NOT".equalsIgnoreCase(operation))
        {
            for (int i = 0; i < bitSize; i++)
            {
                JButton button = new JButton("0");
                buttonsTwo.add(button);
                button.setFont(new Font("Arial", Font.BOLD, 46));
                button.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        JButton button = (JButton) e.getSource();
                        if (button.getText().equals("0"))
                        {
                            button.setText("1");
                        }
                        else
                        {
                            button.setText("0");
                        }
                        changeValue();
                    }
                });
                buttonBitPanel.add(button);
            }
            buttonBitPanel.add(labelTwo);
        }

        for (int i = 0; i < bitSize; i++)
        {
            JLabel label = new JLabel("0");
            result.add(label);
            label.setFont(new Font("Arial", Font.BOLD, 60));
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setForeground(Color.RED);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            buttonBitPanel.add(label);
        }
        buttonBitPanel.add(labelResult);
        getContentPane().add(buttonBitPanel);
        JPanel panel = new JPanel(new FlowLayout());
        getContentPane().add(panel, BorderLayout.SOUTH);
    }

    protected void changeValue()
    {
        int bitValue1 = getBits(buttonsOne);
        labelOne.setText(String.valueOf(bitValue1));
        int bitResult;
        switch (operation)
        {
            case "OR":
                int bitValue2 = getBits(buttonsTwo);
                labelTwo.setText(String.valueOf(bitValue2));
                bitResult = bitValue1 | bitValue2;
                break;
            case "AND":
                bitValue2 = getBits(buttonsTwo);
                labelTwo.setText(String.valueOf(bitValue2));
                bitResult = bitValue1 & bitValue2;
                break;
            case "XOR":
                bitValue2 = getBits(buttonsTwo);
                labelTwo.setText(String.valueOf(bitValue2));
                bitResult = bitValue1 ^ bitValue2;
                break;
            case "NOT":
                bitResult = ~bitValue1;
                break;
            case "<<":
                bitValue2 = getBits(buttonsTwo);
                labelTwo.setText(String.valueOf(bitValue2));
                bitResult = bitValue1 << bitValue2;
                break;
            case ">>":
                bitValue2 = getBits(buttonsTwo);
                labelTwo.setText(String.valueOf(bitValue2));
                bitResult = bitValue1 >> bitValue2;
                break;
            case ">>>":
                bitValue2 = getBits(buttonsTwo);
                labelTwo.setText(String.valueOf(bitValue2));
                bitResult = bitValue1 >>> bitValue2;
                break;
            default:
                bitResult = 0;
                break;
        }
        labelResult.setText(String.valueOf(bitResult));
        String stringResult = Integer.toBinaryString(bitResult);
        stringResult = (stringResult.length() == 32) ? stringResult.substring(24) : stringResult;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Byte.SIZE - stringResult.length(); i++)
        {
            sb.append("0");
        }
        sb.append(stringResult);
        stringResult = sb.toString();
        int index = 0;
        for (JLabel label : result)
        {
            label.setText(String.valueOf(stringResult.charAt(index++)));
        }
    }

    private static int getBits(List<JButton> buttons)
    {
        StringBuilder sb = new StringBuilder();
        for (JButton jButton : buttons)
        {
            sb.append(jButton.getText());
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    private static void initLabel(JLabel label)
    {
        label.setFont(new Font("Arial", Font.BOLD, 36));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(BorderFactory.createLineBorder(Color.GREEN));
    }

    public static void main(String[] args)
    {
        BitOperationViewer bitViewer = new BitOperationViewer(args);
        bitViewer.setVisible(true);
    }
}