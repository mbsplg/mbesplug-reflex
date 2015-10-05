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

/* Activity that displays three buzzers for three players */

package com.example.michael.mbesplug_reflex;

import java.util.Timer;
import java.util.TimerTask;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class PlayerActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_player_activity3, menu);
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

    public void p3_player1_clicked (View view) {
        DialogFragment newFragment = new Player1Dialog();
        newFragment.show(getSupportFragmentManager(), "3p_mode_player1");
    }

    public void p3_player2_clicked (View view) {
        DialogFragment newFragment = new Player2Dialog();
        newFragment.show(getSupportFragmentManager(), "3p_mode_player2");
    }

    public void p3_player3_clicked (View view) {
        DialogFragment newFragment = new Player3Dialog();
        newFragment.show(getSupportFragmentManager(), "3p_mode_player3");
    }

}
