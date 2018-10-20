public class Main {

    public static class Sat {
        public int sati, minute, sekunde;
        public Sat(int sati, int minute, int sekunde) { postavi(sati,minute,sekunde); }
        void postavi(int sati, int minute, int sekunde) { this.sati=sati; this.minute=minute; this.sekunde=sekunde; }
        void sljedeci() {
            sekunde++;
            if (sekunde==60) { sekunde=0; minute++; }
            if (minute==60) { minute=0; sati++; }
            if (sati==24) sati=0;
        }
        void prethodni() {
            sekunde--;
            if (sekunde==-1) { sekunde=59; minute--; }
            if (minute==-1) { minute=59; sati--; }
            if (sati==-1) sati=23;
        }
        void pomjeriZa(int pomak) {
            if (pomak>0) for (int i=0; i<pomak; i++) sljedeci();
		else for (int i=0; i<-pomak; i++) prethodni();
        }
        final int dajSate()  { return this.sati; }
        final int dajMinute()  { return this.minute; }
        final int dajSekunde()  { return this.sekunde; }
        final void ispisi()  { System.out.println(sati+":"+minute+":"+sekunde); }

    }

    public static void main(String[] args)
    {

        Sat s = new Sat (15,30,45);
        s.ispisi();
        s.sljedeci();
        s.ispisi();
        s.pomjeriZa(-48);
        s.ispisi();
        s.postavi(0,0,0);
        s.ispisi();

    }
}
