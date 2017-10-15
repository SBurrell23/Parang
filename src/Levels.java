import org.lwjgl.input.Keyboard;
import org.lwjgl.util.Rectangle;


public class Levels {
	
	public static int currentLevel = 1;
	
	public static int amountBeforeCrossOver = 15;
	public static Rectangle top = new Rectangle(0,-50,800,1);
	public static Rectangle bot = new Rectangle(0,625,800,1);
	public static Rectangle right = new Rectangle(800+amountBeforeCrossOver,0,1,601);
	public static Rectangle left = new Rectangle(0-You.you.getWidth(),0,You.you.getWidth()-amountBeforeCrossOver,601);
	//LAWS
	//DO NOT ALLOW PLAYER TO JUMP UP INTO A BLOCK, PLACE BLOCKS AT TOP OF LEVEL TO IN RESPECT TO TOP LEVEL BLOCKS TO AVOID THIS
	
	//  1  2  3  4  5                  |     26
	//  6  7  8  9 10                  |     27
	// 11 12 13 14 15                  |     28
	// 16 17 18 19 20                  |     29
	// 21 22 23 24 25                  |     30
  

	public static void handleLevelChanges(){
		
		//GET RID OF THIS DEVELOPER TOOL IT CHANGES THE LEVELS WITH P AND O
		//levelChanger();
		
		if(You.you.intersects(top) && currentLevel > 5){
			currentLevel = currentLevel - 5;
			You.you.setY(600-50);
			reviveAllEnemies();
		}
		if(You.you.intersects(bot) && currentLevel < 21){
			currentLevel = currentLevel + 5;
			You.you.setY(-25);
			reviveAllEnemies();
		}
		//handle boss fall
		if(You.you.intersects(bot) && (currentLevel == 26 || currentLevel == 27 || currentLevel == 28 || currentLevel == 29)){
			currentLevel = currentLevel + 1;
			You.you.setY(-25);
			reviveAllEnemies();
		}
		
		if(You.you.intersects(right) && currentLevel % 5 != 0){
			currentLevel = currentLevel + 1;
			You.you.setX(-amountBeforeCrossOver);
			reviveAllEnemies();
		}
		if(You.you.intersects(left) && currentLevel != 1 && currentLevel != 6 && currentLevel != 11 && currentLevel != 16 && currentLevel != 21){
			currentLevel = currentLevel - 1;
			You.you.setX(775+amountBeforeCrossOver);
			reviveAllEnemies();
		}
		
		
		//ENTER CAVE HERE
		if(currentLevel == 25 && You.you.intersects(new Rectangle(552,450,100,150)) && Coin.coinCount >= 50){
			currentLevel = 26;
			You.you.setX(300);
			You.you.setY(30);
		}
		//music control here
		if(currentLevel == 29){
			if(!AssetLoader.jungleMusic.playing())
			AssetLoader.jungleMusic.loop(1f,.2f);
			AssetLoader.bossMusic.stop();
		}
		
		//if(Keyboard.isKeyDown(Keyboard.KEY_1))
		//Coin.coinCount++; 
		
	}
	
	public static boolean pOnce = true;
	public static boolean oOnce = true;
	public static void levelChanger(){
		if(Keyboard.isKeyDown(Keyboard.KEY_P) && pOnce){
			currentLevel++;
			pOnce = false;
			You.you.setX(-1000);
			You.you.setY(-1000);
		}
		if(!Keyboard.isKeyDown(Keyboard.KEY_P))
				pOnce = true;
		if(Keyboard.isKeyDown(Keyboard.KEY_O) && oOnce){
			currentLevel--;
			oOnce = false;
			You.you.setX(-1000);
			You.you.setY(-1000);
		}
		if(!Keyboard.isKeyDown(Keyboard.KEY_O))
				oOnce = true;
		
		
	}

	public static void drawBackground(){
		AssetLoader.background.draw(0,0);
	}
	
	public static void reviveAllEnemies(){
		for(int i = 0; i < Enemy.enemies.size();i++){
			Enemy.enemies.get(i).isAlive = true;
		}
	}
	
}
