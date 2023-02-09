package ıstanbul;

class dugum {

    int derece;
    int katsayi;
    dugum ileri;

    public dugum(int katsayi, int derece) {
        this.derece = derece;
        this.katsayi = katsayi;
        ileri = null;
    }

}

public class List {

    dugum bas;

    public List() {
        bas = null;
    }
     void hesapla(dugum yeni){
         
         
      
      
  }
    void siraliEkle(dugum yeni) {
        dugum tmp = null;
        if (bas == null || bas.derece > yeni.derece) {
            yeni.ileri = bas;
            bas = yeni;
        } else {
            tmp = bas;
        }
        while (tmp.ileri != null && tmp.ileri.derece < yeni.derece) {
            tmp = tmp.ileri;
        }
        yeni.ileri = tmp.ileri;
        tmp.ileri = yeni;
    }

    String listele() {
        String S = "";
        dugum tmp = bas;
        while (tmp != null) {
            S = S + tmp.katsayi + "x^" + tmp.derece + "->";
            tmp = tmp.ileri;
        }
        return S;
    

}
    
    
}
