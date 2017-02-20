package com.example.pratama.cobaconductor.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bluelinelabs.conductor.Controller;

/**
 * Created by pratama on 2/20/17.
 */

public abstract class ButterKnifeController extends Controller {

  private Unbinder unbinder;

  protected ButterKnifeController() {
  }

  protected ButterKnifeController(Bundle args) {
    super(args);
  }

  protected abstract View inflateView(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup container);

  @NonNull @Override
  protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
    View view = inflateView(inflater, container);
    unbinder = ButterKnife.bind(this, view);
    onViewBound(view);
    return view;
  }

  protected void onViewBound(@NonNull View view) {
  }

  @Override protected void onDestroyView(@NonNull View view) {
    super.onDestroyView(view);
    unbinder.unbind();
    unbinder = null;
  }
}