
import java.io.IOException;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;


public class AssetLoader {
	
	private static Texture blocks,creatorinf,bb,instructions,MMB2,loadingScreen,loadingBar,jh2;
	
	private static Texture b,bg,jmx,mmb,tigerTex,hotj,cavee,onefiddy,woodp,bossRedBar,ws;
	
	public static Image blocksImage,block1,testYouImage,tigerright1I,tigerleft1I,heart,bat,coin,ladderLeft,ladderRight,background,thorns,
	beeRight,beeLeft,beeRight2,beeLeft2,pillar,pillarTop,shrubbery1,shrubbery2,shrubbery3,shrubbery4,shrubbery5,block2,block3,block4,blockhanging,jmxrRun3,
	blockright1,blockright2,blockright3,blockright4,blockleft1,blockleft2,blockleft3,blockleft4,
	bat1,bat2,bat3,batdead,blockdoublesided,blockalone,
	coin1,coin2,coin3,coin4,pop1,pop2,pop3,pop4,splatL1,splatL2,splatL3,splatR1,splatR2,splatR3,
	thornsBottom,thornsTop,
	roundedGroundRight,roundedGroundLeft,roundedOnlyBottom,roundedSides,coinCounter,woodPanel,thornsDouble;
	
	public static Image JungleManX,
	jmxrStill,jmxrRun1,jmxrRun2,jmxrAttack1,jmxrAttack2,jmxrAttack3,jmxrAttack4,jmxClimb1,jmxrJump1,jmxrJump2,jmxrJump3,
	jmxlStill,jmxlRun1,jmxlRun2,jmxlAttack1,jmxlAttack2,jmxlAttack3,jmxlAttack4,jmxClimb2,jmxlJump1,jmxlJump2,jmxlJump3,jmxlRun3,
	mainMenuBackground,creatorinfo,blankscreen,
	tigerRight1,tigerRight2,tigerRight3,tigerRightDead,tigerLeft1,tigerLeft2,tigerLeft3,tigerLeftDead,tigerImage,
	caveEntrance,HeartOfJungle,bossHP,bossBorder,
	instructionsMenu,winScreen,selectDifficulty,jungleHeart2;
	
	
	public static Sound bossMusic,jungleMusic;
	public static Sound swordSwing1,clack,batDeath,beesBuzzing,beeDeath,bossGetsHit,bossStomp,coinSound,gettingHit,jumpSound,tigerDeath,thornGrow,ladderClimb,spikeFall;

	
	public static void loadSounds(){
		try{

			
			batDeath =  new Sound("Assets/SoundFX/BatDeath.wav");
			lb.getSubImage(0, 0, 100, 635).draw(0,-35);
			beesBuzzing =  new Sound("Assets/SoundFX/BeesBuzzing.wav");
			beeDeath =  new Sound("Assets/SoundFX/BeeScreechDeath.wav");
			bossGetsHit = new Sound("Assets/SoundFX/BossGetsHit.wav");
			lb.getSubImage(0, 0, 200, 635).draw(0,-35);
			bossStomp = new Sound("Assets/SoundFX/BossStomp.wav");
			coinSound = new Sound("Assets/SoundFX/Coin.wav");
			lb.getSubImage(0, 0, 300, 635).draw(0,-35);
			gettingHit =  new Sound("Assets/SoundFX/GetHit.wav");
			jumpSound =  new Sound("Assets/SoundFX/Jump.wav");
			lb.getSubImage(0, 0, 400, 635).draw(0,-35);
			
			jungleMusic =  new Sound("Assets/SoundFX/JungleCreditSong.wav");
			
			swordSwing1 = new Sound("Assets/SoundFX/SwordSwing1.wav");
			ladderClimb = new Sound("Assets/SoundFX/Ladder.wav");
			lb.getSubImage(0, 0, 500, 635).draw(0,-35);
			spikeFall = new Sound("Assets/SoundFX/SpikeFall.wav");
			thornGrow = new Sound("Assets/SoundFX/ThornGrow.wav");
			clack = new Sound("Assets/SoundFX/clack.wav");
			lb.getSubImage(0, 0, 600, 635).draw(0,-35);
			tigerDeath =  new Sound("Assets/SoundFX/TigerDeath.wav");
			
			//Music
			bossMusic = new Sound("Assets/SoundFX/BossFightMusic.wav");
			lb.getSubImage(0, 0, 700, 635).draw(0,-35);

		} catch (SlickException e){e.printStackTrace();}
	}
	
	
	
