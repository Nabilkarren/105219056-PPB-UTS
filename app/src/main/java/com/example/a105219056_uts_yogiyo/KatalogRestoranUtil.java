package com.example.a105219056_uts_yogiyo;

import java.util.ArrayList;
import java.util.List;

public class KatalogRestoranUtil {

    private static int[] ridArray = {
        R.drawable.ketoprak_06_mas_wahyu,
        R.drawable.rm_hidup_baru_raya,
        R.drawable.seblak_keyza,
        R.drawable.sushi_cuy,
        R.drawable.warung_korea_pop,
        R.drawable.lawson,
        R.drawable.maliki_toast,
        R.drawable.seia_kopi,
        R.drawable.maxx_coffee,
        R.drawable.martabak_djuara
    };

    private static String[] filenameArray = {
        "Ketoprak 06 mas Wahyu",
        "RM Hidup Baru Raya",
        "Seblak Keyza",
        "Sushi Cuy",
        "Warung Korea Pop",
        "Lawson",
        "Maliki Toast",
        "Seia Kopi",
        "Maxx Coffee",
        "Martabak Djuara"
    };

    private static double[] ratingArray = {
        4.9,
        3.5,
        3.9,
        2.9,
        4.3,
        3.7,
        3.3,
        2.7,
        5.0,
        4.1
    };

    private static String[] waktuArray = {
        "18 Menit",
        "38 Menit",
        "15 Menit",
        "55 Menit",
        "24 Menit",
        "10 Menit",
        "35 Menit",
        "15 Menit",
        "10 Menit",
        "45 Menit"
    };

    private static String[] jarakArray = {
        "2 Km",
        "4 Km",
        "1.06 Km",
        "5 Km",
        "1.54 Km",
        "0.6 Km",
        "1.2 Km",
        "1 Km",
        "0.3 Km",
        "4.63 Km"
    };

    private static String[] biayaPengirimanArray = {
            "Rp. 3800",
            "Rp. 6000",
            "Rp. 1500",
            "Rp. 7000",
            "Rp. 4000",
            "Rp. 2000",
            "Rp. 3200",
            "Rp. 2000",
            "Rp. 1500",
            "Rp. 4500"
    };

    private static String[] ringkasanMenuArray = {
            "[New Menu] Ketoprak + Matcha Latte",
            "[Kombo 5] Nasi Padang komplit + Es teh hangat",
            "Seblak ceker + baso",
            "[Wow 1] California Roll + Yakiniku Don + Iced Caramel Matcha",
            "Moon Chicken + Gimbap + Tteobokki Large",
            "Roti Canai + Nestea + Beef Kebab",
            "[Paket Kenyang] Cheese Toast + Iced Mocachino",
            "Kopi Susu Gula Aren ( Topping Boba )",
            "Iced Yakult with Caramel Topping",
            "Martabak Telor + Martabak Manis Mini"
    };

    private static int[] ratingJumlahArray = {
            49,
            35,
            39,
            29,
            43,
            37,
            33,
            27,
            50,
            41
    };

    private static List<KatalogRestoran> katalogRestoranList;

    public static void init(){
        katalogRestoranList = new ArrayList<>();

        int nArray = ridArray.length;

        for(int i = 0; i < nArray; i++){
            katalogRestoranList.add(new KatalogRestoran(ridArray[i], filenameArray[i], ratingArray[i], waktuArray[i],
                    jarakArray[i], biayaPengirimanArray[i], ringkasanMenuArray[i], ratingJumlahArray[i]));
        }
    }

    public static List<KatalogRestoran> getKatalogRestoranList(){
        return katalogRestoranList;
    }

    public static KatalogRestoran getKatalogFotoAt(int i){
        return katalogRestoranList.get(i);
    }


}
