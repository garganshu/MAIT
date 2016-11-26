package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sylla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylla);
        setTitle("SYLLABUS");
    }
    public void comp(View v){

        Intent intent = new Intent(sylla.this,csesy.class);
        startActivity(intent);
    }
    public void info(View v){

        Intent intent = new Intent(sylla.this,itsy.class);
        startActivity(intent);
    }
    public void mech(View v){

        Intent intent = new Intent(sylla.this,maesy.class);
        startActivity(intent);
    }
    public void elec(View v){

        Intent intent = new Intent(sylla.this,ecesy.class);
        startActivity(intent);
    }
    public void eelec(View v){

        Intent intent = new Intent(sylla.this,eeesy.class);
        startActivity(intent);
    }


}
