package in.MAIT;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText ed,pass,branch,year,name;
    String user,password,nam,bran,yr;
    boolean log = false;
    String a=null,b=null,c=null,d=null,e=null;
    boolean t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("LOGIN");
        SharedPreferences sp = getSharedPreferences("login",
                Activity.MODE_PRIVATE);
        log = sp.getBoolean("state",false);
        Log.d("logincheck",""+log);

        ed = (EditText) findViewById(R.id.e);
        pass = (EditText) findViewById(R.id.pas);
        name = (EditText) findViewById(R.id.name);
        branch = (EditText) findViewById(R.id.branch);
        year = (EditText) findViewById(R.id.year);
        check();


    }
    @Override
    public void onBackPressed() {

        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    public void shared(){
        // editor.putBoolean("key_name1", true);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("key1", user);
        editor.putString("key2", password);
        editor.putString("key3", nam);
        editor.putString("key4", bran);
        editor.putString("key5", yr);
        editor.commit();

        /*Log.i("check the value s1 :",""+user);
        Log.i("check the value s2 :",""+password);*/



    }

    public void put(){
        // userFirstLogin= pref.getBoolean("key_name1", true);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
       /* editor.clear();
        editor.commit();*/
        a=pref.getString("key1",user);
        b=pref.getString("key2",password);
        c=pref.getString("key3",nam);
        d=pref.getString("key4",bran);
        e=pref.getString("key5",yr);


        Log.d("check the value a :",""+a);
        Log.d("check the value b :",""+b);

    }
    public boolean one(){
        if(nam.length()==0) {
            name.setError("*Required Field");
            return false;
        }

        if(user.length()==0) {
            ed.setError("*Enter a valid email");
            return false;
        }
        if(bran.length()==0) {
            branch.setError("*Required Field");
            return false;
        }

        if(yr.length()==0) {
            year.setError("*Required Field");
            return false;
        }

        if(password.length()==0) {
            pass.setError("*Required Field");
            return false;
        }

        return true;

    }
    public void check(){

        if(log == true) {

            Toast.makeText(this, "Logging In", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(login.this, navigation.class);
            startActivity(i);
        }
    }
    public void login(View v){

        user=ed.getText().toString();
        password=pass.getText().toString();
        nam=name.getText().toString();
        bran=branch.getText().toString();
        yr=year.getText().toString();
        t=one();

        shared();

        if(t==true) {
            Toast.makeText(this, "Welcome User ", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(login.this, navigation.class);
            startActivity(i);
        }else
        {
            Toast.makeText(this, "Fill up the Form ", Toast.LENGTH_SHORT).show();
        }
    }
}
