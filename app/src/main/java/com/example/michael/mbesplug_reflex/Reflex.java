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

/* The main activity of the app; contains main menu */

package com.example.michael.mbesplug_reflex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Reflex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflex);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reflex, menu);
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

    /** Called when the user clicks the Reaction Timer button */
    public void reactionMode(View view) {
        Intent intent = new Intent(this, PreBuzzReactionBuzzerActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Game Show Buzzers button */
    public void buzzersMode(View view) {
        Intent intent = new Intent(this, PlayerCountActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the View Stats button */
    public void statsMode(View view) {
        Intent intent = new Intent(this, DisplayStatsActivity.class);
        startActivity(intent);
    }
}
