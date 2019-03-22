package gelecegiyazanlar.com.gyk201;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText userName;
    EditText userPassword;
    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.user_name);
        userPassword = (EditText) findViewById(R.id.user_password);
        loginBtn = (Button) findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Butona tıkladığında gerçekleşecek işlem
                login();

            }
        });


    }

    private void login() {
        String receivedUserName = userName.getText().toString();
        String receivedUserPassword = userPassword.getText().toString();

        if (receivedUserName.equals("Hasibe") && receivedUserPassword.equals("123456")) {
            Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
            //loginIntent.putExtra("userName",receivedUserName);
            startActivity(loginIntent);

        } else {
            Toast.makeText(getApplicationContext(), "Kullanıcı Adı ya da parola hatalı", Toast.LENGTH_LONG).show();
        }


    }


}
