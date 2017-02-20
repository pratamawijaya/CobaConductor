package com.example.pratama.cobaconductor;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.pratama.cobaconductor.base.ButterKnifeController;

/**
 * Created by pratama on 2/20/17.
 */
public class ChildController extends ButterKnifeController {
  @Override
  protected View inflateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
    return inflater.inflate(R.layout.layout_child, container, false);
  }
}
