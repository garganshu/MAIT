package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class eights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eights);
    }

    public void cseeight(View v){

        Intent intent = new Intent(eights.this,cse8.class);
        startActivity(intent);
    }
    public void iteight(View v){

        Intent intent = new Intent(eights.this,cse8.class);
        startActivity(intent);
    }
}
