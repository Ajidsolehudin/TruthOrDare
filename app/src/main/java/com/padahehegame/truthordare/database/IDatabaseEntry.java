package com.padahehegame.truthordare.database;


//import com.google.android.gms.drive.MetadataChangeSet;
//import com.google.android.gms.nearby.messages.Strategy;
//import com.google.android.gms.wallet.WalletConstants;

import com.padahehegame.truthordare.model.TruthOrDare;
import com.padahehegame.truthordare.types.GameMode;
import com.padahehegame.truthordare.types.QuestionType;

import java.util.ArrayList;
import java.util.List;

public class IDatabaseEntry {

    //DARE DEWASA
    public static String[] DareListAdult = new String[]{
            "Baca niat solat jenazah",
            "Baca do’a tayamum",
            "Baca do'a setelah adzan",
            "Kirim pulsa senilai 10 ribu ke anak anda",
            "Telepon pasangan anda dan bilang ma'af",
            "Berikan pesan romantis ke pasangan anda lewat whatsApp",
            "Upload foto keluarga ke sosial media",
            "Foto selfi dan kirimkan ke anak anda",
            "Pijat semua pemain yang sejenis dengan anda, masing-masing 1 menit",
            "Bilang ma'af ke anak anda lewat telepon",
            "Beri uang Rp.5000 ke semua pemain",
            "Baca surah An-Nazi'at",
            "Baca surah At-Takwir",
            "Baca tiga surah dalam juz 30",
            "Baca istighfar sebanyak 15 kali",
            "Baca hamdalah sebanyak 15 kali",
            "Baca asmaul husna",
            "Baca solawat sebanyak 15 kali",
            "Baca syahadat sebanyak 10 kali",
            "Senyum sampai permainan selesai",
            "Baca surah Al-fatihah lengkap dengan terjemahannya",
            "Baca surah Al-ikhlas lengkap dengan terjemahannya",
            "Baca surah Al-zalzalah lengkap dengan terjemahannya",
            "Baca surah Al-ankabut",
            "Baca surah Al-kafirun lengkap dengan terjemahannya",
            "Baca do'a sujud sahwi",
            "Baca niat zakat fitrah",
            "Baca niat zakat mal",
            "Baca do'a iftitah",
            "Baca niat solat tahajjud",
            "Baca niat solat gerhana bulan",
            "Baca niat mandi besar",
            "Baca niat puasa senin kamis",
            "Baca do'a nabi ibrahim",
            "Baca do'a nabi adam"};

    //DARE ANAK
    private static String[] DareListKids = new String[]{
            "Baca do’a sebelum makan",
            "Baca do’a sebelum tidur",
            "Baca do’a bangun tidur",
            "Baca do’a hendak masuk toilet",
            "Baca niat wudhu",
            "Baca niat solat shubuh",
            "Baca niat solat dzuhur",
            "Baca niat solat ashar",
            "Baca niat solat maghrib",
            "Baca niat solat isya",
            "Baca niat solat tarawih",
            "Baca do’a untuk kedua orang tua",
            "Baca surah Al-Kafirun",
            "Baca surah Al-Ikhlas",
            "Baca surah Al-Ma’un",
            "Baca surah Al-Fiil",
            "Baca surah At-Takasur",
            "Baca surah Al-Zalzalah",
            "Baca surah Ad-Dhuha",
            "Baca surah An-Nas",
            "Baca surah Al-Falaq",
            "Baca surah Al-Lahab",
            "Baca do'a setelah makan",
            "Baca do'a sebelum belajar",
            "Baca do'a hendak masuk rumah",
            "Baca do'a keluar toilet",
            "Baca do'a masuk masjid",
            "Baca do'a keluar masjid",
            "Baca surah Al-Humazah",
            "Baca surah Al-Ashr",
            "Baca surah Al-Qadr",
            "Baca surah Al-Alaq",
            "Baca surah Al-Quraisy",
            "Baca surah At-Tin",
            "Baca surah Al-Insyirah"};


