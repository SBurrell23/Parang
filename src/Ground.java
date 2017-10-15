import java.util.LinkedList;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.Rectangle;



public class Ground {

	public static LinkedList<Rectangle> ground = new LinkedList<Rectangle>();
	public static LinkedList<Rectangle> ladder = new LinkedList<Rectangle>();
	public static LinkedList<Rectangle> thorns = new LinkedList<Rectangle>();
	public static LinkedList<Rectangle> shrubs = new LinkedList<Rectangle>();

	//Tiger Params (Alive,startingx,startingy,endingx,endingy, goBack,Rectangle(startingx,startingy,width,height))
	//only use even numbers for tiger x

	public static void drawLevel()
	{	
		GL11.glColor3f(0, 0, 1);
		switch(Levels.currentLevel){
		case 1:drawLevel1();drawGround();break;
		case 2:drawLevel2();drawGround();break;
		case 3:drawLevel3();drawGround();break;
		case 4:drawLevel4();drawGround();break;
		case 5:drawLevel5();drawGround();break;
		case 6:drawLevel6();drawGround();break;
		case 7:drawLevel7();drawGround();break;
		case 8:drawLevel8();drawGround();break;
		case 9:drawLevel9();drawGround();break;
		case 10:drawLevel10();drawGround();break;
		case 11:drawLevel11();drawGround();break;
		case 12:drawLevel12();drawGround();break;
		case 13:drawLevel13();drawGround();break;
		case 14:drawLevel14();drawGround();break;
		case 15:drawLevel15();drawGround();break;
		case 16:drawLevel16();drawGround();break;
		case 17:drawLevel17();drawGround();break;
		case 18:drawLevel18();drawGround();break;
		case 19:drawLevel19();drawGround();break;
		case 20:drawLevel20();drawGround();break;
		case 21:drawLevel21();drawGround();break;
		case 22:drawLevel22();drawGround();break;
		case 23:drawLevel23();drawGround();break;
		case 24:drawLevel24();drawGround();break;
		case 25:drawLevel25();drawGround();break;
		case 26:drawLevel26();drawGround();break;
		case 27:drawLevel27();drawGround();break;
		case 28:drawLevel28();drawGround();break;
		case 29:drawLevel29();drawGround();break;
		case 30:drawLevel30();drawGround();break;
		default:break;
		}
	}

	public static Coin coin1_1 = new Coin(275,400,false);
	public static Coin coin1_2 = new Coin(125,525,false);
	public static Coin coin1_3 = new Coin(225,525,false);
	public static void drawLevel1()
	{
		
		Coin.coins.add(coin1_1);Coin.coins.add(coin1_2);Coin.coins.add(coin1_3);
		//

		
		ground.add(new Rectangle(250,450,125,25));
		ground.add(new Rectangle(325,400,50,50));
		ground.add(new Rectangle(25,450,175,25));
		ground.add(new Rectangle(0,0,100,150));
		ground.add(new Rectangle(100,0,25,125));
		ground.add(new Rectangle(125,0,25,100));
		ground.add(new Rectangle(150,0,25,75));
		ground.add(new Rectangle(0,125,100,25));
		ground.add(new Rectangle(0,125,75,50));
		ground.add(new Rectangle(0,175,50,50));
		ground.add(new Rectangle(0,225,25,275));
		ground.add(new Rectangle(175,0,150,50));
		ground.add(new Rectangle(200,50,125,25));
		ground.add(new Rectangle(200,75,75,50));
		ground.add(new Rectangle(225,100,25,100));
		ground.add(new Rectangle(275,0,50,75));
		ground.add(new Rectangle(325,0,475,25));
		ground.add(new Rectangle(375,0,150,50));
		ground.add(new Rectangle(400,25,100,50));
		ground.add(new Rectangle(425,50,25,50));
		ground.add(new Rectangle(575,0,75,50));
		ground.add(new Rectangle(600,25,25,50));
		ground.add(new Rectangle(775,25,25,50));
		ground.add(new Rectangle(750,0,50,50));
		ground.add(new Rectangle(750,175,50,425));
		ground.add(new Rectangle(700,225,50,350));
		ground.add(new Rectangle(650,250,75,325));
		ground.add(new Rectangle(600,275,75,275));
		ground.add(new Rectangle(625,525,50,50));
		ground.add(new Rectangle(550,300,75,225));
		ground.add(new Rectangle(575,500,50,50));
		ground.add(new Rectangle(375,350,200,175));
		ground.add(new Rectangle(300,475,150,75));
		ground.add(new Rectangle(350,550,75,25));
		ground.add(new Rectangle(325,350,225,25));
		ground.add(new Rectangle(300,350,25,25));
		ground.add(new Rectangle(325,375,50,25));
		ground.add(new Rectangle(225,425,25,50));
		ground.add(new Rectangle(200,450,25,25));
		ground.add(new Rectangle(25,475,350,25));
		ground.add(new Rectangle(0,500,25,100));
		ground.add(new Rectangle(75,575,225,25));
		ground.add(new Rectangle(300,550,50,75));
		ladder.add(new Rectangle(25,500,50,100));
		
		shrubs.add(new Rectangle(75,550,225,25));
		shrubs.add(new Rectangle(25,425,175,25));
		shrubs.add(new Rectangle(200,425,25,25));
		shrubs.add(new Rectangle(225,400,25,25));
		shrubs.add(new Rectangle(250,425,75,25));
		shrubs.add(new Rectangle(300,325,250,25));
		shrubs.add(new Rectangle(550,275,50,25));
		shrubs.add(new Rectangle(600,250,50,25));
		shrubs.add(new Rectangle(650,225,50,25));
		shrubs.add(new Rectangle(700,200,50,25));
		shrubs.add(new Rectangle(750,150,50,25));
		
		ground.add(new Rectangle(325,475,475,200));
	}

