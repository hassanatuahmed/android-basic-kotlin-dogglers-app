// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView age;

  @NonNull
  public final TextView hobby;

  @NonNull
  public final TextView name;

  @NonNull
  public final ImageView photo;

  private VerticalHorizontalListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull TextView age, @NonNull TextView hobby, @NonNull TextView name,
      @NonNull ImageView photo) {
    this.rootView = rootView;
    this.age = age;
    this.hobby = hobby;
    this.name = name;
    this.photo = photo;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.age;
      TextView age = ViewBindings.findChildViewById(rootView, id);
      if (age == null) {
        break missingId;
      }

      id = R.id.hobby;
      TextView hobby = ViewBindings.findChildViewById(rootView, id);
      if (hobby == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.photo;
      ImageView photo = ViewBindings.findChildViewById(rootView, id);
      if (photo == null) {
        break missingId;
      }

      return new VerticalHorizontalListItemBinding((MaterialCardView) rootView, age, hobby, name,
          photo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
