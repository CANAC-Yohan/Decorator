import javax.swing.*;
import java.awt.*;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowDecorator extends JFrame
{
    public JPanel panelButton;
    public IButton initialButton;

    public MainWindowDecorator(String newTitle, IButton initialButton)
    {
        super(newTitle);
        super(initialButton);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 1));

        JPanel buttonPanel = new JPanel();
        this.add(buttonPanel);

        JPanel actionPanel = new JPanel();
        this.add(actionPanel);

        this.initialButton = initialButton;
        this.setVisible(true);

        JButton textUpperCaseButton = new JButton("Text UpperCase Button");
        textUpperCaseButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                buttonPanel.removeAll();
                initialButton = new TextUpperCaseDecorator((IButton)initialButton);
                buttonPanel.add((TextUpperCaseDecorator)initialButton);
            }
        });
        actionPanel.add(textUpperCaseButton);

        JButton backgroundButton = new JButton("Background Button");
        backgroundButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                buttonPanel.removeAll();
                initialButton = new BackgroundDecorator((IButton)initialButton);
                buttonPanel.add((BackgroundDecorator)initialButton);
            }
        });
        actionPanel.add(backgroundButton);

        JButton hideOnClickButton = new JButton("HOC Button");
        hideOnClickButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                buttonPanel.removeAll();
                initialButton = new HideOnClickDecorator((IButton)initialButton);
                buttonPanel.add((HideOnClickDecorator)initialButton);
            }
        });
        actionPanel.add(hideOnClickButton);
    }
}