package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class eeesy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeesy);
    }
    public void eeef(View v){
        Intent i = new Intent(eeesy.this,first.class);
        startActivity(i);
    }
    public void eeel(View v){
        Intent i = new Intent(eeesy.this,eel.class);
        startActivity(i);

    }
}
