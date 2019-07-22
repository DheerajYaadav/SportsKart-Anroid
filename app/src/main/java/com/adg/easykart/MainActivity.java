package com.adg.easykart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.adg.easykart.com.adg.easykart.client.ApiClient;
import com.adg.easykart.com.adg.easykart.service.ApiInterface;
import com.adg.easykart.requestDTO.AdminrequestDTO;
import com.adg.easykart.requestDTO.SignIn;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
 private static Button button;

 private static TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        apiInterface = ApiClient.getClient().create(ApiInterface.class);
//        signIn();

        onClickButtonListner();
    }

    public void onClickButtonListner() {
        textView = (TextView) findViewById(R.id.textview1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.adg.easykart.DrawerNavigation");
                startActivity(intent);
            }
        });
    }

//    private void signIn() {
//        AdminrequestDTO admin = new AdminrequestDTO("Dheeraj", "dheeraj@123");
//        Call<SignIn> call = apiInterface.signIn(admin);
//        call.enqueue(new Callback<SignIn>() {
//            @Override
//            public void onResponse(Call<SignIn> call, Response<SignIn> response) {
//                Log.e("", "response from java api" + response.body());
//            }
//
//            @Override
//            public void onFailure(Call<SignIn> call, Throwable t) {
//                Log.e("", "error messasge " + t.getLocalizedMessage());
//            }
//
//        });
//    }
}