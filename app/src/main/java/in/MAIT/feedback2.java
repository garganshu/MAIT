package in.MAIT;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class feedback2 extends AppCompatActivity {


    Feedback_DbHelper fb_dbhlper;
    SQLiteDatabase sql_db;
    Cursor mCursor2;

    TextView tx_name,tx_email,tx_opinion,tx_rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback2);
        setTitle("SUBMISSION");

        tx_name=(TextView) findViewById(R.id.txtname);

        tx_email=(TextView) findViewById(R.id.txtemail);

        tx_opinion=(TextView) findViewById(R.id.txtopinion);

        tx_rating=(TextView) findViewById(R.id.txtrating);


        fb_dbhlper=new Feedback_DbHelper(this);
        sql_db=fb_dbhlper.getWritableDatabase();

        mCursor2 = sql_db.rawQuery("SELECT * FROM "
                + Feedback_DbHelper.TABLE_Feedback, null);

        if (mCursor2.moveToFirst()) {
            do {
                String  fname = mCursor2.getString(mCursor2
                        .getColumnIndex(Feedback_DbHelper.KEY_NAME));

                String  femail = mCursor2.getString(mCursor2
                        .getColumnIndex(Feedback_DbHelper.KEY_EMAIL));

                String  fopinion = mCursor2.getString(mCursor2
                        .getColumnIndex(Feedback_DbHelper.KEY_OPINION));

                String  frating = mCursor2.getString(mCursor2
                        .getColumnIndex(Feedback_DbHelper.KEY_RATING));



                tx_name.setText("Name : "+fname);

                tx_email.setText("Email : "+femail);

                tx_opinion.setText("Suggestion : "+fopinion);

                tx_rating.setText("Rating : "+frating);


            } while (mCursor2.moveToNext());



        }
        sql_db.close();

    }
}