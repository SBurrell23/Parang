import java.util.ArrayList;
import org.lwjgl.util.Rectangle;


public class Enemy {

	public static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	public boolean isAlive;
	public int startx,starty,endx,endy;
	public boolean goBack;
	public static boolean invincibilityTimer = false;
	public static int invincibilityTime = 0;
	public Rectangle r;
	public static int pillarSpeed = 10;
	public static int batAnimation = 0;
	public static int batDeadAni = 0;
	public static int beeBuzz = 0;

	public static void handleEnemies(){


		moveEnemy();
		detectCollision();
		batAnimation++;

		Thorns.handleThornCollision();
		handleAfterHitInvincibility();

	}

	public static void handleAfterHitInvincibility(){
		if(invincibilityTimer){
			invincibilityTime++;
		}	

		if(invincibilityTime == 60){
			invincibilityTimer = false;
			invincibilityTime = 0;
			You.invincible = false;
		}
	}

	public static void detectCollision(){
		for(int i = 0;i < enemies.size();i++){
			Enemy e = enemies.get(i);

			//---TIGER---//
			if(e instanceof Tiger){
				if(e.isAlive){

					if(e.r.intersects(You.you)){
						if(!invincibilityTimer){
							System.out.println("You get hit and are are temporarily invincible");
							You.health -=1;
							AssetLoader.gettingHit.play();
							You.invincible = true;
							invincibilityTimer = true;
						}
					}
					if(Weapon.swingMachete){
						if(Weapon.Machete.intersects(e.r)){
							System.out.println("Your machete strikes the Tiger!");
							e.endy = 1;
							AssetLoader.tigerDeath.play();
							e.isAlive = false;
						}
					}
				}	
			}
			//---TIGER---//
			//----------//
			//---BAT---//
			else if(e instanceof Bat){
				if(e.isAlive){

					if(e.r.intersects(You.you)){
						if(!invincibilityTimer){
							System.out.println("You get hit and are are temporarily invincible");
							You.health -=1;
							AssetLoader.gettingHit.play();
							You.invincible = true;
							invincibilityTimer = true;
						}
					}
					if(Weapon.swingMachete){
						if(Weapon.Machete.intersects(e.r)){
							System.out.println("Your machete strikes the Bat!");
							e.endx = 1;
							AssetLoader.batDeath.play(1f,.4f);
							e.isAlive = false;
						}
					}
				}	
			}

			//---BAT---//
			//----------//
			//---BEE---//
			else if(e instanceof Bee){
				if(e.isAlive){

					if(e.r.intersects(You.you)){
						if(!invincibilityTimer){
							System.out.println("You get hit and are are temporarily invincible");
							You.health -=1;
							AssetLoader.gettingHit.play();
							You.invincible = true;
							invincibilityTimer = true;
						}
					}
					if(Weapon.swingMachete){
						if(Weapon.Machete.intersects(e.r)){
							System.out.println("Your machete strikes the Bee!");
							e.endx = 1;
							AssetLoader.beeDeath.play();
							e.isAlive = false;
						}
					}
				}	
			}
			//---BEE---//
			//----------//
			//--PILLAR-//
			//Moved part to draw enemies so pillar can be drawn right before it dies
			else if(e instanceof Pillar){
				if(e.isAlive){

					if(e.r.intersects(You.you)){
						if(!invincibilityTimer){
							System.out.println("You get hit and are are temporarily invincible");
							You.health -=1;
							AssetLoader.gettingHit.play();
							You.invincible = true;
							invincibilityTimer = true;
							e.isAlive = false;
							AssetLoader.spikeFall.play();
						}
					}




				}	
			}
			//--PILLAR-//

		}
	}

	public static void drawEnemies(){

		for(int i = 0;i< enemies.size();i++){
			Enemy e = enemies.get(i);

			//---TIGER---//
			Tiger.drawTiger(e);
			//---TIGER---//
			//----------//
			//---BAT---//
			if(e instanceof Bat){
				if(e.isAlive){
					if(batAnimation > 21)
						batAnimation = 0;
					if(batAnimation <= 7)
						AssetLoader.bat1.draw(e.r.getX(), e.r.getY());
					if(batAnimation > 7 && batAnimation <=14)
						AssetLoader.bat2.draw(e.r.getX(), e.r.getY());
					if(batAnimation > 14)
						AssetLoader.bat3.draw(e.r.getX(), e.r.getY());
				}
				if(enemies.get(i).endx != 0){
					AssetLoader.batdead.draw(e.r.getX(), e.r.getY());
					e.endx++;
				}
				if(e.endx >= 25)
					e.endx = 0;

			}
			//---BAT---//

		}
	}

	public static void drawPillar(){
		for(int i = 0;i< enemies.size();i++){
			Enemy e = enemies.get(i);
			if(e instanceof Pillar){
				if(enemies.get(i).isAlive){
					AssetLoader.pillarTop.draw(e.r.getX(), e.r.getY()-25);
					AssetLoader.pillar.draw(e.r.getX(), e.r.getY());
				}


				for(int q = 0;q < Ground.ground.size();q++){
					if(e.r.intersects(Ground.ground.get(q))){
						e.r.setY(e.r.getY()-11);
						e.isAlive = false;
						AssetLoader.spikeFall.play();
					}
				}	

			}
		}
		//--PILLAR-//
	}

