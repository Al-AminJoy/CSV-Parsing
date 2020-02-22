package com.example.csvparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    InputStream inputStream;
    String[] data;
    ArrayList<ModelClass> listItem=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputStream=getResources().openRawResource(R.raw.test);
        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
        try {
            String csvLine;
            while ((csvLine=reader.readLine())!=null)
            {
                data=csvLine.split(",");
                //When Have To Use Arraylist and Adapter
               /* ModelClass modelClass=new ModelClass(data[0],data[1]);
                listItem.add(modelClass);*/

               try {
                   Log.e("Data"," : "+data[0]+" "+data[1]);
               }
               catch (Exception e)
               {

               }

            }
        }
        catch (Exception e)
        {

        }

    }
}
