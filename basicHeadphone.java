import java.awt.*;
/**
 * Write a description of class basicHeadphone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class basicHeadphone
{
    protected int xpos;
    protected int ypos;
    protected int qualityLevel;
    protected String connectionType;
    protected leftspeakerx = x-150;
    protected leftspeakermiddle = leftspeakerx + 50;
    protected leftspeakery = y;
    protected rightspeakerx = x+100;
    protected rightspeakermiddle = rightspeakerx+25;
    protected speakerlw = 50;
    protected rightspeakery = y;

    /**
     * Constructor for objects of class basicHeadphone
     */
    public basicHeadphone(int x, int y)
    {
        xpos = x;
        ypos = y;
        qualityLevel = 2;
        connectionType = "wired";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void showHeadphone (Graphics g)
    {
        g.drawOval(x-150,y-150,50,50);
        g.drawOval(x+150,y+150,50,50
    }
}
