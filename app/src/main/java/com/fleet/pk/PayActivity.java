package com.fleet.pk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.androidtrip.plugins.searchablespinner.SearchableSpinner;
import com.androidtrip.plugins.searchablespinner.interfaces.IStatusListener;
import com.fleet.pk.databinding.ActivityPaymentAmount;

import java.util.ArrayList;
import java.util.List;

public class PayActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    CardView cardView;
    LinearLayout linearLayout;
    MyClickHandlers handlers;
    ActivityPaymentAmount bind;
    List<DataModel> dataModelList;
    StringArrayAdapter arrayAdapter;
    ArrayList<String> petrolList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.activity_pay);
        handlers = new MyClickHandlers(this);
        petrolList = new ArrayList<>();
        dataModelList = new ArrayList<>();
        bind.setHandlers(handlers);
        Helper.showSelfUis(PayActivity.this,bind);
        populateData();
        arrayAdapter = new StringArrayAdapter(this, petrolList);
        bind.spinner2.setAdapter(arrayAdapter);
        bind.spinner2.setOnItemSelectedListener(this);

    }



    public class MyClickHandlers {

        Context context;

        public MyClickHandlers(Context context) {
            this.context = context;
        }


        public void showSelfUi(View view) {
            Helper.showSelfUis(PayActivity.this,bind);

        }


        public void showStaticUi(View view) {
            //showStaticUis();

            Helper.showStaticUis(PayActivity.this,bind);
        }

    }
    private void populateData() {
        dataModelList.add(new DataModel("Honda City", "2020", "6.0", "567"));
        dataModelList.add(new DataModel("Audi", "2019", "67.0", "568"));
        dataModelList.add(new DataModel("Civic", "2015", "68.0", "587"));
        dataModelList.add(new DataModel("Honda turbo", "2020", "6.0", "567"));

        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter(dataModelList, this);
        bind.setMyAdapter(myRecyclerViewAdapter);

        for (int i = 0; i < dataModelList.size(); i++) {
            petrolList.add(dataModelList.get(i).getCarName());
        }

        petrolList.add(0, "Choose Petrol Type");
    }

    public interface CustomClickListener {
        void cardClicked(DataModel f);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position > 0) {
            bind.linear.setVisibility(View.VISIBLE);
            bind.cardView.setVisibility(View.GONE);

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}