package khoapham.ptp.phamtanphat.sqlite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

public class MonanAdapter extends ArrayAdapter<Monan> {
    public MonanAdapter(@NonNull Context context, int resource, @NonNull List<Monan> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.dong_item_monan,null);

        TextView txtTenmonan = convertView.findViewById(R.id.textviewTenmonan);
        TextView txtGiamonan = convertView.findViewById(R.id.textviewGiamonan);
        TextView txtDiachi = convertView.findViewById(R.id.textviewDiachi);

        Monan monan = getItem(position);

        txtTenmonan.setText(monan.getTenmonan());
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        int gia = Integer.parseInt(monan.getGiamonan());
        txtGiamonan.setText(decimalFormat.format( gia )+ " dong");
        txtDiachi.setText(monan.getDiachi());

        return convertView;
    }
}
