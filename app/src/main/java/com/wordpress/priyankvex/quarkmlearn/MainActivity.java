package com.wordpress.priyankvex.quarkmlearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    View mLayoutAssignments, mLayoutProgress, mLayoutReadings, mLayoutHelp, mLayoutAbout, mLayoutSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getViews();
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

    private void getViews(){
        mLayoutAssignments = findViewById(R.id.layoutAssignments);
        mLayoutProgress = findViewById(R.id.layoutProgress);
        mLayoutReadings = findViewById(R.id.layoutReadings);
        mLayoutHelp = findViewById(R.id.layoutHelp);
        mLayoutAbout = findViewById(R.id.layoutAbout);
        mLayoutSettings = findViewById(R.id.layoutSettings);
        mLayoutAssignments.setOnClickListener(this);
        mLayoutProgress.setOnClickListener(this);
        mLayoutReadings.setOnClickListener(this);
        mLayoutHelp.setOnClickListener(this);
        mLayoutAbout.setOnClickListener(this);
        mLayoutSettings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.layoutAssignments:
                // Open Assignments activity
                break;
            case R.id.layoutProgress:
                // Open Progress activity
                break;
            case R.id.layoutReadings:
                // Open Readings activity
                break;
            case R.id.layoutHelp:
                // Open Help activity
                break;
            case R.id.layoutAbout:
                // Open About activity
                break;
            case R.id.layoutSettings:
                // Open Settings activity
                break;
        }
    }
}