	public static void drawBees(){
		for(int i = 0;i< enemies.size();i++){
			Enemy e = enemies.get(i);
			if(e instanceof Bee){
				if(enemies.get(i).isAlive){

					if(beeBuzz > 8)
						beeBuzz = 0;

					if(You.you.getX() < e.r.getX()){
						if(beeBuzz < 4)
							AssetLoader.beeLeft.draw(e.r.getX(), e.r.getY());
						if(beeBuzz >= 4)
							AssetLoader.beeLeft2.draw(e.r.getX(), e.r.getY());
					}
					if(You.you.getX() > e.r.getX()){
						if(beeBuzz < 4)
							AssetLoader.beeRight.draw(e.r.getX(), e.r.getY());
						if(beeBuzz >= 4)
							AssetLoader.beeRight2.draw(e.r.getX(), e.r.getY());
					}
				}
				if(!e.isAlive && e.endx < 30){
					if(You.you.getX() < e.r.getX()){
						if(e.endx > 0 && e.endx < 10){
							AssetLoader.splatL1.draw(e.r.getX(), e.r.getY());

						}
						if(e.endx > 10 && e.endx < 20){
							AssetLoader.splatL2.draw(e.r.getX(), e.r.getY());
						}
						if(e.endx > 20 && e.endx < 30){
							AssetLoader.splatL3.draw(e.r.getX(), e.r.getY());
						}
					}
					if(You.you.getX() >= e.r.getX()){
						if(e.endx > 0 && e.endx < 10){
							AssetLoader.splatR1.draw(e.r.getX(), e.r.getY());

						}
						if(e.endx > 10 && e.endx < 20){
							AssetLoader.splatR2.draw(e.r.getX(), e.r.getY());
						}
						if(e.endx > 20 && e.endx < 30){
							AssetLoader.splatR3.draw(e.r.getX(), e.r.getY());
						}
					}
					e.endx++;
				}

			}
		}
	}


	public static void moveEnemy(){
		for(int k = 0;k < enemies.size();k++){
			Enemy e = enemies.get(k);

			//---TIGER---//
			Tiger.moveTiger(e);
			//---TIGER---//
			//----------//
			//---BAT---//
			if(e instanceof Bat){
				if(e.isAlive){
					if(e.r.getY() == e.endy)
						e.goBack = true;
					if(e.r.getY() == e.starty)
						e.goBack = false;
					int batSpeed = 4;

					if(e.r.getY() != e.endy && !e.goBack)
						e.r.setY(e.r.getY()+batSpeed);
					if(e.goBack)
						e.r.setY(e.r.getY()-batSpeed);
				}

			}
			//---BAT---//
			//---------//
			//---BEE---//

			if(e instanceof Bee && e.isAlive){
				//int beeSpeed = e.endy;
				int beeSpeed = 2;

				if(levelChange())
					e.goBack = true;	

				if(e.goBack){
					e.r.setX(e.startx);
					e.r.setY(e.starty);
					e.goBack = false;
				}

				if(e.r.getX() < You.you.getX()+2)
					e.r.setX(e.r.getX()+beeSpeed);
				else if(e.r.getX() > You.you.getX()+2)
					e.r.setX(e.r.getX()-beeSpeed);
				if(e.r.getY() > You.you.getY()+20)
					e.r.setY(e.r.getY()-beeSpeed);
				if(e.r.getY() < You.you.getY()+20)
					e.r.setY(e.r.getY()+beeSpeed);

			}
			//---BEE---//
			//----------//
			//--PILLAR-//
			if(e instanceof Pillar){
				if(levelChange())
					e.goBack = true;
				if(e.goBack){
					e.r.setX(e.startx);
					e.r.setY(e.starty);
					e.goBack = true;
					pillarSpeed = 10;
				}
				Rectangle PillCheck = new Rectangle(e.r.getX(),e.r.getY(),25,500);
				if(PillCheck.intersects(You.you) && e.goBack == true){
					e.goBack= false;
				}
				if(!e.goBack && e.isAlive){
					e.r.setY(e.r.getY()+pillarSpeed);
				}

			}
			//--PILLAR-//


		}
		if(!thereAreBees()){
			AssetLoader.beesBuzzing.stop();
		}
		handleLevelChange();
	}
	public static int myLevel = 1;
	public static boolean levelChange(){
		if(myLevel != Levels.currentLevel){
			return true;
		}
		return false;
	}


	public static boolean handleLevelChange(){
		if(myLevel != Levels.currentLevel){
			myLevel = Levels.currentLevel;
			AssetLoader.beesBuzzing.stop();
			if(thereAreBees())
				AssetLoader.beesBuzzing.loop(1f,.6f);
			return true;
		}
		return false;
	}



	public static boolean thereAreBees(){
		for(int k = 0;k < enemies.size();k++){
			Enemy e = enemies.get(k);
			if(e instanceof Bee && e.isAlive)
				return true;
		}
		return false;
	}

	public Enemy(boolean isAlive,int startx, int starty,int endx,int endy,boolean goBack,Rectangle r){
		this.isAlive = isAlive;
		this.endx = endx;
		this.endy = endy;
		this.goBack = goBack;
		this.startx = startx;
		this.starty = starty;
		this.r = r;

	}



}
