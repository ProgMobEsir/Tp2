package com.example.myapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main extends Activity {

    public static ArrayList<String> depList = new ArrayList<>();

    public static Map<String,String> depmap = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5_7);

        ListView lv = (ListView) findViewById(R.id.ListView_Regions);

        setupList();

        ArrayAdapter<String> adapterList = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,depList);

        lv.setAdapter(adapterList);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = depList.get(i);
                String nbHabs = depmap.get(item);
                main.this.createDialogFor(item,nbHabs);
            }
        });
    }

    public void createDialogFor(String mess,String nbHabs) {

        AlertDialog.Builder builder = new AlertDialog.Builder(main.this);

        // Set the message show for the Alert time
        builder.setMessage(mess + "\n" + nbHabs);

        // Set Alert Title
        builder.setTitle("Departement choisi ");


        // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
        builder.setCancelable(false);

        builder.setNegativeButton("Cancel",null);

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();
        // Show the Alert Dialog box
        alertDialog.show();

    }

    public static void setupList(){
        depList.add("ile-et-vilaine -Bretagne");
        depList.add("Cote d'armor -Bretagne");
        depList.add("morbian -Bretagne");
        depList.add("finister -Bretagne");

        depmap.put("ile-et-vilaine -Bretagne","500 00Y");
        depmap.put("Cote d'armor -Bretagne","500");
        depmap.put("morbian -Bretagne","500");
        depmap.put("finister -Bretagne","500");

    }







}