package com.example.android.sahrul_1202154153_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class hasil_pesanan extends AppCompatActivity {
    TextView tvRestaurant, tvMenu, tvPortion, tvprice;
    String restaurant, menu;
    int portion, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_pesanan);
        tvRestaurant = (TextView)findViewById(R.id.tvRestaurant); //komponen
        tvMenu = (TextView)findViewById(R.id.tvMenu);
        tvPortion = (TextView)findViewById(R.id.tvPortion);
        tvprice = (TextView)findViewById(R.id.tvprice);
        Intent intent = getIntent();


        restaurant = intent.getStringExtra("restaurant"); // data
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion", 0);
        price = intent.getIntExtra("price", 0);

        //buat masang data di tv menu kita
        tvRestaurant.setText(restaurant);
        tvMenu.setText(menu);
        tvprice.setText(""+price);
        tvPortion.setText(""+portion);

        Toast toast = null;
        if(price < 65000){
            toast = Toast.makeText(getApplicationContext(),"Makan Disini lebih Murah", 200);
        }else{
            toast = Toast.makeText(getApplicationContext(),"Jangan makan di sini mahal", 200);
        }
        toast.show();

    }

}
