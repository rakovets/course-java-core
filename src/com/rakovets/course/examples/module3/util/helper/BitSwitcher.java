package com.rakovets.course.examples.module3.util.helper;

import javax.swing.*;
import java.awt.*;
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
public class BitSwitcher extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JLabel result = new JLabel("0");
    private JToggleButton signButton = new JToggleButton("Без знаковый");
    private List<JButton> buttons = new ArrayList<>(8);
    private ButtonGroup settings = new ButtonGroup();
    private int bitSize = 8;
    private int sizeCooficient;

    public BitSwitcher(String[] args)
    {
        if (args != null && args.length > 0)
        {
            if (args[0].startsWith("-b"))
            {
                bitSize = Integer.parseInt(args[0].substring(2).trim());
                bitSize = bitSize < 8 ? 8 : bitSize;
                setSize(800 * bitSize / 8, 300);
            }
        }
        else
        {
            setSize(800, 300);
        }
        sizeCooficient = bitSize / Byte.SIZE;
        setTitle("Bits viewer");

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        result.setFont(new Font("Arial", Font.BOLD, 60 / sizeCooficient));
        result.setHorizontalAlignment(JLabel.CENTER);
        result.setForeground(Color.RED);
        result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        getContentPane().add(result, BorderLayout.NORTH);

        JPanel buttonBitPanel = new JPanel(new GridLayout(2, 8, 5, 0));
        int value = 1 << bitSize >> 1;
        for (int i = 0; i < bitSize; i++)
        {
            JLabel label = new JLabel(String.valueOf(value));
            label.setFont(new Font("Arial", Font.BOLD, 30 / sizeCooficient));
            label.setHorizontalAlignment(JLabel.CENTER);
            value = value >> 1;
            buttonBitPanel.add(label);
        }

        for (int i = 0; i < bitSize; i++)
        {
            JButton button = new JButton("0");
            buttons.add(button);
            button.setFont(new Font("Arial", Font.BOLD, 46 / sizeCooficient));
            button.addActionListener((event) -> {
                JButton source = (JButton) event.getSource();
                if (source.getText().equals("0"))
                {
                    source.setText("1");
                }
                else
                {
                    source.setText("0");
                }
                changeValue();
            });
            buttonBitPanel.add(button);
        }

        getContentPane().add(buttonBitPanel);
        JPanel panel = new JPanel(new FlowLayout());
        ActionListener listener = (event) -> {
            changeValue();
        };
        JRadioButton button = new JRadioButton("Шестнадцатеричная");
        button.setActionCommand("16");
        button.addActionListener(listener);
        panel.add(button);
        settings.add(button);
        button = new JRadioButton("Восьмиричная");
        button.setActionCommand("8");
        button.addActionListener(listener);
        panel.add(button);
        settings.add(button);
        button = new JRadioButton("Десятичная");
        button.setActionCommand("10");
        button.setSelected(true);
        button.addActionListener(listener);
        panel.add(button);
        settings.add(button);
        signButton.addActionListener((event) -> {
            if (signButton.isSelected())
            {
                signButton.setText("Знаковый");
                buttons.get(0).setForeground(Color.RED);
            }
            else
            {
                signButton.setText("Без знаковый");
                buttons.get(0).setForeground(Color.BLACK);
            }
            changeValue();
        });
        panel.add(signButton);

        getContentPane().add(panel, BorderLayout.SOUTH);
    }

    protected void changeValue()
    {
        StringBuilder sb = new StringBuilder();
        for (JButton jButton : buttons)
        {
            sb.append(jButton.getText());
        }
        String action = settings.getSelection().getActionCommand();
        int bitValue = Integer.parseInt(sb.toString(), 2);
        if (signButton.isSelected() && buttons.get(0).getText().equals("1"))
        {
            bitValue = ~bitValue;
            bitValue = bitValue ^ 0b11111111;
        }
        switch (action)
        {
            case "10":
                result.setText(Integer.toString(bitValue));
                break;
            case "8":
                result.setText("0" + Integer.toOctalString(bitValue));
                break;
            case "16":
                result.setText("0x" + Integer.toHexString(bitValue).toUpperCase());
                break;
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            BitSwitcher bitViewer = new BitSwitcher(args);
            bitViewer.setVisible(true);
        });
    }
}