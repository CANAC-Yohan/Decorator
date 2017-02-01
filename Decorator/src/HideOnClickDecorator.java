import javax.swing.*;
import java.awt.*;

public class HideOnClickDecorator extends JButton implements IButton
{
    private final IButton beforeButton;

    HideOnClickDecorator(IButton beforeButton)
    {
        this.beforeButton = beforeButton;
        this.setEnabled(HideOnClick());
    }

    public boolean HideOnClick()
    {
        if(this.beforeButton.HideOnClick()){

        }
        return this.beforeButton.HideOnClick();
    }

    public String TextUpperCase()
    {
        return this.beforeButton.TextUpperCase();
    }

    public Color Background()
    {
        return this.beforeButton.Background();
    }
}