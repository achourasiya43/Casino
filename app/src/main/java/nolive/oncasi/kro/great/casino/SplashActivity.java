package nolive.oncasi.kro.great.casino;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thefinestartist.finestwebview.FinestWebView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent intent =  new Intent(SplashActivity.this, WebViewActivity.class);
               startActivity(intent);
               finish();

               /* String url = "http://jackpotjoy.xyz/landing.php?subid=275&toptittle=jackpotjoy&creid-33061";
                new FinestWebView.Builder(SplashActivity.this).show(url);
*/
            }
        }, secondsDelayed * 3000);


    }
}
