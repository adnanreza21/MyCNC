package com.amazing.mycnc;

public class Question {
    public String mQuestions[] = {
            "1. Mesin yang dikontrol oleh komputer dengan menggunakan bahasa numerik adalah...",
            "2. Dibawah ini yang bukan fungsi komputer pada mesin CNC adalah...",
            "3. Ada dua macam mesin CNC di sekolah Yaitu CNC TU-2A dan CNC TU-3A, kata TU-2A singkatan dari...",
            "4. Program CNC terdiri dari...",
            "5. Pemrograman metode absolut adalah...",
            "6. Pemrograman metode inkrimental adalah...",
            "7. (1) Ketelitian" +
                    "(2) Ketepatan" +
                    "(3) Kapasitas produksi" +
                    "(4) Fleksibilitas" +
                    "(5) Harga mesin murah\n" +
                    "Keunggulan penggunaan mesin CNC dibandingan dengan mesin konvensional adalah...",
            "8. Sistem persumbuan pada mesin bubut CNC TU-2A dengan arah gerak sumbu Z adalah...",
            "9. Sistem persumbuan pada mesin bubut CNC TU-2A dengan arah gerak sumbu X adalah...",
            "10. Jika terjadi kesalahan dalam memasukan program nilai positif/negative akan terlihat jika dilakukan...",
            "11. Apabila saat mesin CNC beroperasi terjadi bahaya yang bisa menyebabkan kerusakan mesin atau dan benda kerja maka langkah yang tepat dilakukan adalah...",
            "12. Apa fungsi dari karakter alamat N pada struktur program CNC?",
            "13. Apa fungsi dari kode F pada struktur program?",
            "14. Perintah G78 pada mesin TU-2A adalah perintah siklus pengeboran dengan penarikan tatal. Arti parameter K pada G78 adalah...",
            "15. Gerak melengkung searah jarum jam pada program CNC ditandai dengan kode...",
            "16. Untuk mengakhiri/menutup program, menggunakan perintah...",
            "17. Interpolasi gerak lurus penyayatan, yaitu fungsi dari kode?",
            "18. Kode untuk memanggil pahat, adalah kode?",
            "19. Kode untuk menentukan jumlah putaran spindel per menit (rpm), adalah kode?",
            "20. Didalam lembaran program terdiri atas baris-baris yang disebut...",
            "21. Kode untuk perintah siklus pembuatan alur adalah...",
            "22. Sumbu utama dapat dimatikan dengan memasukan...",
            "23. Pada program G86 pembuatan alur ada parameter H, apa arti parameter tersebut...",
            "24. Apa fungsi dari perintah M03?",
            "25. Perintah untuk menghidupkan coolant adalah...",
    };

    private String mChoices[][] = {
            {"a. Controled Numerical Center", "b. Controled Normally Center", "c. Computer Normally Center", "d. Computer Numerical Controled", "e. Computer Normally Controled"},
            {"a. Mengatur fungsi", "b. Mengolah data", "c. Menterjemahkan data", "d. Menghaluskan pergerakan", "e. Mengubah data menjadi instruksi terperinci"},
            {"a. Tool Unit – 2 Alur", "b. Tool Uniform – 2 Axis", "c. Tool Unit – 2 Axis", "d. Trainning Unit – 2 Axis", "e. Trainning Uniform – 2 Axis"},
            {"a. Sejumlah blok program", "b. Sejumlah kata", "c. Sejumlah alamat (addres)", "d. Kolom", "e. Jawaban a, b, c benar"},
            {"a. Posisi pahat aktual adalah sebagai titik nol", "b. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran berubah-ubah", "c. Titik nol pada koordinat benda kerja sebagai acuan pengukuran tetap", "d. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran awal", "e. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran sesudahnya"},
            {"a. Posisi pahat aktual adalah sebagai titik nol", "b. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran berubah-ubah", "c. Titik nol pada koordinat benda kerja sebagai acuan pengukuran tetap", "d. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran awal", "e. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran sesudahnya"},
            {"a. 1,2,3,4", "b. 1,2,4,5", "c. 2,3,4,5", "d. 1,2,3,5", "e. 1,3,4,5"},
            {"a. Gerak melintang ", "b. Gerak memanjang ", "c. Gerak turun naik", "d. Gerak sudut", "e. Semua jawaban salah"},
            {"a. Gerak melintang ", "b. Gerak memanjang ", "c. Gerak turun naik", "d. Gerak sudut", "e. Semua jawaban salah"},
            {"a. Uji jalan program", "b. Eksekusi program", "c. Uji kebenaran program", "d. Pemeriksaan produk", "e. Uji lintasan tool/pahat"},
            //11
            {"a. Menekan tombol emergency", "b. Mematikan panel listrik pada mesin", "c. Memanggil instruktur", "d. Memutar kunci pada posisi off", "e. Mematikan panel utama"},
            {"a. Program number ", "b. Tool  function", "c. Block number ", "d. Feed function", "e. Auxiliary function"},
            {"a. Program number ", "b. Tool  function", "c. Block number ", "d. Feed function", "e. Auxiliary function"},
            {"a. Diameter benda kerja","b. Kisar ulir","c. Kecepatan penyayatan ","d. Kecepatan pemakanan ","e. Jumlah penyayatan tiap kali penyayatan"},
            {"a. G00","b. G01","c. G02","d. G03","e. G04"},
            {"a. M03","b. M30","c. M25","d. M92","e. M90"},
            {"a. G50 ","b. G00","c. G01 ","d. G02 ","e. G03"},
            {"a. Kode T ","b. Kode S ","c. Kode N ","d. Kode P ","e. Kode R"},
            {"a. Kode T","b. Kode S ","c. Kode N ","d. Kode P ","e. Kode R"},
            {"a. Blok ","b. Kata","c. Adres","d. Kolom","e. Parameter"},
            //21
            {"a. G02","b. G03","c. G78","d. G86","e. G90"},
            {"a. M00","b. M03","c. M05","d. M17","e. M30"},
            {"a. Tinggi alur","b. Lebar pahat alur","c. Panjang benda kerja","d. Diameter benda kerja","e. Kecepatan potong"},
            {"a. Mengakhiri program","b. Menghidupkan coolant","c. Mematikan coolant","d. Memutar spindle berlawanan arah jarum jam","e. Memutar spindle searah jarum jam"},
            {"a. M00","b. M03","c. M05","d. M08","e. M09"},
    };
    private String mCorrectAnswer[] = {
            "d. Computer Numerical Controled", "d. Menghaluskan pergerakan",
            "d. Trainning Unit – 2 Axis", "e. Jawaban a, b, c benar",
            "c. Titik nol pada koordinat benda kerja sebagai acuan pengukuran tetap", "b. Titik nol pada koordinat benda kerja  sebagai acuan pengukuran berubah-ubah",
            "a. 1,2,3,4", "b. Gerak memanjang ",
            "a. Gerak melintang ", "e. Uji lintasan tool/pahat",
            "a. Menekan tombol emergency", "c. Block number ",
            "d. Feed function","b. Kisar ulir",
            "c. G02", "b. M30",
            "c. G01 ", "a. Kode T ",
            "b. Kode S ", "a. Blok ",
            "d. G86", "c. M05",
            "b. Lebar pahat alur","e. Memutar spindle searah jarum jam","d. M08",
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

