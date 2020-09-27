package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddItems extends AppCompatActivity {

    public static final String EXTRA_ITEM ="com.example.shoppinglist.extra.MESSAGE";




    private TextView mHeader;
    private Button mItemOne;
    private Button mItemTwo;
    private Button mItemThree;
    private Button mItemFour;
    private Button mItemFive;
    private Button mItemSix;
    private Button mItemSeven;
    private Button mItemEight;
    private Button mItemNine;
    private Button mItemTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);
        mHeader = findViewById(R.id.add_item_header);
        mItemOne = findViewById(R.id.button1);
        mItemTwo = findViewById(R.id.button2);
        mItemThree = findViewById(R.id.button3);
        mItemFour = findViewById(R.id.button4);
        mItemFive = findViewById(R.id.button5);
        mItemSix = findViewById(R.id.button6);
        mItemSeven = findViewById(R.id.button7);
        mItemEight = findViewById(R.id.button8);
        mItemNine = findViewById(R.id.button9);
        mItemTen = findViewById(R.id.button10);


    }

    public void addItemOne(View view) {
        if (view.getId() == R.id.button1){

            Intent itemIntent = new Intent();
            String item = mItemOne.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK, itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if (view.getId() == R.id.button2){
            Intent itemIntent = new Intent();
            String item = mItemTwo.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK +1 , itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(view.getId() == R.id.button3){
            Intent itemIntent = new Intent();
            String item = mItemThree.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK +2 , itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(view.getId() == R.id.button4){
            Intent itemIntent = new Intent();
            String item = mItemFour.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK +3, itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(view == findViewById(R.id.button5)){
            Intent itemIntent = new Intent();
            String item = mItemFive.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK +4, itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(view == findViewById(R.id.button6)){
            Intent itemIntent = new Intent();
            String item = mItemSix.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK +5, itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(view == findViewById(R.id.button7)){
            Intent itemIntent = new Intent();
            String item = mItemSeven.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK +6, itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(view == findViewById(R.id.button8)){
            Intent itemIntent = new Intent();
            String item = mItemEight.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK +7, itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(view == findViewById(R.id.button9)){
            Intent itemIntent = new Intent();
            String item = mItemNine.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK +8, itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(view == findViewById(R.id.button10)){
            Intent itemIntent = new Intent();
            String item = mItemTen.getText().toString();
            itemIntent.putExtra(EXTRA_ITEM, item);
            setResult(RESULT_OK +9, itemIntent);
            Toast.makeText(this,"item added to list", Toast.LENGTH_SHORT).show();
            finish();
        }



    }
}