package com.example.shoppinglist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

   // private static final String EXTRA_GET ="com.example.shoppinglist.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;
    private TextView mItemHeader;
    private TextView mItemOne;
    private TextView mItemTwo;
    private TextView mItemThree;
    private TextView mItemFour;
    private TextView mItemFive;
    private TextView mItemSix;
    private TextView mItemSeven;
    private TextView mItemEight;
    private TextView mItemNine;
    private TextView mItemTen;
    private Button mAddItemButton;
    private EditText mShopNameEditText;
    private Button mClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mItemHeader = findViewById(R.id.text_header);
        mItemOne = findViewById(R.id.text_item1);
        mItemTwo = findViewById(R.id.text_item2);
        mItemThree = findViewById(R.id.text_item3);
        mItemFour = findViewById(R.id.text_item4);
        mItemFive = findViewById(R.id.text_item5);
        mItemSix = findViewById(R.id.text_item6);
        mItemSeven = findViewById(R.id.text_item7);
        mItemEight = findViewById(R.id.text_item8);
        mItemNine = findViewById(R.id.text_item9);
        mItemTen = findViewById(R.id.text_item10);
        mAddItemButton = findViewById(R.id.add_item_button);



     if(savedInstanceState!= null){
          mItemOne.setText(savedInstanceState.getString("item_one"));
           mItemTwo.setText(savedInstanceState.getString("item_two"));
         mItemThree.setText(savedInstanceState.getString("item_three"));
         mItemFour.setText(savedInstanceState.getString("item_four"));
         mItemFive.setText(savedInstanceState.getString("item_five"));
         mItemSix.setText(savedInstanceState.getString("item_six"));
         mItemSeven.setText(savedInstanceState.getString("item_seven"));
         mItemEight.setText(savedInstanceState.getString("item_eight"));
         mItemNine.setText(savedInstanceState.getString("item_nine"));
         mItemTen.setText(savedInstanceState.getString("item_ten"));
           mShopNameEditText.setText(savedInstanceState.getString("shop_location"));
       }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==TEXT_REQUEST){
            if (resultCode == RESULT_OK ){
                String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                mItemOne.setText(selectedItem);
                Toast.makeText(this,"item added to list", Toast.LENGTH_LONG).show();
            }

                if (resultCode == RESULT_OK +1) {
                    String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                    mItemTwo.setText(selectedItem);

                }


                 if (resultCode == RESULT_OK +2) {
                    String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                    mItemThree.setText(selectedItem);

                }


                if (resultCode == RESULT_OK +3) {
                    String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                    mItemFour.setText(selectedItem);
                }


                if (resultCode == RESULT_OK +4){
                    String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                    mItemFive.setText(selectedItem);
                }

                if (resultCode == RESULT_OK +5){
                    String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                    mItemSix.setText(selectedItem);
                }

                if (resultCode == RESULT_OK + 6){
                    String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                    mItemSeven.setText(selectedItem);
                }

                 if (resultCode == RESULT_OK +7){
                    String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                    mItemEight.setText(selectedItem);
                }

                if (resultCode == RESULT_OK +8){
                    String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                    mItemNine.setText(selectedItem);
                }

                if (resultCode == RESULT_OK +9){
                    String selectedItem = data.getStringExtra(AddItems.EXTRA_ITEM);
                    mItemTen.setText(selectedItem);
                }
            }


        }


    public void addItem(View view) {
        Intent intent = new Intent(this, AddItems.class);
        startActivityForResult(intent,TEXT_REQUEST);


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mItemOne != null){
            outState.putString("item_one", mItemOne.getText().toString());
        }
        if (mItemTwo!=null){
            outState.putString("item_two", mItemTwo.getText().toString());
        }
        if (mItemThree!=null){
            outState.putString("item_three", mItemThree.getText().toString());
        }
        if (mItemFour!=null){
            outState.putString("item_four", mItemFour.getText().toString());
        }
        if (mItemFive!=null){
            outState.putString("item_five", mItemFive.getText().toString());
        }
        if (mItemSix!=null){
            outState.putString("item_six", mItemSix.getText().toString());
        }
        if (mItemSeven!=null){
            outState.putString("item_seven", mItemSeven.getText().toString());
        }
        if (mItemEight!=null){
            outState.putString("item_eight", mItemEight.getText().toString());
        }
        if (mItemNine!=null){
            outState.putString("item_nine", mItemNine.getText().toString());
        }
        if (mItemTen!=null){
            outState.putString("item_ten", mItemTen.getText().toString());
        }
        if (mShopNameEditText !=null){
           outState.putString("shop_location", mShopNameEditText.getText().toString());
        }

    }

    public void locateShop(View view) {
        mShopNameEditText = findViewById(R.id.editText_shop);

        String shopName = mShopNameEditText.getText().toString();
        Uri uri_shop = Uri.parse("geo:0?q= " +shopName);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri_shop);

        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shoppingmenu, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       int id = item.getItemId();
        if (id == R.id.shopping_menu){
            clearList();

        }
        return super.onOptionsItemSelected(item);
    }

    private void clearList() {
        mItemOne.setText("");
        mItemTwo.setText("");
        mItemTwo.setText("");
        mItemThree.setText("");
        mItemFour.setText("");
        mItemFive.setText("");
        mItemSix.setText("");
        mItemSeven.setText("");
        mItemEight.setText("");
        mItemNine.setText("");
        mItemTen.setText("");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mItemOne.getText().toString();
        mItemTwo.getText().toString();
    }
}