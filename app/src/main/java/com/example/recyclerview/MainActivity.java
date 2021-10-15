 package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
    //17. creating variable
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//18. initializing it
        recyclerView=findViewById(R.id.recyclerView);
        //19. create an instance for recyclerViewAdapter
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(this);
        recyclerView.setAdapter(recyclerViewAdapter);
        //20.setting a layout manager. set the way that items are going to be shown inside the recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //this is also another layout manager
//        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        //21. after you need to set the new array list for the adapter
        ArrayList<ContactModal>contactModals=new ArrayList<>();
        contactModals.add(new ContactModal("Jesus Christ","0704690012","https://www.learnreligions.com/thmb/DHO4Y2Yz_AgCbkPzf8aZuvjGcWI=/768x0/filters:no_upscale():max_bytes(150000):strip_icc()/SonOfGod1500x998-56a146083df78cf772691384.jpg"));
        contactModals.add(new ContactModal("Son of God","0704690012","https://www.learnreligions.com/thmb/Uzg-V7On90BidLAmjP8uwEVQ8Ns=/1500x1000/filters:fill(auto,1)/JesusChristGettyImages-600166818-5a4e7131eb4d520037d96847.jpg"));
        contactModals.add(new ContactModal("Jehovah Shalom","0704690012","https://i.ytimg.com/vi/PqervTCq9L0/maxresdefault.jpg"));
        contactModals.add(new ContactModal("Jesus is Lord","0704690012","https://cdn.modernghana.com/story_/1024/728/427201914452_vaqdtgfssn_jesus_christ.jpg"));
        recyclerViewAdapter.setContactModals(contactModals);
    }
}

//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 this token expires on sun 14/nov/2021