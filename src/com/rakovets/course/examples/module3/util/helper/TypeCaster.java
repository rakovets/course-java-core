package com.rakovets.course.examples.module3.util.helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TypeCaster extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JLabel message = new JLabel("<html>Выбери примитивные типы<br> для преобразования:");

    public TypeCaster()
    {
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setFont(new Font("Areal", Font.PLAIN, 36));
        final ButtonGroup buttonGroupLeft = new ButtonGroup();
        ButtonGroup buttonGroupRight = new ButtonGroup();
        ItemListener listener = new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if (buttonGroupLeft.getSelection() == null || buttonGroupRight.getSelection() == null)
                {
                    return;
                }
                String command1 = buttonGroupLeft.getSelection().getActionCommand();
                String command2 = buttonGroupRight.getSelection().getActionCommand();
                if (command1.equals(command2))
                {
                    message.setForeground(Color.BLUE);
                    message.setText("<html>Не требуется<br> преобразование");
                }
                else if (("boolean".equals(command1) && !"boolean".equals(command2))
                        || (("boolean".equals(command2) && !("boolean".equals(command1)))))
                {
                    message.setForeground(Color.RED);
                    message.setText("Нельзя преобразовывать");
                }
                else if ("byte".equals(command1) && "char".equals(command2))
                {
                    message.setForeground(Color.RED);
                    message.setText(
                            "<html>Явное преобразовывание<br> Возможна потеря значения в случае отрицательного значения byte");
                }
                else if ("short".equals(command1) && "char".equals(command2))
                {
                    message.setForeground(Color.RED);
                    message.setText(
                            "<html>Явное преобразовывание<br> Возможна потеря значения в случае отрицательного значения byte");
                }
                else if ("short".equals(command1) && "byte".equals(command2))
                {
                    message.setForeground(Color.MAGENTA);
                    message.setText("Явное преобразовывание");
                }
                else if ("char".equals(command1) && "byte".equals(command2))
                {
                    message.setForeground(Color.MAGENTA);
                    message.setText("<html>Явное преобразовывание<br>Возможно переполнение");
                }
                else if ("char".equals(command1) && "short".equals(command2))
                {
                    message.setForeground(Color.MAGENTA);
                    message.setText("<html>Явное преобразовывание<br>Возможно переполнение");
                }
                else if ("int".equals(command1) && "short".equals(command2))
                {
                    message.setForeground(Color.MAGENTA);
                    message.setText("<html>Явное преобразовывание<br>Возможно переполнение");
                }
                else if ("int".equals(command1) && "byte".equals(command2))
                {
                    message.setForeground(Color.MAGENTA);
                    message.setText("<html>Явное преобразовывание <br>Возможно переполнение");
                }
                else if ("int".equals(command1) && "char".equals(command2))
                {
                    message.setForeground(Color.RED);
                    message.setText(
                            "<html>Явное преобразовывание <br>Возможна потеря значения в случае отрицательного значения int. <br> Возможно переполнение");
                }
                else if ("int".equals(command1) && "float".equals(command2))
                {
                    message.setForeground(Color.RED);
                    message.setText("<html>НЕ явное преобразовывание <br>Возможна потеря точности");
                }
                else if ("long".equals(command1) && !"double".equals(command2))
                {
                    message.setForeground(Color.MAGENTA);
                    message.setText("<html>Явное преобразовывание. <br>Возможна потеря точности");
                }
                else if ("float".equals(command1) && !"double".equals(command2))
                {
                    message.setForeground(Color.MAGENTA);
                    message.setText("<html>Явное преобразовывание. <br>Возможна потеря точности");
                }

                else if ("double".equals(command1))
                {
                    message.setForeground(Color.MAGENTA);
                    message.setText("<html>Явное преобразовывание. <br>Возможна потеря точности");
                }
                else
                {
                    message.setForeground(Color.GREEN);
                    message.setText("<html>НЕ явное<br> преобразовывание");
                }
            }
        };
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.setBorder(BorderFactory.createTitledBorder("примитивные типы"));
        panel.add(createButton(buttonGroupLeft, "boolean", listener));
        panel.add(createButton(buttonGroupRight, "boolean", listener));

        panel.add(createButton(buttonGroupLeft, "byte", listener));
        panel.add(createButton(buttonGroupRight, "byte", listener));

        panel.add(createButton(buttonGroupLeft, "short", listener));
        panel.add(createButton(buttonGroupRight, "short", listener));

        panel.add(createButton(buttonGroupLeft, "char", listener));
        panel.add(createButton(buttonGroupRight, "char", listener));

        panel.add(createButton(buttonGroupLeft, "int", listener));
        panel.add(createButton(buttonGroupRight, "int", listener));

        panel.add(createButton(buttonGroupLeft, "long", listener));
        panel.add(createButton(buttonGroupRight, "long", listener));

        panel.add(createButton(buttonGroupLeft, "float", listener));
        panel.add(createButton(buttonGroupRight, "float", listener));

        panel.add(createButton(buttonGroupLeft, "double", listener));
        panel.add(createButton(buttonGroupRight, "double", listener));

        getContentPane().add(panel);
        getContentPane().add(message, BorderLayout.NORTH);
        pack();
    }

    private static JRadioButton createButton(ButtonGroup group, String action, ItemListener listener)
    {
        JRadioButton button = new JRadioButton(action);
        group.add(button);
        button.setActionCommand(action);
        button.addItemListener(listener);
        button.setFont(new Font("Areal", Font.PLAIN, 36));
        return button;
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            TypeCaster typeCaster = new TypeCaster();
            typeCaster.setVisible(true);
        });
    }
}
