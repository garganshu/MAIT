package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class seconds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconds);
    }

    public void cses(View v){

        Intent intent = new Intent(seconds.this,cse2.class);
        startActivity(intent);
    }
    public void its(View v){

        Intent intent = new Intent(seconds.this,cse2.class);
        startActivity(intent);
    }
}