	public static Tiger tiger2_1 = new Tiger(true,124,445,424,0,false,new Rectangle(124,445,80,30));
	public static Coin coin2_1 = new Coin(165,300,false);
	public static Coin coin2_2 = new Coin(85,410,false);
	public static Coin coin2_3 = new Coin(740,355,false);
	//public static Tiger tiger2_2 = new Tiger(true,320,445,424,445,false,new Rectangle(320,445,80,30));
	//public static Tiger tiger2_3 = new Tiger(true,214,445,320,445,false,new Rectangle(214,445,80,30));
	//public static Bat bat1_2 = new Bat(true,500,252,500,376,false,new Rectangle(500,252,50,25));
	public static void drawLevel2(){
		ground.add(new Rectangle(25,525,125,25));
		ground.add(new Rectangle(75,525,50,50));
		ground.add(new Rectangle(100,575,25,25));
		ground.add(new Rectangle(125,525,25,50));
		ground.add(new Rectangle(275,525,225,25));
		ground.add(new Rectangle(425,550,50,25));
		ground.add(new Rectangle(500,525,25,25));
		ground.add(new Rectangle(700,525,50,25));
		ground.add(new Rectangle(725,525,25,50));
		ground.add(new Rectangle(250,525,25,75));
		ground.add(new Rectangle(575,525,25,50));
		ground.add(new Rectangle(0,0,800,25));
		ground.add(new Rectangle(0,175,425,75));
		ground.add(new Rectangle(675,150,125,25));
		ground.add(new Rectangle(0,475,800,50));
		ground.add(new Rectangle(675,300,25,150));
		ground.add(new Rectangle(700,425,100,25));
		ground.add(new Rectangle(700,300,100,25));
		ground.add(new Rectangle(475,175,50,25));
		ground.add(new Rectangle(575,175,50,25));
		ground.add(new Rectangle(675,175,125,125));
		ground.add(new Rectangle(750,25,25,25));
		ground.add(new Rectangle(775,25,25,50));
		ground.add(new Rectangle(200,150,225,25));
		ground.add(new Rectangle(475,150,50,25));
		ground.add(new Rectangle(575,150,50,25));
		ground.add(new Rectangle(425,150,50,25));
		ground.add(new Rectangle(500,200,25,25));
		ground.add(new Rectangle(525,150,50,25));
		ground.add(new Rectangle(600,200,25,25));
		ground.add(new Rectangle(375,250,50,50));
		ground.add(new Rectangle(400,300,25,25));
		ground.add(new Rectangle(350,250,25,25));
		ground.add(new Rectangle(425,175,25,125));
		ground.add(new Rectangle(450,175,25,75));
		ground.add(new Rectangle(525,175,25,100));
		ground.add(new Rectangle(550,175,25,50));
		ground.add(new Rectangle(75,250,75,50));
		ground.add(new Rectangle(100,300,25,25));
		ground.add(new Rectangle(150,250,25,25));
		ground.add(new Rectangle(50,250,25,25));
		ground.add(new Rectangle(200,250,75,25));
		ground.add(new Rectangle(225,250,25,50));
		ground.add(new Rectangle(250,275,25,25));
		ground.add(new Rectangle(250,300,25,25));
		ground.add(new Rectangle(275,250,25,100));
		ground.add(new Rectangle(300,250,25,50));
		ground.add(new Rectangle(0,250,25,225));
		ground.add(new Rectangle(25,250,25,175));
		ground.add(new Rectangle(50,275,25,125));
		ground.add(new Rectangle(75,300,25,75));
		ground.add(new Rectangle(100,325,25,25));
		ground.add(new Rectangle(675,450,125,25));
		ground.add(new Rectangle(625,25,125,50));
		ground.add(new Rectangle(750,50,25,25));
		ground.add(new Rectangle(550,25,75,25));
		ground.add(new Rectangle(0,25,125,50));
		ground.add(new Rectangle(100,25,150,25));
		ground.add(new Rectangle(700,325,25,25));
		ground.add(new Rectangle(700,400,25,25));
		shrubs.add(new Rectangle(25,450,650,25));
		Coin.coins.add(coin2_1);
		Coin.coins.add(coin2_2);
		Coin.coins.add(coin2_3);
		Enemy.enemies.add(tiger2_1);
		ladder.add(new Rectangle(625,150,50,325));
		ladder.add(new Rectangle(625,75,50,75));
		//
		shrubs.add(new Rectangle(0,150,200,25));
		shrubs.add(new Rectangle(200,125,425,25));
		shrubs.add(new Rectangle(675,125,125,25));
		shrubs.add(new Rectangle(700,375,25,25));
		shrubs.add(new Rectangle(725,400,75,25));
	}
	public static Tiger tiger3_1 = new Tiger(true,300,545,488,0,false,new Rectangle(300,545,80,30));
	public static Bat bat3_1 = new Bat(true,350,176,0,248,false,new Rectangle(350,176,50,25));
	public static Bat bat3_2 = new Bat(true,475,26,0,126,false,new Rectangle(475,26,50,25));
	public static Coin coin3_1 = new Coin(610,85,false);
	public static void drawLevel3(){
		ground.add(new Rectangle(550,175,100,25));
		ground.add(new Rectangle(0,0,800,25));
		ground.add(new Rectangle(0,25,200,50));
		ground.add(new Rectangle(0,150,100,175));
		ground.add(new Rectangle(150,75,50,200));
		ground.add(new Rectangle(0,425,150,175));
		ground.add(new Rectangle(150,450,25,150));
		ground.add(new Rectangle(175,475,25,125));
		ground.add(new Rectangle(200,500,25,100));
		ground.add(new Rectangle(225,525,25,75));
		ground.add(new Rectangle(250,550,25,50));
		ground.add(new Rectangle(275,575,525,25));
		ladder.add(new Rectangle(100,150,50,275));
		ground.add(new Rectangle(650,150,75,425));
		ladder.add(new Rectangle(600,275,50,300));
		ground.add(new Rectangle(250,150,400,25));
		ground.add(new Rectangle(150,275,450,50));
		ground.add(new Rectangle(200,25,100,50));
		ground.add(new Rectangle(300,25,50,25));
		ladder.add(new Rectangle(200,75,50,200));
		ground.add(new Rectangle(750,25,50,50));
		ground.add(new Rectangle(775,75,25,400));
		ladder.add(new Rectangle(725,150,50,425));
		//
		ladder.add(new Rectangle(100,75,50,75));
		ladder.add(new Rectangle(725,75,50,75));
		ladder.add(new Rectangle(600,200,50,75));
		//
		ground.add(new Rectangle(675,25,75,50));
		ground.add(new Rectangle(600,25,50,25));
		ground.add(new Rectangle(600,25,75,25));
		ground.add(new Rectangle(350,25,25,25));
		ground.add(new Rectangle(275,325,225,25));
		ground.add(new Rectangle(300,325,150,75));
		ground.add(new Rectangle(375,375,50,50));
		ground.add(new Rectangle(425,375,50,50));
		ground.add(new Rectangle(475,300,75,100));
		ground.add(new Rectangle(475,350,50,50));
		ground.add(new Rectangle(500,400,25,75));
		ground.add(new Rectangle(450,350,25,25));
		ground.add(new Rectangle(550,325,25,25));
		ground.add(new Rectangle(475,400,25,50));
		ground.add(new Rectangle(0,575,800,100));
		Enemy.enemies.add(tiger3_1);
		Enemy.enemies.add(bat3_1);
		Enemy.enemies.add(bat3_2);
		Coin.coins.add(coin3_1);
		//
		shrubs.add(new Rectangle(0,125,100,25));
		shrubs.add(new Rectangle(0,400,150,25));
		shrubs.add(new Rectangle(150,425,25,25));
		shrubs.add(new Rectangle(175,450,25,25));
		shrubs.add(new Rectangle(200,475,25,25));
		shrubs.add(new Rectangle(225,500,25,25));
		shrubs.add(new Rectangle(250,525,25,25));
		shrubs.add(new Rectangle(275,550,375,25));
		shrubs.add(new Rectangle(200,250,400,25));
		shrubs.add(new Rectangle(250,125,475,25));
		shrubs.add(new Rectangle(725,550,75,25));

	}
	public static Tiger tiger4_1 = new Tiger(true,552,545,644,0,false,new Rectangle(552,545,80,30));
	public static Tiger tiger4_2 = new Tiger(true,276,70,448,0,false,new Rectangle(276,70,80,30));
	public static Bat bat4_1 = new Bat(true,225,28,0,168,false,new Rectangle(225,28,50,25));
	public static Bat bat4_2 = new Bat(true,125,28,0,400,false,new Rectangle(125,28,50,25));
	public static Bat bat4_3 = new Bat(true,175,324,0,540,false,new Rectangle(175,324,50,25));
	//public static Bat bat4_4 = new Bat(true,600,28,0,172,false,new Rectangle(600,28,50,25));
	public static Bat bat4_5 = new Bat(true,675,84,0,324,false,new Rectangle(675,84,50,25));
	public static Bat bat4_6 = new Bat(true,525,352,0,472,false,new Rectangle(525,352,50,25));
	public static Coin coin4_1 = new Coin(400,480,false);
	public static Coin coin4_2 = new Coin(750,525,false);
	public static void drawLevel4(){
		ground.add(new Rectangle(25,25,50,125));
		ground.add(new Rectangle(75,25,25,100));
		ground.add(new Rectangle(100,25,25,50));
		ground.add(new Rectangle(25,125,25,50));
		ground.add(new Rectangle(25,175,25,50));
		ground.add(new Rectangle(275,575,50,25));
		ground.add(new Rectangle(725,300,25,75));
		ground.add(new Rectangle(475,575,50,25));
		ground.add(new Rectangle(0,0,800,25));
		ground.add(new Rectangle(0,575,275,25));
		ground.add(new Rectangle(525,575,275,25));
		ground.add(new Rectangle(275,100,50,475));
		ground.add(new Rectangle(475,100,50,475));
		ground.add(new Rectangle(0,25,25,425));
		ground.add(new Rectangle(0,450,25,25));
		ground.add(new Rectangle(225,500,50,25));
		ground.add(new Rectangle(125,425,50,25));
		ground.add(new Rectangle(75,350,50,25));
		ground.add(new Rectangle(625,450,50,25));
		ground.add(new Rectangle(675,475,25,25));

		ground.add(new Rectangle(175,275,50,25));
		ground.add(new Rectangle(225,200,50,25));
		ground.add(new Rectangle(750,0,50,375));
		ground.add(new Rectangle(525,500,25,75));
		ground.add(new Rectangle(575,425,0,0));
		ground.add(new Rectangle(600,425,75,25));
	
		ground.add(new Rectangle(725,275,50,25));
		ground.add(new Rectangle(325,100,50,25));
		ground.add(new Rectangle(425,100,50,25));
		ladder.add(new Rectangle(375,100,50,175));
		ladder.add(new Rectangle(375,25,50,75));
		ground.add(new Rectangle(600,200,75,25));
		ground.add(new Rectangle(525,125,25,25));
		ground.add(new Rectangle(525,225,75,100));
		ground.add(new Rectangle(525,325,25,25));
		ground.add(new Rectangle(750,450,50,50));
		ground.add(new Rectangle(525,175,50,50));
		ground.add(new Rectangle(575,200,25,25));
		ground.add(new Rectangle(525,150,25,25));
		ground.add(new Rectangle(675,450,75,25));
		ground.add(new Rectangle(700,475,50,25));
		ground.add(new Rectangle(600,225,25,50));
		ground.add(new Rectangle(700,25,50,50));
		ground.add(new Rectangle(725,75,25,50));
		ground.add(new Rectangle(725,100,50,175));
		ground.add(new Rectangle(675,25,25,25));
		ground.add(new Rectangle(325,125,50,300));
		ground.add(new Rectangle(325,425,25,100));
		ground.add(new Rectangle(425,125,50,175));
		ground.add(new Rectangle(450,300,25,75));
		ground.add(new Rectangle(450,375,25,75));
		ground.add(new Rectangle(325,500,25,50));
		ground.add(new Rectangle(675,50,25,25));
		ground.add(new Rectangle(275,575,50,100));
		ground.add(new Rectangle(475,575,75,100));
		ladder.add(new Rectangle(675,75,50,250));
		
		//
		
		
		shrubs.add(new Rectangle(0,550,275,25));
		shrubs.add(new Rectangle(225,475,50,25));
		shrubs.add(new Rectangle(125,400,50,25));
		shrubs.add(new Rectangle(75,325,50,25));
		shrubs.add(new Rectangle(175,250,50,25));
		shrubs.add(new Rectangle(225,175,50,25));
		shrubs.add(new Rectangle(275,75,100,25));
		shrubs.add(new Rectangle(425,75,100,25));
		shrubs.add(new Rectangle(525,100,25,25));
		shrubs.add(new Rectangle(550,150,25,25));
		shrubs.add(new Rectangle(575,175,100,25));
		shrubs.add(new Rectangle(600,400,75,25));
		shrubs.add(new Rectangle(675,425,125,25));
		shrubs.add(new Rectangle(525,475,25,25));
		shrubs.add(new Rectangle(550,550,250,25));

		
		Enemy.enemies.add(tiger4_1);
		Enemy.enemies.add(tiger4_2);
		Enemy.enemies.add(bat4_1);
		Enemy.enemies.add(bat4_2);
		Enemy.enemies.add(bat4_3);
		//Enemy.enemies.add(bat4_4);
		Enemy.enemies.add(bat4_5);
		Enemy.enemies.add(bat4_6);
		Coin.coins.add(coin4_1);
		Coin.coins.add(coin4_2);

	}
	public static Coin coin5_1 = new Coin(34,220,false);
	public static Tiger tiger5_1 = new Tiger(true,75,70,380,0,false,new Rectangle(75,70,80,30));
	public static Bat bat5_1 = new Bat(true,275,126,0,570,false,new Rectangle(275,126,50,25));
	public static Bat bat5_2 = new Bat(true,400,200,0,464,false,new Rectangle(400,200,50,25));
	public static void drawLevel5(){

		Coin.coins.add(coin5_1);
		Enemy.enemies.add(tiger5_1);
		Enemy.enemies.add(bat5_1);Enemy.enemies.add(bat5_2);
		ladder.add(new Rectangle(725,25,50,575));
		ground.add(new Rectangle(0,0,25,375));
		ground.add(new Rectangle(0,450,100,25));
		ground.add(new Rectangle(0,575,100,25));
		ground.add(new Rectangle(75,100,25,550));
		ground.add(new Rectangle(75,100,375,25));
		ground.add(new Rectangle(375,100,25,50));
		ground.add(new Rectangle(400,100,25,75));
		ground.add(new Rectangle(425,100,25,100));
		ground.add(new Rectangle(450,150,50,25));
		ground.add(new Rectangle(575,200,50,25));
		ground.add(new Rectangle(525,250,75,25));
		ground.add(new Rectangle(450,325,50,25));
		ground.add(new Rectangle(325,275,75,25));
		ground.add(new Rectangle(325,425,50,25));
		ground.add(new Rectangle(200,300,50,25));
		ground.add(new Rectangle(100,325,50,25));
		ground.add(new Rectangle(150,400,50,25));
		ground.add(new Rectangle(200,475,75,25));
		ground.add(new Rectangle(375,500,75,25));
		ground.add(new Rectangle(500,550,50,25));
		ground.add(new Rectangle(600,475,50,25));
		ground.add(new Rectangle(700,125,25,550));
		ground.add(new Rectangle(775,0,75,650));
		ground.add(new Rectangle(625,0,25,150));
		ground.add(new Rectangle(600,0,25,50));
		ground.add(new Rectangle(25,0,750,25));
		ground.add(new Rectangle(100,125,25,75));
		ground.add(new Rectangle(125,125,25,50));
		ground.add(new Rectangle(150,125,25,25));
		//
		thorns.add(new Rectangle(100,450,25,125));
		thorns.add(new Rectangle(125,475,25,75));
		thorns.add(new Rectangle(150,475,25,50));
		thorns.add(new Rectangle(675,525,25,75));
		thorns.add(new Rectangle(650,550,50,50));
		thorns.add(new Rectangle(625,575,50,25));

		//
		shrubs.add(new Rectangle(0,425,75,25));
		shrubs.add(new Rectangle(0,550,75,25));
		shrubs.add(new Rectangle(75,75,375,25));
		shrubs.add(new Rectangle(450,125,50,25));
		shrubs.add(new Rectangle(575,175,50,25));
		shrubs.add(new Rectangle(700,100,25,25));
		shrubs.add(new Rectangle(525,225,75,25));
		shrubs.add(new Rectangle(450,300,50,25));
		shrubs.add(new Rectangle(325,250,75,25));
		shrubs.add(new Rectangle(200,275,50,25));
		shrubs.add(new Rectangle(100,300,50,25));
		shrubs.add(new Rectangle(150,375,50,25));
		shrubs.add(new Rectangle(200,450,75,25));
		shrubs.add(new Rectangle(325,400,50,25));
		shrubs.add(new Rectangle(375,475,75,25));
		shrubs.add(new Rectangle(500,525,50,25));
		shrubs.add(new Rectangle(600,450,50,25));



	}
	public static Coin coin6_1 = new Coin(680,510,false);
	public static Bat bat6_1 = new Bat(true,250,26,0,550,false,new Rectangle(250,26,50,25));
	public static Bat bat6_2 = new Bat(true,310,26,0,550,false,new Rectangle(310,26,50,25));
	public static Bat bat6_3 = new Bat(true,370,26,0,550,false,new Rectangle(370,26,50,25));
	public static Bat bat6_4 = new Bat(true,430,26,0,550,false,new Rectangle(430,26,50,25));
	public static Bat bat6_5 = new Bat(true,600,26,0,102,false,new Rectangle(600,26,50,25));
	public static Pillar pillar6_1 = new Pillar(true,500,150,false,new Rectangle(500,150,25,75));
	public static Coin coin6_3 = new Coin(732,275,false);
	public static Coin coin6_2 = new Coin(183,75,false);
	public static Coin coin6_4 = new Coin(85,500,false);
	public static void drawLevel6(){
		Coin.coins.add(coin6_1);Coin.coins.add(coin6_2);Coin.coins.add(coin6_3);Coin.coins.add(coin6_4);
		Enemy.enemies.add(bat6_1);Enemy.enemies.add(bat6_2);Enemy.enemies.add(bat6_3);Enemy.enemies.add(bat6_4);Enemy.enemies.add(bat6_5);
		Enemy.enemies.add(pillar6_1);
		ground.add(new Rectangle(75,125,25,350));
		ground.add(new Rectangle(100,425,125,50));
		ground.add(new Rectangle(0,0,25,600));
		ground.add(new Rectangle(25,575,100,25));
		ground.add(new Rectangle(175,425,50,175));
		ground.add(new Rectangle(175,575,625,50));
		ground.add(new Rectangle(500,550,100,25));
		ground.add(new Rectangle(550,525,75,25));
		ground.add(new Rectangle(575,475,75,50));
		ground.add(new Rectangle(625,425,50,50));
		ground.add(new Rectangle(700,375,25,25));
		ground.add(new Rectangle(650,400,75,50));
		ground.add(new Rectangle(675,125,125,25));
		ground.add(new Rectangle(775,125,25,325));
		ground.add(new Rectangle(75,0,725,25));
		//
		ground.add(new Rectangle(150,25,25,175));
		ground.add(new Rectangle(225,125,475,25));
		ground.add(new Rectangle(275,350,25,25));
		ground.add(new Rectangle(700,175,25,25));
		ground.add(new Rectangle(350,300,25,25));
		ground.add(new Rectangle(350,475,25,25));
		ground.add(new Rectangle(250,500,25,25));
		ground.add(new Rectangle(575,250,25,25));
		ground.add(new Rectangle(525,425,25,25));
		ground.add(new Rectangle(675,325,25,25));
		ground.add(new Rectangle(425,350,25,25));
		ground.add(new Rectangle(575,450,50,25));
		ground.add(new Rectangle(575,400,75,75));
		ground.add(new Rectangle(175,25,25,25));
		ground.add(new Rectangle(125,25,25,25));
		//
		thorns.add(new Rectangle(675,450,50,50));
		thorns.add(new Rectangle(775,450,25,50));
		thorns.add(new Rectangle(650,475,25,100));
		thorns.add(new Rectangle(675,550,25,25));
		thorns.add(new Rectangle(625,525,25,50));
		thorns.add(new Rectangle(600,550,25,25));
		//
		ladder.add(new Rectangle(25,0,50,575));
		ladder.add(new Rectangle(125,550,50,50));
		ladder.add(new Rectangle(125,475,50,75));
		//
		shrubs.add(new Rectangle(600,550,100,25));
		shrubs.add(new Rectangle(700,550,100,25));
		shrubs.add(new Rectangle(575,375,125,25));
		shrubs.add(new Rectangle(700,350,25,25));
		shrubs.add(new Rectangle(675,300,25,25));
		shrubs.add(new Rectangle(700,150,25,25));
		shrubs.add(new Rectangle(575,225,25,25));
		shrubs.add(new Rectangle(425,325,25,25));
		shrubs.add(new Rectangle(350,275,25,25));
		shrubs.add(new Rectangle(275,325,25,25));
		shrubs.add(new Rectangle(250,475,25,25));
		shrubs.add(new Rectangle(350,450,25,25));
		shrubs.add(new Rectangle(525,400,25,25));
		shrubs.add(new Rectangle(550,500,25,25));
		shrubs.add(new Rectangle(500,525,50,25));
		shrubs.add(new Rectangle(225,550,275,25));
		shrubs.add(new Rectangle(25,550,100,25));
		shrubs.add(new Rectangle(100,400,125,25));
		shrubs.add(new Rectangle(75,100,25,25));
		shrubs.add(new Rectangle(225,100,575,25));


	}
	public static Tiger tiger7_1 = new Tiger(true,376,95,494,0,false,new Rectangle(376,95,80,30));
	public static Bat bat7_1 = new Bat(true,625,150,0,322,false,new Rectangle(625,150,50,25));
	public static Coin coin7_1 = new Coin(645,250,false);
	public static Coin coin7_2 = new Coin(100,275,false);
	public static Pillar pillar7_1 = new Pillar(true,275,50,false,new Rectangle(275,50,25,75));
	public static Pillar pillar7_2 = new Pillar(true,725,150,false,new Rectangle(725,150,25,75));
	public static Bee bee7_1 = new Bee(true,450,275,0,2,false,new Rectangle(450,275,25,25));
	public static void drawLevel7(){
		shrubs.add(new Rectangle(0,550,200,25));
		shrubs.add(new Rectangle(250,550,125,25));
		shrubs.add(new Rectangle(0,100,75,25));
		shrubs.add(new Rectangle(75,125,50,25));
		shrubs.add(new Rectangle(175,125,50,25));
		shrubs.add(new Rectangle(225,200,50,25));
		shrubs.add(new Rectangle(375,100,200,25));
		shrubs.add(new Rectangle(650,25,100,25));
		shrubs.add(new Rectangle(625,325,75,25));
		shrubs.add(new Rectangle(575,550,225,25));
		ground.add(new Rectangle(775,25,25,450));
		ground.add(new Rectangle(750,25,25,100));
		ground.add(new Rectangle(750,125,50,325));
		ground.add(new Rectangle(-25,200,50,250));
		ground.add(new Rectangle(0,0,800,25));
		ladder.add(new Rectangle(200,475,50,125));
		ground.add(new Rectangle(0,575,200,25));
		ground.add(new Rectangle(250,575,550,25));
		ground.add(new Rectangle(375,125,200,500));
		ground.add(new Rectangle(650,50,100,100));
		ground.add(new Rectangle(0,125,75,50));
		ground.add(new Rectangle(625,350,75,75));
		ground.add(new Rectangle(75,150,50,25));
		ground.add(new Rectangle(300,0,100,50));
		ground.add(new Rectangle(175,225,100,250));
		ground.add(new Rectangle(175,150,50,75));
		ground.add(new Rectangle(275,25,25,25));
		ladder.add(new Rectangle(325,50,50,525));
		thorns.add(new Rectangle(25,225,25,200));
		thorns.add(new Rectangle(50,350,25,25));
		thorns.add(new Rectangle(150,400,25,75));
		thorns.add(new Rectangle(125,450,25,25));
		thorns.add(new Rectangle(275,225,25,250));
		thorns.add(new Rectangle(300,275,25,150));
		Coin.coins.add(coin7_1);
		Coin.coins.add(coin7_2);
		Enemy.enemies.add(tiger7_1);
		Enemy.enemies.add(bat7_1);
		Enemy.enemies.add(bee7_1);
		Enemy.enemies.add(pillar7_1);
		Enemy.enemies.add(pillar7_2);

	}
	public static Coin coin8_1 = new Coin(60,225,false);
	public static Coin coin8_2 = new Coin(760,80,false);
	public static void drawLevel8()
	{
		Coin.coins.add(coin8_1);Coin.coins.add(coin8_2);
		ground.add(new Rectangle(300,475,25,1));
		ground.add(new Rectangle(300,475,25,150));
		ground.add(new Rectangle(325,475,200,25));
		ground.add(new Rectangle(0,0,25,475));
		ground.add(new Rectangle(25,0,25,450));
		ground.add(new Rectangle(0,575,325,25));
		ground.add(new Rectangle(425,575,375,25));
		ground.add(new Rectangle(400,575,25,25));
		//
		ground.add(new Rectangle(325,500,25,25));
		ground.add(new Rectangle(300,450,25,25));
		ground.add(new Rectangle(350,450,50,25));
		ground.add(new Rectangle(325,450,25,25));
		ground.add(new Rectangle(450,425,75,50));
		ground.add(new Rectangle(400,450,50,25));
		ground.add(new Rectangle(225,525,25,25));
		ground.add(new Rectangle(125,150,25,25));
		ground.add(new Rectangle(50,0,750,25));
		ground.add(new Rectangle(100,500,25,25));
		ground.add(new Rectangle(175,425,25,25));
		ground.add(new Rectangle(75,275,25,25));
		ground.add(new Rectangle(175,225,25,25));
		ground.add(new Rectangle(300,100,100,25));
		ground.add(new Rectangle(350,400,25,25));
		ground.add(new Rectangle(600,350,25,25));
		ground.add(new Rectangle(675,250,25,25));
		ground.add(new Rectangle(725,350,25,25));
		ground.add(new Rectangle(550,300,25,25));
		ground.add(new Rectangle(225,350,25,25));
		ground.add(new Rectangle(275,275,25,25));
		ground.add(new Rectangle(450,200,25,25));
		ground.add(new Rectangle(250,150,25,25));
		ground.add(new Rectangle(350,250,25,25));
		ground.add(new Rectangle(400,100,25,25));
		ground.add(new Rectangle(400,275,25,25));
		ground.add(new Rectangle(525,150,25,25));
		ground.add(new Rectangle(625,225,25,25));
		ground.add(new Rectangle(700,150,25,25));
		ground.add(new Rectangle(575,75,25,25));
		ground.add(new Rectangle(750,125,50,25));
		ground.add(new Rectangle(775,425,25,75));
		ground.add(new Rectangle(525,425,25,75));
		thorns.add(new Rectangle(550,450,225,25));
		ground.add(new Rectangle(775,150,50,350));
		ground.add(new Rectangle(50,275,25,25));
		//
		shrubs.add(new Rectangle(100,475,25,25));
		shrubs.add(new Rectangle(175,400,25,25));
		shrubs.add(new Rectangle(225,325,25,25));
		shrubs.add(new Rectangle(175,200,25,25));
		shrubs.add(new Rectangle(125,125,25,25));
		shrubs.add(new Rectangle(250,125,25,25));
		shrubs.add(new Rectangle(275,250,25,25));
		shrubs.add(new Rectangle(225,500,25,25));
		shrubs.add(new Rectangle(50,250,50,25));
		shrubs.add(new Rectangle(300,75,125,25));
		shrubs.add(new Rectangle(300,425,150,25));
		shrubs.add(new Rectangle(450,400,100,25));
		shrubs.add(new Rectangle(400,550,400,25));
		shrubs.add(new Rectangle(750,100,50,25));
		shrubs.add(new Rectangle(0,550,300,25));
		shrubs.add(new Rectangle(350,375,25,25));
		shrubs.add(new Rectangle(350,225,25,25));
		shrubs.add(new Rectangle(400,250,25,25));
		shrubs.add(new Rectangle(450,175,25,25));
		shrubs.add(new Rectangle(525,125,25,25));
		shrubs.add(new Rectangle(575,50,25,25));
		shrubs.add(new Rectangle(700,125,25,25));
		shrubs.add(new Rectangle(625,200,25,25));
		shrubs.add(new Rectangle(675,225,25,25));
		shrubs.add(new Rectangle(725,325,25,25));
		shrubs.add(new Rectangle(600,325,25,25));
		shrubs.add(new Rectangle(550,275,25,25));



	}
	public static Tiger tiger9_1 = new Tiger(true,26,245,120,0,false,new Rectangle(26,245,80,30));
	public static Tiger tiger9_2 = new Tiger(true,100,545,200,0,false,new Rectangle(100,545,80,30));
	//
	public static Tiger tiger9_3 = new Tiger(true,525,170,625,0,false,new Rectangle(525,170,80,30));
	public static Tiger tiger9_4 = new Tiger(true,525,270,625,0,false,new Rectangle(525,270,80,30));
	public static Tiger tiger9_5 = new Tiger(true,525,370+25,625,0,false,new Rectangle(525,370+25,80,30));
	public static Coin coin9_1 = new Coin(32,230,false);
	//
	public static Coin coin9_2 = new Coin(660,360,false);
	public static Coin coin9_3 = new Coin(675,510,false);
	public static void drawLevel9()
	{
		Enemy.enemies.add(tiger9_1);Enemy.enemies.add(tiger9_2);
		Enemy.enemies.add(tiger9_3);Enemy.enemies.add(tiger9_4);Enemy.enemies.add(tiger9_5);
		Coin.coins.add(coin9_1);Coin.coins.add(coin9_2);Coin.coins.add(coin9_3);
		ground.add(new Rectangle(775,475,25,125));
		ground.add(new Rectangle(775,0,25,175));
		ground.add(new Rectangle(475,0,325,25));
		ground.add(new Rectangle(475,0,50,600));
		ground.add(new Rectangle(475,575,325,25));
		ground.add(new Rectangle(275,0,50,600));
		ground.add(new Rectangle(0,575,325,25));
		ground.add(new Rectangle(0,0,325,25));
		ground.add(new Rectangle(50,25,275,25));
		ground.add(new Rectangle(0,125,75,25));
		ground.add(new Rectangle(125,125,100,25));
		ground.add(new Rectangle(200,125,25,375));
		ground.add(new Rectangle(150,275,50,200));
		ground.add(new Rectangle(125,275,25,175));
		ground.add(new Rectangle(25,275,50,150));
		ground.add(new Rectangle(0,400,50,75));
		ground.add(new Rectangle(0,450,25,50));
		ground.add(new Rectangle(575,100,150,25));
		ground.add(new Rectangle(700,100,25,275));
		ground.add(new Rectangle(700,350,100,25));
		ground.add(new Rectangle(575,425,125,25));
		ground.add(new Rectangle(575,300,150,25));
		ground.add(new Rectangle(575,200,150,25));
		ground.add(new Rectangle(0,125,25,275));
		ground.add(new Rectangle(700,375,25,100));
		ground.add(new Rectangle(650,450,50,25));
		ground.add(new Rectangle(625,450,25,50));
		ground.add(new Rectangle(600,450,25,25));
		ground.add(new Rectangle(775,475,100,200));
		ground.add(new Rectangle(775,0,100,175));
		ground.add(new Rectangle(275,575,50,100));
		ground.add(new Rectangle(475,575,50,100));

		//
		ladder.add(new Rectangle(75,50,50,300));
		ladder.add(new Rectangle(725,25,50,325));
		ladder.add(new Rectangle(675,25,50,75));
		ladder.add(new Rectangle(625,25,50,75));
		ladder.add(new Rectangle(575,25,50,75));
		ladder.add(new Rectangle(525,25,50,550));
		ladder.add(new Rectangle(725,375,50,200));
		//
		//shrubbage
		shrubs.add(new Rectangle(0,100,75,25));
		shrubs.add(new Rectangle(125,100,100,25));
		shrubs.add(new Rectangle(25,250,50,25));
		shrubs.add(new Rectangle(125,250,75,25));
		shrubs.add(new Rectangle(0,550,275,25));
		shrubs.add(new Rectangle(575,75,150,25));
		shrubs.add(new Rectangle(575,175,125,25));
		shrubs.add(new Rectangle(575,275,125,25));
		shrubs.add(new Rectangle(575,400,125,25));
		shrubs.add(new Rectangle(525,550,250,25));
		shrubs.add(new Rectangle(775,450,25,25));
		shrubs.add(new Rectangle(725,325,75,25));



	}
	public static Coin coin10_1 = new Coin(150,500,false);
	public static Coin coin10_2 = new Coin(325,50,false);
	public static Coin coin10_3 = new Coin(25,400,false);
	
