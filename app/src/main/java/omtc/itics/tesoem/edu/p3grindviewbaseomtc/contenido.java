package omtc.itics.tesoem.edu.p3grindviewbaseomtc;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.constraintlayout.solver.ArrayLinkedVariables;

import java.util.ArrayList;

public class contenido extends BaseAdapter {
    Context context;
    ArrayList<String> arreglo;

    public contenido(Context context, ArrayList<String> arreglo) {
        this.context = context;
        this.arreglo = arreglo;
    }

    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem( int position) {
        return arreglo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.elementogv,null);
        }
        TextView txttitulo = convertView.findViewById(R.id.txttitulo);
        txttitulo.setText(arreglo.get(position));
        return convertView;
    }
}