    // DARE REMAJA
    public static String[] DareListTeen = new String[]{
            "Ucap istighfar sebanyak 10 kali",
            "Ucap syahadat sebanyak 3 kali",
            "Ucap hamdalah sebanyak 5 kali",
            "Ucap solawat sebanyak 7 kali",
            "Baca surah Al-Fatihah dengan terjemahannya",
            "Baca do’a masuk masjid",
            "Baca niat puasa Ramadhan",
            "Baca do’a buka puasa",
            "Telepon orang tua kamu dan bilang : ma’af kalo anakmu ini banyak salah",
            "Chatt orang yang kamu benci dan bilang : maafin aku ya",
            "Jika kamu punya pacar, putusin dia sekarang juga", "Ambil wudhu sekarang",
            "Berikan sedekah pada 1 teman kamu, bebas berapapun nominalnya",
            "Ucapkan sebanyak 10 kali, “saya sering ghibah, mohon ampuni dosa saya”",
            "Bilang ma’af ke semua pemain game ini",
            "Ganti wallpaper hp mu jadi quote islami",
            "Unduh aplikasi Al-Qur’an di hp kamu",
            "Baca niat mandi besar",
            "Ucapkan sebanyak 7 kali, “saya janji tidak akan meninggalkan sholat fardu”",
            "Baca surah Al-Kautsar dengan terjemahannya",
            "Sebutkan urutan 25 nabi dan rosul",
            "Baca niat solat dhuha",
            "Baca niat solat witir",
            "Baca niat puasa arafah",
            "Baca niat puasa tarwiah",
            "Baca niat solat idul fitri",
            "Baca niat solat idul adha",
            "Baca 1 surah dalam juz 30",
            "Tunjuk satu pemain, dan suruh dia istighfar sebanyak 7 kali",
            "Tunjuk satu pemain, dan suruh dia baca syahadat sebanyak 3 kali",
            "Tunjuk satu pemain, dan suruh dia baca solawat sebanyak 5 kali",
            "Baca do’a setelah solat dhuha",
            "Baca surah An-Naba",
            "Baca 10 ayat pertama surah Al-Kahfi",
            "Baca surah Ar-Rahman"};

    // TRUTH DEWASA
    public static String[] TruthListAdult;

    // TRUTH ANAK
    private static String[] TruthListKids = new String[]{
            "Di usia berapa kamu tamat iqra ?",
            "Di usia berapa kamu bisa baca Al-Qur’an ?",
            "Kapan terakhir kali kamu berkata kasar ?",
            "Kapan terakhir kali kamu ingkar janji ?",
            "Berapa surat Al-Qur’an yang kamu hafal ?",
            "Kapan kamu pertama kali puasa penuh sa’at Ramadhan ?",
            "Kapan terakhir kali berdo’a untuk orang tua ?",
            "Siapa yang mengajarkan kamu solat ?",
            "Siapa yang mengajarkan kamu do’a harian ?",
            "Apakah kamu tertarik jadi seorang santri di pesantren ?",
            "Hari ini kamu sudah berbohong berapa kali ?",
            "Tadi pagi sholat subuh engga ?",
            "Kapan terakhir kali meluk ibu ?",
            "Kapan terakhir kali meluk ayah ?",
            "Kapan terakhir kali meninggalkan solat ?",
            "Kapan pertama kali solat 5 waktu ?",
            "Siapa nama guru mengaji kamu ?",
            "Siapa nama teman yang paling kamu benci ?",
            "Di usia berapa kamu pertama kali solat idul fitri ?",
            "Di usia berapa kamu pertama kali solat idul adha ?",
            "Di usia berapa kamu disunat ?",
            "Antara ayah dan ibu, siapa yang paling baik menurut kamu ?",
            "Apa yang kamu lakukan ketika dimarahin ayah ?",
            "Apa yang kamu lakukan ketika dimarahin ibu ?",
            "Apa yang kadang membuatmu lupa solat ?",
            "Apa yang kamu lakukan ketika menunggu waktu buka puasa ?",
            "Siapa nama ayah kamu ?",
            "Siapa nama ibu kamu ?",
            "Pernah dimarahin guru ? apa alasannya ?",
            "Pernah dimarahin ayah ? apa alasannya ?",
            "Pernah dimarahin ibu ? apa alasannya ?",
            "Pernah marah ke ayah ? kenapa dan kapan ?",
            "Pernah marah ke ibu ? kenapa dan kapan ?",
            "Pernah marah ke kakak ? kenapa dan kapan ?",
            "Apa yang membuatmu senang ketika ramadhan ?"};


    // TRUTH REMAJA
    public static String[] TruthListTeen = new String[]{
            "Di usia berapa kamu tamat Al-Qu’an ?",
            "Kapan terakhir kali baca surah Yasin ?",
            "Kapan pertama kali khatam Al-Qur’an ?",
            "Berapa surat Al-Qur’an yang kamu hafal ?",
            "Kapan terakhir kali memeluk ibu ?",
            "Kapan terakhir kali memeluk ayah ?",
            "Siapa orang yang membuatmu ta’at agama ?",
            "Apa alasan terkonyol kamu batal puasa Ramadhan ?",
            "Ramadhan kemarin puasa penuh atau engga, alasannya ?",
            "Apa arti dakwah menurut pendapatmu ?",
            "Kapan terakhir kali kamu baca istigfar ?",
            "Kapan terakhir kali kamu baca bismillah ?",
            "Kapan terakhir kali kamu baca syahadat ?",
            "Kapan terakhir kali kamu baca solawat ?",
            "Siapa nama ustadz yang mengajarkanmu cara membaca Al-Qur’an ?",
            "Jika hari esok kiamat, apa yang akan kamu lakukan sekarang ?",
            "Siapa orang yang sering kamu bentak ?",
            "Kapan terakhir kali kamu cium tangan orang tua ?",
            "Kapan terakhir kali pacaran ?",
            "Kapan terakhir kali ghibah ?",
            "Apa yang membuatmu malas ibadah ?",
            "Apa yang membuatmu kesal dengan orang lain ?",
            "Sebutkan tanggal lahir ayah kamu ?",
            "Kapan terakhir kali berdo’a untuk orang tua ?",
            "Kapan terakhir kali kamu puasa sunnah ?",
            "Kapan terakhir kali solat tahajjud ?",
            "Kapan terakhir kali kamu berbohong? ceritakan kebohongan itu",
            "Kapan terakhir kali kamu mencuri ? jelaskan kronologinya",
            "Kapan pertama kali mimpi basah ?",
            "Apakah kamu cium tangan orang tua sebelum berpergian?",
            "Apa do’a yang sering kamu panjatkan selepas solat ?",
            "Pernah buka aurat didepan umum ?",
            "Sebutkan tanggal lahir ibu kamu ?",
            "Siapa nama orang yang kamu harap jadi pendamping hidup kamu kelak ?",
            "Kapan terakhir kali berbuat maksiat ?"};


