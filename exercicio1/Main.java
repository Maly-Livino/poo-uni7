class Main {
  public static void main(String[] args) {
 cachorro c1 = new cachorro ();
 c1.nome = "Calcifer";
 c1.idade = 3;
c1.latir();
  cachorro c2 = new cachorro ();
c2.nome = "Heen";
c2.idade = 12;
c2.latir();
for(int i=0; i<10; i++){
  c1.latir();
  if (i % 2 == 0)
  c2.latir();
}
  }
}