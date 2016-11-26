package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sixths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixths);
    }
    public void csesix(View v){

        Intent intent = new Intent(sixths.this,cse6.class);
        startActivity(intent);
    }
    public void itsix(View v){

        Intent intent = new Intent(sixths.this,it6.class);
        startActivity(intent);
    }
}
