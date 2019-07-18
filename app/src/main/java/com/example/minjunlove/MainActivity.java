package com.example.minjunlove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.minjunlove.Utils.NetworkHelper;
import com.example.minjunlove.model.Articles;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NetworkHelper.getInstence()
                .getArticles().enqueue(new Callback<Articles>() {
            @Override
            public void onResponse(Call<Articles> call, Response<Articles> response) {
                if (response.isSuccessful()){
                    ListView lv = findViewById(R.id.itemlistview);
                    ListAdapter la = new CustomAdapter(response.body().getArticles());
                    lv.setAdapter(la);
                    Toast.makeText(getApplicationContext(),""+response.body().getArticlesCount(),Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, ""+response.message(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<Articles> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
