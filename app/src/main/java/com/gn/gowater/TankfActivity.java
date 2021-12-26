package com.gn.gowater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import com.airbnb.lottie.*;
import android.widget.EditText;
import android.app.Activity;
import android.content.SharedPreferences;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import java.util.HashMap;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;
import android.view.View;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class TankfActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private String version = "";
	private String app_version = "";
	private String update_link = "";
	private String distance = "";
	private String message = "";
	private double i = 0;
	private double a = 0;
	private double b = 0;
	private String last = "";
	private String alert = "";
	private double dis = 0;
	private double totaldis = 0;
	private double sensordis = 0;
	private double empty = 0;
	private double low = 0;
	private double medium = 0;
	private double full = 0;
	private String valuee = "";
	private String totadis = "";
	private String sensordisss = "";
	private String emptyyy = "";
	private String lowww = "";
	private String mediummm = "";
	private String fullll = "";
	private double num = 0;
	private boolean miss_you_error_404 = false;
	
	private LinearLayout bgbg;
	private LinearLayout linear41;
	private LinearLayout bg;
	private LinearLayout linear42;
	private LinearLayout linear51;
	private LinearLayout linear43;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private ImageView imageview7;
	private TextView textview3;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear53;
	private LinearLayout linear52;
	private ImageView imageview8;
	private TextView textview4;
	private ImageView imageview9;
	private TextView textview5;
	private ImageView imageview10;
	private TextView textview6;
	private ImageView imageview11;
	private TextView textview7;
	private ImageView imageview14;
	private TextView textview11;
	private ImageView imageview13;
	private TextView textview10;
	private LinearLayout linear50;
	private TextView textview9;
	private LinearLayout customize;
	private LinearLayout monitory;
	private LinearLayout linear2;
	private LinearLayout linear32;
	private LinearLayout linear31;
	private HorizontalScrollView hrscroll;
	private TextView finish;
	private ImageView close;
	private TextView thitle;
	private LottieAnimationView lottie3;
	private LinearLayout main;
	private LinearLayout empty1;
	private LinearLayout low1;
	private LinearLayout medium1;
	private LinearLayout full1;
	private LinearLayout sensor1;
	private LinearLayout total1;
	private LinearLayout linear11;
	private EditText emptyy1;
	private TextView e;
	private LinearLayout linear24;
	private EditText loww1;
	private TextView l;
	private LinearLayout linear25;
	private EditText mediumm1;
	private TextView m;
	private LinearLayout linear26;
	private EditText fulll1;
	private TextView f;
	private LinearLayout linear27;
	private EditText sensorr1;
	private TextView s;
	private LinearLayout linear28;
	private EditText totall1;
	private TextView ta;
	private LinearLayout top;
	private LinearLayout moni;
	private ImageView drawer;
	private TextView title;
	private TextView monitor;
	private LinearLayout linear1;
	private TextView distitle;
	private TextView lastvalu;
	
	private SharedPreferences shar;
	private DatabaseReference db = _firebase.getReference("db");
	private ChildEventListener _db_child_listener;
	private Intent it = new Intent();
	private TimerTask t;
	private SharedPreferences value;
	private DatabaseReference data = _firebase.getReference("data");
	private ChildEventListener _data_child_listener;
	private TimerTask time;
	private TimerTask tjs;
	private ObjectAnimator anim = new ObjectAnimator();
	private Intent hometoabout = new Intent();
	private Intent hometocontact = new Intent();
	
	private OnCompleteListener fcm_onCompleteListener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tankf);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		bgbg = findViewById(R.id.bgbg);
		linear41 = findViewById(R.id.linear41);
		bg = findViewById(R.id.bg);
		linear42 = findViewById(R.id.linear42);
		linear51 = findViewById(R.id.linear51);
		linear43 = findViewById(R.id.linear43);
		linear48 = findViewById(R.id.linear48);
		linear49 = findViewById(R.id.linear49);
		imageview7 = findViewById(R.id.imageview7);
		textview3 = findViewById(R.id.textview3);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		linear46 = findViewById(R.id.linear46);
		linear47 = findViewById(R.id.linear47);
		linear53 = findViewById(R.id.linear53);
		linear52 = findViewById(R.id.linear52);
		imageview8 = findViewById(R.id.imageview8);
		textview4 = findViewById(R.id.textview4);
		imageview9 = findViewById(R.id.imageview9);
		textview5 = findViewById(R.id.textview5);
		imageview10 = findViewById(R.id.imageview10);
		textview6 = findViewById(R.id.textview6);
		imageview11 = findViewById(R.id.imageview11);
		textview7 = findViewById(R.id.textview7);
		imageview14 = findViewById(R.id.imageview14);
		textview11 = findViewById(R.id.textview11);
		imageview13 = findViewById(R.id.imageview13);
		textview10 = findViewById(R.id.textview10);
		linear50 = findViewById(R.id.linear50);
		textview9 = findViewById(R.id.textview9);
		customize = findViewById(R.id.customize);
		monitory = findViewById(R.id.monitory);
		linear2 = findViewById(R.id.linear2);
		linear32 = findViewById(R.id.linear32);
		linear31 = findViewById(R.id.linear31);
		hrscroll = findViewById(R.id.hrscroll);
		finish = findViewById(R.id.finish);
		close = findViewById(R.id.close);
		thitle = findViewById(R.id.thitle);
		lottie3 = findViewById(R.id.lottie3);
		main = findViewById(R.id.main);
		empty1 = findViewById(R.id.empty1);
		low1 = findViewById(R.id.low1);
		medium1 = findViewById(R.id.medium1);
		full1 = findViewById(R.id.full1);
		sensor1 = findViewById(R.id.sensor1);
		total1 = findViewById(R.id.total1);
		linear11 = findViewById(R.id.linear11);
		emptyy1 = findViewById(R.id.emptyy1);
		e = findViewById(R.id.e);
		linear24 = findViewById(R.id.linear24);
		loww1 = findViewById(R.id.loww1);
		l = findViewById(R.id.l);
		linear25 = findViewById(R.id.linear25);
		mediumm1 = findViewById(R.id.mediumm1);
		m = findViewById(R.id.m);
		linear26 = findViewById(R.id.linear26);
		fulll1 = findViewById(R.id.fulll1);
		f = findViewById(R.id.f);
		linear27 = findViewById(R.id.linear27);
		sensorr1 = findViewById(R.id.sensorr1);
		s = findViewById(R.id.s);
		linear28 = findViewById(R.id.linear28);
		totall1 = findViewById(R.id.totall1);
		ta = findViewById(R.id.ta);
		top = findViewById(R.id.top);
		moni = findViewById(R.id.moni);
		drawer = findViewById(R.id.drawer);
		title = findViewById(R.id.title);
		monitor = findViewById(R.id.monitor);
		linear1 = findViewById(R.id.linear1);
		distitle = findViewById(R.id.distitle);
		lastvalu = findViewById(R.id.lastvalu);
		shar = getSharedPreferences("shar", Activity.MODE_PRIVATE);
		value = getSharedPreferences("value", Activity.MODE_PRIVATE);
		
		linear44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear41.setVisibility(View.GONE);
				customize.setVisibility(View.VISIBLE);
				miss_you_error_404 = false;
				_TransitionManager(bgbg, 300);
				linear41.setVisibility(View.GONE);
				_Animator(bg, "translationX", 0, 300);
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Animator(bg, "scaleX", 1, 300);
								_Animator(bg, "scaleY", 1, 300);
								_Animator(bg, "translationY", 0, 300);
							}
						});
					}
				};
				_timer.schedule(time, (int)(200));
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_shape(0, 0, 0, 0, "#f4f4fa", "#ffffff", 0, bg);
							}
						});
					}
				};
				_timer.schedule(time, (int)(400));
				anim.setTarget(close);
				anim.setPropertyName("rotation");
				anim.setDuration((int)(175));
				anim.setFloatValues((float)(0));
				anim.setInterpolator(new LinearInterpolator());
				anim.start();
				drawer.setImageResource(R.drawable.menu);
				tjs = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								bgbg.setBackgroundColor(0xFFF4F4FA);
								bg.setBackgroundResource(R.drawable.ghj);
							}
						});
					}
				};
				_timer.schedule(tjs, (int)(660));
				bg.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
			}
		});
		
		linear47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				hometocontact.setClass(getApplicationContext(), ContactActivity.class);
				startActivity(hometocontact);
			}
		});
		
		linear53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				hometoabout.setClass(getApplicationContext(), AboutActivity.class);
				startActivity(hometoabout);
			}
		});
		
		finish.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (totall1.getText().toString().equals("") || totall1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Enter Value please");
				}
				else {
					emptyyy = emptyy1.getText().toString();
					lowww = loww1.getText().toString();
					mediummm = mediumm1.getText().toString();
					fullll = fulll1.getText().toString();
					sensordisss = sensorr1.getText().toString();
					totadis = totall1.getText().toString();
					valuee = "done";
					value.edit().putString("t", totadis).commit();
					value.edit().putString("e", emptyyy).commit();
					value.edit().putString("l", lowww).commit();
					value.edit().putString("m", mediummm).commit();
					value.edit().putString("f", fullll).commit();
					value.edit().putString("s", sensordisss).commit();
					value.edit().putString("totaldiss", totall1.getText().toString()).commit();
					linear41.setVisibility(View.GONE);
					customize.setVisibility(View.GONE);
				}
				miss_you_error_404 = false;
				_TransitionManager(bgbg, 300);
				linear41.setVisibility(View.GONE);
				_Animator(bg, "translationX", 0, 300);
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Animator(bg, "scaleX", 1, 300);
								_Animator(bg, "scaleY", 1, 300);
								_Animator(bg, "translationY", 0, 300);
							}
						});
					}
				};
				_timer.schedule(time, (int)(200));
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_shape(0, 0, 0, 0, "#f4f4fa", "#ffffff", 0, bg);
							}
						});
					}
				};
				_timer.schedule(time, (int)(400));
				anim.setTarget(drawer);
				anim.setPropertyName("rotation");
				anim.setDuration((int)(175));
				anim.setFloatValues((float)(0));
				anim.setInterpolator(new LinearInterpolator());
				anim.start();
				drawer.setImageResource(R.drawable.menu);
				tjs = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								bgbg.setBackgroundColor(0xFFF4F4FA);
							}
						});
					}
				};
				_timer.schedule(tjs, (int)(660));
				bg.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
			}
		});
		
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear41.setVisibility(View.GONE);
				customize.setVisibility(View.GONE);
				miss_you_error_404 = false;
				_TransitionManager(bgbg, 300);
				linear41.setVisibility(View.GONE);
				_Animator(bg, "translationX", 0, 300);
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Animator(bg, "scaleX", 1, 300);
								_Animator(bg, "scaleY", 1, 300);
								_Animator(bg, "translationY", 0, 300);
							}
						});
					}
				};
				_timer.schedule(time, (int)(200));
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_shape(0, 0, 0, 0, "#f4f4fa", "#ffffff", 0, bg);
							}
						});
					}
				};
				_timer.schedule(time, (int)(400));
				anim.setTarget(drawer);
				anim.setPropertyName("rotation");
				anim.setDuration((int)(175));
				anim.setFloatValues((float)(0));
				anim.setInterpolator(new LinearInterpolator());
				anim.start();
				drawer.setImageResource(R.drawable.menu);
				tjs = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								bgbg.setBackgroundColor(0xFFF4F4FA);
							}
						});
					}
				};
				_timer.schedule(tjs, (int)(660));
				bg.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
			}
		});
		
		drawer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (miss_you_error_404) {
					miss_you_error_404 = false;
					_TransitionManager(bgbg, 300);
					linear41.setVisibility(View.GONE);
					_Animator(bg, "translationX", 0, 300);
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									_Animator(bg, "scaleX", 1, 300);
									_Animator(bg, "scaleY", 1, 300);
									_Animator(bg, "translationY", 0, 300);
								}
							});
						}
					};
					_timer.schedule(time, (int)(200));
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									_shape(0, 0, 0, 0, "#f4f4fa", "#ffffff", 0, bg);
								}
							});
						}
					};
					_timer.schedule(time, (int)(400));
					anim.setTarget(drawer);
					anim.setPropertyName("rotation");
					anim.setDuration((int)(175));
					anim.setFloatValues((float)(0));
					anim.setInterpolator(new LinearInterpolator());
					anim.start();
					drawer.setImageResource(R.drawable.menu);
					tjs = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									bgbg.setBackgroundColor(0xFFF4F4FA);
								}
							});
						}
					};
					_timer.schedule(tjs, (int)(660));
					bg.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
				}
				else {
					miss_you_error_404 = true;
					_TransitionManager(bgbg, 300);
					linear41.setVisibility(View.VISIBLE);
					_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(25)), SketchwareUtil.getDip(getApplicationContext(), (int)(25)), SketchwareUtil.getDip(getApplicationContext(), (int)(25)), SketchwareUtil.getDip(getApplicationContext(), (int)(25)), "#f4f4fa", "#ffffff", 0, bg);
					_Animator(bg, "scaleX", 0.7d, 300);
					_Animator(bg, "scaleY", 0.7d, 300);
					_Animator(bg, "translationY", SketchwareUtil.getDip(getApplicationContext(), (int)(-5)), 300);
					_Animator(bg, "translationX", SketchwareUtil.getDip(getApplicationContext(), (int)(-50)), 300);
					anim.setTarget(drawer);
					anim.setPropertyName("rotation");
					anim.setDuration((int)(175));
					anim.setFloatValues((float)(360));
					anim.setInterpolator(new LinearInterpolator());
					anim.start();
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									drawer.setImageResource(R.drawable.ic_close_white_20200908085328_20201127211503);
								}
							});
						}
					};
					_timer.schedule(time, (int)(100));
					_UI_GradientLR(bgbg, "#580e8c", "#0b0538", 0, 0, 0, 0, 0, "#000000", 0, "#bdbdbd");
					_setHeight(bg, SketchwareUtil.getDip(getApplicationContext(), (int)(900)), SketchwareUtil.getDip(getApplicationContext(), (int)(400)));
				}
			}
		});
		
		_db_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals("version update")) {
					version = _childValue.get("version").toString();
					update_link = _childValue.get("link").toString();
					if (version.equals(app_version)) {
						
					}
					else {
						if (!version.equals(app_version)) {
							final AlertDialog sucess = new AlertDialog.Builder(TankfActivity.this).create();
							LayoutInflater inflater = getLayoutInflater();
							
							View convertView = (View) inflater.inflate(R.layout.dialog, null);
							sucess.setView(convertView);
							
							sucess.requestWindowFeature(Window.FEATURE_NO_TITLE);  sucess.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
							
							LinearLayout lin1 = (LinearLayout) convertView.findViewById(R.id.linear1);
							
							TextView txt2 = (TextView) convertView.findViewById(R.id.textview2);
							
							TextView txt3 = (TextView) convertView.findViewById(R.id.textview3);
							
							ImageView b_img = (ImageView) convertView.findViewById(R.id.imageview1);
							
							android.graphics.drawable.GradientDrawable a = new android.graphics.drawable.GradientDrawable();
							a.setColor(Color.parseColor("#000000"));
							a.setCornerRadius(50);
							lin1.setBackground(a);
							
							b_img.setElevation(5);
							
							sucess.show();
							
							txt2.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									sucess.dismiss();
								}});
							
							txt3.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									
									it.setAction(Intent.ACTION_VIEW);
									it.setData(Uri.parse(update_link));
									startActivity(it);
								}});
							
						}
					}
				}
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		db.addChildEventListener(_db_child_listener);
		
		_data_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				distance = _childValue.get("distance").toString();
				if (distance.equals("Full")) {
					title.setText("Your tank is full please off motor");
					monitor.setText("Full");
					monitor.setTextColor(0xFF4CAF50);
					linear1.setBackgroundResource(R.drawable.full);
				}
				if (distance.equals("Medium")) {
					linear1.setBackgroundResource(R.drawable.medium);
					monitor.setText("Medium");
					monitor.setTextColor(0xFFFFEB3B);
					title.setText("Your tank level");
				}
				if (distance.equals("LOW")) {
					title.setText("Your tank level");
					linear1.setBackgroundResource(R.drawable.low);
					monitor.setText("Low");
					monitor.setTextColor(0xFFFF9800);
				}
				if (distance.equals("Empty")) {
					title.setText("Kindly fill the water");
					monitor.setText("Empty");
					monitor.setTextColor(0xFFF44336);
					linear1.setBackgroundResource(R.drawable.empty);
				}
				message = _childValue.get("message").toString();
				i = Double.parseDouble(message);
				a = i - 23;
				b = 100 - a;
				last = String.valueOf((long)(b));
				lastvalu.setText(last);
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				distance = _childValue.get("distance").toString();
				if (distance.equals("Full")) {
					title.setText("Your tank is full please off motor");
					linear1.setBackgroundResource(R.drawable.full);
					monitor.setText("Full");
					monitor.setTextColor(0xFF4CAF50);
				}
				if (distance.equals("Medium")) {
					linear1.setBackgroundResource(R.drawable.medium);
					monitor.setText("Medium");
					monitor.setTextColor(0xFFFFEB3B);
					title.setText("Your tank level");
				}
				if (distance.equals("LOW")) {
					title.setText("Your tank level");
					linear1.setBackgroundResource(R.drawable.low);
					monitor.setText("Low");
					monitor.setTextColor(0xFFFF9800);
				}
				if (distance.equals("Empty")) {
					title.setText("Kindly fill the water");
					monitor.setText("Empty");
					monitor.setTextColor(0xFFF44336);
					linear1.setBackgroundResource(R.drawable.empty);
				}
				if (valuee.equals("done")) {
					alert = _childValue.get("alert").toString();
					message = _childValue.get("message").toString();
					dis = Double.parseDouble(message);
					totaldis = Double.parseDouble(totadis);
					sensordis = Double.parseDouble(sensordisss);
					empty = Double.parseDouble(emptyyy);
					low = Double.parseDouble(lowww);
					medium = Double.parseDouble(mediummm);
					full = Double.parseDouble(fullll);
					i = Double.parseDouble(message);
					a = i - sensordis;
					b = totaldis - a;
					last = String.valueOf((long)(b));
					lastvalu.setText(last);
					if (full > dis) {
						_push_notification(alert, "Your tank is full please turn off motor 😱");
					}
					if (medium < dis) {
						_push_notification(alert, "Your tank is Medium 🤗");
						if (low < dis) {
							_push_notification(alert, "Your tank is Low 🚚");
							if (empty < dis) {
								_push_notification(alert, "Your tank is empty kindly fill the water 🤖");
							}
						}
					}
				}
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		data.addChildEventListener(_data_child_listener);
		
		fcm_onCompleteListener = new OnCompleteListener<InstanceIdResult>() {
			@Override
			public void onComplete(Task<InstanceIdResult> task) {
				final boolean _success = task.isSuccessful();
				final String _token = task.getResult().getToken();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(0xFF008375); w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); }
		linear1.setElevation(10);
		drawer.setColorFilter(0xFFFF0869, PorterDuff.Mode.MULTIPLY);
		title.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		distitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		monitor.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		lastvalu.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		lottie3.setAnimation("working.json");
		_bgbgbg();
		linear41.setVisibility(View.GONE);
		bgbg.setBackgroundColor(0xFFECF0F3);
		_yellow(empty1);
		_grdblue(low1);
		_grdwhyblue(medium1);
		_grdred(full1);
		_grdbluerose(sensor1);
		_grdgreen(total1);
		_grdblue(finish);
		emptyy1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFE0E0E0));
		loww1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFE0E0E0));
		mediumm1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFE0E0E0));
		fulll1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFE0E0E0));
		sensorr1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFE0E0E0));
		totall1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFE0E0E0));
		e.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/produc_sans_old1.ttf"), 0);
		l.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/produc_sans_old1.ttf"), 0);
		m.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/produc_sans_old1.ttf"), 0);
		f.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/produc_sans_old1.ttf"), 0);
		s.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/produc_sans_old1.ttf"), 0);
		ta.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/produc_sans_old1.ttf"), 0);
		emptyy1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/productregular1.ttf"), 0);
		loww1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/productregular1.ttf"), 0);
		mediumm1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/productregular1.ttf"), 0);
		fulll1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/productregular1.ttf"), 0);
		sensorr1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/productregular1.ttf"), 0);
		totall1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/productregular1.ttf"), 0);
		finish.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/productregular1.ttf"), 0);
		thitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/produc_sans_old1.ttf"), 1);
		close.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		close.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFF9C27B0));
		close.setElevation((float)10);
		hrscroll.setHorizontalScrollBarEnabled(false);
		emptyy1.setElevation((float)10);
		loww1.setElevation((float)10);
		mediumm1.setElevation((float)10);
		fulll1.setElevation((float)10);
		sensorr1.setElevation((float)10);
		totall1.setElevation((float)10);
		e.setElevation((float)10);
		l.setElevation((float)10);
		m.setElevation((float)10);
		f.setElevation((float)10);
		s.setElevation((float)10);
		ta.setElevation((float)10);
		finish.setElevation((float)10);
		thitle.setElevation((float)10);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(0xFF008375); w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); }
		if (value.getString("t", "").equals("")) {
			customize.setVisibility(View.VISIBLE);
		}
		else {
			linear41.setVisibility(View.GONE);
			customize.setVisibility(View.GONE);
			totadis = value.getString("t", "");
			emptyy1.setText(value.getString("e", ""));
			loww1.setText(value.getString("l", ""));
			mediumm1.setText(value.getString("m", ""));
			fulll1.setText(value.getString("f", ""));
			sensorr1.setText(value.getString("s", ""));
			totall1.setText(value.getString("t", ""));
			finish.performClick();
		}
		String urc = "com.gn.gowater";
		
		android.content.pm.PackageManager pm = getPackageManager(); 
		try { android.content.pm.PackageInfo pInfo = pm.getPackageInfo(urc, android.content.pm.PackageManager.GET_ACTIVITIES); 
			String version = pInfo.versionName;
			app_version = version;
		} catch (android.content.pm.PackageManager.NameNotFoundException e) { }
		db.addChildEventListener(_db_child_listener);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
	}
	public void _shape(final double _top1, final double _top2, final double _bottom2, final double _bottom1, final String _inside_color, final String _side_color, final double _side_size, final View _view) {
		Double tlr = _top1;
		Double trr = _top2;
		Double blr = _bottom2;
		Double brr = _bottom1;
		Double sw = _side_size;
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
		s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		s.setCornerRadii(new float[] {tlr.floatValue(),tlr.floatValue(), trr.floatValue(),trr.floatValue(), blr.floatValue(),blr.floatValue(), brr.floatValue(),brr.floatValue()}); 
		
		s.setColor(Color.parseColor(_inside_color));
		s.setStroke(sw.intValue(), Color.parseColor(_side_color));
		_view.setBackground(s);
	}
	
	
	public void _bgbgbg() {
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppins.ttf"), 1);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
	}
	
	
	public void _UI_GradientLR(final View _view, final String _left, final String _right, final double _lt, final double _rt, final double _lb, final double _rb, final double _str, final String _str_color, final double _ele, final String _ripple) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		int clrs[] = new int[]{
			Color.parseColor(_left), Color.parseColor(_right)
		};
		gd.setColors(clrs);
		gd.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.TL_BR);
		gd.setStroke((int)_str, Color.parseColor(_str_color));
		gd.setCornerRadii(new float[] {(float)_lt, (float)_lt, (float)_rt, (float)_rt, (float)_rb, (float)_rb, (float)_lb, (float)_lb});
		_view.setElevation((int)_ele);
		android.content.res.ColorStateList clrbs = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor(_ripple)});
		android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrbs , gd, null);
		_view.setBackground(ripdrb);
	}
	
	
	public void _Animator(final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
		anim.start();
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	
	public void _setHeight(final View _view, final double _heightValue, final double _widthValue) {
		_view.getLayoutParams().height = (int)_heightValue;
		_view.requestLayout();
		_view.getLayoutParams().width = (int)_widthValue;
		_view.requestLayout();
	}
	
	
	public void _FadeOut(final View _view, final double _duration) {
		_Animator(_view, "scaleX", 0, 200);
		_Animator(_view, "scaleY", 0, 200);
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_Animator(_view, "scaleX", 1, 200);
						_Animator(_view, "scaleY", 1, 200);
					}
				});
			}
		};
		_timer.schedule(t, (int)(_duration));
	}
	
	
	public void _grd(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{
			0xFF1E3F8F,
			0xFF050423
		});
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _push_notification(final String _title, final String _message) {
		final Context context = getApplicationContext();
		
		NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		
		Intent intent = new Intent(this, MainActivity.class); 
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP); 
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0); 
		androidx.core.app.NotificationCompat.Builder builder; 
		
		    
		    String channelId = "channel-01";
		    String channelName = "Channel Name";
		    int importance = NotificationManager.IMPORTANCE_HIGH;
		
		    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
			        NotificationChannel mChannel = new NotificationChannel(
			                channelId, channelName, importance);
			        notificationManager.createNotificationChannel(mChannel);
			    }
		 androidx.core.app.NotificationCompat.Builder mBuilder = new androidx.core.app.NotificationCompat.Builder(context, channelId)
		            .setSmallIcon(R.drawable.img2)
		            .setContentTitle(_title)
		            .setContentText(_message)
		            .setAutoCancel(true)
		            .setOngoing(false)
		            .setContentIntent(pendingIntent);
		    TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
		    stackBuilder.addNextIntent(intent);
		    PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(
		            0,
		            PendingIntent.FLAG_UPDATE_CURRENT
		    );
		    mBuilder.setContentIntent(resultPendingIntent);
		
		    notificationManager.notify((int)num, mBuilder.build());
	}
	
	
	public void _grdblue(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFF59D3FC,
			0xFF554DDE
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _grdwhyblue(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFF991CD1,
			0xFF043D74
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _grdred(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFFD4145A,
			0xFFFF4B2B
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _grdbluerose(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFFBE2EBF,
			0xFF4D4ADD
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _grdgreen(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFF7BFFD6,
			0xFFA7FF7A
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _yellow(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFFFFC107,
			0xFFFF9800
		});
		gd.setCornerRadius(20f);
		_view.setElevation(6f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}