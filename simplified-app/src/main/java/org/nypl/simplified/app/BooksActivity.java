package org.nypl.simplified.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.io7m.jnull.NullCheck;
import com.io7m.jnull.Nullable;

public final class BooksActivity extends SimplifiedActivity
{
  @Override protected void onCreate(
    final @Nullable Bundle state)
  {
    super.onCreate(state);

    final LayoutInflater inflater =
      NullCheck.notNull(this.getLayoutInflater());

    final FrameLayout content_area = this.getContentFrame();
    final LinearLayout layout =
      NullCheck.notNull((LinearLayout) inflater.inflate(
        R.layout.books,
        content_area,
        false));
    content_area.addView(layout);
    content_area.requestLayout();
  }

  @Override protected void onDestroy()
  {
    super.onDestroy();
  }

  @Override protected void onResume()
  {
    super.onResume();
  }
}