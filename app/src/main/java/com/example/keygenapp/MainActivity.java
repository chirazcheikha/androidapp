package com.example.keygenapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Response;
import android.widget.Toast;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    ListView superListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        superListView = findViewById(R.id.superListView);

        getKeys();
    }

    private void getKeys() {
        Call<List<Results>> call = RetrofitClient.getInstance().getMyApi().getkeys();
        call.enqueue(new Callback<List<Results>>() {
            @Override
            public void onResponse(Call<List<Results>> call, Response<List<Results>> response) {
                List<Results> mykeyList = response.body();
                String[] oneHeroes = new String[mykeyList.size()];

                for (int i = 0; i < mykeyList.size(); i++) {
                    oneHeroes[i] = mykeyList.get(i).getName();
                }

                superListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, oneHeroes));
            }

            @Override
             public void onFailure(Call<List<Results>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }

        });
    }
}