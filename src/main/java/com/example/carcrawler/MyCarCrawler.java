package com.example.carcrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONObject;

public class MyCarCrawler {
        public static void main(String[] args) {
        new MyCarCrawler().getCars("https://www.cars-data.com/");
    }

    private void getCars(String url) {
        try {
            Document document = Jsoup.connect(url).ignoreContentType(true).get();
            System.out.println(document);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
