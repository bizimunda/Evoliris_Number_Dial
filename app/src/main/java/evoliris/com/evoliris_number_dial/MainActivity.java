package evoliris.com.evoliris_number_dial;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private EditText etTelephone, etSearch;
    private Button btnDial, btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTelephone= (EditText) findViewById(R.id.et_main_telephone);
        etSearch= (EditText) findViewById(R.id.et_main_search);

        btnDial=(Button)findViewById(R.id.btn_main_dial);
        btnSearch=(Button)findViewById(R.id.btn_main_search);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=etTelephone.getText().toString();
                Intent callIntent= new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+number));
                startActivity(callIntent);
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String search=etSearch.getText().toString();
                Uri uri = Uri.parse("https://www.google.co.uk/?gws_rd=ssl#q="+search);
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH, uri);
                startActivity(intent);
            }
        });
    }





}
