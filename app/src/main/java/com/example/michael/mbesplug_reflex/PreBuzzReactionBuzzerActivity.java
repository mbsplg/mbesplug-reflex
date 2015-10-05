/*
Copyright 2015 Michael Besplug

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.example.michael.mbesplug_reflex;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Timer;
import java.util.Random;
import java.util.TimerTask;

public class PreBuzzReactionBuzzerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_buzz_reaction_buzzer);

        DialogFragment newFragment = new ReactionInstructionsDialog();
        newFragment.show(getSupportFragmentManager(), "1p_mode_instructions");
        /*
        Random rand = new Random();
        int max = 2000;
        int min = 1000;
        int delay = rand.nextInt((max - min) + 1) + max;

        Timer timer = new Timer();
        Timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(this, BuzzReactionBuzzerActivity.class);
                startActivity(intent);
            }
        }, delay); */


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pre_buzz_reaction_buzzer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
