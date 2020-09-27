package com.example.kulpreetsingh_ceng319lab1_ex1;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

public class TopFragment extends ListFragment {

    //Declaring two buttons for upper fragment
    String[] activities = new String[]
            {
                    "AIActivity",
                    "VRActivity"
            };

    //Showing the array list as button
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list,container,false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,activities);
        setListAdapter(adapter);

        //Toast
        Toast toast = Toast.makeText(getActivity().getApplicationContext(),getString(R.string.create),Toast.LENGTH_LONG);
        toast.show();

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Auto-genereated method stub
        super.onListItemClick(l,v,position,id);

        //Making case switch buttons in list view
        Intent a;
        switch (position){
            case 0:
                a = new Intent(getActivity(),AiActivity.class);
                startActivity(a);
                break;
            case 1:
                a = new Intent(getActivity(),VrActivity.class);
                startActivity(a);
                break;
            default:
                break;
        }
    }

    //Excecuting toast statement on the activation  of onStart Function
    public void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(getActivity().getApplicationContext(),getString(R.string.start),Toast.LENGTH_LONG);
        toast.show();
    }
}
