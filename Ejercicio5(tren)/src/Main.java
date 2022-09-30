public class Main {
    public static void main(String[] args){
        int contador = 0;
        while (contador < 1000){

            Tren patito = new Tren( 500 + contador, 100 + contador);
            System.out.println((patito));
            contador++;

        }
        //Locomotoras
           Locomotora loc509 = new Locomotora(509);
           Locomotora loc566 = new Locomotora(566);
           Locomotora loc666 = new Locomotora();
           loc666.codigo = 666;


        //Vagon
            Vagon vagon1 = new Vagon("2 pisos", 80);
            Vagon vagon2 = new Vagon("1 pisos", 40);
            Vagon vagon3 = new Vagon("2 pisos", 80);

        //Tren 509
            Tren tren509 = new Tren(509, 10);
            loc509.tren = tren509;
            vagon1.tren =tren509;
        //Tren 566
        Tren tren566 = new Tren(566,12);
        loc566.tren = tren566;
        vagon2.tren =tren566;
        //Tren 666
        Tren tren666 = new Tren(666,13);
        loc666.tren = tren666;
        vagon3.tren =tren666;




    }


}
