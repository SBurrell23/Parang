import org.lwjgl.util.Rectangle;

	
	public class Tiger extends Enemy{

		public static int ta = 0;
		public static int AS = 60;
		public static int tigerSpeed = 1;
		
		public Tiger(boolean isAlive, int startx, int starty, int endx,int endy, boolean goBack,Rectangle r) {
			super(isAlive, startx, starty, endx, endy, goBack,r);
		}
		
		public static void drawTiger(Enemy e){
			if(e instanceof Tiger){
				if(e.isAlive){
					if(ta >= AS)
						ta = 0;
					
					if(e.r.getX() != e.endx && !e.goBack)
					{
						if(ta < (15))
							AssetLoader.tigerRight1.draw(e.r.getX(), e.r.getY()-5);
						if(ta >=(15) && ta < (30))
							AssetLoader.tigerRight2.draw(e.r.getX(), e.r.getY()-5);
						if(ta >=(30) && ta < (45))
							AssetLoader.tigerRight3.draw(e.r.getX(), e.r.getY()-5);
					if(ta >=(45) && ta < AS)
							AssetLoader.tigerRight2.draw(e.r.getX(), e.r.getY()-5);
						
					}
					else
					{
						if(ta < 15)
							AssetLoader.tigerLeft1.draw(e.r.getX(), e.r.getY()-6);
						if(ta >=15 && ta < 30)
							AssetLoader.tigerLeft2.draw(e.r.getX(), e.r.getY()-6);
						if(ta >=30&& ta < 45)
							AssetLoader.tigerLeft3.draw(e.r.getX(), e.r.getY()-6);
						if(ta >=45 && ta < AS)
							AssetLoader.tigerLeft2.draw(e.r.getX(), e.r.getY()-6);
					}
				}
				if(e.endy != 0)
				{
					if(e.r.getX() != e.endx && !e.goBack)
						AssetLoader.tigerRightDead.draw(e.r.getX(), e.r.getY()-6);
					else
						AssetLoader.tigerLeftDead.draw(e.r.getX(), e.r.getY()-6);
					e.endy++;
				}
				if(e.endy >=25)
					e.endy = 0;
				
					
				
			}
			
		}
		
		public static void moveTiger(Enemy e){
			

			if(e instanceof Tiger && e.isAlive){
				if(e.r.getX() != e.endx && !e.goBack){
					e.r.setX(e.r.getX()+tigerSpeed);
				}
				if(e.r.getX() == e.endx)
					e.goBack = true;
				if(e.goBack){
					e.r.setX(e.r.getX()-tigerSpeed);
				}
				if(e.r.getX() == e.startx)
					e.goBack = false;

			}
		}
		
		
		
	}