import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;


public class Draw {

	
	public static void Texture(Texture t, int x, int y)
	{
		      float width = t.getImageWidth();
		      float height = t.getImageHeight();
		      //the physical width of the texture which will be used in glTexCoord (generally a float between 0 and 1)
		      float textureWidth = t.getWidth();
		      float textureHeight = t.getHeight();
		      //texture offsets, for texture atlas purposes. leave at 0 for full image
		      float textureOffsetX = 0;
		      float textureOffsetY = 0;
		      //where on screen to draw the image
		      Color.white.bind();
		      t.bind();
		      GL11.glBegin(GL11.GL_QUADS);
		         GL11.glTexCoord2f(textureOffsetX, textureOffsetY);
		         GL11.glVertex2f(x, y);
		         GL11.glTexCoord2f(textureOffsetX, textureOffsetY + textureHeight);
		         GL11.glVertex2f(x, y + height);
		         GL11.glTexCoord2f(textureOffsetX + textureWidth, textureOffsetY + textureHeight);
		         GL11.glVertex2f(x + width, y + height);
		         GL11.glTexCoord2f(textureOffsetX + textureWidth, textureOffsetY);
		         GL11.glVertex2f(x + width, y);
		      GL11.glEnd();		
	}
}
