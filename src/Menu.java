import org.lwjgl.input.Mouse;



public class Menu {
	
	public static boolean mainMenu = true;
	public static boolean instructionsMenu = false;
	public static boolean selectDifficulty = false;
	
	public static boolean playableGameState = false;
	
	public static boolean youWinScreen = false;
	
	public static boolean infoOver = false;
	public static boolean clickOnce = true;
	//
	public static float menuLoadIn = 0;
	public static float creatorInfoFadeIn = 0;
	public static float creatorInfoFadeOut = 100;
	public static int introFlashes = 0;
	public static float mvol = .15f;
	
	public static void handleMainMenu(){
		drawMenus();
		handleMenuInput();
	}
	
	public static void drawMenus(){
		if(creatorInfoFadeIn <= 200){
			AssetLoader.creatorinfo.setAlpha(creatorInfoFadeIn/200);
			AssetLoader.creatorinfo.draw(0,-35);
		}
		if(creatorInfoFadeIn > 200 && creatorInfoFadeOut > 0){
			AssetLoader.creatorinfo.setAlpha(creatorInfoFadeOut/100);
			AssetLoader.creatorinfo.draw(0,-35);
			creatorInfoFadeOut--;
		}

		if(menuLoadIn < 1 && creatorInfoFadeIn > 250 && creatorInfoFadeOut == 0){
			menuLoadIn = menuLoadIn + .01f;
			AssetLoader.mainMenuBackground.setAlpha(menuLoadIn);
			AssetLoader.mainMenuBackground.draw(0,-35);
			if(menuLoadIn > .05f){
				if(!AssetLoader.jungleMusic.playing())
					AssetLoader.jungleMusic.loop(1f,mvol);
			}

		}
		if(menuLoadIn > 1){
			AssetLoader.mainMenuBackground.draw(0,-35);
				infoOver = true;

		}
		
		creatorInfoFadeIn++;
	}
	
	public static void handleInstructionsMenu(){
		handleMenuInput();
		AssetLoader.instructionsMenu.draw(0,-35);
	}
	
	public static void handleDifficultyMenu(){
		handleMenuInput();
		AssetLoader.selectDifficulty.draw(0,-35);
	}
	

	public static boolean handleMenuInput(){
		
		if(Mouse.isButtonDown(0) && clickOnce && infoOver){
			clickOnce = false;
			
			
			if(clickedArea(329,299,150,75) && mainMenu){
				mainMenu = false;
				selectDifficulty = true;
				AssetLoader.thornGrow.play();
				return true;
			}
			if(clickedArea(272,418,272,70) && (mainMenu || selectDifficulty)){
				instructionsMenu = true;
				selectDifficulty = false;
				mainMenu = false;
				AssetLoader.thornGrow.play();
				return true;
			}
			if(clickedArea(0,-35,100,75) && (instructionsMenu)){
				mainMenu = true;
				instructionsMenu = false;
				AssetLoader.thornGrow.play();
				return true;
			}
			//Difficulty selections
			if(selectDifficulty && clickedArea(592,362,166,38)){
				You.difficulty = You.EASY;
				You.amountOfHealth = 12;
				selectDifficulty = false;
				playableGameState = true;
				//AssetLoader.coinSound.play();
				if(!AssetLoader.jungleMusic.playing())
					AssetLoader.jungleMusic.loop(1f,mvol);
				return true;
			}
			if(selectDifficulty && clickedArea(592,417,168,41)){
				You.difficulty = You.MEDIUM;
				You.amountOfHealth = 7;
				selectDifficulty = false;
				playableGameState = true;
				//AssetLoader.coinSound.play();
				if(!AssetLoader.jungleMusic.playing())
					AssetLoader.jungleMusic.loop(1f,mvol);
				return true;
			}
			if(selectDifficulty && clickedArea(592,474,167,39)){
				You.difficulty = You.HARD;
				You.amountOfHealth = 3;
				selectDifficulty = false;
				playableGameState = true;
				//AssetLoader.coinSound.play();
				if(!AssetLoader.jungleMusic.playing())
					AssetLoader.jungleMusic.loop(1f,mvol);
				return true;
			}
			if(selectDifficulty && clickedArea(593,530,166,38)){
				You.difficulty = You.YOLO;
				You.amountOfHealth = 1;
				selectDifficulty = false;
				playableGameState = true;
				//AssetLoader.coinSound.play();
				if(!AssetLoader.jungleMusic.playing())
					AssetLoader.jungleMusic.loop(1f,mvol);
				return true;
			}
			
			
		}
		
		if(!Mouse.isButtonDown(0))
			clickOnce = true;
		return true;
	}
	
	public static void youWin(){
		AssetLoader.winScreen.draw(0,-35);
	}
	
	public static boolean clickedArea(int x, int y, int width , int height){
		if(Mouse.getX() >= x && Mouse.getX() <= (x+width) && (600-Mouse.getY()) > y && (600-Mouse.getY()) <(y+height)){
			return true;
		}
		return false;
	}
	

	

}
