package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ecesy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecesy);
    }
    public void ecef(View v){
        Intent i = new Intent(ecesy.this,first.class);
        startActivity(i);
    }
    public void ecel(View v){
        Intent i = new Intent(ecesy.this,ecl.class);
        startActivity(i);

    }
}
