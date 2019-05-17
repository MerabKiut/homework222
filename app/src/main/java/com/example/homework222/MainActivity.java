package com.example.homework222;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case (R.id.action_open_notes):
                Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();
                Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
                MainActivity.this.startActivity(intentNotes);
                return true;
            case (R.id.action_open_spinner):
                Toast.makeText(MainActivity.this, "Отркыть спиннер", Toast.LENGTH_LONG).show();
                Intent intentSpinner = new Intent(MainActivity.this, SpinnerActivity.class);
                MainActivity.this.startActivity(intentSpinner);
                return true;
            case (R.id.action_open_calendar):
                Toast.makeText(MainActivity.this, "Отркыть спиннер", Toast.LENGTH_LONG).show();
                Intent intentCalendar = new Intent(MainActivity.this, CalendarActivity.class);
                MainActivity.this.startActivity(intentCalendar);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
