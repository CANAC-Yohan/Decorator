import javax.swing.*;
import java.awt.*;

public class BackgroundDecorator extends JButton implements IButton
{
    private final IButton beforeButton;

    BackgroundDecorator(IButton beforeButton)
    {
        this.beforeButton = beforeButton;
        this.setBackground(Background());
    }

    public Color Background()
    {
        return this.beforeButton.Background();
    }

    public boolean HideOnClick()
    {
        return this.beforeButton.HideOnClick();
    }

    public String TextUpperCase()
    {
        return this.beforeButton.TextUpperCase();
    }
}