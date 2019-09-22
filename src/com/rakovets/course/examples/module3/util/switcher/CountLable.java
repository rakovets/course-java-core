package com.rakovets.course.examples.module3.util.switcher;

import javax.swing.*;
import java.awt.*;

/**
 * Метка отображает результат переключение битов
 * @author Maxim Gromko java 6 
 * @since  0.0.1
 */
public class CountLable extends JLabel
{
    private static final long serialVersionUID = 1L;
    private int numb = 0;

    public CountLable()
    {
        setForeground(Color.red);
        setSize(new Dimension(500, 50));
        setFont(new Font("Arial", Font.BOLD, 40));
        setText(String.valueOf(numb));
    }

    public void addNumb(int value)
    {
        numb += value;
        setText(String.valueOf(numb));
        repaint();
    }

    public void subtractionNumb(int value)
    {
        numb -= value;
        setText(String.valueOf(numb));
        repaint();
    }

    public int getNumb()
    {
        return numb;
    }

    public void setNumb(int numb)
    {
        this.numb = numb;
        setText(String.valueOf(numb));
    }
}