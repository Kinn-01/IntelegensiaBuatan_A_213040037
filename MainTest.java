package IntelegensiaBuatan;

import IntelegensiaBuatan.bfs.BreadthFirstSearch;
import IntelegensiaBuatan.dls.DepthLimitedSearch;
import IntelegensiaBuatan.ucs.NodeUCS;
import IntelegensiaBuatan.ucs.UniformCostSearch;

//Deklarasi sebuah kelas dengan nama MainTest
public class MainTest {
    //Main Method
    public static void main(String[] args) {
        
        //Membuat objek-objek node yang mewakili kota-kota dalam peta. setiap kota memiliki nama dan beberapa diantaranya memiliki tetangga (kota yang terhubung)
        Node bandung = new Node("Bandung");
        Node cirebon = new Node("Cirebon");
        Node tegal = new Node("Tegal");
        Node pekalongan = new Node("Pekalongan");
        Node semarang = new Node("Semarang");
        Node surakarta = new Node("Surakarta");
        Node madiun = new Node("Madiun");
        Node tasikMalaya = new Node("Tasik Malaya");
        Node purwokerto = new Node("Purwokerto");
        Node jepara = new Node("Jepara");
        Node kudus = new Node("Kudus");
        Node kediri = new Node("Kediri");
        Node malang = new Node("Malang");
        Node surabaya = new Node("Surabaya");

        bandung.addTetangga(cirebon);
        bandung.addTetangga(tasikMalaya);
        

        cirebon.addTetangga(bandung);
        cirebon.addTetangga(tegal);
        cirebon.addTetangga(tasikMalaya);

        tegal.addTetangga(cirebon);
        tegal.addTetangga(pekalongan);

        pekalongan.addTetangga(tegal);
        pekalongan.addTetangga(semarang);

        semarang.addTetangga(pekalongan);
        semarang.addTetangga(jepara);
        semarang.addTetangga(kudus);
        semarang.addTetangga(surakarta);

        surakarta.addTetangga(semarang);
        surakarta.addTetangga(madiun);

        madiun.addTetangga(surakarta);
        madiun.addTetangga(kediri);

        tasikMalaya.addTetangga(bandung);
        tasikMalaya.addTetangga(purwokerto);

        purwokerto.addTetangga(tasikMalaya);
        purwokerto.addTetangga(tegal);
        purwokerto.addTetangga(pekalongan);

        jepara.addTetangga(semarang);
        jepara.addTetangga(kudus);

        kudus.addTetangga(jepara);
        kudus.addTetangga(semarang);
        kudus.addTetangga(surakarta);

        kediri.addTetangga(madiun);
        kediri.addTetangga(malang);

        malang.addTetangga(kediri);
        malang.addTetangga(surabaya);

        surabaya.addTetangga(kediri);
        surabaya.addTetangga(malang);
       

        //Mencetak pesan yang menunjukan bahwa pencarian menggunakan algoritma 'BFS' akan dimulai
        System.out.println("BFS");
        //Membuat objek 'bfs' dari kelas 'BreadthFirstSearch'
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        //Memanggil method 'search' dari objek 'bfs' untuk mencari jalur dari kota 'Bandung' ke 'Surabaya' menggunakan BFS
        bfs.search(bandung, surabaya);
        System.out.println();

        //Mencetak pesan yang menunjukan bahwa pencarian menggunakan algoritma 'DLS' akan dimulai
        System.out.println("DLS");
        //Membuat objek 'dls' dari kelas 'DepthLimitedSearch'
        DepthLimitedSearch dls = new DepthLimitedSearch();
        //Mengatur batasan kedalaman pencarian dengan nilai 10
        dls.setLimit(10);
        //Memanggil method 'search' dari objek 'dls' untuk mencari jalur dari kota 'Bandung' ke 'Surabaya' menggunakan DLS dengan batasan kedalaman 10
        dls.search(bandung, surabaya);
        System.out.println();

        //Membuat objek-objek 'NodeUCS' yang mewakili kota-kota dengan biaya terkait
        NodeUCS bandungUCS = new NodeUCS(bandung, 366);
        NodeUCS cirebonUCS = new NodeUCS(cirebon, 0);
        NodeUCS tegalUCS = new NodeUCS(tegal, 160);
        NodeUCS pekalonganUCS = new NodeUCS(pekalongan, 242);
        NodeUCS semarangUCS = new NodeUCS(semarang, 161);
        NodeUCS surakartaUCS = new NodeUCS(surakarta, 176);
        NodeUCS madiunUCS = new NodeUCS(madiun, 77);
        NodeUCS tasikMalayaUCS = new NodeUCS(tasikMalaya, 151);
        NodeUCS purwokertoUCS = new NodeUCS(purwokerto, 226);
        NodeUCS jeparaUCS = new NodeUCS(jepara, 244);
        NodeUCS kudusUCS = new NodeUCS(kudus, 241);
        NodeUCS kediriUCS = new NodeUCS(kediri, 234);
        NodeUCS malangUCS = new NodeUCS(malang, 380);
        NodeUCS surabayaUCS = new NodeUCS(surabaya, 10);

        bandung.addTetangga(cirebon);
        bandung.addTetangga(tasikMalaya);
        

        cirebon.addTetangga(bandung);
        cirebon.addTetangga(tegal);
        cirebon.addTetangga(tasikMalaya);

        tegal.addTetangga(cirebon);
        tegal.addTetangga(pekalongan);

        pekalongan.addTetangga(tegal);
        pekalongan.addTetangga(semarang);

        semarang.addTetangga(pekalongan);
        semarang.addTetangga(jepara);
        semarang.addTetangga(kudus);
        semarang.addTetangga(surakarta);

        surakarta.addTetangga(semarang);
        surakarta.addTetangga(madiun);

        madiun.addTetangga(surakarta);
        madiun.addTetangga(kediri);

        tasikMalaya.addTetangga(bandung);
        tasikMalaya.addTetangga(purwokerto);

        purwokerto.addTetangga(tasikMalaya);
        purwokerto.addTetangga(tegal);
        purwokerto.addTetangga(pekalongan);

        jepara.addTetangga(semarang);
        jepara.addTetangga(kudus);

        kudus.addTetangga(jepara);
        kudus.addTetangga(semarang);
        kudus.addTetangga(surakarta);

        kediri.addTetangga(madiun);
        kediri.addTetangga(malang);

        malang.addTetangga(kediri);
        malang.addTetangga(surabaya);

        surabaya.addTetangga(kediri);
        
        //Mencetak pesan yang menunjukan bahwa pencarian menggunakan algoritma 'UCS' akan dimulai
        System.out.println("UCS");
        //Membuat objek 'ucs' dari kelas 'UniformCostSearch'
        UniformCostSearch ucs = new UniformCostSearch();
        //Memanggil method 'search' dari objek 'ucs' untuk mencari jalur dari kota 'Bandung' dengan biaya 366 ke kota 'Surabaya' dengan biaya 10 menggunakan UCS
        ucs.search(bandungUCS, surabayaUCS);
        System.out.println();
    }
}
