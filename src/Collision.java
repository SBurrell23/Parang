import org.lwjgl.input.Keyboard;
import org.lwjgl.util.Rectangle;


public class Collision {
	
	public static boolean jumping = false;
	public static boolean falling = true;
	public static boolean jumpOnce = true;
	public static int RIGHT = 1, LEFT = 0;
	public static float jumpHeight = 0;
	public static int peak = 11;
	public static int gravityAcceleration = 0;
	public static int gravityTopSpeed = 7;
	public static int runningAcceleration = 0;
	public static int runningTopSpeed = 2;
	public static int jumpAcceleration = 14;
	public static int directionFacing = RIGHT;

	
	public static void handleCollisionDetection()
	{

		handleRightAndLeft();
		simulateGravity();		
		handleJump();
		
	}
	
	public static void simulateGravity(){
		if(canIMoveDown() && !jumping && !Ladder.isOnLadder() && !isALadderBelowMe()){
				You.you.setY(You.you.getY()+gravityAcceleration);
			if(gravityAcceleration <=  gravityTopSpeed)
				gravityAcceleration++;
		}
	}
	
	public static void handleRightAndLeft(){
		
		if( canIMoveRight() && (Keyboard.isKeyDown(Keyboard.KEY_RIGHT) || Keyboard.isKeyDown(Keyboard.KEY_D))){
			You.you.setX(You.you.getX()+(runningAcceleration));
			directionFacing = RIGHT;
		}
		if(  canIMoveLeft() && (Keyboard.isKeyDown(Keyboard.KEY_LEFT) || Keyboard.isKeyDown(Keyboard.KEY_A))){
			You.you.setX(You.you.getX()-(runningAcceleration));
			directionFacing = LEFT;
		}
		if(runningAcceleration <= runningTopSpeed)
			runningAcceleration++;
		
		if((!Keyboard.isKeyDown(Keyboard.KEY_RIGHT) && !Keyboard.isKeyDown(Keyboard.KEY_D)) && (!Keyboard.isKeyDown(Keyboard.KEY_LEFT)  && !Keyboard.isKeyDown(Keyboard.KEY_A)))
			runningAcceleration = 0;
		
	}
	
	public static boolean canIMoveRight(){
		Rectangle temp = new Rectangle(You.you.getX()+runningAcceleration,You.you.getY(),You.you.getWidth(),You.you.getHeight());
		for(int i = 0;i < Ground.ground.size();i++){
			if(Ground.ground.get(i).intersects(temp)){
				You.you.setX(Ground.ground.get(i).getX()-(You.you.getWidth()));
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean canIMoveLeft(){
		
		Rectangle temp = new Rectangle(You.you.getX()-runningAcceleration,You.you.getY(),You.you.getWidth(),You.you.getHeight());
		for(int i = 0;i < Ground.ground.size();i++){
			if(Ground.ground.get(i).intersects(temp)){
				You.you.setX(Ground.ground.get(i).getX()+(Ground.ground.get(i).getWidth()));
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean canIMoveDown(){
		for(int i = 0;i < Ground.ground.size();i++){
			Rectangle temp = new Rectangle(You.you.getX(),You.you.getY()+(gravityAcceleration),You.you.getWidth(),You.you.getHeight());
			if(temp.intersects(Ground.ground.get(i))){
				falling = false;
				You.you.setY(Ground.ground.get(i).getY()-75);
				gravityAcceleration = 0;
				return false;
			}
		}
			falling = true;
		return true;
	}
	
	public static boolean amIOntheGround(){
		for(int i = 0;i < Ground.ground.size();i++){
			Rectangle temp = new Rectangle(You.you.getX(),You.you.getY()+1,You.you.getWidth(),You.you.getHeight());
			if(temp.intersects(Ground.ground.get(i))){
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean didIHitSomething(){
		Rectangle temp = new Rectangle(You.you.getX(),You.you.getY()-(jumpAcceleration),You.you.getWidth(),You.you.getHeight());
		for(int i = 0;i < Ground.ground.size();i++){
			if(Ground.ground.get(i).intersects(temp)){
				if(jumping){
					You.you.setY(Ground.ground.get(i).getY()+Ground.ground.get(i).getHeight());
					jumping = false;
					falling = true;
					}
				return true;
			}
		}
		return false;
	}
	
	public static void handleJump(){
		
		if(isALadderBelowMe())
			falling = false;
		
		if(!Ladder.isOnLadder()){
			
		if(!falling && !jumping && (Keyboard.isKeyDown(Keyboard.KEY_UP) || Keyboard.isKeyDown(Keyboard.KEY_W)) && jumpOnce){
			//AssetLoader.jumpSound.play(1f,1f);
			jumpOnce = false;
			jumping = true;
			//AssetLoader.jumpSound.play(1f,1.1f);
			
		}
		if(jumping && jumpHeight != peak && !didIHitSomething()){
			You.you.setY(You.you.getY()-jumpAcceleration);
			jumpHeight++;
			jumpAcceleration--;
		} 
		 if(didIHitSomething() || jumpHeight == peak ){
		 	jumping = false;
			jumpHeight = 0;
			jumpAcceleration  = 14;
		}
		 
		 if((!Keyboard.isKeyDown(Keyboard.KEY_UP) && !Keyboard.isKeyDown(Keyboard.KEY_W)) && !falling && !jumping){
			 jumpOnce = true;
			 
		 }

		 
		 
		}
	
		
		if(Ladder.isOnLadder()){
			
		 	jumping = false;
			jumpHeight = 0;
			jumpAcceleration  = 14;
			if((Keyboard.isKeyDown(Keyboard.KEY_UP) || Keyboard.isKeyDown(Keyboard.KEY_W)) && !isABlockAboveMe()){
				You.you.setY(You.you.getY()-3);
	
				
			}
			
			
			
		}

		if((Keyboard.isKeyDown(Keyboard.KEY_DOWN) || Keyboard.isKeyDown(Keyboard.KEY_S)) && canIMoveDownOffThisLadder() && (Ladder.isOnLadder() || isALadderBelowMe())){
			You.you.setY(You.you.getY()+3);
		}
		
		
		
		
	}
	
	public static boolean canIMoveDownOffThisLadder(){
		Rectangle l = new Rectangle(You.you.getX(),You.you.getY()+4,You.you.getWidth(),You.you.getHeight());
		for(int i = 0; i < Ground.ground.size();i++){
			if(l.intersects(Ground.ground.get(i))){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isALadderBelowMe(){
		Rectangle l = new Rectangle(You.you.getX(),You.you.getY()+gravityAcceleration,You.you.getWidth(),You.you.getHeight());
		for(int i = 0; i < Ground.ladder.size();i++){
			if(l.intersects(Ground.ladder.get(i))){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isABlockAboveMe(){
		Rectangle temp = new Rectangle(You.you.getX(),You.you.getY()-(4),You.you.getWidth(),You.you.getHeight());
		for(int i = 0;i < Ground.ground.size();i++){
			if(Ground.ground.get(i).intersects(temp)){
					You.you.setY(Ground.ground.get(i).getY()+Ground.ground.get(i).getHeight());
				return true;
			}
		}
		return false;
	}
	

	

}
