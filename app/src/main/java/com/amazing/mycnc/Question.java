package com.amazing.mycnc;

public class Question {
    public String mQuestions[] = {
            "1. Mesin yang dikontrol oleh komputer dengan menggunakan bahasa numerik adalah...",
            "2. Dibawah ini yang bukan fungsi komputer pada mesin CNC adalah...",
            "3. Yang dimaksud program CNC adalah...",
            "4. Ada dua macam mesin CNC di sekolah Yaitu CNC TU-2A dan CNC TU-3A, kata TU-2A singkatan dari...",
            "5. Program CNC terdiri dari...",
            "6. Unit dasar untuk menyusun  program CNC, yaitu?",
            "7. Satu kata terdiri dari satu huruf karakter dan angka, yaitu pengertian dari...",
            "8. Perintah kerja yang disusun secara berurutan untuk memandu pelaksanaan suatu pekerjaan adalah...",
            "9. Pemrograman metode absolut adalah...",
            "10. Pemrograman metode inkrimental adalah...",
            "11. Jenis motor yang digunakan untuk mengendalikan pergerakan eretan dan spindle adalah...",
            "12. (1) Ketelitian" +
                    "(2) Ketepatan" +
                    "(3) Kapasitas produksi" +
                    "(4) Fleksibilitas" +
                    "(5) Harga mesin murah\n" +
                    "Keunggulan penggunaan mesin CNC dibandingan dengan mesin konvensional adalah...",
            "13. Sistem persumbuan pada mesin bubut CNC TU-2A dengan arah gerak sumbu Z adalah...",
            "14. Sistem persumbuan pada mesin bubut CNC TU-2A dengan arah gerak sumbu X adalah...",
            "15. Jika terjadi kesalahan dalam memasukan program nilai positif/negative akan terlihat jika dilakukan...",
            "16. Apabila saat mesin CNC beroperasi terjadi bahaya yang bisa menyebabkan kerusakan mesin atau dan benda kerja maka langkah yang tepat dilakukan adalah...",
            "17. Yang bukan prasyarat menjalankan mesin CNC adalah...",
            "18. Apa fungsi dari karakter alamat N pada struktur program CNC?",
            "19. Apa fungsi dari kode F pada struktur program?",
            "20. Perintah G84 pada mesin TU-2A adalah perintah siklus pembubutan memanjang (longitudinal turning cycle). Arti parameter H pada G84 adalah...",
            "21. Penulisan kode perintah G92 yang benar adalah...",
            "22. Penulisan kode perintah G91 yang benar adalah...",
            "23. Gerak melengkung searah jarum jam pada program CNC ditandai dengan kode...",
            "24. Untuk mengakhiri/menutup program, menggunakan perintah...",
            "25. Interpolasi gerak lurus penyayatan, yaitu fungsi dari kode?",
            "26. Kode untuk memanggil pahat, adalah kode?",
            "27. Kode untuk menentukan jumlah putaran spindel per menit (rpm), adalah kode?",
            "28. Dimensi alat potong yang menentukan kecepatan putaran adalah...",
            "29. untuk menghentikan sementara jalannya eksekusi program CNC, kita dapat mengunakan tombol...",
            "30. Untuk menyisipkan blok program ditekan tombol...",


    };

