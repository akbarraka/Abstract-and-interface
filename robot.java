abstract class robot
{
    String nama;
    String pemilik;
    int tahun;

    void setTahunpembuatan(int tahun)
    {
        System.out.println("Saya dibuat tahun " + tahun);
    }

    abstract void setNama(String nama);

    abstract void displayData();
}

class doraMini extends robot
{
    void sayDora()
    {
        System.out.println("Hi, saya Dora Mini");
    }

    @Override
    void setNama(String nama)
    {
        System.out.println("Nama panggilan saya " + nama);
    }

    @Override
    void displayData()
    {
        sayDora();
        setNama("Dora");
        setTahunpembuatan(2020);
        System.out.print("\n");
    }

    public static void main(String[] args) {
        doraMini DoraMini = new doraMini();
        DoraMini.displayData();
    }
}