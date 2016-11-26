package in.MAIT;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class yearlybooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yearlybooks);

    }
    public void first(View view)
    {
        Intent intent = new Intent(yearlybooks.this,firsts.class);
        startActivity(intent);
    }
    public void second(View view)
    {
        Intent intent = new Intent(yearlybooks.this,seconds.class);
        startActivity(intent);
    }
    public void third(View view)
    {
        Intent intent = new Intent(yearlybooks.this,thirds.class);
        startActivity(intent);
    }
    public void fourth(View view)
    {
        Intent intent = new Intent(yearlybooks.this,fourths.class);
        startActivity(intent);
    }
    public void fifth(View view)
    {
        Intent intent = new Intent(yearlybooks.this,fifths.class);
        startActivity(intent);
    }
    public void sixth(View view)
    {
        Intent intent = new Intent(yearlybooks.this,sixths.class);
        startActivity(intent);
    }
    public void seventh(View view)
    {
        Intent intent = new Intent(yearlybooks.this,sevenths.class);
        startActivity(intent);
    }
    public void eighth(View view)
    {
        Intent intent = new Intent(yearlybooks.this,eights.class);
        startActivity(intent);
    }
}
