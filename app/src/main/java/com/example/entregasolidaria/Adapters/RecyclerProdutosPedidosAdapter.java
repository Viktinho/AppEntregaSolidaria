package com.example.entregasolidaria.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entregasolidaria.Model.Produto;
import com.example.entregasolidaria.ProdutosActivity;
import com.example.entregasolidaria.R;

import java.util.ArrayList;

public class RecyclerProdutosPedidosAdapter extends RecyclerView.Adapter<RecyclerProdutosPedidosAdapter.ViewHolder> {

    Context contexto;
    ArrayList<Produto> produtos;

    public RecyclerProdutosPedidosAdapter(Context contexto, ArrayList<Produto> produtos) {
        this.produtos = produtos;
        this.contexto = contexto;
    }

    @NonNull
    @Override
    public RecyclerProdutosPedidosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_produtos_pedido, parent, false);
        RecyclerProdutosPedidosAdapter.ViewHolder holderProdutos = new RecyclerProdutosPedidosAdapter.ViewHolder(v);
        return holderProdutos;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.descricao.setText(produtos.get(position).getDescricao());
        holder.preco.setText(String.valueOf(produtos.get(position).getPreco()));
        holder.estoque.setText(String.valueOf(produtos.get(position).getEstoque()));
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView preco, descricao, estoque;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, ProdutosActivity.class);
                    context.startActivity(intent);
                }
            });
            preco = itemView.findViewById(R.id.txtPreco);
            estoque = itemView.findViewById(R.id.txtEstoque);
            descricao = itemView.findViewById(R.id.txtDescricao);

        }
    }
}
