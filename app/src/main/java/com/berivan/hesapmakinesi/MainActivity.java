package com.berivan.hesapmakinesi;

import java.util.Locale;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView sonuc;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bArti;
    private Button bEksi;
    private Button bCarpi;
    private Button bBolu;
    private Button bEsittir;
    private String islem="boş";
    private int d1,d2=0;
    private boolean yapti=false;
    //private Switch dil;   ---Switch tanımlaması
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana_aktivite);

        sonuc = (TextView) findViewById(R.id.sonuc);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bArti = (Button) findViewById(R.id.bArti);
        bEksi = (Button) findViewById(R.id.bEksi);
        bCarpi = (Button) findViewById(R.id.bCarpi);
        bBolu = (Button) findViewById(R.id.bBolu);
        bEsittir = (Button) findViewById(R.id.bEsittir);

        /* Dil için olan işlemler
        dil = (Switch) findViewById(R.id.dil);
        sp = getSharedPreferences("Hesap_Makinesi", Context.MODE_PRIVATE);
        dil.setChecked(sp.getBoolean("Hesap_Makinesi",true));

        dil.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    setLocale("tr");
                    SharedPreferences.Editor spEditor = sp.edit();
                    spEditor.putBoolean("Hesap_Makinesi", true);
                    spEditor.commit();
                }else{
                    setLocale("en");
                    SharedPreferences.Editor spEditor = sp.edit();
                    spEditor.putBoolean("Hesap_Makinesi", false);
                    spEditor.commit();
                }
            }
        }); */

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                sonuc.append("0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                sonuc.append("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                String temp = sonuc.getText().toString();
                sonuc.setText(temp + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                sonuc.append("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                sonuc.append("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                sonuc.append("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                sonuc.append("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                sonuc.append("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                sonuc.append("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yapti){
                    sonuc.setText("");
                    yapti=false;
                }
                sonuc.append("9");
            }
        });


        bArti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                d1=Integer.parseInt(sonuc.getText().toString());
                sonuc.setText("");
                islem="artı";
                }catch(NumberFormatException e){
                    hataMesaji(e);
                }
            }
        });
        bEksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                d1=Integer.parseInt(sonuc.getText().toString());
                sonuc.setText("");
                islem="eksi";
            }catch(NumberFormatException e){
                    hataMesaji(e);
            }
            }
        });
        bCarpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                d1=Integer.parseInt(sonuc.getText().toString());
                sonuc.setText("");
                islem="çarpı";
                }catch(NumberFormatException e){
                    hataMesaji(e);
            }
            }
        });
        bBolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                d1=Integer.parseInt(sonuc.getText().toString());
                sonuc.setText("");
                islem="bölü";
                }catch(NumberFormatException e){
                    hataMesaji(e);
                }
            }
        });

        bEsittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (islem){
                    case "artı":
                        try{
                        d2=Integer.parseInt(sonuc.getText().toString());
                        sonuc.setText(Integer.toString(d1+d2));
                        }catch(NumberFormatException e){
                            hataMesaji(e);
                        }
                        yapti=true;
                        break;
                    case "eksi":
                        try{
                        d2=Integer.parseInt(sonuc.getText().toString());
                        sonuc.setText(Integer.toString(d1-d2));
                        }catch(NumberFormatException e){
                            hataMesaji(e);
                        }
                        yapti=true;
                        break;
                    case "çarpı":
                        try{
                        d2=Integer.parseInt(sonuc.getText().toString());
                        sonuc.setText(Integer.toString(d1*d2));
                        }catch(NumberFormatException e){
                            hataMesaji(e);
                        }
                        yapti=true;
                        break;
                    case "bölü":
                        try{
                        d2=Integer.parseInt(sonuc.getText().toString());
                        sonuc.setText(Integer.toString(d1/d2));
                        }catch(NumberFormatException e){
                            hataMesaji(e);
                        }
                        yapti=true;
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), R.string.null_islem, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
    /* Kodla dil değiştirmek için fonksiyon
    public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
        finish();
    } */
    public void hataMesaji(Exception e){
        sonuc.setText("");
        Toast.makeText(getApplicationContext(), R.string.largeerror, Toast.LENGTH_SHORT).show();
    }
}