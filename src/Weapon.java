import org.lwjgl.input.Keyboard;
import org.lwjgl.util.Rectangle;


public class Weapon {
	
	public static int macheteWidth = 40;
	public static int macheteHeight = 60;
	public static Rectangle Machete;
	public static int macheteTime = 0;
	public static boolean swingMachete = false;
	public static boolean canIMachete = true;
	public static int alternateSwing = 0;
	
	
	public static void macheteSound(){
		
		if(alternateSwing >= 4)
			alternateSwing = 0;
		if(alternateSwing == 0)
			AssetLoader.swordSwing1.play(1f, 1f);
		if(alternateSwing == 1)
			AssetLoader.swordSwing1.play(.8f, 1f);
		if(alternateSwing == 2)
			AssetLoader.swordSwing1.play(1.1f, 1f);
		if(alternateSwing == 3)
			AssetLoader.swordSwing1.play(.9f, 1f);
			
		alternateSwing++;	
			
	}
	
	public static void createMachete(){
		
		Machete = new Rectangle(0,0,0,0);
		if(Keyboard.isKeyDown(Keyboard.KEY_SPACE) && !swingMachete && canIMachete && !Ladder.isOnLadder()){
			
			macheteSound();
				
			swingMachete = true;
			canIMachete = false;
		}
		if(swingMachete){
			if(Collision.directionFacing == Collision.RIGHT){
				//GL11.glRecti(You.you.getX()+You.you.getWidth(),You.you.getY()+15,You.you.getX()+You.you.getWidth()+macheteWidth,You.you.getY()+15+macheteHeight);
				Machete = new Rectangle(You.you.getX()+You.you.getWidth(),You.you.getY()+5,macheteWidth,macheteHeight);
				macheteTime++;
			}
			else{
				//GL11.glRecti(You.you.getX()-macheteWidth,You.you.getY()+15,(You.you.getX()-macheteWidth)+macheteWidth,You.you.getY()+15+macheteHeight);
				 Machete = new Rectangle(You.you.getX()-macheteWidth,You.you.getY()+5,macheteWidth,macheteHeight);
				 macheteTime++;
			}	
		}
		if(macheteTime == 30){
			swingMachete = false;
			macheteTime = 0;
		}
		if(!Keyboard.isKeyDown(Keyboard.KEY_SPACE) && macheteTime == 0 && !Ladder.isOnLadder()){
			canIMachete = true;
		}
		
		
		

//		for(int i = 0;i < Ground.ground.size();i++){
//			if(Machete.intersects(Ground.ground.get(i))){
//				System.out.println("You attacked a block!");
//
//			}
//		}

		
	}
			
			


}
