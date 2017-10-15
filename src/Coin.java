import java.util.ArrayList;

import org.lwjgl.util.Rectangle;


public class Coin {
	
	public static ArrayList<Coin> coins = new ArrayList<Coin>();
	public static int coinCount = 0;
	int coinx;
	int coiny;
	boolean isCollected;
	Rectangle r;
	public static int coinRotate = 0;
	public static int flash = 0;
	
	
	public Coin(int coinx, int coiny, boolean isCollected){
		this.coinx = coinx;
		this.coiny = coiny;
		this.isCollected = isCollected;
		this.r = new Rectangle(coinx,coiny,25,25);
	}
	
	public static void handleCoins(){
		collectCoins();
		drawCoins();
	}
	
	public static void collectCoins(){
		for(int i = 0;i < coins.size();i++){
			if(coins.get(i).isCollected == false && You.you.intersects(coins.get(i).r)){
				coinCount++;
				System.out.println("You've collected " + coinCount + " coins!");
				AssetLoader.coinSound.play(1f,.5f);
				coins.get(i).isCollected = true;
				AssetLoader.pop1.draw(coins.get(i).r.getX(),coins.get(i).r.getY());
					
			}
		}
	}
	
	public static void drawCoins(){
		for(int i = 0;i < coins.size();i++){
			if(!coins.get(i).isCollected){
				if(coinRotate >= 40)
					coinRotate = 0;
				if(coinRotate < 10)
					AssetLoader.coin1.draw(coins.get(i).r.getX(),coins.get(i).r.getY());
				if(coinRotate >= 10 && coinRotate < 20)
					AssetLoader.coin2.draw(coins.get(i).r.getX(),coins.get(i).r.getY());
				if(coinRotate >= 20 && coinRotate < 30)
					AssetLoader.coin3.draw(coins.get(i).r.getX(),coins.get(i).r.getY());
				if(coinRotate >= 30 && coinRotate < 40)
					AssetLoader.coin4.draw(coins.get(i).r.getX(),coins.get(i).r.getY());
			}
			
		}
		
		coinRotate++;
	}
	

}
