package com.example.pratama.cobaconductor;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.OnClick;
import com.bluelinelabs.conductor.RouterTransaction;
import com.example.pratama.cobaconductor.base.ButterKnifeController;

/**
 * Created by pratama on 2/20/17.
 */
public class HomeController extends ButterKnifeController {

  private static final String TAG = "Home Controller";

  @Override
  protected View inflateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
    return inflater.inflate(R.layout.layout_home, container, false);
  }

  @Override protected void onViewBound(@NonNull View view) {
    super.onViewBound(view);
  }

  @OnClick(R.id.btnNext) void onNextButtonClick() {
    getRouter().pushController(RouterTransaction.with(new ChildController()));
  }

  @Override protected void onAttach(@NonNull View view) {
    super.onAttach(view);
    Log.d(TAG, "onAttach: ");
  }

  @Override protected void onDetach(@NonNull View view) {
    super.onDetach(view);
    Log.d(TAG, "onDetach: ");
  }
}
