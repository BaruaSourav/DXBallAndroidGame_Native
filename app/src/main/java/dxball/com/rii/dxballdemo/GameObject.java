package dxball.com.rii.dxballdemo;

import android.graphics.Canvas;

/**
 * Created by SBOrion on 12/29/2016.
 */
public abstract class GameObject {
    int x;
    int y;
    int speed = 1;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void onDraw(Canvas canvas);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
