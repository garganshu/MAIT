package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class maesy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maesy);
    }
    public void maef(View v){
        Intent i = new Intent(maesy.this,first.class);
        startActivity(i);
    }
    public void mael(View v){
        Intent i = new Intent(maesy.this,mal.class);
        startActivity(i);

    }
}
