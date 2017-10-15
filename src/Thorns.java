import org.lwjgl.util.Rectangle;


public class Thorns {

	
	
	
	public static void handleThornCollision(){
		for(int i = 0;i < Ground.thorns.size();i++){
			if(You.you.intersects(Ground.thorns.get(i)) && !You.invincible){
				System.out.println("You get hit and are are temporarily invincible");
				You.health -=1;
				AssetLoader.gettingHit.play();
				You.invincible = true;
				Enemy.invincibilityTimer = true;
			}
		}
	}
	
	public static void drawThorns(){
		for(int i = 0;i < Ground.thorns.size();i++){
			for(int k = 0;k <Ground.thorns.get(i).getWidth();k+=25){
				for(int j = 0;j <Ground.thorns.get(i).getHeight();j+=25){
					int gx = Ground.thorns.get(i).getX()+k;
					int gy = Ground.thorns.get(i).getY()+j;
					
					
					if(isTileOpenOnBottom(gx, gy) && isTileOpenOnTop(gx,gy)){
						AssetLoader.thornsDouble.draw(gx,gy);
					}
					else if(isTileOpenOnBottom(gx, gy)){
						AssetLoader.thornsBottom.draw(gx,gy);
					}
					else if(isTileOpenOnTop(gx,gy)){
						AssetLoader.thornsTop.draw(gx, gy);
					}
					else{
						AssetLoader.thorns.draw(gx, gy);
					}
					
					//Draws thorns attaching to cieling
					if(isTileOnTopGround(gx,gy)){
						AssetLoader.thornsTop.draw(gx,gy-25);
					}
	
				}	
			}

		}  
	}
	
	public static boolean isTileOnTopGround(int x, int y){
		Rectangle t = new Rectangle(x,y-15,5,5);
		for(int i = 0;i < Ground.ground.size();i++){
			if(t.intersects(Ground.ground.get(i)))
				return true;
		}
		return false;
		
	}
	
	
	public static boolean isTileOpenOnBottom(int x, int y){
		Rectangle t = new Rectangle(x,y+30,5,5);
		for(int i = 0;i < Ground.ground.size();i++){
			if(t.intersects(Ground.ground.get(i)))
				return false;
		}
		for(int i = 0;i < Ground.thorns.size();i++){
			if(t.intersects(Ground.thorns.get(i)))
				return false;
		}
		return true;
	}
	public static boolean isTileOpenOnTop(int x, int y){
		Rectangle t = new Rectangle(x,y-15,5,5);
		for(int i = 0;i < Ground.ground.size();i++){
			if(t.intersects(Ground.ground.get(i)))
				return false;
		}
		for(int i = 0;i < Ground.thorns.size();i++){
			if(t.intersects(Ground.thorns.get(i)))
				return false;
		}
		return true;
	}
	
}