	public static void loadImages(){
	try 
	{
			cavee = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Screens/cave.png"));
			blocks = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Blocks/blocks.png"));
			b = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Enemies/bat.png"));
			bg = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Blocks/background.png"));
			jmx = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/You/junglemanX.png"));
			mmb = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Screens/mainmenubackground.png"));
			MMB2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Screens/mainmenubackground2.png"));
			creatorinf = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Screens/creatorinfo.png"));
			tigerTex = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Enemies/tigerthick.png"));
			hotj = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Enemies/jungleheart.png"));
			jh2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Enemies/jungleheart2.png"));
			onefiddy = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/You/coin1to50.png"));
			woodp = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Screens/woodpanel.png"));
			bossRedBar = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Enemies/bosshp.png"));
			bb = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Enemies/bossborder.png"));
			instructions = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Screens/instructionsmenu.png"));
			ws = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Screens/winscreen.png"));
			
			//--//
			blocksImage = new Image(blocks);		
			tigerImage = new Image(tigerTex);
			bossHP = new Image(bossRedBar);
			bossBorder = new Image(bb);
			jungleHeart2 = new Image(jh2);
			
			
			instructionsMenu = new Image(instructions);
			winScreen = new Image(ws);
			selectDifficulty = new Image(MMB2);
		
			bat = new Image(b);
			background = new Image(bg);
			thorns = blocksImage.getSubImage(175, 25, 25, 25);
			thornsBottom = blocksImage.getSubImage(175, 50, 25, 25);
			thornsDouble = blocksImage.getSubImage(175, 75, 25, 25);
			thornsTop = blocksImage.getSubImage(150, 50, 25, 25);
			//
			JungleManX = new Image(jmx);
			
			heart = blocksImage.getSubImage(50, 75, 25, 25); 
			
			mainMenuBackground = new Image(mmb);
			creatorinfo = new Image(creatorinf);
			caveEntrance = new Image(cavee);
			HeartOfJungle = new Image(hotj);
			coinCounter = new Image(onefiddy);
			woodPanel = new Image(woodp);
			
			jmxrStill = JungleManX.getSubImage(0, 0, 24, 74);
			jmxlStill = JungleManX.getSubImage(0, 75, 24, 148);
			
			
			jmxrRun1 = JungleManX.getSubImage(24, 0, 48, 74);
			jmxrRun2 = JungleManX.getSubImage(72, 0, 24, 74);
			jmxrRun3 = JungleManX.getSubImage(96+44+38+70+68+26+30+48, 0, 48, 74);
			
			
			jmxlRun1 = JungleManX.getSubImage(24, 75, 48, 148);
			jmxlRun2 = JungleManX.getSubImage(72, 75, 24, 148);
			jmxlRun3 = JungleManX.getSubImage(96+44+38+70+68+26+30+48, 75, 48, 148);
					
			
			jmxrAttack1 = JungleManX.getSubImage(96, 0, 44, 74);
			jmxrAttack2 = JungleManX.getSubImage(96+44, 0, 38, 74);
			jmxrAttack3 = JungleManX.getSubImage(96+44+38, 0, 70, 74);
			jmxrAttack4 = JungleManX.getSubImage(96+44+38+70, 0, 68, 74);
			
			jmxlAttack1 = JungleManX.getSubImage(96, 75, 44, 148);
			jmxlAttack2 = JungleManX.getSubImage(96+44, 75, 38, 148);
			jmxlAttack3 = JungleManX.getSubImage(96+44+38, 75, 70, 148);
			jmxlAttack4 = JungleManX.getSubImage(96+44+38+70, 75, 68, 148);
			
			jmxClimb1  = JungleManX.getSubImage(96+44+38+70+68, 0, 26, 74);
			jmxClimb2  = JungleManX.getSubImage(96+44+38+70+68, 75, 26, 148);
			
			jmxrJump1 =  JungleManX.getSubImage(96+44+38+70+68+26, 0, 30, 74);
			jmxrJump2 = JungleManX.getSubImage(96+44+38+70+68+26+30, 0, 48, 74);
			jmxrJump3 = JungleManX.getSubImage(96+44+38+70+68+26+30+48, 0, 48, 74);
			
			jmxlJump1 =  JungleManX.getSubImage(96+44+38+70+68+26, 75, 30, 148);
			jmxlJump2 = JungleManX.getSubImage(96+44+38+70+68+26+30, 75, 48, 148);
			jmxlJump3 = JungleManX.getSubImage(96+44+38+70+68+26+30+48, 75, 48, 148);
			
			
			bat1 = bat.getSubImage(0, 0, 40, 25);
			bat2 = bat.getSubImage(50, 0, 50, 25);
			bat3 = bat.getSubImage(100, 0, 50, 25);
			batdead = bat.getSubImage(150, 0, 50, 25);

			
			tigerRight1 = tigerImage.getSubImage(0, 0, 80, 35);
			tigerRight2 = tigerImage.getSubImage(80, 0, 80, 35);
			tigerRight3 = tigerImage.getSubImage(160, 0, 80, 35);
			tigerRightDead = tigerImage.getSubImage(240, 0, 80, 35);
			tigerLeft1 = tigerImage.getSubImage(0, 35, 80, 75);
			tigerLeft2 = tigerImage.getSubImage(80, 35, 80, 75);
			tigerLeft3 = tigerImage.getSubImage(160, 35, 80, 75);
			tigerLeftDead = tigerImage.getSubImage(240, 35, 80, 75);
			
			coin1 = blocksImage.getSubImage(0, 175, 25, 25);
			coin2 = blocksImage.getSubImage(25, 175, 25, 25);
			coin3 = blocksImage.getSubImage(50, 175, 25, 25);
			coin4 = blocksImage.getSubImage(75, 175, 25, 25);
			
			pop1    = blocksImage.getSubImage(100, 175, 25, 25);
			pop2	= blocksImage.getSubImage(125, 175, 25, 25);
			pop3	= blocksImage.getSubImage(150, 175, 25, 25);
			pop4	= blocksImage.getSubImage(175, 175, 25, 25);
			
			
			
			block1 = blocksImage.getSubImage(0, 25, 25, 25);
			block2 = blocksImage.getSubImage(25, 0, 25, 25);
			block3 = blocksImage.getSubImage(50, 0, 25, 25);
			block4 = blocksImage.getSubImage(75, 0, 25, 25);
			blockhanging = blocksImage.getSubImage(150, 0, 25, 25);
			ladderLeft = blocksImage.getSubImage(0, 75, 25, 25);
			ladderRight = blocksImage.getSubImage(25, 75, 25, 25);
		
			beeRight = blocksImage.getSubImage(75, 75, 25, 25); 
			beeRight2 = blocksImage.getSubImage(100, 75, 25, 25); 
			beeLeft = blocksImage.getSubImage(125, 75, 25, 25);
			beeLeft2 = blocksImage.getSubImage(150, 75, 25, 25);
			
			pillar = blocksImage.getSubImage(0, 100, 25, 75);
			pillarTop = blocksImage.getSubImage(100, 150, 25, 25);
			
			blockright1 = blocksImage.getSubImage(25, 125, 25, 25);
			blockleft1 = blocksImage.getSubImage(50, 125, 25, 25);
			blockdoublesided = blocksImage.getSubImage(75, 125, 25, 25);
			blockalone = blocksImage.getSubImage(75, 150, 25, 25);
			
			roundedGroundRight  = blocksImage.getSubImage(0, 0, 25, 25);
			roundedGroundLeft  = blocksImage.getSubImage(100, 0, 25, 25);
			roundedOnlyBottom  = blocksImage.getSubImage(125, 0, 25, 25);
			roundedSides  = blocksImage.getSubImage(175, 0, 25, 25);
			
			shrubbery1 = blocksImage.getSubImage(0, 50, 25, 25);
			shrubbery2 = blocksImage.getSubImage(25, 50, 25, 25);
			shrubbery3 = blocksImage.getSubImage(50, 50, 25, 25);
			shrubbery4 = blocksImage.getSubImage(75, 50, 25, 25);
			shrubbery5 = blocksImage.getSubImage(100, 50, 25, 25);
			
			splatL1 = blocksImage.getSubImage(175, 100, 25, 25);
			splatL2 = blocksImage.getSubImage(150, 100, 25, 25);
			splatL3 = blocksImage.getSubImage(125, 100, 25, 25);
			splatR1 = blocksImage.getSubImage(125, 125, 25, 25);
			splatR2 = blocksImage.getSubImage(150, 125, 25, 25);
			splatR3 = blocksImage.getSubImage(175, 125, 25, 25);
			
			
			
	}
	catch (IOException e){e.printStackTrace();}	
	}
	
	public static Image ls,lb;
	public static void loadAssets(){
		try {
			loadingScreen = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Screens/loadingscreen.png"));
			loadingBar = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("Assets/Screens/loadingbar.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ls = new Image(loadingScreen);
		lb = new Image(loadingBar);
		ls.draw(0,-35);
		
		//System.out.println("loading shit");
		loadSounds();
		loadImages();
		
		
	}
	
	
}
