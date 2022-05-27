package samkit.myappcompany.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    boolean player = true;

    boolean click1 = true;
    boolean click2 = true;
    boolean click3 = true;
    boolean click4 = true;
    boolean click5 = true;
    boolean click6 = true;
    boolean click7 = true;
    boolean click8 = true;
    boolean click9 = true;

    int a1, a2, a3, a4, a5, a6, a7, a8, a9 = 0;

    public void stop() {

        click1 = false;
        click2 = false;
        click3 = false;
        click4 = false;
        click5 = false;
        click6 = false;
        click7 = false;
        click8 = false;
        click9 = false;

    }

    public void win() {

        if (a1 == 1 && a2 == 1 && a3 == 1) {
            Toast.makeText(this, "Blue is winner", Toast.LENGTH_LONG).show();
            ImageView linev1 = (ImageView) findViewById(R.id.linev1);
            linev1.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a4 == 1 && a5 == 1 && a6 == 1) {
            Toast.makeText(this, "Blue is winner", Toast.LENGTH_LONG).show();
            ImageView linev2 = (ImageView) findViewById(R.id.linev2);
            linev2.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a7 == 1 && a8 == 1 && a9 == 1) {
            Toast.makeText(this, "Blue is winner", Toast.LENGTH_LONG).show();
            ImageView linev3 = (ImageView) findViewById(R.id.linev3);
            linev3.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a1 == 1 && a4 == 1 && a7 == 1) {
            Toast.makeText(this, "Blue is winner", Toast.LENGTH_LONG).show();
            ImageView lineh1 = (ImageView) findViewById(R.id.lineh1);
            lineh1.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a2 == 1 && a5 == 1 && a8 == 1) {
            Toast.makeText(this, "Blue is winner", Toast.LENGTH_LONG).show();
            ImageView lineh2 = (ImageView) findViewById(R.id.lineh2);
            lineh2.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a3 == 1 && a6 == 1 && a9 == 1) {
            Toast.makeText(this, "Blue is winner", Toast.LENGTH_SHORT).show();
            ImageView lineh3 = (ImageView) findViewById(R.id.lineh3);
            lineh3.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a1 == 1 && a5 == 1 && a9 == 1) {
            Toast.makeText(this, "Blue is winner", Toast.LENGTH_LONG).show();
            ImageView diagonal = (ImageView) findViewById(R.id.diagonal);
            diagonal.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a3 == 1 && a5 == 1 && a7 == 1) {
            Toast.makeText(this, "Blue is winner", Toast.LENGTH_LONG).show();
            ImageView off_diagonal = (ImageView) findViewById(R.id.off_diagonal);
            off_diagonal.animate().alpha(1).setDuration(100);
            stop();
        }

        if (a1 == 2 && a2 == 2 && a3 == 2) {
            Toast.makeText(this, "Red is winner", Toast.LENGTH_LONG).show();
            ImageView linev1 = (ImageView) findViewById(R.id.linev1);
            linev1.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a4 == 2 && a5 == 2 && a6 == 2) {
            Toast.makeText(this, "Red is winner", Toast.LENGTH_LONG).show();
            ImageView linev2 = (ImageView) findViewById(R.id.linev2);
            linev2.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a7 == 2 && a8 == 2 && a9 == 2) {
            Toast.makeText(this, "Red is winner", Toast.LENGTH_LONG).show();
            ImageView linev3 = (ImageView) findViewById(R.id.linev3);
            linev3.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a1 == 2 && a4 == 2 && a7 == 2) {
            Toast.makeText(this, "Red is winner", Toast.LENGTH_LONG).show();
            ImageView lineh1 = (ImageView) findViewById(R.id.lineh1);
            lineh1.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a2 == 2 && a5 == 2 && a8 == 2) {
            Toast.makeText(this, "Red is winner", Toast.LENGTH_LONG).show();
            ImageView lineh2 = (ImageView) findViewById(R.id.lineh2);
            lineh2.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a3 == 2 && a6 == 2 && a9 == 2) {
            Toast.makeText(this, "Red is winner", Toast.LENGTH_LONG).show();
            ImageView lineh3 = (ImageView) findViewById(R.id.lineh3);
            lineh3.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a1 == 2 && a5 == 2 && a9 == 2) {
            Toast.makeText(this, "Red is winner", Toast.LENGTH_LONG).show();
            ImageView diagonal = (ImageView) findViewById(R.id.diagonal);
            diagonal.animate().alpha(1).setDuration(100);
            stop();
        }
        if (a3 == 2 && a5 == 2 && a7 == 2) {
            Toast.makeText(this, "Red is winner", Toast.LENGTH_LONG).show();
            ImageView off_diagonal = (ImageView) findViewById(R.id.off_diagonal);
            off_diagonal.animate().alpha(1).setDuration(100);
            stop();
        }

    }

    public void restart(View view) {

        player = true;

        click1 = true;
        click2 = true;
        click3 = true;
        click4 = true;
        click5 = true;
        click6 = true;
        click7 = true;
        click8 = true;
        click9 = true;

        a1 = 0;
        a2 = 0;
        a3 = 0;
        a4 = 0;
        a5 = 0;
        a6 = 0;
        a7 = 0;
        a8 = 0;
        a9 = 0;

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);

        imageView1.animate().alpha(0).setDuration(500);
        imageView2.animate().alpha(0).setDuration(500);
        imageView3.animate().alpha(0).setDuration(500);
        imageView4.animate().alpha(0).setDuration(500);
        imageView5.animate().alpha(0).setDuration(500);
        imageView6.animate().alpha(0).setDuration(500);
        imageView7.animate().alpha(0).setDuration(500);
        imageView8.animate().alpha(0).setDuration(500);
        imageView9.animate().alpha(0).setDuration(500);
        imageView10.animate().alpha(0).setDuration(500);
        imageView11.animate().alpha(0).setDuration(500);
        imageView12.animate().alpha(0).setDuration(500);
        imageView13.animate().alpha(0).setDuration(500);
        imageView14.animate().alpha(0).setDuration(500);
        imageView15.animate().alpha(0).setDuration(500);
        imageView16.animate().alpha(0).setDuration(500);
        imageView17.animate().alpha(0).setDuration(500);
        imageView18.animate().alpha(0).setDuration(500);

        ImageView linev1 = (ImageView) findViewById(R.id.linev1);
        ImageView linev2 = (ImageView) findViewById(R.id.linev2);
        ImageView linev3 = (ImageView) findViewById(R.id.linev3);
        ImageView lineh1 = (ImageView) findViewById(R.id.lineh1);
        ImageView lineh2 = (ImageView) findViewById(R.id.lineh2);
        ImageView lineh3 = (ImageView) findViewById(R.id.lineh3);
        ImageView diagonal = (ImageView) findViewById(R.id.diagonal);
        ImageView off_diagonal = (ImageView) findViewById(R.id.off_diagonal);

        linev1.animate().alpha(0).setDuration(500);
        linev2.animate().alpha(0).setDuration(500);
        linev3.animate().alpha(0).setDuration(500);
        lineh1.animate().alpha(0).setDuration(500);
        lineh2.animate().alpha(0).setDuration(500);
        lineh3.animate().alpha(0).setDuration(500);
        diagonal.animate().alpha(0).setDuration(500);
        off_diagonal.animate().alpha(0).setDuration(500);

    }

    public void click1(View view) {
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        if (click1) {
            if (player) {
                imageView1.animate().alpha(1).setDuration(100);
                imageView10.animate().alpha(0).setDuration(100);
                a1 = 1;
                player = false;
            }
            else {
                imageView1.animate().alpha(0).setDuration(100);
                imageView10.animate().alpha(1).setDuration(100);
                a1 = 2;
                player = true;
            }
            click1 = false;
            win();
        }
    }
    public void click2(View view) {
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        if (click2) {
            if (player) {
                imageView2.animate().alpha(1).setDuration(100);
                imageView11.animate().alpha(0).setDuration(100);
                a2 = 1;
                player = false;
            }
            else {
                imageView2.animate().alpha(0).setDuration(100);
                imageView11.animate().alpha(1).setDuration(100);
                a2 = 2;
                player = true;
            }
            click2 = false;
            win();
        }
    }
    public void click3(View view) {
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        if (click3) {
            if (player) {
                imageView3.animate().alpha(1).setDuration(100);
                imageView12.animate().alpha(0).setDuration(100);
                a3 = 1;
                player = false;
            }
            else {
                imageView3.animate().alpha(0).setDuration(100);
                imageView12.animate().alpha(1).setDuration(100);
                a3 = 2;
                player = true;
            }
            click3 = false;
            win();
        }
    }
    public void click4(View view) {
        ImageView imageView4= (ImageView) findViewById(R.id.imageView4);
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        if (click4) {
            if (player) {
                imageView4.animate().alpha(1).setDuration(100);
                imageView13.animate().alpha(0).setDuration(100);
                a4 = 1;
                player = false;
            }
            else {
                imageView4.animate().alpha(0).setDuration(100);
                imageView13.animate().alpha(1).setDuration(100);
                a4 = 2;
                player = true;
            }
            click4 = false;
            win();
        }
    }
    public void click5(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        if (click5) {
            if (player) {
                imageView5.animate().alpha(1).setDuration(100);
                imageView14.animate().alpha(0).setDuration(100);
                a5 = 1;
                player = false;
            }
            else {
                imageView5.animate().alpha(0).setDuration(100);
                imageView14.animate().alpha(1).setDuration(100);
                a5 = 2;
                player = true;
            }
            click5 = false;
            win();
        }
    }
    public void click6(View view) {
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        if (click6) {
            if (player) {
                imageView6.animate().alpha(1).setDuration(100);
                imageView15.animate().alpha(0).setDuration(100);
                a6 = 1;
                player = false;
            }
            else {
                imageView6.animate().alpha(0).setDuration(100);
                imageView15.animate().alpha(1).setDuration(100);
                a6 = 2;
                player = true;
            }
            click6 = false;
            win();
        }
    }
    public void click7(View view) {
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        if (click7) {
            if (player) {
                imageView7.animate().alpha(1).setDuration(100);
                imageView16.animate().alpha(0).setDuration(100);
                a7 = 1;
                player = false;
            }
            else {
                imageView7.animate().alpha(0).setDuration(100);
                imageView16.animate().alpha(1).setDuration(100);
                a7 = 2;
                player = true;
            }
            click7 = false;
            win();
        }
    }
    public void click8(View view) {
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        if (click8) {
            if (player) {
                imageView8.animate().alpha(1).setDuration(100);
                imageView17.animate().alpha(0).setDuration(100);
                a8 = 1;
                player = false;
            }
            else {
                imageView8.animate().alpha(0).setDuration(100);
                imageView17.animate().alpha(1).setDuration(100);
                a8 = 2;
                player = true;
            }
            click8 = false;
            win();
        }
    }
    public void click9(View view) {
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageView18= (ImageView) findViewById(R.id.imageView18);
        if (click9) {
            if (player) {
                imageView9.animate().alpha(1).setDuration(100);
                imageView18.animate().alpha(0).setDuration(100);
                a9 = 1;
                player = false;
            }
            else {
                imageView9.animate().alpha(0).setDuration(100);
                imageView18.animate().alpha(1).setDuration(100);
                a9 = 2;
                player = true;
            }
            click9 = false;
            win();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}