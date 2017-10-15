import org.lwjgl.input.Keyboard;
import org.lwjgl.util.Rectangle;
import org.newdawn.slick.Color;

public class You {
	//400/375/l12
	public static Rectangle you  = new Rectangle(75,375,25,75);
	public static boolean invincible = false;
	public static long movementFrames = 0;
	public static int ladderClimbFrames = 10;
	public static int preJumpFrames = 0;
	public static Color redShade = new Color(244,100,100);
	public static Color plain = new Color(255,255,255);
	
	
	public static int amountOfHealth = 0;
	public static int health = amountOfHealth;
	
	public static int difficulty;
	public static final int EASY = 1, MEDIUM = 2, HARD = 3, YOLO = 4;

	public static int hspace = 30;
	public static void drawHealth(){
		switch(health){
		case 15:
			AssetLoader.heart.draw(10+hspace*14,-30);
		case 14:
			AssetLoader.heart.draw(10+hspace*13,-30);
		case 13:
			AssetLoader.heart.draw(10+hspace*12,-30);	
		case 12:
			AssetLoader.heart.draw(10+hspace*11,-30);
		case 11:
			AssetLoader.heart.draw(10+hspace*10,-30);
		case 10:
			AssetLoader.heart.draw(10+hspace*9,-30);
		case 9:
			AssetLoader.heart.draw(10+hspace*8,-30);
		case 8:
			AssetLoader.heart.draw(10+hspace*7,-30);
		case 7:
			AssetLoader.heart.draw(10+hspace*6,-30);
		case 6:
			AssetLoader.heart.draw(10+hspace*5,-30);
		case 5:
			AssetLoader.heart.draw(10+hspace*4,-30);
		case 4:
			AssetLoader.heart.draw(10+hspace*3,-30);
		case 3:
			AssetLoader.heart.draw(10+hspace*2,-30);
		case 2:
			AssetLoader.heart.draw(10+hspace,-30);
		case 1:
			AssetLoader.heart.draw(10,-30);
		}
	}
	
	public static void drawCoinCounter(){
		switch(Coin.coinCount){
		case 0:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 1:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 2:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 3:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 4:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 5:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 6:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 7:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 8:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 9:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 10:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 11:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 12:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 13:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 14:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 15:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 16:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 17:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 18:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 19:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 20:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 21:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 22:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 23:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 24:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 25:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 26:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 27:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 28:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 29:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 30:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 31:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 32:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 33:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 34:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 35:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 36:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 37:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 38:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 39:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 40:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 41:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 42:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 43:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 44:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 45:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 46:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 47:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 48:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 49:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		case 50:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		default:AssetLoader.coinCounter.getSubImage(0, Coin.coinCount*32, 100, 32).draw(715,-28);break;
		}
	}
	
	public static void drawPanel(){
		AssetLoader.woodPanel.draw(0,-35);
	}


	public static void drawYou(){

		if(movementFrames >= 19) 
			movementFrames = 0;

		if(invincible)
		{
			Weapon.macheteTime = 0;
			Weapon.swingMachete = false;
			drawMachete(redShade);
			drawLadderClimb(redShade);
			drawStandingStill(redShade);
			drawJumpingAndFalling(redShade);
			drawRunAnimations(redShade);			
		}
		else
		{

			drawMachete(plain);
			drawLadderClimb(plain);
			drawStandingStill(plain);
			drawJumpingAndFalling(plain);
			drawRunAnimations(plain);

			if(!invincible && !Ladder.isOnLadder())
				Weapon.createMachete();
		}
		movementFrames++;
		
		drawPanel();
		drawHealth();
		drawCoinCounter();
		
		handleDeath();
	}
	
	public static void handleDeath(){
		if(health == 0 && JungleHeart.haveYouMadeItToTheBoss){
			Levels.currentLevel = 29;
			health = amountOfHealth;
			You.you.setX(375);
			You.you.setY(100);
			JungleHeart.resetBossVariables();
			Levels.reviveAllEnemies();
		}
		else if(health == 0){
			Levels.currentLevel = 1;
			You.you.setX(75);
			You.you.setY(375);
			health = amountOfHealth;
			Levels.reviveAllEnemies();
		}
		
	}

