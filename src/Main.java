import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Sound;
import org.newdawn.slick.openal.SoundStore;
import org.newdawn.slick.opengl.PNGDecoder;


//TODO Finish designing all levels. Single ground artwork needs to be rocky. Implements boss. Start menu + instructions menu.
///DONE

public class Main {
	//Recommended 800,600
	public static int width = 800;
	public static int height = 635;
	static boolean grid = true;
	public static boolean loading = true;


	public Main() throws LWJGLException{
		initGL();//also loads assets
		while(!Display.isCloseRequested()){
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			long start = System.currentTimeMillis();
			gameLoop();	
			//System.out.println(System.currentTimeMillis() - start);
			Display.update();
			Display.sync(60);
		}
		AL.destroy();
		Display.destroy();
		System.exit(0);
	}

	public static void initGL() throws LWJGLException{
		Display.setDisplayMode(new DisplayMode(width,height));
		//Display.setDisplayMode(Display.getDesktopDisplayMode());
		//Display.setFullscreen(true);
		//
		Display.setTitle("Parang");
		Display.setVSyncEnabled(true);
		try {
		Display.setIcon(new ByteBuffer[] {loadIcon(Main.class.getResource("Assets/Screens/icon32x32.png"))});
		} catch (MalformedURLException e){e.printStackTrace();} catch (IOException e) {e.printStackTrace();}

		Display.create();
		
		//
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		// enable alpha blending (toggles simple and loaded graphics)
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		//initialize openGl
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0,800,600,-35,1,-1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}

	public static void gameLoop(){
		if(loading){
			AssetLoader.loadAssets();
			loading = false;
		}
		
		SoundStore.get().poll(0);
		
		if(Menu.mainMenu)
			mainMenu();
		else if(Menu.selectDifficulty)
			Menu.handleDifficultyMenu();
		else if(Menu.instructionsMenu)
			instructionsMenu();
		else if(Menu.youWinScreen)
			Menu.youWin();
		else if(Menu.playableGameState)
			gameState();
	
		//Clicker.handleClicking();
		
	}

	public static void gameState(){
	
		clearLists();

		//ORDER IS VERY IMPORTANT!
		Levels.drawBackground();
		

		Ground.drawLevel();
		Ladder.drawLadder();

		Collision.handleCollisionDetection();

		Enemy.handleEnemies();
		
		Coin.handleCoins();

		Enemy.drawEnemies();
		if(Levels.currentLevel != 30)
			You.drawYou();
		//
		if(Levels.currentLevel != 30)
			Thorns.drawThorns();
		if(Levels.currentLevel != 30)
			Ground.drawPrettyStuff();
		
		Pillar.drawPillar();
		
		if(Levels.currentLevel != 30)
			Enemy.drawBees();
		
		Levels.handleLevelChanges();
		
		//drawGrid();
		
		if(Levels.currentLevel == 30){
			Thorns.drawThorns();
			JungleHeart.handleBoss();
			You.drawYou();
			Enemy.drawBees();
			Ground.drawPrettyStuff();
		}
		
		
		//Do not even ask why this has to be here.
		Tiger.ta++;
		Enemy.beeBuzz++;
	}

	public static void clearLists(){
		Ground.ground.clear();
		Ground.ladder.clear();
		Ground.thorns.clear();
		Ground.shrubs.clear();
		Enemy.enemies.clear();
		Coin.coins.clear();
	}
	public static void mainMenu(){
		Menu.handleMainMenu();
	}
	
	public static void instructionsMenu(){
		Menu.handleInstructionsMenu();
	}


	public static void drawGrid(){
		GL11.glColor3f(1, 1, 1);
		int gridSize = 25;

		for(int i = 0;i <(height);i+=gridSize){
			GL11.glBegin(GL11.GL_LINE_LOOP);
			GL11.glVertex2i(0,i);//Upper-Left
			GL11.glVertex2i(width,i);//Upper-Left
			GL11.glEnd();
		}
		for(int i = 0;i <(width);i+=gridSize){
			GL11.glBegin(GL11.GL_LINE_LOOP);
			GL11.glVertex2i(i,0);//Upper-Left
			GL11.glVertex2i(i,height);//Upper-Left
			GL11.glEnd();
		}
		GL11.glColor3f(1, 1, 1);
	}

	public static ByteBuffer loadIcon(URL url) throws IOException {
		InputStream is = url.openStream();
		try {
			PNGDecoder decoder = new PNGDecoder(is);
			ByteBuffer bb = ByteBuffer.allocateDirect(decoder.getWidth()*decoder.getHeight()*4);
			//decoder.decode(bb, decoder.getWidth()*4, PNGDecoder.Format.RGBA);
			bb.flip();
			return bb;
		} finally {
			is.close();
		}
	}


	public static void main(String[] args) throws LWJGLException{
		new Main();
	}
}
