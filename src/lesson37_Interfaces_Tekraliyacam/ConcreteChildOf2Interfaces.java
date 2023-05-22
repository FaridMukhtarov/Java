package lesson37_Interfaces_Tekraliyacam;

public class ConcreteChildOf2Interfaces  implements Interface_02, Interface_03{

    /*
       1- Bir class sadece bir class'a extends ede biler
          ancak birden cox interface-e implements edile biler

       2- Concrete child class implement rtdiyi
          butun interface'lerdeki abstract method'lari override etmek mecburi oldugundan
          iki interface'deki butun method-lari override etmek lazim olur
          - iki interface de eyni adda ve eyni return type'a sahip
            method'lardan hansinin override etdiyii onemli deyil
          - ancaq adlar eyni return type-lar farkli oldugunda
            iki interface'i birden implement etmemiz mumkun olmayacakdir
            bu vezyetde
               * ) ya child class'dan bu iki interface'i implements etmekden vazkecmeliyik
               * ) veya sisteme mudaxile imkanimiz varsa bu conlict'i hell etmeliyik

        3- Child class'dan parent Interface'lerdeki variable'lari istifade etmek istersek
           - eyni adda iki interface-de de variable varsa,
             interfaceAd.variableAd seklinde secimimizi qeyd etmeliyik
           - istifade edeceyimiz  variable sadece 1 interface'de varsa
             sadece variableAdi yazmaq yeterli olacaqdir
     */

    public static void main(String[] args) {
        System.out.println(Interface_02.MESAJ);
        System.out.println(Interface_03.MESAJ);
        System.out.println(REQEM_1);

        System.out.println(Interface_02.REQEM); // 20  Interface_02
        System.out.println(Interface_03.REQEM); // 30  Interface_03
    }

    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
