package com.android.gson_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();
////        转换为json
//        Employee employee = new Employee("yc",30,"qq");
//        String s = gson.toJson(employee);
//        Log.d("qq", "onCreate: "+s);
//        json 转换为实体
//        Employee employee= gson.fromJson(json,Employee.class);
        String json ="{\n" +
                "  \"code\": 0,\n" +
                "  \"msg\": \"成功\",\n" +
                "  \"data\": [\n" +
                "  {\n" +
                "    \"name\": \"黑色\",\n" +
                "    \"type\": \"手机\",\n" +
                "    \"goods\": [\n" +
                "    {\n" +
                "      \"id\": \"4\",\n" +
                "      \"name\": \"Xiaomi / 小米 Redmi K20 Pro 新品 4800 万三摄骁龙 855 \",\n" +
                "      \"price\": 2499,\n" +
                "      \"description\": \"Redmi K20 Pro\",\n" +
                "      \"icon\": \"https://img.alicdn.com/imgextra/i1/1714128138/O1CN01O3ezvP29zFiPoEBsB_!!1714128138.jpg_430x430q90.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"5\",\n" +
                "      \"name\": \"一加 7Pro  OnePlus7pro 骁龙 855\",\n" +
                "      \"price\": 4609,\n" +
                "      \"description\": \"OnePlus7 pro\",\n" +
                "      \"icon\": \"https://img.alicdn.com/imgextra/i2/2432146763/O1CN01udgGPB1zpV7ZrN0Z4_!!2432146763.jpg_430x430q90.jpg\"\n" +
                "    }]\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"yancy\",\n" +
                "    \"type\": 2,\n" +
                "    \"goods\": [\n" +
                "    {\n" +
                "      \"id\": \"2\",\n" +
                "      \"name\": \"Intel / 英特尔 酷睿 i9-9900k 盒装 CPU 8 核 16 线程 1151 针脚台式机电脑处理器 9900k\",\n" +
                "      \"price\": 3949,\n" +
                "      \"description\": \"i9-9900K\",\n" +
                "      \"icon\": \"https://img.alicdn.com/imgextra/i2/2578685019/O1CN011mwkJrflslfv3Dt_!!2578685019.jpg_430x430q90.jpg\"\n" +
                "    }]\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"黑色\",\n" +
                "    \"type\": \"手机\",\n" +
                "    \"goods\": [\n" +
                "    {\n" +
                "      \"id\": \"1\",\n" +
                "      \"name\": \"Apple / 苹果 iphoneXS\",\n" +
                "      \"price\": 8199,\n" +
                "      \"description\": \"iPhone XS\",\n" +
                "      \"icon\": \"https://img.alicdn.com/imgextra/i3/1917047079/TB2AHQYXwDqK1RjSZSyXXaxEVXa_!!1917047079.jpg_430x430q90.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"3 \",\n" +
                "      \"name\": \"Apple / 苹果 iPhone XR\",\n" +
                "      \"price\": 6199,\n" +
                "      \"description\": \"iPhone XR\",\n" +
                "      \"icon\": \"https://img.alicdn.com/imgextra/i4/1917047079/O1CN0122AEDNRubJERqkK_!!1917047079.jpg_430x430q90.jpg\"\n" +
                "    }]\n" +
                "  }]\n" +
                "}";
        GoodsList goodsList = gson.fromJson(json, GoodsList.class);
        Log.d("qq", "onCreate: "+goodsList.toString());
    }
}
