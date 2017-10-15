import java.util.Random;

import org.lwjgl.util.Rectangle;


public class JungleHeart {
	
	public static Random rand = new Random();
	//
	public static Rectangle r = new Rectangle(900,25,200,200);
	public static int phase;
	public static boolean startPhase0;
	public static int bossHP;
	public static boolean isBossDead;
	public static int phase0countdown;
	public static int numOfStomps;
	public static boolean stomp1,stomp1return,stomp2, stomp2track, stomp2return;
	public static boolean phase2Up,clackOnce;
	public static int phase2counter;
	public static boolean stomp3, stomp3track ,stomp3return;
	public static boolean phase4Up;
	public static int vineGrow,vineGrow2 ,vineCount ,vineReceed ;
	public static boolean moveBossToRight;
	public static boolean moveDown;
	public static boolean moveLeft;
	public static boolean moveUp ;
	public static boolean moveRight;
	public static boolean bossReturnUp , returnOnceUp;
	public static boolean stopGrowingVines;
	public static int blockCreatorCounter;
	public static boolean createBlocks,destroyBlocks;
	public static boolean stomp5 , stomp5track , stomp5return;
	public static boolean phase5Up,spawnBees;
	public static boolean stomp7 , stomp7track , stomp7return;
	public static int spazCounter;
	public static int sd;
	public static int spazOutLength;
	public static boolean haveYouMadeItToTheBoss = false;
	
	public static boolean OOO = true;
	

	public static void handleBoss(){
		if(OOO){
			resetBossVariables();
			OOO = false;
		}
		drawBoss();
		handlePhases();
		handleBossCollision();

	}

	public static void drawBoss(){
		if(phase <= 7)
			AssetLoader.HeartOfJungle.draw(r.getX()-2,r.getY()-2);
		else
			AssetLoader.jungleHeart2.draw(r.getX()-2,r.getY()-2);
		drawBossHP();
	}
	public static void drawBossHP(){
		
		if(r.getX() > -500){
		
		AssetLoader.bossBorder.draw(132,560);
		
			if(bossHP >= 0)
		AssetLoader.bossHP.getSubImage(0, 0, bossHP-4, 16).draw(153,572);
			
		}
			
	}
	
	public static void handleBossCollision(){
		if(You.you.intersects(r) && spazCounter == 0){
			if(!Enemy.invincibilityTimer){
				System.out.println("Your skin burns when you touch the heart of the jungle!");
				You.health -=1;
				AssetLoader.gettingHit.play();
				You.invincible = true;
				Enemy.invincibilityTimer = true;
			}
		}
		if(Weapon.swingMachete){
			if(Weapon.Machete.intersects(r)){
				bossHP--;
				System.out.println("Boss HP = " + bossHP);
					
			}
		}

	}


	public static void handlePhases(){

		switch(phase){
		case 0:phase0();break;
		case 1:phase1();break;		
		case 2:phase2();break;
		case 3:phase3();break;	
		case 4:phase4();break;
		case 5:phase5();break;
		case 6:phase6();break;
		case 7:phase7();break;
		case 8:phase8();break;
		}
	}
	