	public static void drawStandingStill(Color c){

		//Draws you if you are standing still
		if(Weapon.macheteTime == 0 && !Keyboard.isKeyDown(Keyboard.KEY_D) && !Keyboard.isKeyDown(Keyboard.KEY_A) &&
				!Keyboard.isKeyDown(Keyboard.KEY_RIGHT) && !Keyboard.isKeyDown(Keyboard.KEY_LEFT) && 
				!Collision.jumping && !Ladder.isOnLadder()
				&& (Collision.gravityAcceleration == 1 || Collision.gravityAcceleration == 0) && (Ladder.isGroundBeneathMe() || Ladder.isALadderBelowMe())
				){
			if(Collision.directionFacing == Collision.RIGHT)
				AssetLoader.jmxrStill.draw(you.getX(), you.getY()+1,c);
			else
				AssetLoader.jmxlStill.draw(you.getX(), you.getY()+1,c);

			movementFrames = 0;

		}
		//draws still if u are trying to split yourself in half
		if(Collision.amIOntheGround()  && Weapon.macheteTime == 0){
			if(Keyboard.isKeyDown(Keyboard.KEY_D) && Keyboard.isKeyDown(Keyboard.KEY_A) && Collision.directionFacing == Collision.LEFT)
				AssetLoader.jmxlStill.draw(you.getX(), you.getY()+1,c);
			if(Keyboard.isKeyDown(Keyboard.KEY_D) && Keyboard.isKeyDown(Keyboard.KEY_A) && Collision.directionFacing == Collision.RIGHT )
				AssetLoader.jmxrStill.draw(you.getX(), you.getY()+1,c);
			if(Keyboard.isKeyDown(Keyboard.KEY_LEFT) && Keyboard.isKeyDown(Keyboard.KEY_RIGHT) && Collision.directionFacing == Collision.LEFT )
				AssetLoader.jmxlStill.draw(you.getX(), you.getY()+1,c);
			if(Keyboard.isKeyDown(Keyboard.KEY_LEFT) && Keyboard.isKeyDown(Keyboard.KEY_RIGHT) && Collision.directionFacing == Collision.RIGHT )
				AssetLoader.jmxrStill.draw(you.getX(), you.getY()+1,c);

			//Draws you still if you attempt to move next to a wall

			if(Collision.directionFacing == Collision.RIGHT  && !Collision.canIMoveRight() && Weapon.macheteTime == 0 && !Ladder.isOnLadder() ){
				AssetLoader.jmxrStill.draw(you.getX(), you.getY()+1,c);
			}
			if(Collision.directionFacing == Collision.LEFT  && !Collision.canIMoveLeft() && Weapon.macheteTime == 0 && !Ladder.isOnLadder()){
				AssetLoader.jmxlStill.draw(you.getX(), you.getY()+1,c);
			}
		}
	}



	public static void drawJumpingAndFalling(Color c){

		//jumping and falling

		if(!Ladder.isOnLadder() &&  !Ladder.isALadderBelowMe() && Collision.jumping && Collision.directionFacing == Collision.RIGHT && Weapon.macheteTime == 0){
			AssetLoader.jmxrJump2.draw(you.getX()-10, you.getY()+1,c);

		}
		else if (!Ladder.isOnLadder() &&  !Ladder.isALadderBelowMe() &&Collision.jumping && Collision.directionFacing == Collision.LEFT && Weapon.macheteTime == 0){
			AssetLoader.jmxlJump2.draw(you.getX()-10, you.getY()+2,c);

		}
		else if(!Ladder.isOnLadder() &&   !Ladder.isALadderBelowMe() &&!Collision.amIOntheGround() && Collision.directionFacing == Collision.RIGHT && Weapon.macheteTime == 0){
			AssetLoader.jmxrJump2.draw(you.getX()-10, you.getY()+1,c);

		}
		else if (!Ladder.isOnLadder() &&   !Ladder.isALadderBelowMe() &&!Collision.amIOntheGround()&& Collision.directionFacing == Collision.LEFT && Weapon.macheteTime == 0){
			AssetLoader.jmxlJump2.draw(you.getX()-10, you.getY()+1,c);

		}
	}



