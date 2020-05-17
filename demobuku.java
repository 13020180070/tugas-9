class buku{
// property/variabel/data member
String pengarang;
String judul;
}

class demobuku{
public static void main(String args[]){
buku a,b;
a=new buku();
b=new buku();

a.pengarang=”michael crichton”;
a.judul=”jurassic park”;

a.pengarang=”alistair maclean”;
a.judul=”siaga merah”;

System.out.println(“judul : “ + a.judul + “ pengarang : “ + a.pengarang);
System.out.println(“judul : “ + b.judul + “ pengarang : “ + b.pengarang);
}
}