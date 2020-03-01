package id.frio.kasir.Login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;

import id.frio.kasir.Dashboard.DashboardActivity;
import id.frio.kasir.R;
import id.frio.kasir.Pilihan2.Pilihan2Activity;
import id.frio.kasir.Register.RegisterActivity;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        viewL();
    }

    private void viewL(){

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextInputEditText txt_nohp = findViewById(R.id.txt_nohp);
                String nohp = txt_nohp.getText().toString();

                if (nohp.matches("")){
                    Toast.makeText(LoginActivity.this, "Masukan Nomor Hp", Toast.LENGTH_LONG).show();
                }else {
                    startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                }
            }
        });



        findViewById(R.id.btn_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, Pilihan2Activity.class));
            }
        });

        findViewById(R.id.txt4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

    }

    private void login(String hp){

    }

}