	public static void drawRunAnimations(Color c){
		//draws run animations

		if ((Keyboard.isKeyDown(Keyboard.KEY_D) && Keyboard.isKeyDown(Keyboard.KEY_A)) || (Keyboard.isKeyDown(Keyboard.KEY_RIGHT) && Keyboard.isKeyDown(Keyboard.KEY_LEFT))){}
		else{
			if( (Ladder.isGroundBeneathMe() || Ladder.isALadderBelowMe()) && Collision.directionFacing == Collision.RIGHT && ((!Ladder.isOnLadder() && (Keyboard.isKeyDown(Keyboard.KEY_D) || Keyboard.isKeyDown(Keyboard.KEY_RIGHT)))) && Collision.canIMoveRight() && Weapon.macheteTime == 0){
				if(movementFrames < 7)
					AssetLoader.jmxrRun1.draw(you.getX()-10, you.getY()+1,c);
				else if(movementFrames < 12 && movementFrames >=7)
					AssetLoader.jmxrRun2.draw(you.getX()+4, you.getY()+1,c);
				else if(movementFrames >= 12)
					AssetLoader.jmxrRun3.draw(you.getX(), you.getY()+1,c);


			}

			if((Ladder.isGroundBeneathMe() || Ladder.isALadderBelowMe()) && Collision.directionFacing == Collision.LEFT && ((!Ladder.isOnLadder() && (Keyboard.isKeyDown(Keyboard.KEY_A) || Keyboard.isKeyDown(Keyboard.KEY_LEFT)))) && Collision.canIMoveLeft() && Weapon.macheteTime == 0){
				if(movementFrames < 7)
					AssetLoader.jmxlRun1.draw(you.getX()-9, you.getY()+1,c);
				else if(movementFrames < 12 && movementFrames >=7)
					AssetLoader.jmxlRun2.draw(you.getX()+5, you.getY()+1,c);
				else if(movementFrames >= 12)
					AssetLoader.jmxlRun3.draw(you.getX()+3, you.getY()+1,c);

			}
		}
	}


	public static void drawLadderClimb(Color c){
		//Ladder climbing
		if(Ladder.isOnLadder()){
			if(ladderClimbFrames <7)
				AssetLoader.jmxClimb1.draw(you.getX(), you.getY()+1,c);
			else
				AssetLoader.jmxClimb2.draw(you.getX(), you.getY()+2,c);
			
			
			if(ladderClimbFrames >= 14)
				ladderClimbFrames = 0;
			if((Keyboard.isKeyDown(Keyboard.KEY_W) || Keyboard.isKeyDown(Keyboard.KEY_UP)) ||(Keyboard.isKeyDown(Keyboard.KEY_S) || Keyboard.isKeyDown(Keyboard.KEY_DOWN))){
				ladderClimbFrames++;
//				if (!AssetLoader.ladderClimb.playing())
//					AssetLoader.ladderClimb.play();
			}
		}
	}


	public static void drawMachete(Color c){
		if(Ladder.isOnLadder()){
			Weapon.macheteTime = 0;
			Weapon.swingMachete = false;
		}
		if(!Ladder.isOnLadder()){
			//handles machete animations
			if(Collision.directionFacing == Collision.RIGHT){
				if(Weapon.macheteTime > 0 && Weapon.macheteTime < 5)
					AssetLoader.jmxrAttack1.draw(you.getX(), you.getY()+1,c);
				if(Weapon.macheteTime >= 5 && Weapon.macheteTime < 10)
					AssetLoader.jmxrAttack2.draw(you.getX(), you.getY()+1,c);
				if(Weapon.macheteTime >= 10 && Weapon.macheteTime < 20)
					AssetLoader.jmxrAttack3.draw(you.getX(), you.getY()+1,c);
				if(Weapon.macheteTime >= 20 && Weapon.macheteTime < 30)
					AssetLoader.jmxrAttack4.draw(you.getX(), you.getY()+1,c);
			}
			if(Collision.directionFacing == Collision.LEFT){
				if(Weapon.macheteTime > 0 && Weapon.macheteTime < 5)
					AssetLoader.jmxlAttack1.draw(you.getX()-(44-25), you.getY()+1,c);
				if(Weapon.macheteTime >= 5 && Weapon.macheteTime < 10)
					AssetLoader.jmxlAttack2.draw(you.getX()-(38-25), you.getY()+1,c);
				if(Weapon.macheteTime >= 10 && Weapon.macheteTime < 20)
					AssetLoader.jmxlAttack3.draw(you.getX()-(70-25), you.getY()+1,c);
				if(Weapon.macheteTime >= 20 && Weapon.macheteTime < 30)
					AssetLoader.jmxlAttack4.draw(you.getX()-(68-25), you.getY()+1,c);
				//44,38,70,68
			}
		}
	}






}
