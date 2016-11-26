package in.MAIT;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    int backpress=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("HOME");
        setContentView(R.layout.activity_navigation);
        bool();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    public void notice(View v){
        Intent i=new Intent(navigation.this,noti.class);
        startActivity(i);

    }
    public void syllabus(View v){
        Intent i=new Intent(navigation.this,sylla.class);
        startActivity(i);

    }
    public void books(View v){
        Intent intent = new Intent(navigation.this,yearlybooks.class);
        startActivity(intent);

    }
    public void resul (View v){
        Intent i=new Intent(navigation.this,result.class);
        startActivity(i);

    }
    public void bool(){
        SharedPreferences sp = getApplicationContext().getSharedPreferences("login", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("state", true);
        editor.commit();
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            backpress = (backpress + 1);
            if(backpress==1) {
                Toast.makeText(getApplicationContext(), " Press Back again to Exit ", Toast.LENGTH_SHORT).show();
            }

            if (backpress>1) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
   /* public boolean onPrepareOptionsMenu(Menu menu) {

        menu.findItem(R.id.sign).setTitle(ed.getText().toString());

        return true;
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();



         if (id == R.id.location) {
             Intent i =new Intent (this, location1.class);
             startActivity(i);

        } else if (id == R.id.contact) {
            Intent i =new Intent (this, contact.class);
            startActivity(i);

        } else if (id == R.id.logout) {
             SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
             pref.edit().clear().commit();

             SharedPreferences sp = getApplicationContext().getSharedPreferences("login", Context.MODE_PRIVATE);
             SharedPreferences.Editor editor = sp.edit();
             editor.putBoolean("state", false);
             editor.commit();

             Intent i =new Intent (this, login.class);
             startActivity(i);

         } else if (id == R.id.help) {
            Intent i =new Intent (this, help.class);
            startActivity(i);

        } else if (id == R.id.feedback) {
            Intent i =new Intent (this, feedback.class);
            startActivity(i);


        } else if (id == R.id.About) {
            Intent i =new Intent (this, about.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
