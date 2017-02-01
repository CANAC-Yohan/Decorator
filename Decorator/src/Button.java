import javax.swing.*;
import java.awt.*;

public class Button extends JButton implements IButton {

    public Button(String text)
    {
        super(text);
    }

    public boolean HideOnClick(){
        return true;
    }


    public String TextUpperCase(){
        return this.getText();
    }

    public Color Background(){
        return this.getBackground();
    }
}