	public static Bat bat10_1 = new Bat(true,575,152,0,320,false,new Rectangle(575,152,50,25));
	public static Bat bat10_2 = new Bat(true,475,152,0,320,false,new Rectangle(475,152,50,25));
	public static Bat bat10_3 = new Bat(true,375,152,0,320,false,new Rectangle(375,152,50,25));
	public static Bat bat10_4 = new Bat(true,275,152,0,320,false,new Rectangle(275,152,50,25));
	public static Bat bat10_5 = new Bat(true,175,152,0,320,false,new Rectangle(175,152,50,25));
	
	public static void drawLevel10(){
		
		Enemy.enemies.add(bat10_1);Enemy.enemies.add(bat10_2);Enemy.enemies.add(bat10_3);Enemy.enemies.add(bat10_4);Enemy.enemies.add(bat10_5);
		
		Coin.coins.add(coin10_1);Coin.coins.add(coin10_2);Coin.coins.add(coin10_3);
		ground.add(new Rectangle(625,475,100,100));
		ground.add(new Rectangle(575,525,100,50));

		
		ground.add(new Rectangle(700,400,25,200));
		ground.add(new Rectangle(775,0,75,650));
		ground.add(new Rectangle(700,0,25,175));
		ladder.add(new Rectangle(725,0,50,600));
		ground.add(new Rectangle(275,575,425,25));
		ground.add(new Rectangle(675,400,25,75));

		ground.add(new Rectangle(0,575,225,25));
		ground.add(new Rectangle(575,575,150,100));
		//
		ground.add(new Rectangle(575,350,50,25));
		ground.add(new Rectangle(475,350,50,25));
		ground.add(new Rectangle(375,350,50,25));
		ground.add(new Rectangle(275,350,50,25));
		ground.add(new Rectangle(175,350,50,25));
		ground.add(new Rectangle(75,350,50,25));
		ground.add(new Rectangle(-25,350,50,25));
		ground.add(new Rectangle(0,475,100,200));
		//
		thorns.add(new Rectangle(525,350,50,25));
		thorns.add(new Rectangle(425,350,50,25));
		thorns.add(new Rectangle(325,350,50,25));
		thorns.add(new Rectangle(225,350,50,25));
		thorns.add(new Rectangle(125,350,50,25));
		thorns.add(new Rectangle(25,350,50,25));

		//
		ground.add(new Rectangle(0,0,25,175));
		ground.add(new Rectangle(25,125,600,25));
		ground.add(new Rectangle(0,0,100,25));
		ground.add(new Rectangle(25,25,75,75));
		ground.add(new Rectangle(25,100,75,75));
		ground.add(new Rectangle(75,150,75,25));
		//
		shrubs.add(new Rectangle(100,100,525,25));
		shrubs.add(new Rectangle(0,325,25,25));
		shrubs.add(new Rectangle(75,325,50,25));
		shrubs.add(new Rectangle(175,325,50,25));
		shrubs.add(new Rectangle(275,325,50,25));
		shrubs.add(new Rectangle(375,325,50,25));
		shrubs.add(new Rectangle(475,325,50,25));
		shrubs.add(new Rectangle(575,325,50,25));
		shrubs.add(new Rectangle(675,375,50,25));
		shrubs.add(new Rectangle(625,450,50,25));
		shrubs.add(new Rectangle(575,500,50,25));
		shrubs.add(new Rectangle(275,550,300,25));
		shrubs.add(new Rectangle(100,550,125,25));
		shrubs.add(new Rectangle(0,450,100,25));

		

		
	}
	public static Bat bat11_1 = new Bat(true,25,100,0,516,false,new Rectangle(25,100,50,25));
	public static Bat bat11_2 = new Bat(true,75,52,0,400,false,new Rectangle(75,52,50,25));
	public static Bat bat11_3 = new Bat(true,412,300,0,448,false,new Rectangle(412,300,50,25));
	public static Tiger tiger11_1 = new Tiger(true,400,95,600,0,false,new Rectangle(400,95,80,30));
	public static Tiger tiger11_2 = new Tiger(true,250,220,625,0,false,new Rectangle(250,220,80,30));
	public static Coin coin11_1 = new Coin(422,375,false);
	public static void drawLevel11(){
		Enemy.enemies.add(bat11_1);Enemy.enemies.add(bat11_2);Enemy.enemies.add(bat11_3);
		Enemy.enemies.add(tiger11_1);Enemy.enemies.add(tiger11_2);
		Coin.coins.add(coin11_1);
		ground.add(new Rectangle(550,475,25,25));
		ground.add(new Rectangle(400,475,75,25));
		ground.add(new Rectangle(300,475,25,25));
		//

		ground.add(new Rectangle(0,0,100,50));
		ground.add(new Rectangle(100,0,25,25));
		ground.add(new Rectangle(0,50,75,25));
		ground.add(new Rectangle(0,75,25,525));
		ground.add(new Rectangle(25,300,100,25));
		ground.add(new Rectangle(75,175,100,25));
		ground.add(new Rectangle(125,150,50,25));
		ground.add(new Rectangle(75,425,100,25));
		ground.add(new Rectangle(125,450,50,25));
		ground.add(new Rectangle(175,0,25,450));
		ground.add(new Rectangle(200,0,50,350));
		ground.add(new Rectangle(250,250,25,100));
		ground.add(new Rectangle(275,250,25,75));
		ground.add(new Rectangle(300,250,400,50));
		ground.add(new Rectangle(575,300,125,25));
		ground.add(new Rectangle(625,325,75,25));
		ground.add(new Rectangle(650,350,50,100));
		ground.add(new Rectangle(750,125,50,475));
		ground.add(new Rectangle(300,125,500,50));
		ground.add(new Rectangle(225,0,575,50));
		ground.add(new Rectangle(0,550,800,75));
		ground.add(new Rectangle(100,25,25,25));
		ground.add(new Rectangle(200,350,25,50));
		//
		ladder.add(new Rectangle(25,75,50,25));
		ladder.add(new Rectangle(25,325,50,225));
		ladder.add(new Rectangle(75,325,50,100));
		ladder.add(new Rectangle(125,200,50,225));
		ladder.add(new Rectangle(75,200,50,100));
		ladder.add(new Rectangle(25,100,50,100));
		ladder.add(new Rectangle(75,50,50,100));
		ladder.add(new Rectangle(25,200,50,100));
		ladder.add(new Rectangle(75,150,50,25));
		ladder.add(new Rectangle(125,0,50,150));
		//
		thorns.add(new Rectangle(325,525,225,25));
		//
		shrubs.add(new Rectangle(550,450,25,25));
		shrubs.add(new Rectangle(300,450,25,25));
		shrubs.add(new Rectangle(400,450,75,25));
		shrubs.add(new Rectangle(25,525,300,25));
		shrubs.add(new Rectangle(550,525,200,25));
		shrubs.add(new Rectangle(250,225,450,25));
		shrubs.add(new Rectangle(300,100,500,25));
		shrubs.add(new Rectangle(25,275,100,25));
		shrubs.add(new Rectangle(75,400,100,25));
		shrubs.add(new Rectangle(125,125,50,25));
		shrubs.add(new Rectangle(75,150,50,25));
		shrubs.add(new Rectangle(325,525,225,25));
		///////////
		////
		

	}
	public static Bee bee12_1 = new Bee(true,600,50,0,2,false,new Rectangle(600,50,25,25));
	public static Pillar pillar12_1 = new Pillar(true,550,175,false,new Rectangle(550,175,25,75));
	public static Pillar pillar12_2 = new Pillar(true,650,175,false,new Rectangle(650,175,25,75));
	public static Pillar pillar12_3 = new Pillar(true,450,175,false,new Rectangle(450,175,25,75));
	public static Pillar pillar12_4 = new Pillar(true,350,175,false,new Rectangle(350,175,25,75));
	public static Bat bat12_1 = new Bat(true,255,180,0,500,false,new Rectangle(255,276,50,25));
	public static Bat bat12_2 = new Bat(true,145,180,0,500,false,new Rectangle(145,276,50,25));
	public static Tiger tiger12_1 = new Tiger(true,52,495,160,0,false,new Rectangle(52,495,80,30));
	public static Coin coin12_1 = new Coin(698,52,false);
	public static Coin coin12_4 = new Coin(598,52,false);
	public static Coin coin12_2 = new Coin(498,52,false);
	public static Coin coin12_3 = new Coin(75,325,false);
	public static void drawLevel12(){
		//Coin.coins.add(coin12_1);
		//Coin.coins.add(coin12_2);
		Coin.coins.add(coin12_3);
		Coin.coins.add(coin12_4);
		ground.add(new Rectangle(250,525,550,75));
		ground.add(new Rectangle(0,525,175,75));
		ground.add(new Rectangle(0,125,50,450));
		ground.add(new Rectangle(250,0,500,25));
		ground.add(new Rectangle(0,0,150,25));
		ground.add(new Rectangle(150,0,25,25));
		ground.add(new Rectangle(750,0,50,300));
		ground.add(new Rectangle(750,275,50,50));
		ground.add(new Rectangle(50,400,75,25));
		ground.add(new Rectangle(100,425,25,25));
		ground.add(new Rectangle(50,425,50,25));
		ground.add(new Rectangle(50,450,25,25));
		ground.add(new Rectangle(250,125,500,50));
		ground.add(new Rectangle(175,0,25,25));
		ground.add(new Rectangle(175,525,25,75));
		ladder.add(new Rectangle(200,0,50,600));
		ground.add(new Rectangle(50,125,150,50));
		ground.add(new Rectangle(750,0,50,25));
		ground.add(new Rectangle(600,175,25,200));
		ground.add(new Rectangle(500,175,25,100));
		ground.add(new Rectangle(725,175,25,50));
		ground.add(new Rectangle(700,175,25,125));
		ground.add(new Rectangle(400,175,25,225));
		ground.add(new Rectangle(0,575,200,100));
		ground.add(new Rectangle(250,575,550,100));
	
	
		//
			shrubs.add(new Rectangle(50,375,75,25));
		shrubs.add(new Rectangle(250,100,500,25));
		shrubs.add(new Rectangle(50,500,150,25));
		shrubs.add(new Rectangle(250,500,550,25));
		shrubs.add(new Rectangle(0,100,200,25));
		//Enemy.enemies.add(bee12_1);
		Enemy.enemies.add(pillar12_1);
		Enemy.enemies.add(pillar12_2);Enemy.enemies.add(pillar12_3);Enemy.enemies.add(pillar12_4);	
		Enemy.enemies.add(bat12_1);Enemy.enemies.add(bat12_2);
	}
	public static Coin coin13_1 = new Coin(348,450,false);
	public static Coin coin13_2 = new Coin(473,450,false);
	public static Coin coin13_3 = new Coin(348,5,false);
	public static Bat bat13_1 = new Bat(true,225,276,0,504,false,new Rectangle(225,276,50,25));
	public static Tiger tiger13_1 = new Tiger(true,226,195,560,0,false,new Rectangle(226,195,80,30));
	public static Pillar pillar13_1 = new Pillar(true,125,125,false,new Rectangle(125,125,25,75));
	public static void drawLevel13(){
		//Enemy.enemies.add(bat13_1);
		Enemy.enemies.add(tiger13_1);
		Enemy.enemies.add(pillar13_1);
		shrubs.add(new Rectangle(325,75,75,25));
		ground.add(new Rectangle(325,100,75,25));
		ground.add(new Rectangle(0,600,800,25));
		ground.add(new Rectangle(0-25,250,25,50));
		ground.add(new Rectangle(200,550,450,25));
		ground.add(new Rectangle(0,0,325,50));
		ground.add(new Rectangle(0,50,275,25));
		ground.add(new Rectangle(0,75,225,50));
		ground.add(new Rectangle(175,125,50,25));
		ground.add(new Rectangle(200,150,25,25));
		ground.add(new Rectangle(0,125,125,50));
		ground.add(new Rectangle(0,175,100,50));
		ground.add(new Rectangle(0,225,75,25));
		ground.add(new Rectangle(0,250,25,75));
		ground.add(new Rectangle(0,525,200,75));
		ground.add(new Rectangle(200,575,600,25));
		ground.add(new Rectangle(650,525,150,50));
		ground.add(new Rectangle(400,0,400,25));
		ground.add(new Rectangle(500,25,300,25));
		ground.add(new Rectangle(550,50,250,25));
		ground.add(new Rectangle(625,75,175,25));
		ground.add(new Rectangle(650,100,150,50));
		ground.add(new Rectangle(700,150,100,25));
		ground.add(new Rectangle(725,175,75,50));
		ground.add(new Rectangle(750,225,50,50));
		ground.add(new Rectangle(775,275,25,25));
		ground.add(new Rectangle(200,225,450,50));
		ladder.add(new Rectangle(650,150,50,375));
		thorns.add(new Rectangle(200,525,450,25));
		ladder.add(new Rectangle(525,275,50,250));
		ladder.add(new Rectangle(400,275,50,250));
		ladder.add(new Rectangle(275,275,50,250));
		
		shrubs.add(new Rectangle(200,200,450,25));
		shrubs.add(new Rectangle(650,500,150,25));
		shrubs.add(new Rectangle(0,500,200,25));
		shrubs.add(new Rectangle(200,525,450,25));
		Coin.coins.add(coin13_1);
		Coin.coins.add(coin13_2);
		Coin.coins.add(coin13_3);



	}
	public static Pillar pillar14_1 = new Pillar(true,375,150,false,new Rectangle(375,150,25,75));
	public static Pillar pillar14_2 = new Pillar(true,125,150,false,new Rectangle(125,150,25,75));
	public static Pillar pillar14_3 = new Pillar(true,150,150,false,new Rectangle(150,150,25,75));
	public static Pillar pillar14_4 = new Pillar(true,175,150,false,new Rectangle(175,150,25,75));
	public static Pillar pillar14_5 = new Pillar(true,200,150,false,new Rectangle(200,150,25,75));
	public static Pillar pillar14_6 = new Pillar(true,225,150,false,new Rectangle(225,150,25,75));
	public static Bat bat14_1 = new Bat(true,275,226,0,490,false,new Rectangle(275,226,50,25));
	public static Bat bat14_2 = new Bat(true,500,48,0,472,false,new Rectangle(500,48,50,25));
	public static Coin coin14_1 = new Coin(175,350,false);
	public static Coin coin14_2 = new Coin(375,350,false);
	public static void drawLevel14(){
		Enemy.enemies.add(pillar14_1);Enemy.enemies.add(pillar14_2);Enemy.enemies.add(pillar14_3);Enemy.enemies.add(pillar14_4);
		Enemy.enemies.add(pillar14_5);Enemy.enemies.add(pillar14_6);
		Coin.coins.add(coin14_1);Coin.coins.add(coin14_2);
		Enemy.enemies.add(bat14_1);Enemy.enemies.add(bat14_2);
		ground.add(new Rectangle(275,200,25,25));
		ground.add(new Rectangle(0,600,800,25));
		ground.add(new Rectangle(-25,225,25,25));
		ground.add(new Rectangle(325,125,150,25));
		ground.add(new Rectangle(475,0,325,50));
		ground.add(new Rectangle(0,525,750,75)); 
		ground.add(new Rectangle(600,50,75,75));
		ground.add(new Rectangle(625,125,50,50));
		ground.add(new Rectangle(650,175,25,50));
		ground.add(new Rectangle(550,50,50,25));
		ground.add(new Rectangle(0,0,325,75));
		ground.add(new Rectangle(0,50,150,75));
		ground.add(new Rectangle(150,75,100,50));
		ground.add(new Rectangle(250,75,50,50));
		ground.add(new Rectangle(0,75,50,75));
		ground.add(new Rectangle(300,75,25,25));
		ground.add(new Rectangle(650,450,50,25));
		ground.add(new Rectangle(600,475,75,50));
		ground.add(new Rectangle(550,500,50,25));
		ground.add(new Rectangle(50,125,150,25));
		ground.add(new Rectangle(0,125,125,75));
		ground.add(new Rectangle(0,175,75,50));
		ground.add(new Rectangle(0,225,25,50));
		ground.add(new Rectangle(250,100,50,75));
		ground.add(new Rectangle(275,150,25,50));
		ground.add(new Rectangle(200,125,50,25));
		ground.add(new Rectangle(325,100,25,0));
		ground.add(new Rectangle(325,150,50,25));
		ground.add(new Rectangle(300,175,50,25));
		ground.add(new Rectangle(475,150,25,50));
		ground.add(new Rectangle(300,200,25,25));
		ground.add(new Rectangle(675,425,125,175));
		ground.add(new Rectangle(675,25,125,250));
		ground.add(new Rectangle(675,275,125,25));
		ground.add(new Rectangle(700,275,100,50));
		ground.add(new Rectangle(750,325,50,25));
		ground.add(new Rectangle(300,100,25,75));
		ground.add(new Rectangle(400,150,75,25));
		ground.add(new Rectangle(425,150,50,50));
		ground.add(new Rectangle(450,175,25,50));
		ground.add(new Rectangle(625,450,25,25));
		ground.add(new Rectangle(575,475,25,25));
		ground.add(new Rectangle(525,500,25,25));
		//
		shrubs.add(new Rectangle(0,500,525,25));
		shrubs.add(new Rectangle(525,475,50,25));
		shrubs.add(new Rectangle(575,450,50,25));
		shrubs.add(new Rectangle(625,425,50,25));
		shrubs.add(new Rectangle(675,400,125,25));
		shrubs.add(new Rectangle(325,100,150,25));
		shrubs.add(new Rectangle(475,125,25,25));


	}
	public static Coin coin15_1 = new Coin(235,10,false);
	public static Coin coin15_2 = new Coin(610,480,false);
	public static Tiger tiger15_1 = new Tiger(true,300,520,600,0,false,new Rectangle(300,520,80,30));
	public static void drawLevel15(){
		Enemy.enemies.add(tiger15_1);
		Coin.coins.add(coin15_1);
		Coin.coins.add(coin15_2);
		ground.add(new Rectangle(800,0,25,600));
		ground.add(new Rectangle(-25,300,25,25));
		ground.add(new Rectangle(175,600,550,25));
		ground.add(new Rectangle(775,600,25,25));
		ground.add(new Rectangle(25,600,25,25));
		ground.add(new Rectangle(0,0,75,275));
		ground.add(new Rectangle(0,250,50,50));
		ground.add(new Rectangle(0,275,25,75));
		ground.add(new Rectangle(75,0,150,25));
		ground.add(new Rectangle(225,50,50,25));
		ground.add(new Rectangle(275,0,450,25));
		ground.add(new Rectangle(625,25,100,25));
		ground.add(new Rectangle(650,50,75,25));
		ground.add(new Rectangle(675,75,50,50));
		ground.add(new Rectangle(700,125,25,475));
		ground.add(new Rectangle(175,550,525,50));
		ground.add(new Rectangle(100,575,75,25));
		ground.add(new Rectangle(0,425,525,50));
		ground.add(new Rectangle(0,475,75,25));
		ground.add(new Rectangle(0,500,50,100));
		ground.add(new Rectangle(125,225,50,250));
		ground.add(new Rectangle(150,175,25,100));
		ground.add(new Rectangle(625,225,25,150));
		ground.add(new Rectangle(625,375,25,25));
		ground.add(new Rectangle(575,425,25,25));
		ground.add(new Rectangle(525,425,50,50));
		ground.add(new Rectangle(225,50,50,50));
		ground.add(new Rectangle(150,25,25,25));
		ground.add(new Rectangle(325,25,25,50));
		ground.add(new Rectangle(450,25,25,25));
		ground.add(new Rectangle(550,25,25,50));
		ground.add(new Rectangle(525,25,25,25));
		ground.add(new Rectangle(350,25,25,25));
		ladder.add(new Rectangle(725,0,50,600));
		ladder.add(new Rectangle(75,25,50,400));
		thorns.add(new Rectangle(175,200,25,100));
		thorns.add(new Rectangle(200,225,25,100));
		thorns.add(new Rectangle(225,250,25,75));
		thorns.add(new Rectangle(250,275,25,50));
		thorns.add(new Rectangle(275,275,25,50));
		thorns.add(new Rectangle(300,225,25,100));
		thorns.add(new Rectangle(325,250,25,75));
		thorns.add(new Rectangle(350,250,25,75));
		thorns.add(new Rectangle(375,275,25,50));
		thorns.add(new Rectangle(400,300,25,25));
		thorns.add(new Rectangle(425,250,25,75));
		thorns.add(new Rectangle(450,250,25,75));
		thorns.add(new Rectangle(475,275,25,50));
		thorns.add(new Rectangle(500,300,25,25));
		thorns.add(new Rectangle(525,300,25,25));
		thorns.add(new Rectangle(550,275,25,50));
		thorns.add(new Rectangle(575,250,25,75));
		thorns.add(new Rectangle(600,225,25,100));
		thorns.add(new Rectangle(525,250,25,50));
		thorns.add(new Rectangle(175,300,25,25));
		thorns.add(new Rectangle(275,250,25,25));
		thorns.add(new Rectangle(500,275,25,25));

		for(int i = 1;i< 6; i++)
			ladder.add(new Rectangle(75+(i*100),100,50,100));
		for(int i = 1;i< 6; i++)
			ground.add(new Rectangle(75+(i*100),25,50,75));
		ground.add(new Rectangle(175,325,450,100));
		ground.add(new Rectangle(775,0,25,600));

		shrubs.add(new Rectangle(175,525,525,25));
		shrubs.add(new Rectangle(100,550,75,25));
		shrubs.add(new Rectangle(0,400,125,25));
		shrubs.add(new Rectangle(125,200,25,25));
		shrubs.add(new Rectangle(150,150,25,25));
		shrubs.add(new Rectangle(625,200,25,25));
		shrubs.add(new Rectangle(225,25,50,25));
		shrubs.add(new Rectangle(175,300,450,25));

		ladder.add(new Rectangle(50,500,50,100));
		ground.add(new Rectangle(75,475,25,25));


	}
	public static Tiger tiger16_1 = new Tiger(true,225,320,500,0,false,new Rectangle(225,320,80,30));
	public static Tiger tiger16_2 = new Tiger(true,275,545,600,0,false,new Rectangle(275,545,80,30));
	public static Bat bat16_1 = new Bat(true,250,50,0,122,false,new Rectangle(250,50,50,25));
	public static Bat bat16_2 = new Bat(true,450,50,0,122,false,new Rectangle(450,50,50,25));
	public static Coin coin16_1 = new Coin(134,383,false);
	public static void drawLevel16(){
		Enemy.enemies.add(tiger16_1);Enemy.enemies.add(tiger16_2);
		Enemy.enemies.add(bat16_1);Enemy.enemies.add(bat16_2);
		Coin.coins.add(coin16_1);
		ladder.add(new Rectangle(25,25,50,575));
		ground.add(new Rectangle(0,0,25,600));
		ground.add(new Rectangle(0,0,800,25));
		ground.add(new Rectangle(75,150,25,550));
		ground.add(new Rectangle(750,200,50,500));
		ground.add(new Rectangle(75,575,725,25));
		ground.add(new Rectangle(725,200,25,25));
		ground.add(new Rectangle(150,25,450,25));
		ground.add(new Rectangle(725,225,25,25));
		//
		ground.add(new Rectangle(75,150,575,50));
		//
		ground.add(new Rectangle(700,200,25,25));
		ground.add(new Rectangle(675,275,25,25));
		ground.add(new Rectangle(650,350,25,25));
		ground.add(new Rectangle(625,425,25,25));
		ground.add(new Rectangle(600,500,25,25));
		//
		ground.add(new Rectangle(300,350,250,100));
		ground.add(new Rectangle(100,300,100,50));
		ground.add(new Rectangle(175,550,50,25));
		
		ground.add(new Rectangle(550,350,50,25));
		ground.add(new Rectangle(550,375,25,25));
		ground.add(new Rectangle(225,350,50,50));
		ground.add(new Rectangle(250,375,25,25));
		ground.add(new Rectangle(100,450,75,25));
		ground.add(new Rectangle(275,350,25,150));
		ground.add(new Rectangle(175,575,50,100));
		ground.add(new Rectangle(175,450,25,25));
		ground.add(new Rectangle(300,450,75,25));
		ground.add(new Rectangle(425,450,25,50));
		ground.add(new Rectangle(450,450,50,25));
		//
		ground.add(new Rectangle(100,200,25,75));
		ground.add(new Rectangle(125,200,25,50));
		ground.add(new Rectangle(150,200,25,75));
		ground.add(new Rectangle(175,200,25,50));

		//
		shrubs.add(new Rectangle(75,125,575,25));
		shrubs.add(new Rectangle(700,175,100,25));
		shrubs.add(new Rectangle(675,250,25,25));
		shrubs.add(new Rectangle(650,325,25,25));
		shrubs.add(new Rectangle(625,400,25,25));
		shrubs.add(new Rectangle(600,475,25,25));
		shrubs.add(new Rectangle(100,425,100,25));
		shrubs.add(new Rectangle(100,550,75,25));
		shrubs.add(new Rectangle(175,525,50,25));
		shrubs.add(new Rectangle(225,550,525,25));
		shrubs.add(new Rectangle(100,275,100,25));
		shrubs.add(new Rectangle(225,325,375,25));

	}
	public static Coin coin17_1 = new Coin(211,375,false);
	public static Coin coin17_2 = new Coin(448,375,false);
	public static Coin coin17_3 = new Coin(648,375,false);
	public static Bat bat17_1 = new Bat(true,638,26,0,566,false,new Rectangle(638,26,50,25));
	public static Bat bat17_2 = new Bat(true,438,26,0,566,false,new Rectangle(438,26,50,25));
	public static Bee bee17_1 = new Bee(true,450,300,0,2,false,new Rectangle(450,400,25,25));
	public static void drawLevel17(){
		Coin.coins.add(coin17_1);Coin.coins.add(coin17_2);Coin.coins.add(coin17_3);
		Enemy.enemies.add(bat17_1);Enemy.enemies.add(bat17_2);Enemy.enemies.add(bee17_1);
		ladder.add(new Rectangle(200,0,50,150));
		ground.add(new Rectangle(0,0,200,25));
		ground.add(new Rectangle(250,0,550,25));
		ground.add(new Rectangle(700,200,100,500));
		ground.add(new Rectangle(500,200,125,500));
		ground.add(new Rectangle(300,200,125,500));
		ground.add(new Rectangle(0,200,150,500));
		shrubs.add(new Rectangle(0,175,150,25));
		shrubs.add(new Rectangle(300,175,125,25));
		shrubs.add(new Rectangle(500,175,125,25));
		shrubs.add(new Rectangle(700,175,100,25));
	}
	public static Bat bat18_1 = new Bat(true,100,26,0,486,false,new Rectangle(100,26,50,25));
	public static Bat bat18_2 = new Bat(true,200,298,0,486,false,new Rectangle(200,298,50,25));
	public static Bat bat18_3 = new Bat(true,300,82,0,486,false,new Rectangle(300,82,50,25));
	public static Bat bat18_4 = new Bat(true,400,26,0,542,false,new Rectangle(400,26,50,25));
	public static Bat bat18_5 = new Bat(true,500,202,0,402,false,new Rectangle(500,202,50,25));
	public static Bat bat18_6 = new Bat(true,600,102,0,542,false,new Rectangle(600,102,50,25));
	public static Bat bat18_7 = new Bat(true,700,26,0,402,false,new Rectangle(700,26,50,25));
	public static void drawLevel18(){
		Enemy.enemies.add(bat18_1);	Enemy.enemies.add(bat18_2);Enemy.enemies.add(bat18_3);Enemy.enemies.add(bat18_4);
		Enemy.enemies.add(bat18_5);Enemy.enemies.add(bat18_6);Enemy.enemies.add(bat18_7);
		ground.add(new Rectangle(0,0,800,25));
		ground.add(new Rectangle(0,200,25,400));
		ground.add(new Rectangle(0,575,800,25));
		ground.add(new Rectangle(25,200,25,450));
		ladder.add(new Rectangle(50,25,50,550));
		ladder.add(new Rectangle(100,25,50,550));
		ladder.add(new Rectangle(150,25,50,550));
		ladder.add(new Rectangle(200,25,50,550));
		ladder.add(new Rectangle(250,25,50,550));
		ladder.add(new Rectangle(300,25,50,550));
		ladder.add(new Rectangle(350,25,50,550));
		ladder.add(new Rectangle(400,25,50,550));
		ladder.add(new Rectangle(450,25,50,550));
		ladder.add(new Rectangle(500,25,50,550));
		ladder.add(new Rectangle(550,25,50,550));
		ladder.add(new Rectangle(600,25,50,550));
		ladder.add(new Rectangle(650,25,50,550));
		ladder.add(new Rectangle(700,25,50,550));
		ground.add(new Rectangle(750,25,50,425));
		ground.add(new Rectangle(775,425,25,75));
		ground.add(new Rectangle(750,450,50,25));

		//
		shrubs.add(new Rectangle(50,550,775,25));
		shrubs.add(new Rectangle(0,175,50,25));

		

	}
	public static Coin coin19_1 = new Coin(260,500,false);
	public static Coin coin19_2 = new Coin(460,500,false);
	
