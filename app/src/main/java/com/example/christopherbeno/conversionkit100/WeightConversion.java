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
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Spinner;

public class WeightConversion extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_conversion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Loading Main Menu...", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                startActivity(new Intent(WeightConversion.this,MainMenu.class));
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
/*
    public void Pounds2Kilograms (View v){

        double PtoKG_convert;
        String PtoKG_final;
        EditText PtoKG_Input = (EditText) findViewById(R.id.Pounds2Kilograms_Textfield);
        String oldnum = PtoKG_Input.getText().toString();

        if(PtoKG_Input.length()== 0){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else{
            PtoKG_convert = Double.parseDouble(PtoKG_Input.getText().toString());
            PtoKG_convert = PtoKG_convert * 0.4535924;
            PtoKG_final = Double.toString(PtoKG_convert);
            ((TextView) findViewById(R.id.Result)).setText(oldnum + " lbs" + " = " + PtoKG_final + " kg");
            ((EditText) findViewById(R.id.Pounds2Kilograms_Textfield)).setText("");
        }

    }

    public void Kilograms2Pounds (View v){

        double KGtoP_convert;
        String KGtoP_final;
        EditText KGtoP_Input = (EditText) findViewById(R.id.Kilograms2Pounds_Textfield);
        String oldnum = KGtoP_Input.getText().toString();

        if(KGtoP_Input.length()== 0){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else{
            KGtoP_convert = Double.parseDouble(KGtoP_Input.getText().toString());
            KGtoP_convert = KGtoP_convert * 2.204623;
            KGtoP_final = Double.toString(KGtoP_convert);
            ((TextView) findViewById(R.id.Result)).setText(oldnum + " kg" + " = " + KGtoP_final + " lbs");
            ((EditText) findViewById(R.id.Kilograms2Pounds_Textfield)).setText("");
        }

    }
*/
    public void Weight_Convert (View v){
        hideSoftKeyboard(this);

        double weight_PtoKG_convert, weight_PtoST_convert, weight_PtoG_convert, weight_PtoO_convert, weight_PtoT_convert, weight_PtoMT_convert;

        double weight_KGtoP_convert, weight_KGtoST_convert, weight_KGtoG_convert, weight_KGtoO_convert, weight_KGtoT_convert, weight_KGtoMT_convert;

        double weight_STtoP_convert, weight_STtoKG_convert, weight_STtoG_convert, weight_STtoO_convert, weight_STtoT_convert, weight_STtoMT_convert;

        double weight_GtoP_convert, weight_GtoKG_convert, weight_GtoST_convert, weight_GtoO_convert, weight_GtoT_convert, weight_GtoMT_convert;

        double weight_OtoP_convert, weight_OtoKG_convert, weight_OtoST_convert, weight_OtoG_convert, weight_OtoT_convert, weight_OtoMT_convert;

        double weight_TtoP_convert, weight_TtoKG_convert, weight_TtoST_convert, weight_TtoG_convert, weight_TtoO_convert, weight_TtoMT_convert;

        double weight_MTtoP_convert, weight_MTtoKG_convert, weight_MTtoST_convert, weight_MTtoG_convert, weight_MTtoT_convert, weight_MTtoO_convert;

        String weight_PtoKG_final, weight_PtoST_final, weight_PtoG_final, weight_PtoO_final, weight_PtoT_final, weight_PtoMT_final;

        String weight_KGtoP_final, weight_KGtoST_final, weight_KGtoG_final, weight_KGtoO_final, weight_KGtoT_final, weight_KGtoMT_final;

        String weight_STtoP_final, weight_STtoKG_final, weight_STtoG_final, weight_STtoO_final, weight_STtoT_final, weight_STtoMT_final;

        String weight_GtoP_final, weight_GtoKG_final, weight_GtoST_final, weight_GtoO_final, weight_GtoT_final, weight_GtoMT_final;

        String weight_OtoP_final, weight_OtoKG_final, weight_OtoST_final, weight_OtoG_final, weight_OtoT_final, weight_OtoMT_final;

        String weight_TtoP_final, weight_TtoKG_final, weight_TtoST_final, weight_TtoG_final, weight_TtoO_final, weight_TtoMT_final;

        String weight_MTtoP_final, weight_MTtoKG_final, weight_MTtoST_final, weight_MTtoG_final, weight_MTtoT_final, weight_MTtoO_final;

        EditText weight_input = (EditText) findViewById(R.id.weight_input);
        Spinner weight_type = (Spinner) findViewById(R.id.weight_spinner);
        String weight_type_string = weight_type.getSelectedItem().toString();
        String oldnum = weight_input.getText().toString();


        if(weight_input.length()==0){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else{
            switch(weight_type_string){
                case "Pounds (lbs)":
                    weight_PtoKG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_PtoKG_convert = weight_PtoKG_convert * 0.4535924;
                    weight_PtoKG_final = Double.toString(weight_PtoKG_convert);

                    weight_PtoST_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_PtoST_convert = weight_PtoST_convert * 0.07142857;
                    weight_PtoST_final = Double.toString(weight_PtoST_convert);

                    weight_PtoG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_PtoG_convert = weight_PtoG_convert * 453.5924;
                    weight_PtoG_final = Double.toString(weight_PtoG_convert);

                    weight_PtoO_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_PtoO_convert = weight_PtoO_convert * 16;
                    weight_PtoO_final = Double.toString(weight_PtoO_convert);

                    weight_PtoT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_PtoT_convert = weight_PtoT_convert * 0.0005;
                    weight_PtoT_final = Double.toString(weight_PtoT_convert);

                    weight_PtoMT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_PtoMT_convert = weight_PtoMT_convert * 0.0004535924;
                    weight_PtoMT_final = Double.toString(weight_PtoMT_convert);


                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " lbs" + " = " + weight_PtoKG_final + " kg\n" +
                            oldnum + " lbs" + " = " + weight_PtoST_final + " st\n" +
                            oldnum + " lbs" + " = " + weight_PtoG_final + " g\n" +
                            oldnum + " lbs" + " = " + weight_PtoO_final + " oz\n" +
                            oldnum + " lbs" + " = " + weight_PtoT_final + " tons\n" +
                            oldnum + " lbs" + " = " + weight_PtoMT_final + " metric tons");
                    ((EditText) findViewById(R.id.weight_input)).setText("");
                break;
                case "Kilograms (kg)":
                    weight_KGtoP_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_KGtoP_convert = weight_KGtoP_convert * 2.204623;
                    weight_KGtoP_final = Double.toString(weight_KGtoP_convert);

                    weight_KGtoST_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_KGtoST_convert = weight_KGtoST_convert * 0.157473;
                    weight_KGtoST_final = Double.toString(weight_KGtoST_convert);

                    weight_KGtoG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_KGtoG_convert = weight_KGtoG_convert * 1000;
                    weight_KGtoG_final = Double.toString(weight_KGtoG_convert);

                    weight_KGtoO_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_KGtoO_convert = weight_KGtoO_convert * 35.27396;
                    weight_KGtoO_final = Double.toString(weight_KGtoO_convert);

                    weight_KGtoT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_KGtoT_convert = weight_KGtoT_convert * 0.001102311;
                    weight_KGtoT_final = Double.toString(weight_KGtoT_convert);

                    weight_KGtoMT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_KGtoMT_convert = weight_KGtoMT_convert * 0.001;
                    weight_KGtoMT_final = Double.toString(weight_KGtoMT_convert);

                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " kg" + " = " + weight_KGtoP_final + " lbs\n" +
                            oldnum + " kg" + " = " + weight_KGtoST_final + " st\n" +
                            oldnum + " kg" + " = " + weight_KGtoG_final + " g\n" +
                            oldnum + " kg" + " = " + weight_KGtoO_final + " oz\n" +
                            oldnum + " kg" + " = " + weight_KGtoT_final + " tons\n" +
                            oldnum + " kg" + " = " + weight_KGtoMT_final + " metric tons");
                    ((EditText) findViewById(R.id.weight_input)).setText("");
                break;
                case "Stone (UK)":
                    weight_STtoP_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_STtoP_convert = weight_STtoP_convert * 14;
                    weight_STtoP_final = Double.toString(weight_STtoP_convert);

                    weight_STtoKG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_STtoKG_convert = weight_STtoKG_convert * 6.350293;
                    weight_STtoKG_final = Double.toString(weight_STtoKG_convert);

                    weight_STtoG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_STtoG_convert = weight_STtoG_convert * 6350.293;
                    weight_STtoG_final = Double.toString(weight_STtoG_convert);

                    weight_STtoO_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_STtoO_convert = weight_STtoO_convert * 224;
                    weight_STtoO_final = Double.toString(weight_STtoO_convert);

                    weight_STtoT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_STtoT_convert = weight_STtoT_convert * 0.007;
                    weight_STtoT_final = Double.toString(weight_STtoT_convert);

                    weight_STtoMT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_STtoMT_convert = weight_STtoMT_convert * 0.006350293;
                    weight_STtoMT_final = Double.toString(weight_STtoMT_convert);

                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " st" + " = " + weight_STtoP_final + " lbs\n" +
                            oldnum + " st" + " = " + weight_STtoKG_final + " kg\n" +
                            oldnum + " st" + " = " + weight_STtoG_final + " g\n" +
                            oldnum + " st" + " = " + weight_STtoO_final + " oz\n" +
                            oldnum + " st" + " = " + weight_STtoT_final + " tons\n" +
                            oldnum + " st" + " = " + weight_STtoMT_final + " metric tons");

                    ((EditText) findViewById(R.id.weight_input)).setText("");
                break;
                case "Grams (g)":
                    weight_GtoP_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_GtoP_convert = weight_GtoP_convert * 0.002204623;
                    weight_GtoP_final = Double.toString(weight_GtoP_convert);

                    weight_GtoKG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_GtoKG_convert = weight_GtoKG_convert * 0.001;
                    weight_GtoKG_final = Double.toString(weight_GtoKG_convert);

                    weight_GtoST_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_GtoST_convert = weight_GtoST_convert * 0.000157473;
                    weight_GtoST_final = Double.toString(weight_GtoST_convert);

                    weight_GtoO_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_GtoO_convert = weight_GtoO_convert * 0.03527396;
                    weight_GtoO_final = Double.toString(weight_GtoO_convert);

                    weight_GtoT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_GtoT_convert = weight_GtoT_convert * 0.000001102311;
                    weight_GtoT_final = Double.toString(weight_GtoT_convert);

                    weight_GtoMT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_GtoMT_convert = weight_GtoMT_convert * 0.000001;
                    weight_GtoMT_final = Double.toString(weight_GtoMT_convert);

                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " g" + " = " + weight_GtoP_final + " lbs\n" +
                            oldnum + " g" + " = " + weight_GtoKG_final + " kg\n" +
                            oldnum + " g" + " = " + weight_GtoST_final + " st\n" +
                            oldnum + " g" + " = " + weight_GtoO_final + " oz\n" +
                            oldnum + " g" + " = " + weight_GtoT_final + " tons\n" +
                            oldnum + " g" + " = " + weight_GtoMT_final + " metric tons");
                    ((EditText) findViewById(R.id.weight_input)).setText("");
                break;
                case "Ounces (oz)":
                    weight_OtoP_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_OtoP_convert = weight_OtoP_convert * 0.0625;
                    weight_OtoP_final = Double.toString(weight_OtoP_convert);

                    weight_OtoKG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_OtoKG_convert = weight_OtoKG_convert * 0.02834952;
                    weight_OtoKG_final = Double.toString(weight_OtoKG_convert);

                    weight_OtoST_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_OtoST_convert = weight_OtoST_convert * 0.004464286;
                    weight_OtoST_final = Double.toString(weight_OtoST_convert);

                    weight_OtoG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_OtoG_convert = weight_OtoG_convert * 28.34952;
                    weight_OtoG_final = Double.toString(weight_OtoG_convert);

                    weight_OtoT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_OtoT_convert = weight_OtoT_convert * 0.00003125;
                    weight_OtoT_final = Double.toString(weight_OtoT_convert);

                    weight_OtoMT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_OtoMT_convert = weight_OtoMT_convert * 0.00002834952;
                    weight_OtoMT_final = Double.toString(weight_OtoMT_convert);

                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " oz" + " = " + weight_OtoP_final + " lbs\n" +
                            oldnum + " oz" + " = " + weight_OtoKG_final + " kg\n" +
                            oldnum + " oz" + " = " + weight_OtoST_final + " st\n" +
                            oldnum + " oz" + " = " + weight_OtoG_final + " g\n" +
                            oldnum + " oz" + " = " + weight_OtoT_final + " tons\n" +
                            oldnum + " oz" + " = " + weight_OtoMT_final + " metric tons");
                    ((EditText) findViewById(R.id.weight_input)).setText("");
                    break;
                case "Tons (US)":
                    weight_TtoP_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_TtoP_convert = weight_TtoP_convert * 2000;
                    weight_TtoP_final = Double.toString(weight_TtoP_convert);

                    weight_TtoKG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_TtoKG_convert = weight_TtoKG_convert * 907.1847;
                    weight_TtoKG_final = Double.toString(weight_TtoKG_convert);

                    weight_TtoST_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_TtoST_convert = weight_TtoST_convert * 142.8571;
                    weight_TtoST_final = Double.toString(weight_TtoST_convert);

                    weight_TtoG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_TtoG_convert = weight_TtoG_convert * 907184.7;
                    weight_TtoG_final = Double.toString(weight_TtoG_convert);

                    weight_TtoO_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_TtoO_convert = weight_TtoO_convert * 32000;
                    weight_TtoO_final = Double.toString(weight_TtoO_convert);

                    weight_TtoMT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_TtoMT_convert = weight_TtoMT_convert * 0.9071847;
                    weight_TtoMT_final = Double.toString(weight_TtoMT_convert);

                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " tons" + " = " + weight_TtoP_final + " lbs\n" +
                            oldnum + " tons" + " = " + weight_TtoKG_final + " kg\n" +
                            oldnum + " tons" + " = " + weight_TtoST_final + " st\n" +
                            oldnum + " tons" + " = " + weight_TtoG_final + " g\n" +
                            oldnum + " tons" + " = " + weight_TtoO_final + " oz\n" +
                            oldnum + " tons" + " = " + weight_TtoMT_final + " metric tons");
                    ((EditText) findViewById(R.id.weight_input)).setText("");
                    break;
                case "Metric Tons":
                    weight_MTtoP_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_MTtoP_convert = weight_MTtoP_convert * 2204.623;
                    weight_MTtoP_final = Double.toString(weight_MTtoP_convert);

                    weight_MTtoKG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_MTtoKG_convert = weight_MTtoKG_convert * 1000;
                    weight_MTtoKG_final = Double.toString(weight_MTtoKG_convert);

                    weight_MTtoST_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_MTtoST_convert = weight_MTtoST_convert * 157.473;
                    weight_MTtoST_final = Double.toString(weight_MTtoST_convert);

                    weight_MTtoG_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_MTtoG_convert = weight_MTtoG_convert * 1000000;
                    weight_MTtoG_final = Double.toString(weight_MTtoG_convert);

                    weight_MTtoO_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_MTtoO_convert = weight_MTtoO_convert * 35273.96;
                    weight_MTtoO_final = Double.toString(weight_MTtoO_convert);

                    weight_MTtoT_convert = Double.parseDouble(weight_input.getText().toString());
                    weight_MTtoT_convert = weight_MTtoT_convert * 1.102311;
                    weight_MTtoT_final = Double.toString(weight_MTtoT_convert);

                    ((TextView) findViewById(R.id.Result)).setText(oldnum + " tonnes" + " = " + weight_MTtoP_final + " lbs\n" +
                            oldnum + " tonnes" + " = " + weight_MTtoKG_final + " kg\n" +
                            oldnum + " tonnes" + " = " + weight_MTtoST_final + " st\n" +
                            oldnum + " tonnes" + " = " + weight_MTtoG_final + " g\n" +
                            oldnum + " tonnes" + " = " + weight_MTtoO_final + " oz\n" +
                            oldnum + " tonnes" + " = " + weight_MTtoT_final + " tons");
                    ((EditText) findViewById(R.id.weight_input)).setText("");
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
        getMenuInflater().inflate(R.menu.weight_conversion, menu);
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
        } else if (id == R.id.nav_temp) {
            startActivity(new Intent(WeightConversion.this,TemperatureConversion.class));

        } else if (id == R.id.nav_distance) {

        } else if (id == R.id.nav_main_menu) {
            startActivity(new Intent(WeightConversion.this,MainMenu.class));

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
