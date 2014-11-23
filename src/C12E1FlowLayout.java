
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
public class C12E1FlowLayout extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public void Flayout()
	{
		JFrame f = new JFrame("Flow Layout Demo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.add(new Button("Button-1"));
		f.add(new Button("Button-2"));
		f.add(new Button("Button-3"));
		f.add(new Button("Button-4"));
		f.add(new Button("Button-5"));
		f.add(new Button("Button-6"));
		f.pack();
		f.setVisible(true);
	  
	}
    public static void main(String[] args) {
    	C12E1FlowLayout FL = new C12E1FlowLayout();
		FL.Flayout();
    }
}
        