	public static Bat bat19_1 = new Bat(true,100,26,0,546,false,new Rectangle(100,26,50,25));
	public static Bat bat19_2 = new Bat(true,300,26,0,546,false,new Rectangle(300,26,50,25));
	public static Bat bat19_3 = new Bat(true,500,26,0,546,false,new Rectangle(500,26,50,25));
	public static Bat bat19_4 = new Bat(true,700,26,0,442,false,new Rectangle(700,26,50,25));
	public static void drawLevel19(){
		Enemy.enemies.add(bat19_1);Enemy.enemies.add(bat19_2);Enemy.enemies.add(bat19_3);Enemy.enemies.add(bat19_4);
		Coin.coins.add(coin19_1);Coin.coins.add(coin19_2);
		ground.add(new Rectangle(0,575,800,25));
		ground.add(new Rectangle(0,0,50,450));
		ground.add(new Rectangle(50,125,25,25));
		ground.add(new Rectangle(50,275,25,25));
		ground.add(new Rectangle(50,425,25,25));
		ground.add(new Rectangle(75,425,25,25));
		ground.add(new Rectangle(75,275,25,25));
		ground.add(new Rectangle(75,125,25,25));
		ground.add(new Rectangle(25,0,775,25));
		ground.add(new Rectangle(200,125,50,450));
		ground.add(new Rectangle(150,350,50,25));
		ground.add(new Rectangle(150,500,50,25));
		ground.add(new Rectangle(150,200,50,25));
		ground.add(new Rectangle(250,125,50,25));
		ground.add(new Rectangle(225,275,75,25));
		ground.add(new Rectangle(225,425,75,25));
		ground.add(new Rectangle(350,200,50,25));
		ground.add(new Rectangle(350,350,50,25));
		ground.add(new Rectangle(400,125,50,450));
		ground.add(new Rectangle(350,500,50,25));
		ground.add(new Rectangle(425,125,75,25));
		ground.add(new Rectangle(450,275,50,25));
		ground.add(new Rectangle(425,425,75,25));
		ground.add(new Rectangle(550,200,50,25));
		ground.add(new Rectangle(550,350,50,25));
		ground.add(new Rectangle(550,500,50,25));
		ground.add(new Rectangle(600,125,50,475));
		ground.add(new Rectangle(775,200,25,25));
		ground.add(new Rectangle(750,200,50,25));
		ground.add(new Rectangle(650,275,50,25));
		ground.add(new Rectangle(650,425,50,25));
		ground.add(new Rectangle(650,125,50,25));
		ground.add(new Rectangle(750,350,50,25));
		ground.add(new Rectangle(750,500,50,25));
		ground.add(new Rectangle(175,575,500,100));
		ground.add(new Rectangle(0,450,50,50));
		ground.add(new Rectangle(650,500,150,150));
		ground.add(new Rectangle(650,450,50,25));
		
		ladder.add(new Rectangle(100,25,50,550));
		ladder.add(new Rectangle(300,25,50,550));
		ladder.add(new Rectangle(500,25,50,550));
		ladder.add(new Rectangle(700,25,50,450));

		shrubs.add(new Rectangle(150,475,50,25));
		shrubs.add(new Rectangle(50,400,50,25));
		shrubs.add(new Rectangle(150,325,50,25));
		shrubs.add(new Rectangle(50,250,50,25));
		shrubs.add(new Rectangle(150,175,50,25));
		shrubs.add(new Rectangle(200,100,100,25));
		shrubs.add(new Rectangle(400,100,100,25));
		shrubs.add(new Rectangle(600,100,100,25));
		shrubs.add(new Rectangle(750,175,50,25));
		shrubs.add(new Rectangle(650,250,50,25));
		shrubs.add(new Rectangle(750,325,50,25));
		ground.add(new Rectangle(650,475,150,25));
		shrubs.add(new Rectangle(650,400,50,25)); 
		shrubs.add(new Rectangle(700,450,100,25));
		shrubs.add(new Rectangle(550,475,50,25));
		shrubs.add(new Rectangle(550,325,50,25));
		shrubs.add(new Rectangle(550,175,50,25));
		shrubs.add(new Rectangle(450,250,50,25));
		shrubs.add(new Rectangle(350,175,50,25));
		shrubs.add(new Rectangle(250,250,50,25));
		shrubs.add(new Rectangle(350,325,50,25));
		shrubs.add(new Rectangle(250,400,50,25));
		shrubs.add(new Rectangle(350,475,50,25));
		shrubs.add(new Rectangle(250,550,150,25));
		shrubs.add(new Rectangle(450,400,50,25));
		shrubs.add(new Rectangle(450,550,150,25));
		shrubs.add(new Rectangle(0,550,200,25));
		shrubs.add(new Rectangle(50,100,50,25));

	}
	public static Coin coin20_1 = new Coin(420,500,false);
	public static Coin coin20_2 = new Coin(420,65,false);
	public static Coin coin20_3 = new Coin(650,270,false);
	public static Tiger tiger20_1 = new Tiger(true,175,545,610,0,false,new Rectangle(175,545,80,30));
	public static void drawLevel20(){
		Enemy.enemies.add(tiger20_1);
		Coin.coins.add(coin20_1);Coin.coins.add(coin20_2);Coin.coins.add(coin20_3);
		ladder.add(new Rectangle(50,0,50,200));
		ground.add(new Rectangle(0,0,50,25));
		ground.add(new Rectangle(100,0,600,25));
		ground.add(new Rectangle(700,0,25,650));
		ground.add(new Rectangle(775,0,100,650));
		ground.add(new Rectangle(0,575,725,25));
		ground.add(new Rectangle(775,575,25,25));
		ladder.add(new Rectangle(725,0,50,600));
		ground.add(new Rectangle(100,25,25,200));
		ground.add(new Rectangle(0,200,100,25));
		ground.add(new Rectangle(0,575,175,75));
		//
		ground.add(new Rectangle(0,350,175,25));
		ground.add(new Rectangle(0,475,100,25));
		ground.add(new Rectangle(100,500,25,25));
		ground.add(new Rectangle(125,525,25,25));
		ground.add(new Rectangle(150,550,25,25));
		ground.add(new Rectangle(0,500,100,25));
		ground.add(new Rectangle(0,525,125,50));
		ground.add(new Rectangle(100,550,50,25));
		ground.add(new Rectangle(200,325,25,50));
		ground.add(new Rectangle(250,275,25,100));
		ground.add(new Rectangle(300,225,25,150));
		ground.add(new Rectangle(350,175,25,200));
		ground.add(new Rectangle(400,125,25,250));
		ground.add(new Rectangle(425,125,50,250));
		ground.add(new Rectangle(500,175,25,200));
		ground.add(new Rectangle(550,225,25,150));
		ground.add(new Rectangle(600,275,25,100));
		ground.add(new Rectangle(650,325,25,50));
		//
		
		thorns.add(new Rectangle(175,550,25,25));
		thorns.add(new Rectangle(375,550,25,25));
		thorns.add(new Rectangle(275,550,25,25));
		thorns.add(new Rectangle(475,550,25,25));
		thorns.add(new Rectangle(575,550,25,25));
		thorns.add(new Rectangle(675,550,25,25));
		
		//
		shrubs.add(new Rectangle(0,325,175,25));
		shrubs.add(new Rectangle(200,300,25,25));
		shrubs.add(new Rectangle(250,250,25,25));
		shrubs.add(new Rectangle(300,200,25,25));
		shrubs.add(new Rectangle(350,150,25,25));
		shrubs.add(new Rectangle(400,100,75,25));
		shrubs.add(new Rectangle(500,150,25,25));
		shrubs.add(new Rectangle(550,200,25,25));
		shrubs.add(new Rectangle(600,250,25,25));
		shrubs.add(new Rectangle(650,300,25,25));
		shrubs.add(new Rectangle(100,475,25,25));
		shrubs.add(new Rectangle(125,500,25,25));
		shrubs.add(new Rectangle(150,525,25,25));
		shrubs.add(new Rectangle(0,450,100,25));
		//
		shrubs.add(new Rectangle(200,550,75,25));
		shrubs.add(new Rectangle(300,550,75,25));
		shrubs.add(new Rectangle(400,550,75,25));
		shrubs.add(new Rectangle(500,550,75,25));
		shrubs.add(new Rectangle(600,550,75,25));
		shrubs.add(new Rectangle(0,175,100,25));

		
	}
	public static Coin coin21_1 = new Coin(125,200,false);
	public static Coin coin21_2 = new Coin(475,320,false);
	public static Coin coin21_3 = new Coin(275,325,false);
	public static Tiger tiger21_1 = new Tiger(true,180,370,320,0,false,new Rectangle(180,370,80,30));
	public static Tiger tiger21_2 = new Tiger(true,100,545,350,0,false,new Rectangle(100,545,80,30));
	public static void drawLevel21(){
		Coin.coins.add(coin21_1);Coin.coins.add(coin21_2);Coin.coins.add(coin21_3);
		Enemy.enemies.add(tiger21_1);Enemy.enemies.add(tiger21_2);
		ground.add(new Rectangle(0,575,800,25));
		ground.add(new Rectangle(0,0,25,600));
		ground.add(new Rectangle(700,175,100,75));
		ground.add(new Rectangle(600,150,125,25));
		ground.add(new Rectangle(325,150,75,25));
		ground.add(new Rectangle(475,150,25,25));
		ground.add(new Rectangle(175,150,75,25));
		ground.add(new Rectangle(75,0,725,25));
		ground.add(new Rectangle(75,25,25,425));
		ground.add(new Rectangle(175,400,225,75));
		ground.add(new Rectangle(175,175,550,75));
		ground.add(new Rectangle(450,575,225,75));
		ground.add(new Rectangle(375,250,325,50));
		ground.add(new Rectangle(300,225,75,50));
		//
		ladder.add(new Rectangle(25,0,50,575));
		//
		ground.add(new Rectangle(600,525,75,50));
		ground.add(new Rectangle(525,450,75,125));
		ground.add(new Rectangle(450,375,75,200));
		//
		shrubs.add(new Rectangle(25,550,425,25));
		shrubs.add(new Rectangle(175,375,225,25));
		shrubs.add(new Rectangle(450,350,75,25));
		shrubs.add(new Rectangle(525,425,75,25));
		shrubs.add(new Rectangle(600,500,75,25));
		shrubs.add(new Rectangle(675,550,125,25));
		shrubs.add(new Rectangle(175,125,75,25));
		shrubs.add(new Rectangle(250,150,75,25));
		shrubs.add(new Rectangle(325,125,75,25));
		shrubs.add(new Rectangle(400,150,75,25));
		shrubs.add(new Rectangle(475,125,25,25));
		shrubs.add(new Rectangle(500,150,100,25));
		shrubs.add(new Rectangle(600,125,125,25));
		shrubs.add(new Rectangle(725,150,75,25));


	}
	public static Pillar pillar22_1 = new Pillar(true,400,250,false,new Rectangle(400,250,25,75));
	public static Pillar pillar22_2 = new Pillar(true,500,250,false,new Rectangle(500,250,25,75));
	public static Tiger tiger22_1 = new Tiger(true,100,545,350,0,false,new Rectangle(100,545,80,30));
	public static Bat bat22_1 = new Bat(true,575,300,0,544,false,new Rectangle(575,300,50,25));
	public static void drawLevel22(){
		
		Enemy.enemies.add(pillar22_1);Enemy.enemies.add(pillar22_2);Enemy.enemies.add(tiger22_1);Enemy.enemies.add(bat22_1);
		
		ground.add(new Rectangle(0,575,800,25));
		ground.add(new Rectangle(0,0,150,25));
		ground.add(new Rectangle(300,0,125,25));
		ground.add(new Rectangle(500,0,125,25));
		ground.add(new Rectangle(700,0,100,25));
		ground.add(new Rectangle(500,25,125,225));
		ground.add(new Rectangle(625,200,125,50));
		ground.add(new Rectangle(300,25,125,200));
		ground.add(new Rectangle(0,175,425,75));
		ground.add(new Rectangle(775,200,25,25));
		ground.add(new Rectangle(50,25,100,25));
		ground.add(new Rectangle(75,25,75,50));
		ground.add(new Rectangle(750,200,25,50));

		thorns.add(new Rectangle(700,250,50,150));
		thorns.add(new Rectangle(725,375,75,50));
		thorns.add(new Rectangle(775,400,25,75));
		thorns.add(new Rectangle(750,400,25,50));
		//
		thorns.add(new Rectangle(675,250,25,125));
		thorns.add(new Rectangle(650,250,25,100));
		thorns.add(new Rectangle(625,250,25,75));
		thorns.add(new Rectangle(600,250,25,50));
		thorns.add(new Rectangle(575,250,25,25));
		thorns.add(new Rectangle(750,250,50,125));
		thorns.add(new Rectangle(775,225,25,25));
		//
		thorns.add(new Rectangle(25,250,25,100));
		thorns.add(new Rectangle(50,250,25,175));
		thorns.add(new Rectangle(75,250,25,75));
		thorns.add(new Rectangle(100,250,25,50));
		thorns.add(new Rectangle(125,250,25,150));
		thorns.add(new Rectangle(150,250,25,125));
		thorns.add(new Rectangle(175,250,25,100));
		thorns.add(new Rectangle(200,250,25,75));
		thorns.add(new Rectangle(225,250,25,50));
		thorns.add(new Rectangle(250,250,25,175));
		thorns.add(new Rectangle(275,250,25,75));
		thorns.add(new Rectangle(300,250,25,75));
		thorns.add(new Rectangle(325,250,25,25));
		thorns.add(new Rectangle(350,250,25,25));
		thorns.add(new Rectangle(0,250,25,50));
		thorns.add(new Rectangle(550,250,25,100));
		thorns.add(new Rectangle(525,250,25,50));
		thorns.add(new Rectangle(375,250,25,50));

		//
		shrubs.add(new Rectangle(0,150,300,25));
		shrubs.add(new Rectangle(625,175,175,25));
		shrubs.add(new Rectangle(0,550,800,25));


	}
	
