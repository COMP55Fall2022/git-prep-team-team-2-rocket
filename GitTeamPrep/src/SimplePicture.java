import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
// new comment 
// new comment
public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static final String ROBOTIMAGENAME = "robot.png";
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		//try 2
		GImage robot = new GImage(ROBOTIMAGENAME, 200, 200);
		add(robot);
		
		GLabel label = new GLabel("Conflict lmao 5", 200, 300);
		add(label);
		
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}