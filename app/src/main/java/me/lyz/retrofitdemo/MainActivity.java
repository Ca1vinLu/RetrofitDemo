package me.lyz.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

import me.lyz.retrofitdemo.model.Repo;
import me.lyz.retrofitdemo.network.RetrofitUtils;
import me.lyz.retrofitdemo.service.GitHubService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text);


        GitHubService service = RetrofitUtils.getRetrofit().create(GitHubService.class);
        service.getGitHubRepos("CalvinLv")
                .enqueue(new Callback<List<Repo>>() {
                    @Override
                    public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                        StringBuilder stringBuilder = new StringBuilder();
                        if (response.body() != null) {
                            for (Repo repo : response.body()) {
                                stringBuilder.append(repo.toString()).append("\n\n");
                            }
                        }
                        mTextView.setText(stringBuilder.toString());
                    }

                    @Override
                    public void onFailure(Call<List<Repo>> call, Throwable t) {

                    }
                });
    }
}
