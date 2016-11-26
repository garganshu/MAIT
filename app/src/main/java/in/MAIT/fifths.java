package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fifths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifths);
    }
    public void csefive(View v){

        Intent intent = new Intent(fifths.this,cse5.class);
        startActivity(intent);
    }
    public void itfive(View v){

        Intent intent = new Intent(fifths.this,it5.class);
        startActivity(intent);
    }
}
