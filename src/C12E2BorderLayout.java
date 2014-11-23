
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
public class C12E2BorderLayout extends JFrame
{
	
	 public static void main(String[] args) {
	    	C12E2BorderLayout BL = new C12E2BorderLayout();
			BL.BLayout();
	  } 
	 
	private static final long serialVersionUID = 1L;
	public void BLayout()
	{
		JFrame aWindow = new JFrame("Border Layout");
		aWindow.setBounds(50, 50, 300, 300); 
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout border = new BorderLayout(); 
		Container content = aWindow.getContentPane(); 
		content.setLayout(border); 
		@SuppressWarnings("unused")
		JButton button;
		content.add(button = new JButton("Button:1"), BorderLayout.EAST);
		content.add(button = new JButton("Button:2"), BorderLayout.WEST);
		content.add(button = new JButton("Button:3"), BorderLayout.NORTH);
		content.add(button = new JButton("Button:4"), BorderLayout.SOUTH);
		content.add(button = new JButton("Button:5"), BorderLayout.CENTER);
		aWindow.setVisible(true);
	}
   
}