package com.rakovets.course.examples.module3.util.switcher;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Класс отображает переключение битов
 * @author Maxim Gromko java 6 
 * @since  0.0.1
 */
public class BitFrame extends JFrame
{
    private static final long serialVersionUID = 1L;
    private LampButton[] lamp = new LampButton[8];
    private CountLable lable = new CountLable();
    private JButton plus = new JButton(new ImageIcon("imag\\+.png"));
    private JButton subtraction = new JButton(new ImageIcon("imag\\-.png"));
    private JButton allOff = new JButton("all off");
    private JButton allOn = new JButton("all on");

    public BitFrame()
    {
        super("Bit Switch");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200, 200);

        Container container = getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(new GridBagLayout());
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.ipadx = -30;
        constraints.ipady = -9;
        constraints.fill = GridBagConstraints.NONE;
        constraints.insets = new Insets(5, 5, 5, 5);
        for (int i = 0; i < lamp.length; i++)
        {
            lamp[i] = new LampButton((int) Math.pow(2, i));
            constraints.gridx = 8 - i;
            container.add(lamp[i], constraints);
        }

        plus.setBackground(Color.WHITE);
        subtraction.setBackground(Color.WHITE);
        plus.setSize(new Dimension(95, 95));
        subtraction.setSize(new Dimension(95, 95));
        plus.addActionListener(e -> {
            cangeResult();
        });
        subtraction.addActionListener(e -> {
            subtractionNumb();
        });
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.gridx = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(5, 5, 5, 50);
        container.add(plus, constraints);
        constraints.gridx = 5;

        container.add(lable, constraints);
        constraints.gridx = 7;
        constraints.insets = new Insets(5, 50, 5, 5);
        container.add(subtraction, constraints);

        allOff.addActionListener(e -> {
            setCondition(false);
        });
        allOff.setBackground(Color.WHITE);
        allOn.addActionListener(e -> {
            setCondition(true);
        });
        allOn.setBackground(Color.WHITE);
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridwidth = 3;
        constraints.gridx = 0;
        container.add(allOn, constraints);
        constraints.gridx = 7;
        container.add(allOff, constraints);
        pack();
        setResizable(false);

    }

    private void setCondition(boolean b)
    {
        for (int i = 0; i < lamp.length; i++)
        {
            if (b)
            {
                lamp[i].on();
            }
            else
            {
                lamp[i].off();
            }

        }
        if (b)
        {
            lable.setNumb(255);
        }
        else
        {
            lable.setNumb(0);
        }
    }

    private void subtractionNumb()
    {
        int numb = lable.getNumb();
        if (numb > 0)
        {
            lable.setNumb(--numb);
            replaseSwitch(numb);
        }

    }

    private void cangeResult()
    {
        int numb = lable.getNumb();
        if (numb < 255)
        {
            lable.setNumb(++numb);
            replaseSwitch(numb);
        }
    }

    private void replaseSwitch(int numb)
    {

        boolean all = true;
        for (int i = 0; i < lamp.length; i++)
        {
            if (!all)
            {
                lamp[7 - i].off();
                continue;
            }
            if (lamp[7 - i].value == numb)
            {
                lamp[7 - i].on();
                all = false;
            }
            else if (lamp[7 - i].value < numb)
            {
                lamp[7 - i].on();
                numb -= lamp[7 - i].value;
            }
            else if (lamp[7 - i].value > numb)
            {
                lamp[7 - i].off();
            }

        }

    }

    class LampButton extends JButton
    {
        private ImageIcon lampOn;
        private ImageIcon lampOff;
        private boolean isOn = false;
        private int value;
        private File soundOn = new File("sound\\on.wav");
        private File soundOff = new File("sound\\off.wav");
        private Clip clipOn;
        private Clip clipOff;

        public LampButton(int value)
        {
            super();
            this.value = value;
            setBackground(Color.WHITE);
            lampOn = new ImageIcon("imag\\" + value + "On.png");
            lampOff = new ImageIcon("imag\\" + value + "Off.png");

            setSize(70, 125);
            setIcon(lampOff);
            try
            {
                AudioInputStream aisOn = AudioSystem.getAudioInputStream(soundOn);
                clipOn = AudioSystem.getClip();
                clipOn.open(aisOn);
                clipOn.setFramePosition(0);

                AudioInputStream aisOff = AudioSystem.getAudioInputStream(soundOff);
                clipOff = AudioSystem.getClip();
                clipOff.open(aisOff);
                clipOn.setFramePosition(0);
            }
            catch (UnsupportedAudioFileException e1)
            {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            catch (IOException e1)
            {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            catch (LineUnavailableException e1)
            {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            addActionListener(e -> {
                if (isOn)
                {
                    lable.subtractionNumb(value);
                    setIcon(lampOff);
                    isOn = !isOn;
                    clipOff.setFramePosition(0);
                    clipOff.start();
                }
                else
                {
                    lable.addNumb(value);
                    setIcon(lampOn);
                    isOn = !isOn;
                    clipOn.setFramePosition(0);
                    clipOn.start();
                }
            });

        }

        public void on()
        {
            setIcon(lampOn);
            isOn = true;
            clipOn.setFramePosition(0);
            clipOn.start();

        }

        public void off()
        {
            setIcon(lampOff);
            isOn = false;
            clipOff.setFramePosition(0);
            clipOff.start();
        }
    }

}
