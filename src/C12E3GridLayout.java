
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class C12E3GridLayout extends JFrame
{
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		C12E3GridLayout GL = new C12E3GridLayout();
		GL.GLayout(); 
    }
	
	
	private static final long serialVersionUID = 1L;
	
	
	public void GLayout()
	{
		JFrame frame = new JFrame("GRID LAYOUT");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 3));
		frame.add(new JButton("Button:1"));
		frame.add(new JButton("Button:2"));
		frame.add(new JButton("Button:3"));
		frame.add(new JButton("Button:4"));
		frame.add(new JButton("Button:5"));
		frame.add(new JButton("Button:6"));
		frame.pack();
		frame.setVisible(true);
	
	}
    
}
        