package br.senac.sp.l13.projetorecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListaItem> listaItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listaItems = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            ListaItem listaItem = new ListaItem(
                    "Título " + (i + 1),
                    "Lorem ipsum dummy text"

            );

            listaItems.add(listaItem);
        }

        adapter = new MyAdapter(listaItems,this);

        recyclerView.setAdapter(adapter);
    }
}
