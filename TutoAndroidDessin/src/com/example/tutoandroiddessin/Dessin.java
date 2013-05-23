package com.example.tutoandroiddessin;

import java.util.LinkedList;
import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class Dessin extends View implements OnTouchListener {
	TextView monTexte = null;

	LinkedList<Cercle> cercles;

	public Dessin(Context context, AttributeSet attrs) {
		super(context, attrs);
		cercles = new LinkedList<Cercle>();
	}

	@Override
	public void onDraw(Canvas canvas) {
		for (Cercle cercle : cercles)
			cercle.draw(canvas);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		int x = (int) event.getX();
		int y = (int) event.getY();
		monTexte = (TextView) v.findViewById(R.id.textView);
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			cercles.add(new Cercle(x, y, 1));
			break;

		case MotionEvent.ACTION_MOVE:
			Cercle cercle = cercles.getLast();
			cercle.rayon = (int) Math.sqrt((x - cercle.xc) * (x - cercle.xc)
					+ (y - cercle.yc) * (y - cercle.yc));
			break;
		case MotionEvent.ACTION_UP:
		}
		this.invalidate();
		return true;
	}

	class Cercle {
		int xc, yc, rayon;
		private Paint paint;
		private Random rand = new Random();
		private LinkedList<Integer> li;

		public Cercle(int x, int y, int r) {
			xc = x;
			yc = y;
			rayon = r;
			paint = new Paint();
			li = new LinkedList<Integer>();
			for (int i = 0; i < 3; i++)
				li.add(rand.nextInt(256));
			paint.setColor(Color.rgb(li.get(0), li.get(1), li.get(2)));
		}

		public void draw(Canvas canvas) {
			canvas.drawCircle(xc, yc, rayon, paint);
		}

		public LinkedList<Integer> getLi() {
			return li;
		}

	}

}
