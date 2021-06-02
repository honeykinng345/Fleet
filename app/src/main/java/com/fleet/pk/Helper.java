package com.fleet.pk;

import android.content.Context;
import android.view.View;

import com.fleet.pk.databinding.ActivityPaymentAmount;

public class Helper {


    public  static  void showStaticUis(Context context, ActivityPaymentAmount bind){
        bind.linear.setVisibility(View.GONE);
        bind.cardView.setVisibility(View.GONE);
        bind.staticPaymentRl.setVisibility(View.VISIBLE);
        bind.tabOrderTv.setTextColor(context.getResources().getColor(R.color.black));
        bind.tabOrderTv.setBackgroundResource(R.drawable.react04);
        bind.tabproductTv.setTextColor(context.getResources().getColor(R.color.white));
        bind.tabproductTv.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
    }


    public  static  void showSelfUis(Context context, ActivityPaymentAmount bind){
        bind.cardView.setVisibility(View.VISIBLE);
        bind.staticPaymentRl.setVisibility(View.GONE);
        bind.tabproductTv.setTextColor(context.getResources().getColor(R.color.black));
        bind.tabproductTv.setBackgroundResource(R.drawable.react04);
        bind.tabOrderTv.setTextColor(context.getResources().getColor(R.color.white));
        bind.tabOrderTv.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
    }
}
