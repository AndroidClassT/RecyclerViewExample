package test.muhammed.com.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import test.muhammed.com.recyclerviewexample.adapters.UserAdapter;
import test.muhammed.com.recyclerviewexample.models.UserModel;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();
    }

    private void setUI() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<UserModel> userModels = getUserList();

        mRecyclerView.setAdapter(new UserAdapter(this,userModels));
    }

    private ArrayList<UserModel> getUserList() {
        ArrayList<UserModel> userModels = new ArrayList<>();

        userModels.add(new UserModel("Muhammed", "8086461927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        userModels.add(new UserModel("Thasneem", "9446771927"));
        return userModels;
    }
}
