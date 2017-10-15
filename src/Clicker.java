import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.Rectangle;


public class Clicker {
	
	static boolean once = true;
	public static int x1;
	public static int y1;
	public static int x2;
	public static int y2;
	
	public static void handleClicking(){
		 
		if(Mouse.isButtonDown(0)){
			GL11.glColor3f(0, .4f, 0);
			GL11.glRecti(x1, y1, ceil(Mouse.getX()), ceil((Main.height-35  - Mouse.getY())));
		}
		
			
		
		if(Mouse.isButtonDown(0) && once){
			int floorX = floor(Mouse.getX());
			int floorY  = floor((Main.height-35 - Mouse.getY()));
			x1 = floorX;
			y1 = floorY;
			once = false;
		}
		
		if(!Mouse.isButtonDown(0) && !once){
			int floorX2 = ceil(Mouse.getX());
			int floorY2  = ceil((Main.height-35  - Mouse.getY()));
			x2 = floorX2;
			y2 = floorY2;
			//System.out.println("GL11.glRecti(" + x1 + "," + y1 + "," + x2 + "," + y2 + ");");
			System.out.println("ground.add(new Rectangle(" + x1 + "," + y1 + "," + (x2-x1)+ "," + (y2-y1) + "));");
			//System.out.println("shrubs.add(new Rectangle(" + x1 + "," + y1 + "," + (x2-x1)+ "," + (y2-y1) + "));");
			Ground.ground.add(new Rectangle(x1,y1,(x2-x1),(y2-y1)));
			
			
			
//			for(int i = 0;i < Ground.ground.size();i++){
//				System.out.println(Ground.ground.get(i));
//			}
//			System.out.println(Ground.ground.size());
			
			once = true;
		}
		

		
	}	
	
	
	public static int floor(int i){
		while(i % 25 != 0){
			i = i-1;
		}
		return i;
	}
	public static int ceil(int i){
		while(i % 25 != 0){
			i = i+1;
		}
		return i;
	}
	
}
