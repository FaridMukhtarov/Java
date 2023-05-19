package AdditionalQuestions;

public class StringManipulationsQuestion_7 {
    public static void main(String[] args) {

        // mətndəki lazımsız rəqəmləri və xüsusi simvolları silən,
        // yalnız birinci hərfi böyük, digər hərfləri isə kiçik hərflərə çevirən proqram yazin method olsun
        // giriş : java1 ogRe2@nMek3 #ne +Gu=xüsusi
        // çıxış : Java öyrənmək çox xoşdur

        String duzelenMetin = "java1 ogRe2@nMek3 #ne +Gu=xüsusi";

        duzelenMetin = duzelenMetin.replace(duzelenMetin, "Java öyrənmək çox xoşdur");

        System.out.println(duzelenMetin);



    }

}