	public static void resetBossVariables(){
		r.setX(800);
		r.setY(25);
		//
		Ground.tigerLeft1 = new Tiger(true,-999999999,520,900,0,true,new Rectangle(900,520,80,30));
		Ground.tigerRight1 = new Tiger(true,-200,520,999999999,0,false,new Rectangle(-200,520,80,30));
		Ground.tigerLeft2 = new Tiger(true,-999999999,520,1000,0,true,new Rectangle(1000,520,80,30));
		Ground.tigerRight2 = new Tiger(true,-300,520,999999999,0,false,new Rectangle(-300,520,80,30));
		Ground.tigerLeft3 = new Tiger(true,-999999999,520,1100,0,true,new Rectangle(1100,520,80,30));
		Ground.tigerRight3 = new Tiger(true,-400,520,999999999,0,false,new Rectangle(-400,520,80,30));
		Ground.tigerLeft4 = new Tiger(true,-999999999,520,1200,0,true,new Rectangle(1200,520,80,30));
		Ground.tigerRight4 = new Tiger(true,-500,520,999999999,0,false,new Rectangle(-500,520,80,30));
		Ground.tigerLeft5 = new Tiger(true,-999999999,520,1300,0,true,new Rectangle(1300,520,80,30));
		Ground.tigerRight5 = new Tiger(true,-600,520,999999999,0,false,new Rectangle(-600,520,80,30));
		Ground.tigerLeft6 = new Tiger(true,-999999999,520,1400,0,true,new Rectangle(1400,520,80,30));
		Ground.tigerRight6 = new Tiger(true,-700,520,999999999,0,false,new Rectangle(-700,520,80,30));
		Ground.tigerLeft7 = new Tiger(true,-999999999,520,1500,0,true,new Rectangle(1500,520,80,30));
		Ground.tigerRight7 = new Tiger(true,-800,520,999999999,0,false,new Rectangle(-800,520,80,30));
		Ground.tigerLeft8 = new Tiger(true,-999999999,520,1600,0,true,new Rectangle(1600,520,80,30));
		Ground.tigerRight8 = new Tiger(true,-900,520,999999999,0,false,new Rectangle(-900,520,80,30));
		Ground.tigerLeft9 = new Tiger(true,-999999999,520,1700,0,true,new Rectangle(1700,520,80,30));
		Ground.tigerRight9 = new Tiger(true,-1000,520,999999999,0,false,new Rectangle(-1000,520,80,30));
		Ground.tigerLeft10 = new Tiger(true,-999999999,520,1800,0,true,new Rectangle(1800,520,80,30));
		Ground.tigerRight10 = new Tiger(true,-1100,520,999999999,0,false,new Rectangle(-1100,520,80,30));
		//
		Ground.bee30_1 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
		Ground.bee30_2 = new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));
		Ground.bee30_3 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
		Ground.bee30_4 = new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));
		Ground.bee30_5 = new Bee(true,775,300,0,2,false,new Rectangle(825,300,25,25));
		Ground.bee30_6 = new Bee(true,0,300,0,2,false,new Rectangle(-50,300,25,25));
		Ground.bee30_7 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
		Ground.bee30_8 = new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));
		Ground.bee30_9 = new Bee(true,775,300,0,2,false,new Rectangle(800,300,25,25));
		Ground.bee30_10 = new Bee(true,0,300,0,2,false,new Rectangle(-25,300,25,25));
		Ground.bee30_11 = new Bee(true,775,300,0,2,false,new Rectangle(850,-50,25,25));
		Ground.bee30_12 = new Bee(true,0,300,0,2,false,new Rectangle(-98,-25,25,25));
		Ground.bee30_13 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
		Ground.bee30_14= new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));
		Ground.bee30_15= new Bee(true,775,300,0,2,false,new Rectangle(800,-75,25,25));
		Ground.bee30_16 = new Bee(true,0,300,0,2,false,new Rectangle(-25,-100,25,25));
		Ground.bee30_17 = new Bee(true,775,300,0,2,false,new Rectangle(877,450,25,25));
		Ground.bee30_18 = new Bee(true,0,300,0,2,false,new Rectangle(-98,450,25,25));
		Ground.bee30_19= new Bee(true,775,50,0,2,false,new Rectangle(850,200,25,25));
		Ground.bee30_20= new Bee(true,0,50,0,2,false,new Rectangle(-75,200,25,25));
		Ground.bee30_21 = new Bee(true,775,50,0,2,false,new Rectangle(775,50,25,25));
		Ground.bee30_22= new Bee(true,0,50,0,2,false,new Rectangle(0,50,25,25));
		Ground.bee30_23= new Bee(true,775,300,0,2,false,new Rectangle(800,300,25,25));
		Ground. bee30_24 = new Bee(true,0,300,0,2,false,new Rectangle(-25,-80,25,25));
		Ground. bee30_25 = new Bee(true,775,300,0,2,false,new Rectangle(899,450,25,25));
		Ground.bee30_26 = new Bee(true,0,300,0,2,false,new Rectangle(-105,450,25,25));
		Ground.bee30_27= new Bee(true,775,50,0,2,false,new Rectangle(850,-10,25,25));
		Ground.bee30_28= new Bee(true,0,50,0,2,false,new Rectangle(-75,200,25,25));
		Ground.bee30_29= new Bee(true,775,50,0,2,false,new Rectangle(425,-100,25,25));
		Ground.bee30_30= new Bee(true,0,50,0,2,false,new Rectangle(-250,-50,25,25));
		//Starting
		phase = 0;
		startPhase0 = false;
		bossHP = 500;
		isBossDead = false;
		//Phase 0
		phase0countdown = 0;
		//Phase 1
		numOfStomps = 0;
		stomp1 = true;stomp1return = false;
		stomp2 = false; stomp2track = false; stomp2return = false;
		//Phase 2
		phase2Up = true;
		phase2counter = 0;
		//Phase 3
		stomp3 = false; stomp3track = true; stomp3return = false;
		//Phase 4
		phase4Up = true;
		vineGrow = 0;vineGrow2 = 0;vineCount = 0;vineReceed = 0;
		moveBossToRight = false;
		moveDown = false;
		moveLeft = false;
		moveUp = false;
		moveRight = false;
		bossReturnUp = false; returnOnceUp = true;
		stopGrowingVines = false;
		blockCreatorCounter = 0;
		createBlocks = false;destroyBlocks = false;
		//Phase 5
		stomp5 = false; stomp5track = true;stomp5return = false;
		//Phase 6
		phase5Up = true;spawnBees = false;
		//Phase 7
		stomp7 = false;stomp7track = true; stomp7return = false;
		//Phase 8
		spazCounter = 0;
		 sd = 3;
		 spazOutLength = 0;
		 clackOnce = true;
	}

	public static void phase0(){
		//Play boss music
		if(You.you.getY() == 15 && !AssetLoader.bossMusic.playing()){
			AssetLoader.jungleMusic.stop();
			AssetLoader.bossMusic.loop(1f,.4f);
		}
		
		
		
		if(You.you.getY() == 475)
			startPhase0 = true;
		if(startPhase0 && r.getX() > 300){
			r.setX(r.getX()-1);
		}
		if(r.getX() <= 300)
			phase0countdown++;

		if(phase0countdown >= 100)
			phase = 1;
		
		haveYouMadeItToTheBoss= true;
	}
	
	
	public static void phase1(){
		if(r.getY() <=  346 && stomp1)
			r.setY(r.getY()+3);
		if(r.getY() > 346){
			AssetLoader.bossStomp.play();
			stomp1 = false;
			stomp1return = true;
		}
		if(stomp1return && r.getY() > 25)
			r.setY(r.getY()-6);
		if(r.getY() <= 25 && stomp1return){
			stomp1return = false;
			stomp2track = true;
		}
		if(stomp2track){
			if(You.you.getX() > r.getX()+100)
				r.setX(r.getX()+4);
			else if(You.you.getX() < r.getX()+100)
				r.setX(r.getX()-4);
			if((r.getX()+100) == You.you.getX() || r.getX()+101 == You.you.getX() || (r.getX()+102) == You.you.getX()
					|| (r.getX()+103) == You.you.getX()	|| (r.getX()+104) == You.you.getX() || (r.getX()+105) == You.you.getX()
					|| (r.getX()+106) == You.you.getX() || (r.getX()+107) == You.you.getX() || (r.getX()+108) == You.you.getX()
					){
				stomp2 = true;
				stomp2track = false;
			}
		}
		if(r.getY() <=  346 && stomp2)
			r.setY(r.getY()+5);
		if(r.getY() > 346){
			AssetLoader.bossStomp.play();
			stomp2 = false;
			stomp2return = true;
			numOfStomps++;
			System.out.println(numOfStomps);
		}
		if(stomp2return && r.getY() > 25)
			r.setY(r.getY()-6);
		if(r.getY() <= 25 && stomp2return){
			stomp2return = false;
			stomp2track = true;
		}

		if(bossHP <= 400){
			stomp2track = false;
			phase = 2;
		}

	}


	public static void phase2(){
		if(phase2Up){
			if(r.getY() > 25)
				r.setY(r.getY()-6);
			if(r.getY() <= 25)
				phase2Up = false;
			Tiger.tigerSpeed = 2;
		}
		if(!phase2Up)
			phase2counter++;
		//System.out.println(phase2counter);

		if(phase2counter >= 840){
			phase = 3;
			numOfStomps = 0;
		}
	}

	public static void phase3(){

		if(stomp3track){
			if(You.you.getX() > r.getX()+100)
				r.setX(r.getX()+4);
			else if(You.you.getX() < r.getX()+100)
				r.setX(r.getX()-4);
			if((r.getX()+100) == You.you.getX() || r.getX()+101 == You.you.getX() || (r.getX()+102) == You.you.getX()
					|| (r.getX()+103) == You.you.getX()	|| (r.getX()+104) == You.you.getX() || (r.getX()+105) == You.you.getX()
					|| (r.getX()+106) == You.you.getX() || (r.getX()+107) == You.you.getX() || (r.getX()+108) == You.you.getX()
					){
				stomp3 = true;
				stomp3track = false;
			}
		}
		if(r.getY() <=  346 && stomp3)
			r.setY(r.getY()+5);
		if(r.getY() > 346){
			AssetLoader.bossStomp.play();
			stomp3 = false;
			stomp3return = true;
			numOfStomps++;
			System.out.println(numOfStomps);
		}
		if(stomp3return && r.getY() > 25)
			r.setY(r.getY()-6);
		if(r.getY() <= 25 && stomp3return){
			stomp3return = false;
			stomp3track = true;
		}

		if(bossHP <= 300){
			stomp3track = false;
			phase = 4;
		}

	}



	public static void phase4(){
		if(phase4Up){
			if(r.getY() > 25)
				r.setY(r.getY()-6);
			if(r.getY() <= 25)
				phase4Up = false;

		}
		else{
			vineCount++;
		}

		if(vineCount > 5){
			
			if(vineCount % 15 == 0 && vineGrow < 450 && vineReceed ==0){
				vineGrow+=25;
				if(vineGrow > 1 && vineGrow % 25 == 0)
					AssetLoader.thornGrow.play(1f,.5f);
			}

			if(vineGrow >= 450 && vineCount % 15 == 0 && vineGrow2 < 450 && vineReceed == 0){
				vineGrow2+=25;
				if(vineGrow2 > 1 && vineGrow2 % 25 == 0)
					AssetLoader.thornGrow.play(1f,.5f);
			}

			if(vineGrow2 == 450 && !stopGrowingVines){
				moveBossToRight = true;
				stopGrowingVines = true;
			}

			if(moveBossToRight){
				if(r.getX() != 575){
					if(r.getX() < 575)
						r.setX(r.getX()+1);
					else
						r.setX(r.getX()-1);
					if(r.getX() == 575){
						moveBossToRight = false;
						moveDown = true;
						createBlocks = true;
					}
				}
			}
			if(bossHP > 200){
				if(moveDown){
					if(r.getY() <=  346)
						r.setY(r.getY()+3);
					if(r.getY() >= 346){
						moveLeft = true;
						moveDown = false;
					}
				}

				if(createBlocks && !destroyBlocks)
					blockCreatorCounter++;


				if(moveLeft){
					if(r.getX() > 26)
						r.setX(r.getX()-3);
					if(r.getX() <= 26){
						moveLeft = false;
						moveUp = true;
					}
				}

				if(moveUp){
					if(r.getY() > 25)
						r.setY(r.getY()-3);
					if(r.getY() <= 25){
						moveUp = false;
						moveRight = true;
					}
				}
				if(moveRight){
					if(r.getX()< 575)
						r.setX(r.getX()+3);
					if(r.getX() >= 575){
						moveRight = false;
						moveDown = true;
					}	

				}
			}

			if(bossHP <=200){
				if(returnOnceUp){
					bossReturnUp = true;
					returnOnceUp = false;
				}

				if(bossReturnUp){
					if(r.getY() > 25)
						r.setY(r.getY()-5);
					if(r.getY() <= 25){
						bossReturnUp = false;
						destroyBlocks = true;
						blockCreatorCounter = 175;
						vineReceed++;
					}
				}

				if(vineReceed != 0){
					vineReceed++;
					if(vineReceed % 15 == 0){
						vineGrow-=25;
						vineGrow2-=25;
						blockCreatorCounter-=10;
						if(blockCreatorCounter <= 0)
							phase = 5;
					}
				}
				
				

			}
			
			
			

		}
	}

	
	public static void phase5(){

		if(stomp5track){
			if(You.you.getX() > r.getX()+100)
				r.setX(r.getX()+4);
			else if(You.you.getX() < r.getX()+100)
				r.setX(r.getX()-4);
			if((r.getX()+100) == You.you.getX() || r.getX()+101 == You.you.getX() || (r.getX()+102) == You.you.getX()
					|| (r.getX()+103) == You.you.getX()	|| (r.getX()+104) == You.you.getX() || (r.getX()+105) == You.you.getX()
					|| (r.getX()+106) == You.you.getX() || (r.getX()+107) == You.you.getX() || (r.getX()+108) == You.you.getX()
					){
				stomp5 = true;
				stomp5track = false;
			}
		}
		if(r.getY() <=  346 && stomp5)
			r.setY(r.getY()+5);
		if(r.getY() > 346){
			AssetLoader.bossStomp.play();
			stomp5 = false;
			stomp5return = true;
		}
		if(stomp5return && r.getY() > 25)
			r.setY(r.getY()-6);
		if(r.getY() <= 25 && stomp5return){
			stomp5return = false;
			stomp5track = true;
		}

		if(bossHP <= 100){
			stomp5track = false;
			phase = 6;
		}
	}
	
	
	public static void phase6(){
		
		if(phase5Up){
			if(r.getY() > 25)
				r.setY(r.getY()-6);
			if(r.getY() <= 25){
				phase5Up = false;
				spawnBees = true;
				if(!AssetLoader.beesBuzzing.playing())
					AssetLoader.beesBuzzing.loop(1f,.6f);
			}
		}	
		
	}
	
	
	public static void phase7(){
		AssetLoader.beesBuzzing.stop();
		if(stomp7track){
			if(You.you.getX() > r.getX()+100)
				r.setX(r.getX()+4);
			else if(You.you.getX() < r.getX()+100)
				r.setX(r.getX()-4);
			if((r.getX()+100) == You.you.getX() || r.getX()+101 == You.you.getX() || (r.getX()+102) == You.you.getX()
					|| (r.getX()+103) == You.you.getX()	|| (r.getX()+104) == You.you.getX() || (r.getX()+105) == You.you.getX()
					|| (r.getX()+106) == You.you.getX() || (r.getX()+107) == You.you.getX() || (r.getX()+108) == You.you.getX()
					){
				stomp7 = true;
				stomp7track = false;
			}
		}
		if(r.getY() <=  346 && stomp7)
			r.setY(r.getY()+5);
		if(r.getY() > 346){
			AssetLoader.bossStomp.play();
			stomp7 = false;
			stomp7return = true;
		}
		if(stomp7return && r.getY() > 25)
			r.setY(r.getY()-6);
		if(r.getY() <= 25 && stomp7return){
			stomp7return = false;
			stomp7track = true;
		}

		if(bossHP <= 0){
			stomp7track = false;
			phase = 8;
		}
	}
	
	

	public static void phase8(){
		AssetLoader.bossMusic.stop();
		
		spazCounter++;
		int ranSpaz = rand.nextInt(20);
		
		if(spazOutLength < 5)
		switch(spazCounter){
		
		case 100:r.setX(r.getX()+ranSpaz);r.setY(r.getY()+ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 103:r.setX(r.getX()-ranSpaz);r.setY(r.getY()-ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 106:r.setX(r.getX()+ranSpaz);r.setY(r.getY()-ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 109:r.setX(r.getX()-ranSpaz);r.setY(r.getY()-ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 112:r.setX(r.getX()+ranSpaz);r.setY(r.getY()+ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 115:r.setX(r.getX()+ranSpaz);r.setY(r.getY()-ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 118:r.setX(r.getX()-ranSpaz);r.setY(r.getY()-ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 121:r.setX(r.getX()+ranSpaz);r.setY(r.getY()+ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 124:r.setX(r.getX()-ranSpaz);r.setY(r.getY()-ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 127:r.setX(r.getX()+ranSpaz);r.setY(r.getY()+ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 130:r.setX(r.getX()+ranSpaz);r.setY(r.getY()+ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 133:r.setX(r.getX()-ranSpaz);r.setY(r.getY()-ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 136:r.setX(r.getX()+ranSpaz);r.setY(r.getY()+ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		case 139:r.setX(r.getX()-ranSpaz);r.setY(r.getY()-ranSpaz);AssetLoader.bossGetsHit.play();
		break;
		}
		if(spazCounter > 139){
			spazCounter = 100;
			spazOutLength++;
		}
		
		if(spazOutLength >= 5){
			r.setX(-10000);
			isBossDead = true;
			if(clackOnce){
				AssetLoader.clack.play();
				clackOnce = false;
			}
			
			
		}
		
		//EXIT JUNGLER HERE
		if(You.you.intersects(new Rectangle(824,400,100,300))){
			Menu.youWinScreen = true;
			if(!AssetLoader.jungleMusic.playing())
				AssetLoader.jungleMusic.loop(1f,.4f);
		}
		
		
	}


}
