package com.example.christopherbeno.conversionkit100;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TemperatureConversion extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_conversion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Loading Main Menu...", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                startActivity(new Intent(TemperatureConversion.this,MainMenu.class));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(
                        Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(
                activity.getCurrentFocus().getWindowToken(), 0);
    }


    public void Temperature_Convert (View v){
        hideSoftKeyboard(this);
        double temp_FtoC_convert, temp_FtoK_convert ;
        double temp_CtoF_convert, temp_CtoK_convert ;
        double temp_KtoF_convert, temp_KtoC_convert ;

        String temp_FtoC_final, temp_FtoK_final ;
        String temp_CtoF_final, temp_CtoK_final ;
        String temp_KtoF_final, temp_KtoC_final ;

        EditText temp_input = (EditText) findViewById(R.id.temp_input);
        Spinner temp_type = (Spinner) findViewById(R.id.temp_spinner);
        String temp_type_string = temp_type.getSelectedItem().toString();
        String oldnum = temp_input.getText().toString();

        if(temp_input.length()==0){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else{
            switch(temp_type_string){
                case "Fahrenheit (F°)":
                    temp_FtoC_convert = Double.parseDouble(temp_input.getText().toString());
                    temp_FtoC_convert = (temp_FtoC_convert - 32) / 1.8;
                    temp_FtoC_final = Double.toString(temp_FtoC_convert);

                    temp_FtoK_convert = Double.parseDouble(temp_input.getText().toString());
                    temp_FtoK_convert = (temp_FtoK_convert + 459.67) * 0.55555555556;
                    temp_FtoK_final = Double.toString(temp_FtoK_convert);

                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " F°" + " = " + temp_FtoC_final + " C°\n" +
                            oldnum + " F°" + " = " + temp_FtoK_final + " K") ;
                    ((EditText) findViewById(R.id.temp_input)).setText("");
                    break;
                case "Celsius (C°)":
                    temp_CtoF_convert = Double.parseDouble(temp_input.getText().toString());
                    temp_CtoF_convert = (temp_CtoF_convert * 1.8) + 32;
                    temp_CtoF_final = Double.toString(temp_CtoF_convert);

                    temp_CtoK_convert = Double.parseDouble(temp_input.getText().toString());
                    temp_CtoK_convert = temp_CtoK_convert + 273.15;
                    temp_CtoK_final = Double.toString(temp_CtoK_convert);

                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " C°" + " = " + temp_CtoF_final + " F°\n" +
                            oldnum + " C°" + " = " + temp_CtoK_final + " K") ;
                    ((EditText) findViewById(R.id.temp_input)).setText("");
                    break;

                case "Kelvin (K)":
                    temp_KtoF_convert = Double.parseDouble(temp_input.getText().toString());
                    temp_KtoF_convert = (temp_KtoF_convert * 1.8) - 459.67;
                    temp_KtoF_final = Double.toString(temp_KtoF_convert);

                    temp_KtoC_convert = Double.parseDouble(temp_input.getText().toString());
                    temp_KtoC_convert = temp_KtoC_convert - 273.15;
                    temp_KtoC_final = Double.toString(temp_KtoC_convert);

                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " K" + " = " + temp_KtoF_final + " F°\n" +
                            oldnum + " K" + " = " + temp_KtoC_final + " C°") ;
                    ((EditText) findViewById(R.id.temp_input)).setText("");
                    break;
            }

        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.temperature_conversion, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_weight) {
            // Handle the camera action
            startActivity(new Intent(TemperatureConversion.this,WeightConversion.class));
        } else if (id == R.id.nav_temp) {

        } else if (id == R.id.nav_distance) {

        } else if (id == R.id.nav_main_menu) {
            startActivity(new Intent(TemperatureConversion.this,MainMenu.class));

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