    public static List<TruthOrDare> getQuestions(GameMode mode, QuestionType type) {
        String[] questions = new String[0];
        List<TruthOrDare> questionsList = new ArrayList();
        if (mode == GameMode.KIDS) {
            if (type == QuestionType.TRUTH) {
                questions = TruthListKids;
            } else {
                questions = DareListKids;
            }
        } else if (mode == GameMode.TEEN) {
            if (type == QuestionType.TRUTH) {
                questions = TruthListTeen;
            } else {
                questions = DareListTeen;
            }
        } else if (mode == GameMode.ADULT) {
            if (type == QuestionType.TRUTH) {
                questions = TruthListAdult;
            } else {
                questions = DareListAdult;
            }
        }
        for (String question : questions) {
            questionsList.add(new TruthOrDare(question, type, Integer.valueOf(0), mode));
        }
        return questionsList;
    }

    static {
        String[] strArr = new String[36];
        strArr[0] = "Di usia berapa anda khatam Al-Qu’an ?";
        strArr[1] = "Di usia berapa anda menikah ?";
        strArr[2] = "Bagaimana cara anda dalam mendidik anak ?";
        strArr[3] = "Sebutkan tanggal lahir anak anda ?";
        strArr[4] = "Kapan terakhir kali anda membahagiakan pasangan ?";
        strArr[5] = "Sebutkan tanggal lahir pasangan anda ?";
        strArr[6] = "Apakah masakan pasangan anda lezat ?";
        strArr[7] = "Kapan terakhir kali anda mengecewakan anak ?";
        strArr[8] = "Kapan terakhir kali anda ingkar janji ?";
        strArr[9] = "Kapan terakhir kali membentak anak ?";
        strArr[10] = "Apa yang membuat anda sayang dengan pasangan ?";
        strArr[11] = "Apa sifat dari pasangan yang dapat membuat anda kesal ?";
        strArr[12] = "Seberapa sering anda mengajak main anak ?";
        strArr[13] = "Kapan terakhir kali anda meninggalkan solat ?";
        strArr[14] = "Apa alasan anda memilih pasangan yang sekarang ?";
        strArr[15] = "Kapan terakhir kali anda membaca Al-Qur'an ?";
        strArr[16] = "Kapan terakhir kali anda menunaikan puasa sunnah ?";
        strArr[17] = "Sebutkan tanggal lahir ibu anda ?";
        strArr[18] = "Bagaimmana cara anda membuat pasangan betah dengan anda ?";
        strArr[19] = "Kapan terakhir kali berbohong pada anak ?";
        strArr[20] = "Kapan terakhir kali berbohong pada pasangan ?";
        strArr[21] = "Kapan terakhir kali mengucap istighfar ?";
        strArr[22] = "Kapan terakhir kali membaca solawat ?";
        strArr[23] = "Kapan terakhir kali mengajarkan anak mengaji ?";
        strArr[24] = "Siapa orang yang paling anda kagumi ? alasannya ?";
        strArr[25] = "Apakah anda mengajarkan do'a-do'a harian pada anak anda ?";
        strArr[26] = "Apakah anda senantiasa solat dhuha setiap pagi ? alasannya ?";
        strArr[27] = "Apa yang anda lakukan ketika anak anda meninggalkan solat ?";
        strArr[28] = "Apa yang anda lakukan ketika anak anda melawan pada orang tua ?";
        strArr[29] = "Apa yang anda lakukan ketika anak anda berkata kasar ?";
        strArr[30] = "Kapan terakhir kali anda menjadi imam dalam solat?";
        strArr[31] = "Sebutkan tanggal lahir ayah anda ?";
        strArr[32] = "Apa do'a yang anda panjatkan selepa solat ?";
        strArr[33] = "Kapan terakhir kali solat sunnah ?";
        strArr[34] = "Apakah anda memberi contoh yang baik untuk anak anda ? jelaskan";
        strArr[35] = "Apa kesalahan terbesar anda pada anak ?";
        TruthListAdult = strArr;
    }
}
