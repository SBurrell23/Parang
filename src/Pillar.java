import org.lwjgl.util.Rectangle;


public class Pillar extends Enemy{

	public Pillar(boolean isAlive, int startx, int starty, int endx, int endy,boolean goBack, Rectangle r) {
		super(isAlive, startx, starty, endx, endy, goBack, r);
	}
	
	public Pillar(boolean isAlive, int startx, int starty,boolean goBack,Rectangle r) {
		super(isAlive, startx, starty,starty, starty, isAlive, r);
	}

}
