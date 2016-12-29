package dxball.com.rii.dxballdemo;


/**
 * Created by SBOrion on 12/29/2016.
 */

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Paint.Style;

public class Bricks extends GameObject {
    Paint paint = new Paint();
    int height, width;
    int life;
    int x1, y1;
    Boolean first = true;
    Rect r;

    public Bricks(int x, int y) {
        super(x, y);
        // TODO Auto-generated constructor stub
    }

    public Bricks(int x, int x1, int y, int y1, int life) {
        super(x, y);
        this.life = life;
        this.x1 = x1;
        this.y1 = y1;
    }


    @Override
    public void onDraw(Canvas canvas) {

        if (life == 1) {
            paint.setColor(Color.DKGRAY);
        } else if (life == 2) {
            paint.setColor(Color.argb(255, 1, 1, 0));
        }

        paint.setStyle(Style.FILL);


        r = new Rect(x + 2, y + 2, x1, y1);
        canvas.drawRect(r, paint);
    }

}
