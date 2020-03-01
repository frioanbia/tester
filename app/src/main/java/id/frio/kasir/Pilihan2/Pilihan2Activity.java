package id.frio.kasir.Pilihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.frio.kasir.R;
import id.frio.kasir.Register.RegisterActivity;

public class Pilihan2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan2);
        view();
    }

    private void view(){

        findViewById(R.id.card1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pilihan2Activity.this, RegisterActivity.class));
            }
        });
        findViewById(R.id.card2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pilihan2Activity.this, RegisterActivity.class));
            }
        });
    }
}
