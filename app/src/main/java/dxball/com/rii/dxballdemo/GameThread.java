package dxball.com.rii.dxballdemo;

/**
 * Created By SBOrion on 12/29/2016.
 */

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.util.Log;


public class GameThread extends Thread {
    Boolean running;
    Game game;
    GameObject ball;
    Canvas c = new Canvas();

    public GameThread(Game game) {
        this.game = game;
    }

    public void setRunning(Boolean run) {

        running = run;
    }

    @SuppressLint("WrongCall")

    @Override
    public void run() {


        while (running) {

            Log.d("Is the thread running", "sa" + running);


            try {

                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                //game.onDraw(c);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            } finally {
                c = null;
            }


        }
    }
}
