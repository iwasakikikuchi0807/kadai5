package kadai5;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class kadai5 extends JFrame implements ActionListener{
	Container cPane;
	JPanel panelView2D, panelView3D, panelCreate,
		panelV3DUP, panelControl;
	Maze2DCanvas maze2DCanvas;
	Maze3DCanvas maze3DCanvas;
	JButton buttonCreate, buttonGoFwd, buttonTurnL, buttonTurnR;

	Hito hito;
	Map  map;

	public static void main(String[] args) {
		new kadai5();
	}
	public kadai5() {
		super( "MazeCreate" );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		guiSetting();

		hito = new Hito(1, 1);
		maze2DCanvas.setHito( hito );
		maze3DCanvas.setHito( hito );

		map = new Map(31, 31);
		maze2DCanvas.setMap( map );
		maze3DCanvas.setMap( map );
	}
}
