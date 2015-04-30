

import java.awt.Graphics;

public abstract class Gauge
{
   protected String description;
   protected String leftScale, rightScale;
   
   protected int x,y; // upper left corner of gauge
   protected int width, height; // in pixels
   protected float greenPercent, yellowPercent, redPercent;
   protected float indicatorPosition;
   
   public Gauge()
   {
     // ?
   }
   
   public Gauge( String d, String ls, String rs, int x, int y,
                 int w, int h, float gp, float yp, float rp, int ip )
   {
     // you know what to do here
   }
   
   public float getIndicatorPosition() { return indicatorPosition; }
   public void setIndicatorPosition( float newIP ) { indicatorPosition = newIP; }
   
   public abstract void draw( Graphics g );

}