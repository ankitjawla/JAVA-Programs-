import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class C12E7tictactoe extends JFrame
{    
	
	private static final long serialVersionUID = 1L;

	 public static void main(String[] args)
     {
   	 C12E7tictactoe frame = new C12E7tictactoe();
         frame.setTitle("TicTacToe"); 
         frame.setSize(300, 300);
         frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
    }
	
	
	public C12E7tictactoe()
      {
	  int mode=0;
	  setLayout(new GridLayout(3, 3));
          ImageIcon Cross = new ImageIcon("x.gif");                    
		  ImageIcon Circle = new ImageIcon("o.gif");
          for (int i = 0; i < 9; i++)
          {
			   mode = (int) (Math.random() * 3.0);
			   if (mode == 0)
               {
				add(new JLabel(Cross));
			   }
               else if (mode == 1)
               {
				add(new JLabel(Circle));
			   }
			   else      
			   {
				i--;
			   }
          } 
     }
}  