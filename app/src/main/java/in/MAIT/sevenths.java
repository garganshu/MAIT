package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sevenths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevenths);
    }
    public void csese(View v){

        Intent intent = new Intent(sevenths.this,cse7.class);
        startActivity(intent);
    }
    public void itse(View v){

        Intent intent = new Intent(sevenths.this,it7.class);
        startActivity(intent);
    }
}
