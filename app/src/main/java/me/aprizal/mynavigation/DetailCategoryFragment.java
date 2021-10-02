package me.aprizal.mynavigation;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailCategoryFragment extends Fragment {

    public DetailCategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvCategoryName = view.findViewById(R.id.tv_category_name);
        TextView tvCategoryDescription = view.findViewById(R.id.tv_category_description);

//        String dataName = null;
//        if (getArguments() != null) {
//            dataName = getArguments().getString(CategoryFragment.EXTRA_NAME);
//        }
//
//        long dataDescription = 0;
//        if (getArguments() != null) {
//            dataDescription = getArguments().getLong(CategoryFragment.EXTRA_STOCK);
//        }

        String dataName = DetailCategoryFragmentArgs.fromBundle(getArguments()).getName();
        Long dataDescription = DetailCategoryFragmentArgs.fromBundle(getArguments()).getStock();

        tvCategoryName.setText(dataName);
        tvCategoryDescription.setText("Stock : "+dataDescription);
    }
}