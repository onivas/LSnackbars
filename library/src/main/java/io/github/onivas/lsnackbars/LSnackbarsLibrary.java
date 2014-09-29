package io.github.onivas.lsnackbars;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

public class LSnackbarsLibrary {

    private boolean isAnimating;

    FrameLayout layout;

    Context context;

    private final int ANIMATION_TIME = 2000;

    private final float TOP_ANIMATION_HEIGH = -150f;

    public LSnackbarsLibrary(Context c, FrameLayout l) {
        context = c;
        layout = l;
        isAnimating = false;
    }


    public void showLToast(String message, Button obj){

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.lsnackbars_layout, layout, false);

        TextView ltoast_message = (TextView) view.findViewById(R.id.ltoast_text_view);
        ltoast_message.setText(message);

        layout.addView(view);

        if (!isAnimating) {

            setLToastAnimation(view);

            if (obj != null) {

                setButtonAnimation(obj);
            }
        }
    }

    public void showLToast(String message, ImageButton obj){

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.lsnackbars_layout, layout, false);

        TextView ltoast_message = (TextView) view.findViewById(R.id.ltoast_text_view);
        ltoast_message.setText(message);

        layout.addView(view);

        if (!isAnimating) {

            setLToastAnimation(view);

            if (obj != null) {

                setButtonAnimation(obj);
            }
        }
    }

    private void setLToastAnimation(final View obj){

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, 0f, TOP_ANIMATION_HEIGH, TOP_ANIMATION_HEIGH, 0f);
        objectAnimator.setDuration(ANIMATION_TIME);

        objectAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                obj.setVisibility(View.VISIBLE);
                isAnimating = true;
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                obj.setVisibility(View.GONE);
                isAnimating = false;
            }
            @Override
            public void onAnimationCancel(Animator animation) {
                isAnimating = false;
            }
            @Override
            public void onAnimationRepeat(Animator animation) {}
        });

        objectAnimator.start();
    }

    private void setButtonAnimation(final Button obj){

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, 0f, TOP_ANIMATION_HEIGH, TOP_ANIMATION_HEIGH, 0f);
        objectAnimator.setDuration(ANIMATION_TIME);
        objectAnimator.start();

    }

    private void setButtonAnimation(final ImageButton obj){

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, 0f, TOP_ANIMATION_HEIGH, TOP_ANIMATION_HEIGH, 0f);
        objectAnimator.setDuration(ANIMATION_TIME);
        objectAnimator.start();

    }
}
