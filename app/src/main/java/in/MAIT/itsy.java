package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class itsy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itsy);
    }
    public void itf(View v){
        Intent i = new Intent(itsy.this,first.class);
        startActivity(i);
    }
    public void itl(View v){
        Intent i = new Intent(itsy.this,il.class);
        startActivity(i);

    }
}
