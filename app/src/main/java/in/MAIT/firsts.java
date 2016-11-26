package in.MAIT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class firsts extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsts);
    }

    public void cse(View v){

        Intent intent = new Intent(firsts.this,cse1.class);
        startActivity(intent);
    }
    public void it(View v){

        Intent intent = new Intent(firsts.this,cse1.class);
        startActivity(intent);
    }
}
