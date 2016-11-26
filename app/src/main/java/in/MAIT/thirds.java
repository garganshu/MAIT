package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class thirds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirds);
    }

    public void cset(View v){

        Intent intent = new Intent(thirds.this,cse3.class);
        startActivity(intent);
    }
    public void itt(View v){

        Intent intent = new Intent(thirds.this,cse3.class);
        startActivity(intent);
    }
}
