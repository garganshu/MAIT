package in.MAIT;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.icu.text.LocaleDisplayNames;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class feedback extends AppCompatActivity {
    Feedback_DbHelper fb_dbhlper;
    SQLiteDatabase sql_db;
    String sname,semail,sopinion,srating;


    EditText ename,eemail,opi,rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        setTitle("FEEDBACK FORM");

        ename=(EditText) findViewById(R.id.name);
        eemail=(EditText) findViewById(R.id.email);
        opi=(EditText) findViewById(R.id.opinion);
        rate=(EditText) findViewById(R.id.rating);
    }

    public Boolean feed(View v)
    {
        sname=ename.getText().toString();
        semail=eemail.getText().toString();
        sopinion=opi.getText().toString();
        srating=rate.getText().toString();


        if(sname.length()==0) {
            ename.setError("*Required Field");
            return false;
        }

        if(semail.length()==0) {
            eemail.setError("*Enter a valid email");
            return false;
        }

        if(sopinion.length()==0) {
            opi.setError("*Required Field");
            return false;
        }

        if(srating.length()==0) {
            rate.setError("*Required Field");
            return false;
        }


        DBHandler();

        return false;

    }

    public void DBHandler() {

        fb_dbhlper = new Feedback_DbHelper(this);
        sql_db = fb_dbhlper.getWritableDatabase();
        ContentValues value = new ContentValues();

        value.put(Feedback_DbHelper.KEY_NAME, sname);

        value.put(Feedback_DbHelper.KEY_EMAIL, semail);

        value.put(Feedback_DbHelper.KEY_OPINION, sopinion);

        value.put(Feedback_DbHelper.KEY_RATING, srating);


        sql_db.insert(Feedback_DbHelper.TABLE_Feedback, "1", value);
        Toast.makeText(getApplicationContext(), "Store Successfull ",
                Toast.LENGTH_LONG).show();

    }


    public void Result(View v)
    {
        Intent i=new Intent(this,feedback2.class);
        startActivity(i);
    }


}