	public static Bee bee23_1 = new Bee(true,350,175,0,2,false,new Rectangle(350,175,25,25));
	public static Bee bee23_2 = new Bee(true,575,125,0,2,false,new Rectangle(575,125,25,25));
	public static Bee bee23_3 = new Bee(true,475,225,0,2,false,new Rectangle(475,225,25,25));
	public static Coin coin17_4 = new Coin(450,425,false);
	public static void drawLevel23(){
		Enemy.enemies.add(bee23_1);	Enemy.enemies.add(bee23_2);	Enemy.enemies.add(bee23_3);
		Coin.coins.add(coin17_4);
		ground.add(new Rectangle(0,575,800,25));
		ground.add(new Rectangle(0,0,800,50));
		
		thorns.add(new Rectangle(0,400,25,75));
		thorns.add(new Rectangle(25,425,25,25));
		thorns.add(new Rectangle(125,50,25,125));
		thorns.add(new Rectangle(150,50,25,75));
		thorns.add(new Rectangle(175,50,25,50));
		thorns.add(new Rectangle(500,50,25,150));
		thorns.add(new Rectangle(450,50,25,125));
		thorns.add(new Rectangle(350,50,50,50));
		thorns.add(new Rectangle(375,75,50,125));
		thorns.add(new Rectangle(725,50,25,200));
		thorns.add(new Rectangle(75,50,25,75));
		thorns.add(new Rectangle(700,50,25,325));
		thorns.add(new Rectangle(200,50,25,25));
		thorns.add(new Rectangle(250,50,25,350));
		thorns.add(new Rectangle(275,50,25,275));
		thorns.add(new Rectangle(250,50,25,175));
		thorns.add(new Rectangle(400,50,25,200));
		thorns.add(new Rectangle(325,50,25,25));
		thorns.add(new Rectangle(475,50,25,75));
		thorns.add(new Rectangle(600,50,25,175));
		thorns.add(new Rectangle(675,50,25,100));
		thorns.add(new Rectangle(100,50,25,50));
		thorns.add(new Rectangle(550,50,25,75));
		thorns.add(new Rectangle(575,50,25,50)); 
		thorns.add(new Rectangle(650,50,25,400));
		thorns.add(new Rectangle(300,50,25,150));
		thorns.add(new Rectangle(225,50,25,200));
		thorns.add(new Rectangle(50,50,25,25));
		thorns.add(new Rectangle(425,50,25,250));
		thorns.add(new Rectangle(525,50,25,25));
		thorns.add(new Rectangle(625,50,25,275));
		thorns.add(new Rectangle(725,50,50,150));
		thorns.add(new Rectangle(775,50,25,100));
		//
		shrubs.add(new Rectangle(0,550,800,25));
		

	}
	public static Pillar pillar24_1 = new Pillar(true,550,225,false,new Rectangle(550,225,25,75));
	public static Bee bee24_1 = new Bee(true,450,275,0,2,false,new Rectangle(450,325,25,25));
	public static Coin coin24_1 = new Coin(550,350,false);
	public static Coin coin24_2 = new Coin(725,50,false);
	public static Coin coin24_3 = new Coin(180,240,false);
	public static void drawLevel24(){
		Coin.coins.add(coin24_1);Coin.coins.add(coin24_2);Coin.coins.add(coin24_3);
		Enemy.enemies.add(pillar24_1);Enemy.enemies.add(bee24_1);
		ground.add(new Rectangle(0,575,800,25));
		ground.add(new Rectangle(0,0,800,25));
		ground.add(new Rectangle(700,100,100,25));
		ground.add(new Rectangle(650,100,50,25));
		ground.add(new Rectangle(650,125,50,50));
		ground.add(new Rectangle(700,125,50,25));
		ground.add(new Rectangle(625,175,75,25));
		ground.add(new Rectangle(700,150,25,25));
		ground.add(new Rectangle(750,125,25,75));
		ground.add(new Rectangle(775,125,25,25));
		//
		ground.add(new Rectangle(100,500,25,25));
		ground.add(new Rectangle(175,450,25,25));
		ground.add(new Rectangle(250,400,25,25));
		ground.add(new Rectangle(325,350,25,25));
		ground.add(new Rectangle(400,300,25,25));
		ground.add(new Rectangle(475,250,25,25));
		ground.add(new Rectangle(550,200,25,25));
		ground.add(new Rectangle(625,150,25,25));
		ground.add(new Rectangle(450,400,100,25));
		ground.add(new Rectangle(575,400,100,25));
		ground.add(new Rectangle(750,150,50,275));
		ground.add(new Rectangle(775,400,25,50));
		ground.add(new Rectangle(725,125,25,175));
		//
		thorns.add(new Rectangle(0,25,25,175));
		thorns.add(new Rectangle(25,25,25,125));
		thorns.add(new Rectangle(100,25,50,125));
		thorns.add(new Rectangle(125,125,25,25));
		thorns.add(new Rectangle(150,25,25,175));
		thorns.add(new Rectangle(125,25,50,100));
		thorns.add(new Rectangle(50,25,50,100));
		thorns.add(new Rectangle(225,25,50,100));
		thorns.add(new Rectangle(200,25,25,75));
		thorns.add(new Rectangle(250,125,25,50));
		thorns.add(new Rectangle(175,25,25,50));
		thorns.add(new Rectangle(50,125,25,175));
		thorns.add(new Rectangle(100,125,25,125));
		thorns.add(new Rectangle(275,25,25,50));
		thorns.add(new Rectangle(300,25,25,25));
		//
		shrubs.add(new Rectangle(0,550,800,25));
		shrubs.add(new Rectangle(450,375,100,25));
		shrubs.add(new Rectangle(575,375,100,25));
		shrubs.add(new Rectangle(100,475,25,25));
		shrubs.add(new Rectangle(175,425,25,25));
		shrubs.add(new Rectangle(250,375,25,25));
		shrubs.add(new Rectangle(325,325,25,25));
		shrubs.add(new Rectangle(400,275,25,25));
		shrubs.add(new Rectangle(475,225,25,25));
		shrubs.add(new Rectangle(550,175,25,25));
		shrubs.add(new Rectangle(625,125,25,25));
		shrubs.add(new Rectangle(650,75,150,25));


	}
	public static void drawLevel25(){
		ground.add(new Rectangle(775,0,75,650));
		ground.add(new Rectangle(0,575,800,25));
		ground.add(new Rectangle(0,100,575,25));
		ground.add(new Rectangle(575,125,200,25));
		ground.add(new Rectangle(0,0,725,25));
		ladder.add(new Rectangle(725,0,50,125));
		//
		ground.add(new Rectangle(475,125,125,50));
		ground.add(new Rectangle(500,150,75,50));
		ground.add(new Rectangle(525,175,25,75));
		ground.add(new Rectangle(75,100,300,50));
		ground.add(new Rectangle(175,125,25,100));
		ground.add(new Rectangle(225,125,75,50));
		ground.add(new Rectangle(275,150,25,100));
		ground.add(new Rectangle(25,100,25,50));
		ground.add(new Rectangle(0,125,25,25));
		ground.add(new Rectangle(25,125,50,75));
		ground.add(new Rectangle(50,175,25,75));
		ground.add(new Rectangle(425,125,25,75));
		ground.add(new Rectangle(725,125,50,125));
		ground.add(new Rectangle(750,225,25,100));
		ground.add(new Rectangle(700,150,25,50));
		ground.add(new Rectangle(375,125,50,25));
		ground.add(new Rectangle(350,150,50,25));
		ground.add(new Rectangle(375,150,25,150));
		ground.add(new Rectangle(400,175,25,75));
		ground.add(new Rectangle(400,125,25,50));
		ground.add(new Rectangle(675,150,25,125));
		ground.add(new Rectangle(650,150,25,25));
		ground.add(new Rectangle(600,150,50,25));
		ground.add(new Rectangle(450,125,75,25));
		ground.add(new Rectangle(0,150,25,300));
		ground.add(new Rectangle(25,175,25,200));
		ground.add(new Rectangle(75,150,25,50));
		ground.add(new Rectangle(100,150,50,100));
		ground.add(new Rectangle(125,225,25,75));
		ground.add(new Rectangle(150,125,25,50));
		//
		AssetLoader.caveEntrance.draw(400,300);
		
		shrubs.add(new Rectangle(0,75,575,25));
		shrubs.add(new Rectangle(575,100,200,25));
		shrubs.add(new Rectangle(0,550,775,25));


	}
	public static void drawLevel26(){
		ground.add(new Rectangle(-50,0,75,625));
		ground.add(new Rectangle(775,0,100,625));
		//
		ground.add(new Rectangle(25,175,25,350));
		ground.add(new Rectangle(50,175,25,225));
		ground.add(new Rectangle(75,250,25,100));
		ground.add(new Rectangle(750,25,25,475));
		ground.add(new Rectangle(725,200,25,200));
		ground.add(new Rectangle(700,300,25,225));
		ground.add(new Rectangle(750,500,25,75));
		ground.add(new Rectangle(725,400,25,75));
		//
		
		shrubs.add(new Rectangle(700,275,25,25));
		shrubs.add(new Rectangle(750,0,25,25));
		shrubs.add(new Rectangle(725,175,25,25));
		shrubs.add(new Rectangle(25,150,50,25));
		shrubs.add(new Rectangle(75,225,25,25));
	}
	public static void drawLevel27(){
		ground.add(new Rectangle(-50,0,75,625));
		ground.add(new Rectangle(775,0,100,625));
		//
		ground.add(new Rectangle(25,275,75,300));
		ground.add(new Rectangle(25,75,25,275));
		ground.add(new Rectangle(50,225,25,100));
		ground.add(new Rectangle(75,300,50,150));
		ground.add(new Rectangle(125,375,25,150));
		ground.add(new Rectangle(675,100,125,100));
		ground.add(new Rectangle(650,125,25,200));
		ground.add(new Rectangle(725,175,75,275));
		ground.add(new Rectangle(700,375,25,175));
		ground.add(new Rectangle(750,400,50,75));
		//
		ground.add(new Rectangle(25,275,75,300));
		ground.add(new Rectangle(25,75,25,275));
		ground.add(new Rectangle(50,225,25,100));
		ground.add(new Rectangle(75,300,50,150));
		ground.add(new Rectangle(125,375,25,150));
		ground.add(new Rectangle(675,100,125,100));
		ground.add(new Rectangle(650,125,25,200));
		ground.add(new Rectangle(725,175,75,275));
		ground.add(new Rectangle(700,375,25,175));
		ground.add(new Rectangle(750,400,50,75));
		ground.add(new Rectangle(700,200,25,75));
		//
		shrubs.add(new Rectangle(125,350,25,25));
		shrubs.add(new Rectangle(100,275,25,25));
		shrubs.add(new Rectangle(75,250,25,25));
		shrubs.add(new Rectangle(50,200,25,25));
		shrubs.add(new Rectangle(25,50,25,25));
		shrubs.add(new Rectangle(675,75,100,25));
		shrubs.add(new Rectangle(650,100,25,25));


	}
	public static void drawLevel28(){
		ground.add(new Rectangle(-50,0,75,625));
		ground.add(new Rectangle(775,0,100,625));
		//
		ground.add(new Rectangle(25,125,175,50));
		ground.add(new Rectangle(150,150,50,200));
		ground.add(new Rectangle(175,325,25,100));
		ground.add(new Rectangle(50,125,25,175));
		ground.add(new Rectangle(75,125,25,75));
		ground.add(new Rectangle(25,125,25,375));
		ground.add(new Rectangle(750,150,25,425));
		ground.add(new Rectangle(725,200,25,225));
		ground.add(new Rectangle(675,125,75,200));
		ground.add(new Rectangle(650,150,25,300));
		ground.add(new Rectangle(125,175,25,300));
		ground.add(new Rectangle(50,400,25,125));
		ground.add(new Rectangle(700,325,25,175));
		ground.add(new Rectangle(625,175,25,325));
		ground.add(new Rectangle(100,325,25,250));
		ground.add(new Rectangle(200,275,25,275));
		ground.add(new Rectangle(600,275,25,275));
		ground.add(new Rectangle(550,225,50,225));
		ground.add(new Rectangle(200,200,25,25));
		ground.add(new Rectangle(225,175,25,275));
		ground.add(new Rectangle(200,200,25,75));
		ground.add(new Rectangle(550,200,50,25));
		ground.add(new Rectangle(525,325,25,200));
		//
		shrubs.add(new Rectangle(550,175,50,25));
		shrubs.add(new Rectangle(525,300,25,25));
		shrubs.add(new Rectangle(600,250,25,25));
		shrubs.add(new Rectangle(225,150,25,25));
		shrubs.add(new Rectangle(200,175,25,25));
		shrubs.add(new Rectangle(100,300,25,25));
		shrubs.add(new Rectangle(25,100,175,25));
		shrubs.add(new Rectangle(650,125,25,25));
		shrubs.add(new Rectangle(625,150,25,25));
		shrubs.add(new Rectangle(675,100,75,25));
		shrubs.add(new Rectangle(750,125,25,25));
		shrubs.add(new Rectangle(50,375,25,25));

		
	}
	public static void drawLevel29(){
		ground.add(new Rectangle(-50,0,75,625));
		ground.add(new Rectangle(775,0,100,625));
		//
		ground.add(new Rectangle(100,175,600,50));
		ground.add(new Rectangle(600,200,75,50));
		ground.add(new Rectangle(175,200,75,50));
		ground.add(new Rectangle(75,175,25,50));
		ground.add(new Rectangle(675,175,50,50));
		ground.add(new Rectangle(0,375,325,50));
		ground.add(new Rectangle(525,375,275,50));
		ground.add(new Rectangle(475,375,75,50));
		ground.add(new Rectangle(25,425,275,50));
		ground.add(new Rectangle(250,450,25,100));
		ground.add(new Rectangle(300,425,25,100));
		ground.add(new Rectangle(125,475,25,75));
		ground.add(new Rectangle(50,475,25,50));
		ground.add(new Rectangle(25,475,25,50));
		ground.add(new Rectangle(500,400,275,50));
		ground.add(new Rectangle(725,425,75,75));
		ground.add(new Rectangle(700,425,25,125));
		ground.add(new Rectangle(475,400,50,75));
		ground.add(new Rectangle(500,400,25,125));
		ground.add(new Rectangle(525,425,25,50));
		ground.add(new Rectangle(550,425,50,125));
		ground.add(new Rectangle(600,400,25,175));
		ground.add(new Rectangle(575,225,50,75));
		ground.add(new Rectangle(550,225,25,50));
		ground.add(new Rectangle(250,225,25,50));
		ground.add(new Rectangle(125,200,50,75));
		ground.add(new Rectangle(100,225,25,25));
		ground.add(new Rectangle(175,450,75,50));
		ground.add(new Rectangle(225,475,25,50));
		ground.add(new Rectangle(75,475,25,25));
		ground.add(new Rectangle(25,500,25,50));
		ground.add(new Rectangle(675,425,25,100));
		ground.add(new Rectangle(650,425,25,50));
		ground.add(new Rectangle(750,500,25,75));
		ground.add(new Rectangle(700,200,25,75));
		ground.add(new Rectangle(450,200,75,50));
		ground.add(new Rectangle(375,225,25,50));
		ground.add(new Rectangle(325,225,50,25));
		ground.add(new Rectangle(300,225,25,50));
		ground.add(new Rectangle(325,375,25,75));
		ground.add(new Rectangle(450,375,25,75));
		//
		shrubs.add(new Rectangle(75,150,650,25));
		shrubs.add(new Rectangle(450,350,325,25));
		shrubs.add(new Rectangle(25,350,325,25));
		
	}
	
