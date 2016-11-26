package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class csesy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesy);
    }
    public void csef(View v){
        Intent i = new Intent(csesy.this,first.class);
        startActivity(i);
    }
    public void csel(View v){
        Intent i = new Intent(csesy.this,csl.class);
        startActivity(i);

    }
}
