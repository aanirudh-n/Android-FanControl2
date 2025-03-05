package com.example.aifinancemanager;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import java.util.List;

public class ExpenseChartActivity extends AppCompatActivity {
    private PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_chart);

        pieChart = findViewById(R.id.pieChart);
        loadChartData();
    }

    private void loadChartData() {
        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(500, "Food"));
        entries.add(new PieEntry(300, "Transport"));
        entries.add(new PieEntry(200, "Entertainment"));

        PieDataSet dataSet = new PieDataSet(entries, "Expenses");
        dataSet.setColors(Color.BLUE, Color.GREEN, Color.RED);
        PieData pieData = new PieData(dataSet);

        pieChart.setData(pieData);
        pieChart.invalidate();
    }
}