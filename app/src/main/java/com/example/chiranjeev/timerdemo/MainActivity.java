package com.example.chiranjeev.timerdemo;
/**
 * There are 2 ways to create a timer in Android
 * <p>
 * First way :
 * <p>
 * Step 1 : Create a handler object
 * Step 2 : Create a runnable object
 * Step 3 : In the run method of the runnable object , use the method postDelayed() of the handler object
 * The first parameter (this) put the context Runnable object into the function, the next paramter defines the
 * time interval to repeat the action in the run method
 * Step 4 : Now finally use the post() method of the handler object and pass in the runnable object into it ,
 * to start the execution of the runnable object
 * <p>
 *
 * Second Way :
 *
 * Step 1 :Define a  new object Countdown Timer , the mills in future parameter specifies how long will it be running
 * the countdown interval specifies at what interval the code would be repeated
 * the onTick() method has the code that will repepeat after the specified interval ,
 * the millsUntilFinished param gives the countdown in milliseconds from the countdown interval time
 * the onFinish() method contents are called when the millsInFuture time runs out and the onTick() method stops repeatedly executing,
 * and then finally start() the countdown Timer object
 */

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    // Second way :
        //Step 1:
        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("Counting dowm", "" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                Log.i("This process", "Ends now !!");
            }
        }.start();

/**    First Way :
 *
 *  Step 1:
 *     final Handler handler = new Handler();
 *
 *         Step 2:
 *         Runnable run = new Runnable() {
 *
 *        Step 3:
 *             @Override
 *             public void run() {
 *                 handler.postDelayed(this, 1000);
 *                 Log.i("Repeats:", "every second ");
 *             }
 *         };
 *
 *    Step 4 :
 *    handler.post(run);
 */


    }
}
