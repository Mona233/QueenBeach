package com.example.qbrapp.qbr;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;


public class MainActivity extends Activity {

//main activity with image buttons in it
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound);
        mediaPlayer.start();

        /**getActionBar().setDisplayShowHomeEnabled(true);
        getActionBar().setIcon(R.mipmap.ic_launcher);**/

        configureImageButtonAbout();
        configureImageButtonBook();
        configureImageButtonContact();
        configureImageButtonLocation();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

//button about calling its class/view
    private void configureImageButtonAbout(){
        ImageButton btn = (ImageButton) findViewById(R.id.btnAbout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        MainActivity.this,
                        About.class
                );
                    startActivity(i);
            }
        });
    }

    //button book a date calling its class/view
    private void configureImageButtonBook(){
        ImageButton btn = (ImageButton) findViewById(R.id.btnBook);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        MainActivity.this,
                        Book.class
                );
                startActivity(i);
            }
        });
    }

    //button contact calling its class/view
    private void configureImageButtonContact(){
        ImageButton btn = (ImageButton) findViewById(R.id.btnContact);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        MainActivity.this,
                        Contact.class
                );
                startActivity(i);
            }
        });
    }

    //button location calling its class/view
    private void configureImageButtonLocation(){
        ImageButton btn = (ImageButton) findViewById(R.id.btnLocation);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        MainActivity.this,
                        Location.class
                );
                startActivity(i);
            }
        });
    }
}