    private String mChoices[][] = {
            {"a. Controled Numerical Center", "b. Controled Normally Center", "c. Computer Normally Center", "d. Computer Numerical Controled", "e. Computer Normally Controled"},
            {"a. Mengatur fungsi", "b. Mengolah data", "c. Menterjemahkan data", "d. Menghaluskan pergerakan", "e. Mengubah data menjadi instruksi terperinci"},
            {"a. Kumpulan kode-kode perintah", "b. Urutan perintah dalam bentuk kode-kode", "c. Urutan kode penyayatan", "d. Kumpulan addres", "e. Jawaban a, b, dan c benar semua"},
            {"a. Tool Unit – 2 Alur", "b. Tool Uniform – 2 Axis", "c. Tool Unit – 2 Axis", "d. Trainning Unit – 2 Axis", "e. Trainning Uniform – 2 Axis"},
            {"a. Sejumlah blok program", "b. Sejumlah kata", "c. Sejumlah alamat (addres)", "d. Kolom", "e. Jawaban a, b, c benar"},
            {"a. Karakter ", "b. Kata", "c. Nomer blok ", "d. Blok  (baris)", "e. Struktur program CNC"},
            {"a. Karakter", "b. Kata", "c. Nomer blok", "d. Blok  (baris)", "e. Struktur program CNC"},
            {"a. Langkah kerja", "b. Petunjuk pengerjaan", "c. Instruksi kerja", "d. Tanda pengerjaan", "e. Program kerja         "},
            {"a. Posisi pahat aktual adalah sebagai titik nol", "b. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran berubah-ubah", "c. Titik nol pada koordinat benda kerja sebagai acuan pengukuran tetap", "d. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran awal", "e. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran sesudahnya"},
            {"a. Posisi pahat aktual adalah sebagai titik nol", "b. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran berubah-ubah", "c. Titik nol pada koordinat benda kerja sebagai acuan pengukuran tetap", "d. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran awal", "e. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran sesudahnya"},
            //11
            {"a. Motor listrik 1 phase", "b. Motor servo", "c. Motor listrik 3 phase", "d. Motor stirling", "e. Motor bensin"},
            {"a. 1,2,3,4", "b. 1,2,4,5", "c. 2,3,4,5", "d. 1,2,3,5", "e. 1,3,4,5"},
            {"a. Gerak melintang ", "b. Gerak memanjang ", "c. Gerak turun naik", "d. Gerak sudut", "e. Semua jawaban salah"},
            {"a. Gerak melintang ", "b. Gerak memanjang ", "c. Gerak turun naik", "d. Gerak sudut", "e. Semua jawaban salah"},
            {"a. Uji jalan program", "b. Eksekusi program", "c. Uji kebenaran program", "d. Pemeriksaan produk", "e. Uji lintasan tool/pahat"},
            {"a. Menekan tombol emergency", "b. Mematikan panel listrik pada mesin", "c. Memanggil instruktur", "d. Memutar kunci pada posisi off", "e. Mematikan panel utama"},
            {"a. Memahami komponen penunjang mesin CNC dan fungsi setiap tombol pada bagian control CNC", "b. Memahami dasar pembuatan program cara memasukan/mentransfer ke control", "c. Mengetahui cara setting benda kerja dan alat potong", "d. Mengetahui prosedur yang benar untuk melakukan jalan mesin secara otomatis dan instruksi keselamatan kerja", "e. Mengetahui cara penentuan harga produk/jasa"},
            {"a. Program number ", "b. Tool  function", "c. Block number ", "d. Feed function", "e. Auxiliary function"},
            {"a. Program number ", "b. Tool  function", "c. Block number ", "d. Feed function", "e. Auxiliary function"},
            {"a. Kedalaman penyayatan tatal", "b. Kedalaman penyayatan setiap kali penyayatan", "c. Kecepatan penyayatan ", "d. Kecepatan pemakanan ", "e. Jumlah penyayatan tiap kali penyayatan"},
            //21
            {"a. N... / G92 / X -  / Y - / Z - / F –","b. N... / G92 / X... / Y... / Z - / F –","c. N... / G92 / X... / Y... / Z... / F –","d. N... / G92 / X... / Y... / Z... / F...","e. N... / G92 / X- / Y... / Z... / F –"},
            {"a. N... / G91 / X -  / Y - / Z - / F –","b. N... / G91 / X... / Y... / Z - / F –","c. N... / G91 / X... / Y... / Z... / F –","d. N... / G91 / X... / Y... / Z... / F...","e. N... / G91 / X- / Y... / Z... / F –"},
            {"a. G00","b. G01","c. G02","d. G03","e. G04"},
            {"a. M03","b. M30","c. M25","d. M92","e. M90"},
            {"a. G50 ","b. G00","c. G01 ","d. G02 ","e. G03"},
            {"a. Kode T ","b. Kode S ","c. Kode N ","d. Kode P ","e. Kode R"},
            {"a. Kode T","b. Kode S ","c. Kode N ","d. Kode P ","e. Kode R"},
            {"a. Panjang alat potong","b. Lebar alat potong","c. Ketajaman sisi potong ","d. Diameter alat potong","e.\tJenis mesin"},
            {"a. “INP” + “DEL”","b. “INP” + “REV”","c. “INP” + “FWD”","d. “INP” + “~”","e. “REV” + “INP”"},
            {"a. “INP” 2X","b. “~” + “DEL”","c. “~”+ “INP”","d. “H/C”","e. “~” + “INV”"},

    };
    private String mCorrectAnswer[] = {
            "d. Computer Numerical Controled", "d. Menghaluskan pergerakan",
            "b. Urutan perintah dalam bentuk kode-kode", "d. Trainning Unit – 2 Axis",
            "e. Jawaban a, b, c benar", "a. Karakter ",
            "b. Kata", "c. Instruksi kerja",
            "c. Titik nol pada koordinat benda kerja sebagai acuan pengukuran tetap", "b. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran berubah-ubah",

            "b. Motor servo", "a. 1,2,3,4",
            "b. Gerak memanjang ", "a. Gerak melintang ",
            "e. Uji lintasan tool/pahat", "a. Menekan tombol emergency",
            "e. Mengetahui cara penentuan harga produk/jasa", "c. Block number ",
            "d. Feed function", "b. Kedalaman penyayatan setiap kali penyayatan",

            "c. N... / G92 / X... / Y... / Z... / F –", "a. N... / G91 / X -  / Y - / Z - / F –",
            "c. G02", "b. M30",
            "c. G01 ", "a. Kode T ",
            "b. Kode S ", "d. Diameter alat potong",
            "c. “INP” + “FWD”", "c. “~”+ “INP”",
    };

    public int getLength() {
        return mQuestions.length;
    }

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getChoice5(int a) {
        String choice = mChoices[a][4];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}