	public static Tiger tigerLeft1 = new Tiger(true,-999999999,520,900,0,true,new Rectangle(900,520,80,30));
	public static Tiger tigerRight1 = new Tiger(true,-200,520,999999999,0,false,new Rectangle(-200,520,80,30));
	
	public static Tiger tigerLeft2 = new Tiger(true,-999999999,520,1000,0,true,new Rectangle(1000,520,80,30));
	public static Tiger tigerRight2 = new Tiger(true,-300,520,999999999,0,false,new Rectangle(-300,520,80,30));
	
	public static Tiger tigerLeft3 = new Tiger(true,-999999999,520,1100,0,true,new Rectangle(1100,520,80,30));
	public static Tiger tigerRight3 = new Tiger(true,-400,520,999999999,0,false,new Rectangle(-400,520,80,30));
	
	public static Tiger tigerLeft4 = new Tiger(true,-999999999,520,1200,0,true,new Rectangle(1200,520,80,30));
	public static Tiger tigerRight4 = new Tiger(true,-500,520,999999999,0,false,new Rectangle(-500,520,80,30));
	
	public static Tiger tigerLeft5 = new Tiger(true,-999999999,520,1300,0,true,new Rectangle(1300,520,80,30));
	public static Tiger tigerRight5 = new Tiger(true,-600,520,999999999,0,false,new Rectangle(-600,520,80,30));
	
