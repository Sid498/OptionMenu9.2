package com.example.sid.optionmenu92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//Adding menu programatically
        menu.add(1,1,0,"Computer");
        menu.add(1,2,1,"Gamepad");
        menu.add(1,3,2,"Camera");
        menu.add(1,4,3,"Video");
        menu.add(1,5,4,"Email");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //getting  ID and using id applying switch case to hanndle click on every item
        switch (item.getItemId()){

            case 1:
                Toast.makeText(this,"Computer Clicked ",Toast.LENGTH_SHORT).show();
                break;

            case 2:
                Toast.makeText(this,"Gamepad Clicked ",Toast.LENGTH_SHORT).show();
                break;

            case 3:
                Toast.makeText(this,"Camera Clicked ",Toast.LENGTH_SHORT).show();
                break;

            case 4:
                Toast.makeText(this,"Video Clicked ",Toast.LENGTH_SHORT).show();
                break;

            case 5:
                Toast.makeText(this,"Email Clicked ",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
