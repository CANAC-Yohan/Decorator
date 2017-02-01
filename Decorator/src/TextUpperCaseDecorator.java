import javax.swing.*;
import java.awt.*;

public class TextUpperCaseDecorator extends JButton implements IButton
{
    private final IButton beforeButton;

    TextUpperCaseDecorator(IButton beforeButton)
    {
        this.beforeButton = beforeButton;
        this.setText(TextUpperCase());
    }

    public String TextUpperCase()
    {
        return this.beforeButton.TextUpperCase();
    }

    public boolean HideOnClick()
    {
        return this.beforeButton.HideOnClick();
    }

    public Color Background()
    {
        return this.beforeButton.Background();
    }
}