	public static Tiger tigerLeft6 = new Tiger(true,-999999999,520,1400,0,true,new Rectangle(1400,520,80,30));
	public static Tiger tigerRight6 = new Tiger(true,-700,520,999999999,0,false,new Rectangle(-700,520,80,30));
	
	public static Tiger tigerLeft7 = new Tiger(true,-999999999,520,1500,0,true,new Rectangle(1500,520,80,30));
	public static Tiger tigerRight7 = new Tiger(true,-800,520,999999999,0,false,new Rectangle(-800,520,80,30));
	
	public static Tiger tigerLeft8 = new Tiger(true,-999999999,520,1600,0,true,new Rectangle(1600,520,80,30));
	public static Tiger tigerRight8 = new Tiger(true,-900,520,999999999,0,false,new Rectangle(-900,520,80,30));
	
	public static Tiger tigerLeft9 = new Tiger(true,-999999999,520,1700,0,true,new Rectangle(1700,520,80,30));
	public static Tiger tigerRight9 = new Tiger(true,-1000,520,999999999,0,false,new Rectangle(-1000,520,80,30));
	
	public static Tiger tigerLeft10 = new Tiger(true,-999999999,520,1800,0,true,new Rectangle(1800,520,80,30));
	public static Tiger tigerRight10 = new Tiger(true,-1100,520,999999999,0,false,new Rectangle(-1100,520,80,30));
	
