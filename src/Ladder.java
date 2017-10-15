import org.lwjgl.util.Rectangle;



public class Ladder {


	public static void drawLadder(){


		//GL11.glRecti(Ground.ladder.get(i).getX(), Ground.ladder.get(i).getY(), Ground.ladder.get(i).getX()+Ground.ladder.get(i).getWidth(), Ground.ladder.get(i).getY()+Ground.ladder.get(i).getHeight());
		for(int i = 0;i < Ground.ladder.size();i++){
			for(int k = 0;k <1;k+=1){
				for(int j = 0;j <Ground.ladder.get(i).getHeight();j+=25){
					AssetLoader.ladderLeft.draw(Ground.ladder.get(i).getX(), Ground.ladder.get(i).getY()+j);
					AssetLoader.ladderRight.draw(Ground.ladder.get(i).getX()+25, Ground.ladder.get(i).getY()+j);

				}	
			}
		}




	}

	public static boolean isOnLadder(){
		for(int i = 0; i < Ground.ladder.size();i++){
			if(You.you.intersects(Ground.ladder.get(i))){

				return true;
			}
		}

		return false;

	}


	public static boolean isALadderBelowMe(){
		Rectangle l = new Rectangle(You.you.getX(),You.you.getY()+1,You.you.getWidth(),You.you.getHeight());
		for(int i = 0; i < Ground.ladder.size();i++){
			if(l.intersects(Ground.ladder.get(i))){
				return true;
			}
		}
		return false;
	}

	public static boolean isGroundBeneathMe(){

		Rectangle l = new Rectangle(You.you.getX(),You.you.getY()+1,You.you.getWidth(),You.you.getHeight());
		for(int i = 0; i < Ground.ground.size();i++){
			for(int k = 0; k < Ground.ground.size();k++){
				if(l.intersects(Ground.ground.get(k))){
					return true;
				}
			}

		}



		return false;
	}



}