	public static Bee bee30_1 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
	public static Bee bee30_2 = new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));

	public static Bee bee30_3 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
	public static Bee bee30_4 = new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));
	public static Bee bee30_5 = new Bee(true,775,300,0,2,false,new Rectangle(825,300,25,25));
	public static Bee bee30_6 = new Bee(true,0,300,0,2,false,new Rectangle(-50,300,25,25));
	
	public static Bee bee30_7 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
	public static Bee bee30_8 = new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));
	public static Bee bee30_9 = new Bee(true,775,300,0,2,false,new Rectangle(800,300,25,25));
	public static Bee bee30_10 = new Bee(true,0,300,0,2,false,new Rectangle(-25,300,25,25));
	public static Bee bee30_11 = new Bee(true,775,300,0,2,false,new Rectangle(850,-50,25,25));
	public static Bee bee30_12 = new Bee(true,0,300,0,2,false,new Rectangle(-98,-25,25,25));
	
	public static Bee bee30_13 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
	public static Bee bee30_14= new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));
	public static Bee bee30_15= new Bee(true,775,300,0,2,false,new Rectangle(800,-75,25,25));
	public static Bee bee30_16 = new Bee(true,0,300,0,2,false,new Rectangle(-25,-100,25,25));
	public static Bee bee30_17 = new Bee(true,775,300,0,2,false,new Rectangle(877,450,25,25));
	public static Bee bee30_18 = new Bee(true,0,300,0,2,false,new Rectangle(-98,450,25,25));
	public static Bee bee30_19= new Bee(true,775,50,0,2,false,new Rectangle(850,200,25,25));
	public static Bee bee30_20= new Bee(true,0,50,0,2,false,new Rectangle(-75,200,25,25));

	public static Bee bee30_21 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
	public static Bee bee30_22= new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));
	public static Bee bee30_23= new Bee(true,775,300,0,2,false,new Rectangle(800,300,25,25));
	public static Bee bee30_24 = new Bee(true,0,300,0,2,false,new Rectangle(-25,-80,25,25));
	public static Bee bee30_25 = new Bee(true,775,300,0,2,false,new Rectangle(899,450,25,25));
	public static Bee bee30_26 = new Bee(true,0,300,0,2,false,new Rectangle(-105,450,25,25));
	public static Bee bee30_27= new Bee(true,775,50,0,2,false,new Rectangle(850,-10,25,25));
	public static Bee bee30_28= new Bee(true,0,50,0,2,false,new Rectangle(-75,200,25,25));
	public static Bee bee30_29= new Bee(true,775,50,0,2,false,new Rectangle(425,-100,25,25));
	public static Bee bee30_30= new Bee(true,0,50,0,2,false,new Rectangle(-250,-50,25,25));
	
	
	
	
	public static void drawLevel30(){
		ground.add(new Rectangle(775,0,75,425));
		ground.add(new Rectangle(-100,0,125,500));
		ground.add(new Rectangle(0,550,900,150));
		if(!JungleHeart.isBossDead)
			ground.add(new Rectangle(775,425,75,75));
		//
		shrubs.add(new Rectangle(0,525,800,25));
		if(JungleHeart.phase == 2){
			Enemy.enemies.add(tigerRight1);Enemy.enemies.add(tigerLeft1);
			Enemy.enemies.add(tigerRight2);Enemy.enemies.add(tigerLeft2);
			Enemy.enemies.add(tigerRight3);Enemy.enemies.add(tigerLeft3);
			Enemy.enemies.add(tigerRight4);Enemy.enemies.add(tigerLeft4);
			Enemy.enemies.add(tigerRight5);Enemy.enemies.add(tigerLeft5);
			Enemy.enemies.add(tigerRight6);Enemy.enemies.add(tigerLeft6);
			Enemy.enemies.add(tigerRight7);Enemy.enemies.add(tigerLeft7);
			Enemy.enemies.add(tigerRight8);Enemy.enemies.add(tigerLeft8);
			Enemy.enemies.add(tigerRight9);Enemy.enemies.add(tigerLeft9);
			Enemy.enemies.add(tigerRight10);Enemy.enemies.add(tigerLeft10);
		}
		if(JungleHeart.phase ==4){
			for(int i = 0;i<16;i++){
			thorns.add(new Rectangle(i*25,(650+(i*25))-JungleHeart.vineGrow,25,800));
			}
			for(int i = 0;i<16;i++){
				thorns.add(new Rectangle(775 -(i*25),(650+(i*25))-JungleHeart.vineGrow2,25,800));
			}

			if(JungleHeart.createBlocks){
				if(JungleHeart.blockCreatorCounter > 25){
					ground.add(new Rectangle(325,475,25,25));
					ground.add(new Rectangle(450,475,25,25));
					if(JungleHeart.blockCreatorCounter == 26)
							AssetLoader.thornGrow.play(1f,.5f);
				}
				if(JungleHeart.blockCreatorCounter > 50){
					ground.add(new Rectangle(275,425,25,25));
					ground.add(new Rectangle(500,425,25,25));
					if(JungleHeart.blockCreatorCounter == 51)
						AssetLoader.thornGrow.play(1f,.5f);
					}
				if(JungleHeart.blockCreatorCounter > 75){
					ground.add(new Rectangle(225,375,25,25));
					ground.add(new Rectangle(550,375,25,25));
					if(JungleHeart.blockCreatorCounter == 76)
						AssetLoader.thornGrow.play(1f,.5f);
					}
				if(JungleHeart.blockCreatorCounter > 100){
					ground.add(new Rectangle(175,325,25,25));
					ground.add(new Rectangle(600,325,25,25));
					if(JungleHeart.blockCreatorCounter == 101)
						AssetLoader.thornGrow.play(1f,.5f);
				}
			}
		}
		
		if(JungleHeart.spawnBees && JungleHeart.phase == 6){
			
			Enemy.enemies.add(bee30_1);Enemy.enemies.add(bee30_2);
			
			if(!bee30_1.isAlive && !bee30_2.isAlive){
				Enemy.enemies.add(bee30_3);Enemy.enemies.add(bee30_4);Enemy.enemies.add(bee30_5);Enemy.enemies.add(bee30_6);
			}
			
			if(!bee30_3.isAlive && !bee30_4.isAlive && !bee30_5.isAlive && !bee30_6.isAlive){
				Enemy.enemies.add(bee30_7);Enemy.enemies.add(bee30_8);Enemy.enemies.add(bee30_9);
				Enemy.enemies.add(bee30_10);Enemy.enemies.add(bee30_11);Enemy.enemies.add(bee30_12);
			}
			
			if(!bee30_7.isAlive && !bee30_8.isAlive && !bee30_9.isAlive && !bee30_10.isAlive && !bee30_11.isAlive && !bee30_12.isAlive){
				Enemy.enemies.add(bee30_13);Enemy.enemies.add(bee30_15);Enemy.enemies.add(bee30_17);Enemy.enemies.add(bee30_19);
				Enemy.enemies.add(bee30_14);Enemy.enemies.add(bee30_16);Enemy.enemies.add(bee30_18);Enemy.enemies.add(bee30_20);
			}
			
			if(!bee30_13.isAlive && !bee30_14.isAlive && !bee30_15.isAlive && !bee30_16.isAlive && !bee30_17.isAlive && !bee30_18.isAlive && !bee30_19.isAlive && !bee30_20.isAlive){
													
				Enemy.enemies.add(bee30_21);Enemy.enemies.add(bee30_23);Enemy.enemies.add(bee30_25);Enemy.enemies.add(bee30_27);Enemy.enemies.add(bee30_29);
				Enemy.enemies.add(bee30_22);Enemy.enemies.add(bee30_24);Enemy.enemies.add(bee30_26);Enemy.enemies.add(bee30_28);Enemy.enemies.add(bee30_30);
				
			}
			if(!bee30_21.isAlive && !bee30_23.isAlive && !bee30_25.isAlive && !bee30_27.isAlive && !bee30_29.isAlive 
			&& !bee30_22.isAlive && !bee30_24.isAlive && !bee30_26.isAlive && !bee30_28.isAlive && !bee30_30.isAlive){
			
				JungleHeart.phase = 7;
				
			}
			
			
		}
		
		
		
		
	}


	public static int floorTiles = 0;
	public static void drawGround(){
		for(int i = 0;i < ground.size();i++){
			
			//Double For loop tiles over the ground blocks
			for(int k = 0;k <ground.get(i).getWidth();k+=25){
				for(int j = 0;j <ground.get(i).getHeight();j+=25){
					int gx = ground.get(i).getX()+k;
					int gy = ground.get(i).getY()+j;

					if(isTileOpenOnRight(gx,gy) && isTileOpenOnLeft(gx,gy) && !isTileOpenOnBottom(gx,gy))
						AssetLoader.blockdoublesided.draw(gx,gy);
					else
					{
						//draws the side blocks
						if(isTileOpenOnRight(gx,gy) && (!isTileOpenOnBottom(gx,gy)) && gx != 775)
							AssetLoader.blockright1.draw(gx,gy);

						else if(isTileOpenOnLeft(gx,gy) && !isTileOpenOnBottom(gx,gy) && gx != 0)
							AssetLoader.blockleft1.draw(gx,gy);

					}
					//draws lonely tiles
					if(isTileAlone(gx,gy))
						AssetLoader.blockalone.draw(gx,gy);

					//Draws the tiles not the floor and not hanging(middle dirts)
					if(isTileFullySurrounded(gx,gy) || (gx == 0 && !isTileOpenOnBottom(gx,gy) && !isTileOpenOnRight(gx,gy)) ||(gx == 775 && !isTileOpenOnBottom(gx,gy) && !isTileOpenOnLeft(gx,gy))){
						AssetLoader.block1.draw(ground.get(i).getX()+k, ground.get(i).getY()+j);
					}
					
					//draws three ground tiles in order 1,2,3,1,2,3,1,2,3,1,2,3 etc..
					if(!isTileGround(gx, gy) && !isTopTile(gx, gy) && !isTileAlone(gx,gy) && gy != 0)
					{
						
						if(!isTileOpenOnRight(gx,gy) && !isTileOpenOnLeft(gx,gy) && isTileOpenOnBottom(gx,gy) && gy != 575){
							AssetLoader.roundedOnlyBottom.draw(gx,gy);
						}
						else if(isTileOpenOnRight(gx,gy) && isTileOpenOnLeft(gx,gy) && !isTileOpenOnBottom(gx,gy)){
							AssetLoader.roundedSides.draw(gx,gy);
						}
						
						else if(isTileOpenOnRight(gx,gy) && gx != 775){
							AssetLoader.roundedGroundRight.draw(gx,gy);
						}
						else if(isTileOpenOnLeft(gx,gy) && gx != 0){
							AssetLoader.roundedGroundLeft.draw(gx,gy);
						}
						else{
						
						
						if(k == 0)
							floorTiles = 2;
						if(floorTiles >= 3)
							floorTiles = 0;
						if(floorTiles == 0)
							AssetLoader.block2.draw(gx,gy);
						if(floorTiles == 1)
							AssetLoader.block3.draw(gx,gy);
						if(floorTiles == 2)
							AssetLoader.block4.draw(gx,gy);
						}
						floorTiles++;
						
						
					}
					//Draws the hanging tiles
					else if(isTileOpenOnBottom(gx, gy) && !isTileAlone(gx,gy)){
						AssetLoader.blockhanging.draw(gx,gy);
					}

					//top and bottom tile fix?
					if(!isTileOpenOnBottom(gx,gy) && isTopTile(gx, gy) && !isTileOpenOnRight(gx,gy) && !isTileOpenOnLeft(gx,gy))
						AssetLoader.block1.draw(gx, gy);
					if(isBottomTile(gx, gy) && !isTileOpenOnTop(gx, gy) && gx == 0 && gy == 575)
						AssetLoader.block1.draw(gx, gy);
				}	
				
			}
			//End Tiles
		}
		//End Ground Rectangles Array List
	}
	
	public static boolean isTileAlone(int x, int y){
		if(!isTileOpenOnLeft(x,y))
			return false;
		if(!isTileOpenOnRight(x,y))
			return false;
		if(!isTileOpenOnBottom(x,y))
			return false;
		if(!isTileOpenOnTop(x,y))
			return false;
		return true;
	}
	
	public static boolean isTileFullySurrounded(int x, int y){
		if(isTileOpenOnLeft(x,y))
			return false;
		if(isTileOpenOnRight(x,y))
			return false;
		if(isTileOpenOnBottom(x,y))
			return false;
		if(isTileOpenOnTop(x,y))
			return false;
		return true;
	}
	
	public static boolean isTileOpenOnTop(int x, int y){
		Rectangle t = new Rectangle(x,y-15,5,5);
		for(int i = 0;i < ground.size();i++){
			if(t.intersects(ground.get(i)))
				return false;
		}
		return true;
	}
	public static boolean isTileOpenOnLeft(int x, int y){
		Rectangle t = new Rectangle(x-10,y,5,5);
		for(int i = 0;i < ground.size();i++){
			if(t.intersects(ground.get(i)))
				return false;
		}
		return true;
	}
	public static boolean isTileOpenOnRight(int x, int y){
		Rectangle t = new Rectangle(x+35,y,5,5);
		for(int i = 0;i < ground.size();i++){
			if(t.intersects(ground.get(i)))
				return false;
		}
		return true;
	}


	public static boolean isTileGround(int x, int y){
		Rectangle t = new Rectangle(x,y-10,5,5);
		for(int i = 0;i < ground.size();i++){
			if(t.intersects(ground.get(i)))
				return true;
		}
		return false;
	}
	public static boolean isTopTile(int x, int y){
		Rectangle t = new Rectangle(x,y,5,5);
		if(t.getY() == 0)
			return true;
		return false;
	}
	public static boolean isBottomTile(int x, int y){
		Rectangle t = new Rectangle(x,y,5,5);
		if(t.getY() == 575)
			return true;
		return false;
	}
	public static boolean isTileOpenOnBottom(int x, int y){
		Rectangle t = new Rectangle(x,y+30,5,5);
		for(int i = 0;i < ground.size();i++){
			if(t.intersects(ground.get(i)))
				return false;
		}
		return true;
	}

	public static int shrubCount = 0;
	public static void drawPrettyStuff(){

		for(int i = 0;i < shrubs.size();i++){
			//Double For loop tiles over the ground blocks
			for(int k = 0;k <shrubs.get(i).getWidth();k+=25){
				for(int j = 0;j <shrubs.get(i).getHeight();j+=25){	

					if(k == 0)
						shrubCount = 0;
					if(shrubCount >= 7)
						shrubCount = 0;
					if(shrubCount == 0)
						AssetLoader.shrubbery1.draw(shrubs.get(i).getX()+k, shrubs.get(i).getY()+j);
					if(shrubCount == 2)
						AssetLoader.shrubbery2.draw(shrubs.get(i).getX()+k, shrubs.get(i).getY()+j);
					if(shrubCount == 4)
						AssetLoader.shrubbery4.draw(shrubs.get(i).getX()+k, shrubs.get(i).getY()+j);
					if(shrubCount == 6)
						AssetLoader.shrubbery1.draw(shrubs.get(i).getX()+k, shrubs.get(i).getY()+j);
					shrubCount+=2;
				}	

			}

			//End Tiles
		}

		//End Ground Rectangles Array List

	}



}
